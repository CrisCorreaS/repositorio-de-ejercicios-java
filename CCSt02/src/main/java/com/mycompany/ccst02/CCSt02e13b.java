package com.mycompany.ccst02;
//Cristina Correa Segade
/*Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2),
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con switch + “case :”
*/

import java.util.Scanner;

    public class CCSt02e13b {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int nota;
                 System.out.println("Introduce una nota de 0 a 10: ");
                 nota = teclado.nextInt();
                 
                switch (nota){
                    
                    case 0: System.out.println("Muy deficiente"); break;
                    case 1: System.out.println("Muy deficiente"); break;
                    case 2: System.out.println("Muy deficiente"); break;
                    case 3: System.out.println("Insuficiente"); break;
                    case 4: System.out.println("Insuficiente"); break;
                    case 5: System.out.println("Aprobado"); break;
                    case 6: System.out.println("Aprobado"); break;
                    case 7: System.out.println("Notable"); break;
                    case 8: System.out.println("Notable"); break;
                    case 9: System.out.println("Sobresaliente"); break;
                    case 10: System.out.println("Sobresaliente"); break;
                    default: System.out.println("No es válida esa nota");
                }
    }
}
