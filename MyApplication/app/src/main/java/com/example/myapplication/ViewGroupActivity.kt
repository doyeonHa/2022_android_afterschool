package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.widget.addTextChangedListener

class ViewGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.relative_study1)
        setContentView(R.layout.view_study2)

//        val button = findViewById<Button>(R.id.button2)
//        button.setOnClickListener{
//            Log.d("my_tag", "OnClick")
//        }
//        button.setOnLongClickListener{
//            Log.d("my_tag", "OnLongClick")
//            true
//        }
//
//        val toggle = findViewById<ToggleButton>(R.id.my_toggle_button)
//        toggle.setOnCheckedChangeListener{
//            compoundButton, isChecked ->
//            Log.d("my_tag", "checked : ${isChecked}")
//        }
//
//        val editText = findViewById<EditText>(R.id.edittext2)
//        editText.addTextChangedListener{
//            Log.d("my_tag", it.toString())
//        }
//
//        editText.setOnFocusChangeListener{ view, b ->
//            Log.d("my_tag", "focus : ${b}")
//            if(b) view.setBackgroundColor(Color.YELLOW)
//            else view.setBackgroundColor(Color.WHITE)
//        }

//        val checkBox = findViewById<CheckBox>(R.id.checkbox)
//        checkBox.setOnCheckedChangeListener {
//                compoundButton, b ->
//            if (b) Log.d("my_tag", "checked")
//            else Log.d("my_tag", "unchecked")
//
//        }
//
//        val group = findViewById<RadioGroup>(R.id.radio_group)
//        group.setOnCheckedChangeListener {
//                radioGroup, id ->
//            Log.d("my_tag", id.toString())
//
//            when(id) {
//                R.id.radio_button1 -> {
//                    Log.d("my_tag", "버튼 1 선택")
//                }
//                R.id.radio_button2 -> {
//                    Log.d("my_tag", "버튼 2 선택")
//                }
//            }
//        }
//
//        val spinner = findViewById<Spinner>(R.id.my_spinner)
//        val adapter = ArrayAdapter.createFromResource(this,
//        R.array.my_str_array,
//        android.R.layout.simple_spinner_item)
//        adapter.setDropDownViewResource(
//            android.R.layout.simple_spinner_dropdown_item)
//        spinner.adapter = adapter
//
//        spinner.onItemSelectedListener
//        object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(p0: AdapterView<*>?,
//                                        p1: View?,
//                                        p2: Int,
//                                        p3: Long) {
//                Log.d("my_tag", p2.toString())
//                val selected =
//                    p0?.getItemAtPosition(p2).toString()
//
//                Log.d("my_tag", selected)
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//        }
        }

    }
