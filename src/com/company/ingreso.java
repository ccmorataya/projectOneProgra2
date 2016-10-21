package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class ingreso {

    public ArrayList<ArrayList<String>> ingresar_alumnos(ArrayList<ArrayList<String>> alumnos) throws IOException {

        // Metodo scanner
        Scanner entradadatos = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double suma = 0.00;
        boolean tarea = false;
        boolean examen = false;
        boolean proyecto = false;

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
                while (!tarea){
                    System.out.println("Puntaje de tareas");
                    notas.add(entradadatos.nextDouble());
                    double notasLastElement = notas.get(notas.size()-1);
                    if (notasLastElement > 100 || notasLastElement < 0){
                        System.out.println("Nota invalida intente nuevamente");
                        notas.remove(notasLastElement);
                    }
                    else{
                        tarea = true;
                    }
                }
                interno.add(Double.toString(notas.get(0)));
                while (!examen){
                    System.out.println("Puntaje de examenes");
                    notas.add(entradadatos.nextDouble());
                    double examenLastElement = notas.get(notas.size()-1);
                    if (examenLastElement > 100 || examenLastElement < 0){
                        System.out.println("Nota invalida intente nuevamente");
                        notas.remove(examenLastElement);
                    }
                    else{
                        examen = true;
                    }
                }
                interno.add(Double.toString(notas.get(1)));
                while (!proyecto){
                    System.out.println("Puntaje de proyectos");
                    notas.add(entradadatos.nextDouble());
                    double proyectoLastElement = notas.get(notas.size()-1);
                    if (proyectoLastElement > 100 || proyectoLastElement < 0){
                        System.out.println("Nota invalida intente nuevamente");
                        notas.remove(proyectoLastElement);
                    }
                    else{
                        proyecto = true;
                    }
                }
                interno.add(Double.toString(notas.get(2)));

                for (double n: notas){
                    suma += n;
                }
                interno.add(Double.toString(suma));

            } // fin ciclo for
            alumnos.add(interno);
        }
        return alumnos;
    }
}
