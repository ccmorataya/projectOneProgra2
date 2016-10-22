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
            int orderOption = 1;
            int ascOrDesc = 1;

            // Menú
            System.out.println("--Menú de Opciones--");
            System.out.println("¿Qué Deseas hacer?");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Consultar Datos");
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

                    if (optConsulta == 4){
                        System.out.println("Ordenar por: ");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Carné");
                        System.out.println("4. E-mail");
                        System.out.println("5. Notas de tareas");
                        System.out.println("6. Notas de examenes");
                        System.out.println("7. Notas de proyectos");
                        System.out.println("8. Nota final");
                        System.out.println("0. Regresar");
                        orderOption = entradadatos.nextInt();
                        System.out.println("Elige el tipo de ordenamiento:");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        ascOrDesc = entradadatos.nextInt();
                    }

                    Consulta cons = new Consulta();

                    if (optConsulta == 1)
                        cons.consultar_tareas(alumnos, orderOption, ascOrDesc);
                    else if (optConsulta == 2)
                        cons.consultar_proyectos(alumnos, orderOption, ascOrDesc);
                    else if (optConsulta == 3)
                        cons.consultar_examenes(alumnos, orderOption, ascOrDesc);
                    else if (optConsulta == 4)
                        cons.consultar_alumnos(alumnos, orderOption, ascOrDesc);
                    else if (optConsulta == 0)
                        break;

                    break;
                case 0:
                    menu_alive = false;
                    break;
            }

        }

    } // fin args

} // fin clase