package com.mingshan.packagenameviewer.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mingshan.packagenameviewer.R;

/**
 * Created by mms on 2018/12/20.
 */
public class HotAppAdapter extends RecyclerView.Adapter {
    private Context mContext;

    public HotAppAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = View.inflate(mContext, R.layout.item_hot_app,null);
        //返回MyViewHolder的对象
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvAppName;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvAppName = itemView.findViewById(R.id.tvAppName);
        }
    }

}
