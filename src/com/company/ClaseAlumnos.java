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

            int selec_;
            int optConsulta;

            // Menú
            System.out.println("--Menú de Opciones--");
            System.out.println("¿Qué Deseas hacer?");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Consultar Datos");
            System.out.println("3. Ordenar Datos");
            System.out.println("0. Salir");

            System.out.print("Favor ingresar opción: ");
            selec_= entradadatos.nextInt();

            switch(selec_){
                case 1:
                    // llamar a ingreso de datos.
                    ingreso ing = new ingreso();
                    alumnos = ing.ingresar_alumnos(alumnos);
                    break;
                case 2:
                    System.out.println("Ingresa el tipo de consulta a realizar:");
                    System.out.println("1. Consultar Tareas");
                    System.out.println("2. Consultar Proyectos");
                    System.out.println("3. Consultar Examenes");
                    System.out.println("4. Consultar Alumnos");
                    System.out.println("0. Regresar");
                    optConsulta = entradadatos.nextInt();

                    Consulta cons = new Consulta();

                    if (optConsulta == 1)
                        cons.consultar_tareas();
                    else if (optConsulta == 2)
                        cons.consultar_proyectos();
                    else if (optConsulta == 3)
                        cons.consultar_examenes();
                    else if (optConsulta == 4)
                        cons.consultar_alumnos(alumnos);
                    else if (optConsulta == 0)
                        break;

                    break;
                case 3:
                    break;
                case 0:
                    menu_alive = false;
                    break;
            }

        }

    } // fin args

} // fin clase