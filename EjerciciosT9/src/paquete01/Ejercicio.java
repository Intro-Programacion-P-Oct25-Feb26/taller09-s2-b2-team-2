/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;

        int i;
        System.out.println("Ingrese el limite de marcas que quiere ingresar:");
        limite = entrada.nextInt();
        String[] productos = new String[limite];
        String producto;
        String reporte = "";
        
        entrada.nextLine();
        for (i = 0; i < limite; i++) {
            
            System.out.println("Ingrese la marca de auto : ");
            producto = entrada.nextLine();
            String letra = producto.substring(0, 1);
            letra = letra.toUpperCase();
            
            
            
            if (letra.equals("A") || letra.equals("C") || letra.equals("T")) {
                i = i-1;
            } else {
                
                productos[i] = producto;
                reporte = String.format("%sMarca %d: %s\n",reporte,i,producto.toUpperCase());
            }
            
        }
        System.out.printf("%s",reporte);
    }
}
