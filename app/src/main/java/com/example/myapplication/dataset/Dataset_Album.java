package com.example.myapplication.dataset;

import com.example.myapplication.model.Album;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Dataset_Album {

    private static List<Album> album;

    public static List<Album>getAlbum(){
    album = new ArrayList<>();
    album.add( new Album("Catedral de Sorocaba", 0, R.mipmap.catedral));
    album.add( new Album("Shopping Ciane",1, R.mipmap.ciane));
    album.add( new Album("Zoologico de Sorocaba", 2 , R.mipmap.zoologico));
    return album;

    }

}
