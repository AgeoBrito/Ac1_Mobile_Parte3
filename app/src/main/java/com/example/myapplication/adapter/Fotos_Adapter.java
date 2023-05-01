package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.holder.ViewFotos;
import com.example.myapplication.holder.Viewholder;
import com.example.myapplication.model.Fotos;

import java.util.List;

public class Fotos_Adapter extends RecyclerView.Adapter<ViewFotos> {

    private List<Fotos> fotosLocais;

    public Fotos_Adapter (List<Fotos> fotosLocais) {this.fotosLocais = fotosLocais;
    }


    @NonNull
    @Override
    public ViewFotos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewFotos(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.fotos_layout, parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewFotos holder, int position) {
        Fotos fotosLocal = fotosLocais.get(position);
        holder.getFotos().setImageResource(fotosLocal.getImagemlocais());
    }

    @Override
    public int getItemCount() {
        return fotosLocais == null ? 0 : fotosLocais.size();
    }
}
