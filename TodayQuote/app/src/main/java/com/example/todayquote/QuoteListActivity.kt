package com.example.todayquote

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_activity)
        val pref = getSharedPreferences("quotes", Context.MODE_PRIVATE)
        val quotes = Quote.getQuotesFromPreference(pref)

        val layoutManager = LinearLayoutManager(this)

        val list = findViewById<RecyclerView>(R.id.quote_list)
    }
}