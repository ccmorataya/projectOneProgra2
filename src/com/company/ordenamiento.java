package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ordenamiento{
        static void ascendingSort(ArrayList<ArrayList<String>> alumnos, int orderBy){
            int indexOrder = orderBy-1;
            Collections.sort(alumnos, new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> a, ArrayList<String> b) {
                    return a.get(indexOrder).compareTo(b.get(indexOrder));
                }
            });
        }

        static void descendingSort(ArrayList<ArrayList<String>> alumnos, int orderBy){
            int indexOrder = orderBy-1;
            Collections.sort(alumnos, new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> a, ArrayList<String> b) {
                    return a.get(indexOrder).compareTo(b.get(indexOrder));
                }
            }.reversed());
        }
}
