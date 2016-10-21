package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ingreso {

    public ArrayList<ArrayList<String>> ingresar_alumnos(ArrayList<ArrayList<String>> alumnos) throws IOException {

        // Metodo scanner
        Scanner entradadatos = new Scanner(System.in);

        System.out.println("- Cuantos alumnos deseas ingresar: ");

        // variable de cantidad de alumnos
        int cant_alumnos = entradadatos.nextInt();

        if (cant_alumnos > 49){
            // Si es mayor a 49
            System.out.println("La cantidad de alumnos a ingresar excede los limites...\nPresiona cualquier tecla para continuar.");
            char pause = (char) System.in.read();
        }
        else if (cant_alumnos <= 0){
            // Si es menor o igual a cero
            System.out.println("El número de alumnos a ingresar es invalido\nPresiona cualquier tecla para continuar.");
            char pause = (char) System.in.read();
        }else{ // caso contrario

            // creacion de matriz fila x y Columnas 8
            ArrayList<String> interno = new ArrayList<>();

            // Solicitar datos
            for(int i = 0; i < cant_alumnos; i++)
            {

                System.out.println("Ingrese Nombre");
                interno.add(entradadatos.next());
                System.out.println("Ingrese Apellido");
                interno.add(entradadatos.next());
                System.out.println("Ingrese E-mail");
                interno.add(entradadatos.next());
                System.out.println("Ingrese No. de Carné");
                interno.add(entradadatos.next());
                System.out.println("Puntaje de tareas");
                interno.add(Double.toString(entradadatos.nextDouble()));
                System.out.println("Puntaje exámenes");
                interno.add(Double.toString(entradadatos.nextDouble()));
                System.out.println("Puntaje proyectos");
                interno.add(Double.toString(entradadatos.nextDouble()));
            } // fin ciclo for
            alumnos.add(interno);
        }
        return alumnos;
    }
}
