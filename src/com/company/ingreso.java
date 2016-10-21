package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class ingreso {

    ArrayList<ArrayList<String>> ingresar_alumnos(ArrayList<ArrayList<String>> alumnos) throws IOException {

        // Metodo scanner
        Scanner entradadatos = new Scanner(System.in);
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
            // Solicitar datos
            for(int i = 0; i < cant_alumnos; i++)
            {
                // creacion de matriz fila x y Columnas 8
                ArrayList<String> interno = new ArrayList<>();
                ArrayList<Double> notas = new ArrayList<>();
                double suma = 0.00;

                int alumnoId = i + 1;

                System.out.println("Ingrese nombre alumno #" + alumnoId);
                interno.add(entradadatos.next());
                System.out.println("Ingrese apellido alumno #" + alumnoId);
                interno.add(entradadatos.next());
                System.out.println("Ingrese No. de Carné alumno #" + alumnoId);
                interno.add(entradadatos.next());
                System.out.println("Ingrese e-mail alumno #" + alumnoId);
                interno.add(entradadatos.next());
                while (!tarea){
                    System.out.println("Puntaje de tareas alumno #" + alumnoId);
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
                tarea = false;
                interno.add(Double.toString(notas.get(0)));
                while (!examen){
                    System.out.println("Puntaje de examenes alumno #" + alumnoId);
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
                examen = false;
                interno.add(Double.toString(notas.get(1)));
                while (!proyecto){
                    System.out.println("Puntaje de proyectos alumno #" + alumnoId);
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
                proyecto = false;
                interno.add(Double.toString(notas.get(2)));

                for (double n: notas){
                    suma += n;
                }
                interno.add(Double.toString(suma));
                alumnos.add(interno);
            } // fin ciclo for
        }
        return alumnos;
    }
}
