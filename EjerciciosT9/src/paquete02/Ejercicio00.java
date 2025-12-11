package paquete02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author reroes
 */
public class Ejercicio00 {

    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // Se declara un arreglo de tipo double, llamado promedios
        double[] promediosMateria1 = {8.1, 9, 9.5, 10, 9.9};
        double[] promediosMateria2 = {7.9, 9.2, 9.7, 9.8, 9.7};
        String[] estudiantes = {"Luis", "Ana", "Mónica", "José", "Juan"};
        double[] promediosFinales = new double[5];

        double sumaNotas; // = promediosMateria1[2] + promediosMateria2[2];
        double promedio; // = sumaNotas / 2;
        // promediosFinales[2] = promedio;

        String mensajeFinal = ""; // variable que acumula un reporte final
        // Se hace uso del ciclo repetitivo for para recorrer los arreglos
        // y presentar los valore de las posiciones

        for (int i = 0; i < promediosFinales.length; i++) {
            // se suma el valor de la posición i del arreglo 
            // promediosMateria1 y promediosMateria2
            sumaNotas = promediosMateria1[i] + promediosMateria2[i];
            // se obtiene el promedio de la suma de las notas
            promedio = sumaNotas / 2;
            // se asigna a la posición i del arreglo promediosFinales
            promediosFinales[i] = promedio;
        }

        for (int i = 0; i < promediosMateria1.length; i++) {

            mensajeFinal = String.format("%sEstudiante:%s - promedio final: "
                    + "%.4f\n",
                    mensajeFinal,
                    estudiantes[i],
                    promediosFinales[i]);
        }

        System.out.printf("%s\n", mensajeFinal);
        /*
        
        Estudiante:Luis, materia 1: 8.10, materia 2: 7.9. Promedio final: 8,0000
        */
    }

}
