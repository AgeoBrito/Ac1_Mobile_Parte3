package com.example.myapplication.Locais;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.adapter.Fotos_Adapter;
import com.example.myapplication.dataset.Dataset_Fotos;

public class Catedral extends AppCompatActivity {

    Button botaoSite, botaoMapa, botaoLigar;

    private RecyclerView recyclerFotos;
    private Fotos_Adapter fotosLocalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catedral);
        setupRecycler();

        botaoSite = (Button) findViewById(R.id.btnSite);
        botaoMapa = (Button) findViewById(R.id.btnMapa);
        botaoLigar = (Button) findViewById(R.id.btnLigar);

        botaoLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uri = Uri.parse("tel: 1532333233");
                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Catedral.this,
                            new String[]{Manifest.permission.CALL_PHONE},1);
                } else {
                    startActivity(intent);
                }


            }
        });

        botaoSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.catedraldesorocaba.org.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=-23.500281767465243, -47.458383926751246");
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
        fotosLocalAdapter = new Fotos_Adapter(Dataset_Fotos.getCatedral());
        recyclerFotos.setAdapter(fotosLocalAdapter);
        recyclerFotos.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}