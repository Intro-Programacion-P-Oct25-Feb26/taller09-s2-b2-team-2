/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String[] rangos =       {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos =   {10,      20,     3,        1}    
         */
        // Ingreso los arreglos 
        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10, 19, 20};
        String[] rangos = {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos = new int[4]; // {0, 0, 0, 0}
        int respuesta;

        /* Ciclo for donde comparo si el valor de i es menor al numero de la posicion del arreglo
           de respuestas, si se da el caso, la variable respuesta almacenara el valor que tenga la posicion
            del arreglo de respuestas en este caso 1 y asi sucesivameente
         */
        for (int i = 0; i < respuestas.length; i++) {
            respuesta = respuestas[i];
            
            /* Se debe arreglar los comparadores logicos de los condicionales, en vez de usar or
               usaremos and para que se cumplan ambas condiciones */ 

            /* Condicional donde comparo el valor almacenado de respuesta, si es mayor o igual a 1
               y menor igual a 5, entonces el arreglo de valoresRangos sumara 1 
             */
            if ((respuesta >= 1) && (respuesta <= 5)) {
                valoresRangos[0] = valoresRangos[0] + 1;

            } else {
                /* Si no se cumple el primer condicional entonces se ira a este condicional
                   donde comparo el valor almacenado de respuesta, si es mayor o igual a 6
                   y menor igual a 10, entonces el arreglo de valoresRangos den la posicion 1 sumara 1 
                 */
                if ((respuesta >= 6) && (respuesta <= 10)) {
                    valoresRangos[1] = valoresRangos[1] + 1;
                } else {
                    /* Si no se cumple el primer y segundo condicional entonces se ira a este condicional
                       donde comparo el valor almacenado de respuesta, si es mayor o igual a 11
                       y menor igual a 15, entonces el arreglo de valoresRangos den la posicion 2 sumara 1 
                     */
                    if ((respuesta >= 11) && (respuesta <= 15)) {
                        valoresRangos[2] = valoresRangos[2] + 1; //3+1 
                    } else {
                        /* Si no se cumple el primer, segundo y tercer condicional entonces se ira a este condicional
                            donde comparo el valor almacenado de respuesta, si es mayor o igual a 16
                            y menor igual a 20, entonces el arreglo de valoresRangos den la posicion 3 sumara 1 
                         */
                        if ((respuesta >= 16) && (respuesta <= 20)) {
                            valoresRangos[3] = valoresRangos[3] + 1;//1+1                        }

                        }
                    }

                }

            }
        }
        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }

    }

}
