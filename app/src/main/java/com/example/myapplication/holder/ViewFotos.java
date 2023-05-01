package com.example.myapplication.holder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class ViewFotos extends RecyclerView.ViewHolder {

    private ImageView fotos;

    public ImageView getFotos() {
        return fotos;
    }

    public void setFotos(ImageView fotos) {
        this.fotos = fotos;
    }

    public ViewFotos(@NonNull View itemView) {
        super(itemView);
        fotos = (ImageView) itemView.findViewById(R.id.Capas);
    }
}
