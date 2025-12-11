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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Dado el arreglo; determinar cuantos elementos están arriba de la media
                aritmética y cuantos están por debajo de la medía aritmética. */
        
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double mediaArimetica;
        String mensaje = "";
                
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
            mediaArimetica = suma / arreglo.length;
            
        for (int i = 0; i < arreglo.length; i++) {
        
            if (arreglo[i] > mediaArimetica){
                mensaje = String.format("Numero %d encima de la media arimetica"
                        + " %.2f",arreglo[i],mediaArimetica);
                
            } else{
                mensaje = String.format("Numero %d por debajo de la media arimetica"
                        + " %.2f",arreglo[i],mediaArimetica);
            }
            System.out.printf("%s\n", mensaje);
        }
            
        
        }
  
        
        
        
        
    }
