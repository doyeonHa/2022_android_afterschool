package com.example.todayquote

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuoteAdapter (val dataList: List<Quote>):
    RecyclerView.Adapter<QuoteAdapter.QuoteItemViewHolder>()

{
        class QuoteItemViewHolder(val view: View) :
                RecyclerView.ViewHolder(view){

                }

    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: QuoteItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")*/

        override fun getItemViewType(position: Int): Int {
            return super.getItemViewType(position)
        }
    }