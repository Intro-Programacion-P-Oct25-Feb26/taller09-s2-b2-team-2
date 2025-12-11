/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Ayuda01 {

    public static void main(String[] args) {
        String provincia = "Loja";
        
        char inicial = provincia.charAt(0);
        System.out.printf("La inicial es %s, pero en tipo char\n", inicial);
        
        String inicialDos = String.valueOf(inicial); // paso el char a String
        System.out.printf("La inicial es %s, pero en tipo String\n", inicialDos);
        
        System.out.println(inicialDos.equals("L"));
    }
}
