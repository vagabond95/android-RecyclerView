package com.project.vagabond95.android_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder>{

  List<String> datas;

  @Override
  public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text_button, parent, false);

    MainViewHolder viewHolder = new MainViewHolder(view);
    Log.e("ddd","create");
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(MainViewHolder holder, int position) {
    holder.text.setText(datas.get(position));
    Log.e("ddd","bind");
  }

  @Override
  public int getItemCount() {
    return datas.size();
  }

  public void setData(List<String> datas) {
    this.datas = datas;
  }
}
