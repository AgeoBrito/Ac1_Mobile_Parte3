package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.adapter.Adapter;
import com.example.myapplication.dataset.Dataset_Album;

public class MainActivity extends AppCompatActivity {


    Button botao;

    private RecyclerView recyclerAlbum;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerAlbum = (RecyclerView) findViewById(R.id.recyclerAlbum);

        setupRecycler();
    }



    public void  setupRecycler(){
        //define o layout
        recyclerAlbum = (RecyclerView)findViewById(R.id.recyclerAlbum);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerAlbum.setLayoutManager(layoutManager);
        //define o adapter
        adapter = new Adapter(Dataset_Album.getAlbum());
        recyclerAlbum.setAdapter(adapter);
        //Traçar uma linha entre os itens
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL));

    }

    public void trocarClick(View view) {
        RecyclerView.LayoutManager layoutManager = recyclerAlbum.getLayoutManager();

        if(layoutManager instanceof GridLayoutManager){
            recyclerAlbum.setLayoutManager(new LinearLayoutManager(this));
        }else{
            recyclerAlbum.setLayoutManager(new GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false));
        }
    }

}