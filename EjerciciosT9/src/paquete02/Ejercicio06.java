/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] tipoCafe = new String[3];
        tipoCafe[0] = "Café tradicional";
        tipoCafe[1] = "Café francés";
        tipoCafe[2] = "Café alemán";

        double[] precios = new double[3];
        precios[0] = 1.5;
        precios[1] = 2.1;
        precios[2] = 2.3;
        boolean bandera = true;
        int[] cantidad = new int[3];
        double[] subTotales = new double[3];
        int cafe;
        int numeroCafes;
        double subTotal = 0;
        double total = 0;
        String reporte = "";

        while (bandera) {
            System.out.println("MENU CAFÉS\n--ESCOGA UNA OPCIÓN--");
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d %s,%.2f$\n", i, tipoCafe[i], precios[i]);
            }
            System.out.println("3. NO REGISTRAR");
            numeroCafes = 0;
            System.out.println("INGRESE SU OPCION: ");
            cafe = entrada.nextInt();

            if (cafe >= 0 && cafe <= 2) {
                System.out.println("INGRESE LA CANTIDAD: ");
                numeroCafes = entrada.nextInt();

                switch (cafe) {
                    case 0:
                        subTotales[0] = subTotales[0] + (numeroCafes * precios[0]);
                        cantidad[0] = numeroCafes;

                        break;
                    case 1:
                        subTotales[1] = subTotales[1] + (numeroCafes * precios[1]);
                        cantidad[1] = numeroCafes + cantidad[1];
                        break;
                    case 2:
                        subTotales[2] = subTotales[2] + (numeroCafes * precios[2]);
                        cantidad[2] = numeroCafes + cantidad[2];
                        break;
                }

            }else{
                bandera = false;
            }

        }
        for (int i = 0; i < 3; i++) {

            reporte = String.format("%s%s (%d t), valor subtotal cancelar %.2f\n",
                    reporte,
                    tipoCafe[i],
                    cantidad[i],
                    subTotales[i]);
        }
        for (int i = 0; i < 3; i++) {
            total = total + subTotales[i];
        }
        
        reporte = String.format("%s\nEl total a pagar : %.2f $", reporte, total);
        if (subTotales[0] >0 ||subTotales[1] >0 ||subTotales[2] >0 ){
            System.out.printf("%s", reporte);
        }else{
            System.out.println("NO SE PUDO REGISTRAR DATOS");
        }
        
        
    }

}
