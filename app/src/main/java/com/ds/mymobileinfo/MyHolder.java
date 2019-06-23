package com.ds.mymobileinfo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView nameTxt;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.img = itemView.findViewById(R.id.modelimage);
        this.nameTxt= itemView.findViewById(R.id.modelname);
    }
}
