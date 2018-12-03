package com.example.heriprastio.recyclerviewinfragment.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.heriprastio.recyclerviewinfragment.R

class MyAdapter(private val mDataSet: Array<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int) =
    MyViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.card_item, viewGroup, false))


    override fun onBindViewHolder(holder: MyViewHolder, i: Int) {

        holder.mTextView.text = mDataSet[i]
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mCadView: CardView
        var mTextView: TextView

        init {
            mCadView = itemView.findViewById<View>(R.id.card_view) as CardView
            mTextView = itemView.findViewById<View>(R.id.tv_blah) as TextView
        }
    }
}
