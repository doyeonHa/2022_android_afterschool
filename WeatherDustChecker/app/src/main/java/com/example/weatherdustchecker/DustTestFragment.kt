package com.example.weatherdustchecker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.net.URL

@JsonDeserialize(using = MyDustDeserializer::class)
data class OpenDustAPIJONResponse(val pm25: Int, val pm10: Int)

class MyDustDeserializer : StdDeserializer<OpenDustAPIJONResponse>(
    OpenDustAPIJONResponse::class.java
){
    override fun deserialize(
        p: JsonParser?,
        ctxt: DeserializationContext?
    ): OpenDustAPIJONResponse {
        val node = p?.codec?.readTree<JsonNode>(p)

        val dataNode = node?.get("data")
        val iaqi = dataNode?.get("iaqi")
        val pm10Node = iaqi?.get("pm10")
        val pm25Node = iaqi?.get("pm25")
        val pm10 = pm10Node?.get("v")?.asInt()
        val pm25 = pm25Node?.get("v")?.asInt()

        return OpenDustAPIJONResponse(pm25!!, pm10!!)
    }

}

class DustTestFragment: Fragment() {

    lateinit var pm25Text : TextView
    lateinit var pm10Text : TextView
    var id = "1ce50e3d044ebc09f457b116d1bdd2df43634ca7"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dust_test_fragment, container, false)

        pm25Text = view.findViewById(R.id.pm25_text)
        pm10Text = view.findViewById(R.id.pm10_text)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lat = arguments?.getDouble("lat")
        val lon = arguments?.getDouble("lon")
        val url = "https://api.waqi.info/feed/geo:${lat};${lon}/?token=${id}"

        APICall(object : APICall.APICallback{
            override fun onComplete(result: String) {
                var mapper = jacksonObjectMapper()
                var data = mapper?.readValue<OpenDustAPIJONResponse>(result)

                pm25Text.text = data.pm25.toString()
                pm10Text.text = data.pm10.toString()

            }
        }).execute(URL(url))
    }

    companion object {

        fun newInstance(lat: Double, lon: Double): DustTestFragment {
            val fragment = DustTestFragment()

            // 번들 객체에 필요한 정보를 저장
            val args = Bundle()
            args.putDouble("lat", lat)
            args.putDouble("lon", lon)
            fragment.arguments = args

            return fragment
        }
    }
}