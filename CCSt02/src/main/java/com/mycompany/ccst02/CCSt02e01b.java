package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer dos números enteros y muestre si el primero es mayor que el segundo.

import java.util.Scanner;

    public class CCSt02e01b {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                
                if (num1>num2) {
                    System.out.println("El primer número es mayor que el segundo número");
                }
                
                        
                else {
                    if (num1==num2) {
                        System.out.println("Ambos números son iguales");
                    }
                    
                    else {
                        System.out.println("El primer número es menor que el segundo número");
                    }

                }
    }
}
