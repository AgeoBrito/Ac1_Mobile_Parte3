package com.example.myapplication.Locais;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.Fotos_Adapter;
import com.example.myapplication.dataset.Dataset_Fotos;

public class Ciane extends AppCompatActivity {

    Button botaoSite, botaoMapa, botaoLigar;

    private RecyclerView recyclerFotos;
    private Fotos_Adapter fotosLocalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ciane);
        setupRecycler();

        botaoSite = (Button) findViewById(R.id.btnSite);
        botaoMapa = (Button) findViewById(R.id.btnMapa);
        botaoLigar = (Button) findViewById(R.id.btnLigar);

        botaoLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uri = Uri.parse("tel: 15996937613");
                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ciane.this,
                            new String[]{Manifest.permission.CALL_PHONE},1);
                } else {
                    startActivity(intent);
                }


            }
        });

        botaoSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.patiociane.com.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=-23.496361842036585, -47.460026822114166");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //        Intent dados = getIntent();
        //        String dado = dados.getStringExtra("local");
        //        int dadofoto= dados.getIntExtra("foto2", 0);

    }

    private void setupRecycler() {
        recyclerFotos = (RecyclerView) findViewById(R.id.Fotos);

        recyclerFotos.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        fotosLocalAdapter = new Fotos_Adapter(Dataset_Fotos.getCiane());
        recyclerFotos.setAdapter(fotosLocalAdapter);
        recyclerFotos.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}