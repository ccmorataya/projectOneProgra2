package com.company;

import java.util.ArrayList;

public class Consulta {
    public void consultar_alumnos(ArrayList<ArrayList<String>> alumnos){
        for (ArrayList<String> a : alumnos){
            for (String aa: a){
                System.out.println(aa);
            }
        }
    }
}

