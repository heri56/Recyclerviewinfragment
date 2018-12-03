package com.example.heriprastio.recyclerviewinfragment.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.heriprastio.recyclerviewinfragment.R;
import com.example.heriprastio.recyclerviewinfragment.adapter.MyAdapter;

public class CurrentFragmet extends Fragment {
    public CurrentFragmet() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_current, container, false);
        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.listRecycle);
        mRecyclerView.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Mummet 1", "Mummet 2", "Mummet 3", "Mummet 5", "Mummet 6", "Mummet 7"});
        mRecyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        return rootView;

    }
}
