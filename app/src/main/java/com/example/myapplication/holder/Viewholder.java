package com.example.myapplication.holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class Viewholder extends RecyclerView.ViewHolder {

    private TextView txtNome;
    private Button bntSinopse;
    private ImageView imgCapa;



    public TextView getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(TextView txtNome) {
        this.txtNome = txtNome;
    }

    public Button getBntSinopse() {
        return bntSinopse;
    }

    public void setBntSinopse(Button bntSinopse) {
        this.bntSinopse = bntSinopse;
    }

    public ImageView getImgCapa() {
        return imgCapa;
    }

    public void setImgCapa(ImageView imgCapa) {
        this.imgCapa = imgCapa;
    }



    public Viewholder(@NonNull View itemView) {
        super(itemView);
        txtNome = (TextView) itemView.findViewById(R.id.Local);
        bntSinopse = (Button) itemView.findViewById(R.id.btnSaibaMais);
        imgCapa = (ImageView) itemView.findViewById(R.id.Capa);

    }


}

