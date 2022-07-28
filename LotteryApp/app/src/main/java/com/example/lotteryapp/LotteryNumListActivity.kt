package com.example.lotteryapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LotteryNumListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val pref = getSharedPreferences("nums", MODE_PRIVATE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottery_num_list)
        var lottoNums = pref.getString("lottonums", "") // 키로 저장된 것이 없으면 두번째 인자로 대체함
        var numList = if(lottoNums == "") {
            mutableListOf<String>()
        }else {
            lottoNums!!.split(",").toMutableList()
        }

        val listView = findViewById<RecyclerView>(R.id.num_List)
        listView.setHasFixedSize(true)
        // 준비물3 => 레이아웃 매니져
        listView.layoutManager = LinearLayoutManager(this)

        // 준비물4, 5
        val adapter = LotteryListAdapter(numList)
        listView.adapter = adapter

        listView.setHasFixedSize(true)


    }
}