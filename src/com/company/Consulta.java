package com.company;

import java.util.ArrayList;

class Consulta {
    void consultar_alumnos(ArrayList<ArrayList<String>> alumnos){
        System.out.println("Nombre\t\t\tApellido\t\tEmail\t\t\t\t\t\tCarné\t\t\t\tTareas\t\tExamenes\tProyectos\t\tNota Final");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        for (ArrayList<String> a : alumnos){
            for (String aa: a){
                System.out.print(aa+"\t\t");
            }
        }
        System.out.println();
    }

    void consultar_tareas(){

    }

    void consultar_proyectos(){

    }

    void consultar_examenes(){

    }
}