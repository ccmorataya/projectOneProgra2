package com.company;
import java.io.IOException;
import java.util.Scanner;

public class ingreso {

    public void ingresar_alumnos() throws IOException {

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
            String[][] alumnos = new String[cant_alumnos][8];

            // Solicitar datos
            for(int i = 0; i < cant_alumnos; i++)
            {

                System.out.println("Ingrese Nombre");
                alumnos[i][0] = entradadatos.next();
                System.out.println("Ingrese Apellido");
                alumnos[i][1] = entradadatos.next();
                System.out.println("Ingrese E-mail");
                alumnos[i][2] = entradadatos.next();
                System.out.println("Ingrese No. de Carné");
                alumnos[i][3] = entradadatos.next();
                System.out.println("Puntaje de tareas");
                alumnos[i][4] = Double.toString(entradadatos.nextDouble());
                System.out.println("Puntaje exámenes");
                alumnos[i][5] = Double.toString(entradadatos.nextDouble());
                System.out.println("Puntaje proyectos");
                alumnos[i][6] = Double.toString(entradadatos.nextDouble());
            } // fin ciclo for

        }

    }


}

