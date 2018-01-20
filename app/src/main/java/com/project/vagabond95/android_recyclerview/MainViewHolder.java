package com.project.vagabond95.android_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jerry on 2018. 1. 20..
 */

public class MainViewHolder extends RecyclerView.ViewHolder{

  TextView text;

  public MainViewHolder(View itemView) {
    super(itemView);
    text = itemView.findViewById(R.id.item_text);
  }
}
