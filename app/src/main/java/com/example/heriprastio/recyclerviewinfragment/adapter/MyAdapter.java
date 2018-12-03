package com.example.heriprastio.recyclerviewinfragment.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.heriprastio.recyclerviewinfragment.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataSet;

    public MyAdapter(String[] strings) {
        this.mDataSet = strings;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.mTextView.setText(mDataSet[i]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView mCadView;
        public TextView mTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mCadView = (CardView) itemView.findViewById(R.id.card_view);
            mTextView = (TextView) itemView.findViewById(R.id.tv_blah);
        }
    }
}
