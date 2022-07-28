package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_layout)

        //var id = R.id.my_button
        //식별자를 이용한 뷰 접근
        var myButton: Button=findViewById(R.id.my_button)
        var myTextVuew = findViewById<TextView>(R.id.my_textview)
        var myEditText = findViewById(R.id.my_edittext) as EditText

        myButton.setOnClickListener(
            object: View.OnClickListener {
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity,
                    "클릭!", Toast.LENGTH_SHORT).show()
                }
            }
        )
        myButton.setOnClickListener {
            v ->
            Toast.makeText(this@MainActivity,
                "클릭!", Toast.LENGTH_SHORT).show()
        }
    }
}