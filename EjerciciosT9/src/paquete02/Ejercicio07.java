/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double[] numeros = new double[10];
        double suma = 0;
        double diferencia;
        double promedio;
        String mensaje = "";
        String mensajeDiferencia = "";
                
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = entrada.nextDouble();
            mensaje = String.format("%s %.1f",mensaje,numeros[i]);
            suma = suma + numeros[i];
        }
            promedio = suma / numeros.length;
            
        for (int i = 0; i < numeros.length; i++) {
        
            diferencia = numeros[i] - promedio;
            mensajeDiferencia = String.format("%s %.1f - %.1f = %.1f\n",
                    mensajeDiferencia,numeros[i],promedio,diferencia);
        }
        
        System.out.printf("Numeros ingresados:%s\nPromedio numerico"
                + " de los numeros ingresados: %.1f\nDiferencia"
                + " de los numeros ingresados con el promedio:\n%s", mensaje,promedio,
                mensajeDiferencia);

    }

}