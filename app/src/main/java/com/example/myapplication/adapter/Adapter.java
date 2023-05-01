package com.example.myapplication.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Locais.Ciane;
import com.example.myapplication.Locais.Zoologico;
import com.example.myapplication.model.Album;
import com.example.myapplication.Locais.Catedral;
import com.example.myapplication.R;
import com.example.myapplication.holder.Viewholder;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Viewholder> {

    private final List<Album> album;

    Intent intent;
    public Adapter(List<Album> album){
        this.album = album;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.album, parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Album albuns = album.get(position);
        holder.getTxtNome().setText(albuns.getLocal());
        holder.getImgCapa().setImageResource(albuns.getImagem());
        holder.getBntSinopse().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                switch (albuns.getLocal()) {
                    case "Catedral de Sorocaba":
                        intent = new Intent(view.getContext(), Catedral.class);
                        break;
                    case "Shopping Ciane":
                        intent = new Intent(view.getContext(), Ciane.class);
                        break;
                    case "Zoologico de Sorocaba":
                        intent = new Intent(view.getContext(), Zoologico.class);
                        break;
                    default:
                        intent = null;
                        break;
                }
                if (intent != null) {
                    view.getContext().startActivity(intent);
                }
            }

//                Intent intent = new Intent(view.getContext(), Catedral.class);
//                view.getContext().startActivity(intent);
            });
        }


    @Override
    public int getItemCount() {
        return album == null ? 0 : album.size();
    }
}
