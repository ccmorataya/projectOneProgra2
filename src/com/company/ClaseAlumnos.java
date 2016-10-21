package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClaseAlumnos {

    public static void main (String[] args) throws IOException {
        ArrayList<ArrayList<String>> alumnos = new ArrayList<ArrayList<String>>(){};

        // define la lectura del teclado
        Scanner entradadatos = new Scanner(System.in);

        // variable del loop para el menu.
        boolean menu_alive = true;

        while(menu_alive){

            int selec_= 0;

            // Menú
            System.out.println("--Menú de Opciones--");
            System.out.println("¿Qué Deseas hacer?");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Consultar Datos");
            System.out.println("3. Ordenar Datos");
            System.out.println("4. Salir");

            System.out.print("Favor ingresar opción: ");
            selec_= entradadatos.nextInt();

            switch(selec_){
                case 1:
                    // llamar a ingreso de datos.
                    ingreso ing = new ingreso();
                    alumnos = ing.ingresar_alumnos(alumnos);
                    break;
                case 2:
                    Consulta cons = new Consulta();
                    cons.consultar_alumnos(alumnos);
                    break;
                case 3:
                    break;
                case 4:
                    menu_alive = false;
                    break;
            }

        }

    } // fin args

} // fin clase