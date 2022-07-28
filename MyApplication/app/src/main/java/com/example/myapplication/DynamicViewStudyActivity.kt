package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class DynamicViewStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
//        //동적 뷰 생성 => XML 레이아웃 말고 뷰 객체를 직접 생성
//        val root = LinearLayout(this)
//        // android:orientation="vertical"과 동일한 역할
//        root.orientation = LinearLayout.VERTICAL
//        // 각각 android:width, android:height => "match_parents
//        root.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            LinearLayout.LayoutParams.MATCH_PARENT
//        )
//
//
//        val DPToPX = TypedValue.applyDimension(
//            TypedValue.COMPLEX_UNIT_DIP,
//            18f,
//            resources.displayMetrics
//        ).toInt()
//        Log.d("my_tag", DPToPX.toString())
//
//        val btn = Button(this)
//        val params = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            LinearLayout.LayoutParams.WRAP_CONTENT
//        )
//        params.setMargins(DPToPX, DPToPX, DPToPX, DPToPX)
//        btn.layoutParams = params
//        btn.text = "Hello"
//        // android:textSize = "26sp"
//        btn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26f)
//        btn.setTextColor(Color.RED)
//
//        val editText = EditText(this)
//        val height = TypedValue.applyDimension(
//            TypedValue.COMPLEX_UNIT_DIP,
//            100f,
//            resources.displayMetrics
//        ).toInt()
//        Log.d("my_tag", height.toString())
//
//        editText.layoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            height
//        )
//
//        editText.setBackgroundColor(Color.YELLOW)
//
//        root.addView(btn)
//
//        // 레이아웃 리소스  id 혹은 뷰그룹 객체 전달 가능
//        setContentView(root)

        val root = LinearLayout(this)

        root.prientation = LinearLayout.VERTICAL

        root.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )



    }
}