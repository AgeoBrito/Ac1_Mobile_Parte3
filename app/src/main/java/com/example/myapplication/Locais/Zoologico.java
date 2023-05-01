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

public class Zoologico extends AppCompatActivity {

    Button botaoSite, botaoMapa, botaoLigar;

    private RecyclerView recyclerFotos;
    private Fotos_Adapter fotosLocalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoologico);
        setupRecycler();

        botaoSite = (Button) findViewById(R.id.btnSite);
        botaoMapa = (Button) findViewById(R.id.btnMapa);
        botaoLigar = (Button) findViewById(R.id.btnLigar);

        botaoLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uri = Uri.parse("tel: 1532275454");
                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Zoologico.this,
                            new String[]{Manifest.permission.CALL_PHONE},1);
                } else {
                    startActivity(intent);
                }


            }
        });

        botaoSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.sorocaba.sp.gov.br/zoologico/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=-23.505281601926097, -47.437245047880495");
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
        fotosLocalAdapter = new Fotos_Adapter(Dataset_Fotos.getZoologico());
        recyclerFotos.setAdapter(fotosLocalAdapter);
        recyclerFotos.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}