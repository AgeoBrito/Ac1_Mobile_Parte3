package com.example.myapplication.dataset;

import com.example.myapplication.R;
import com.example.myapplication.model.Fotos;

import java.util.ArrayList;
import java.util.List;

public class Dataset_Fotos {

    private static List<Fotos>lugares;

    public static List<Fotos> getCatedral(){
        lugares = new ArrayList<>();
        lugares.add(new Fotos(R.mipmap.igreja));
        lugares.add(new Fotos(R.mipmap.catedralsorocabana));
        lugares.add(new Fotos(R.mipmap.catedralmetropolitana));

    return lugares;
    }

    public static List<Fotos> getCiane(){
        lugares = new ArrayList<>();
        lugares.add(new Fotos(R.mipmap.entradaciane));
        lugares.add(new Fotos(R.mipmap.patio_ciane));
        lugares.add(new Fotos(R.mipmap.lindolugar));

        return lugares;
    }

    public static List<Fotos> getZoologico(){
        lugares = new ArrayList<>();
        lugares.add(new Fotos(R.mipmap.hipo));
        lugares.add(new Fotos(R.mipmap.maqueicos));
        lugares.add(new Fotos(R.mipmap.elfante));

        return lugares;
    }

}
