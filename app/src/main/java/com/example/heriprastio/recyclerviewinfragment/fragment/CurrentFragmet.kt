package com.example.heriprastio.recyclerviewinfragment.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.heriprastio.recyclerviewinfragment.R
import com.example.heriprastio.recyclerviewinfragment.adapter.MyAdapter
import com.example.heriprastio.recyclerviewinfragment.model.Team

class CurrentFragmet : Fragment() {

    private var teams: MutableList<Team> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_current, container, false)
        val mRecyclerView = rootView.findViewById<View>(R.id.listRecycle) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        val adapter = MyAdapter(teams)
        mRecyclerView.adapter = adapter
        val linearLayoutManager = LinearLayoutManager(activity)
        mRecyclerView.layoutManager = linearLayoutManager
        return rootView

    }
}
