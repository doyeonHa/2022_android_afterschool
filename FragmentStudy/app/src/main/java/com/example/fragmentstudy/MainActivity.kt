package com.example.fragmentstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.log

class MainActivity : AppCompatActivity(),
    CurrencyConverterFragment3.CurrencyCalculationListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        // transaction.add(R.id.fragment_container, CurrencyConverterFragment2.newInstance("USD", "KRW"))
        transaction.add(R.id.fragment_container, CurrencyConverterFragment3.newInstance("USD", "KRW"))
        transaction.commit()
    }

        override fun onCalculate(result: Double, amount: Double, from: String, to: String) {
            Log.d("mytag", result.toString())
            findViewById<TextView>(R.id.result).text = result.toString()
        }
    }
