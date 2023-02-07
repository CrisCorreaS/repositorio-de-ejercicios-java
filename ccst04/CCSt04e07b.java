/*Cristina Correa Segade
Un algoritmo de encriptado monoalfabético consiste en la sustitución de una 
letra por otra a lo largo de todo el mensaje, por ejemplo las A por F, las B 
por X, las C por M. Obviamente si la A pasa a ser F, ninguna otra letra pasará 
F. Hacer una segunda versión que funcione con mayúsculas y minúsculas.
*/
import java.util.Scanner;

public class CCSt04e07b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena1, cadena2, mayusculas, minusculas;
        int longitudTexto, i;
        char letra, nueva;
        
        System.out.println("Introduce un texto: ");
        cadena1 = teclado.nextLine();
        longitudTexto = cadena1.length();
        mayusculas = "ABCDEFGHIJKLMNñOPQRSTUVWXYZ";
        minusculas = "abcdefghijklmnñopqrstuvwxyz";
        cadena2 = "";
        
        for(i = 0; i < longitudTexto; i++) {
            letra = cadena1.charAt(i);
            int posicionMayusculas = mayusculas.indexOf(letra);
            int posicionMinusculas = minusculas.indexOf(letra);
            

            if(posicionMayusculas != -1) {
                nueva = mayusculas.charAt(26 - posicionMayusculas);
            } 
            else{
                if(posicionMinusculas != -1) {
                    nueva = minusculas.charAt(26 - posicionMinusculas);
                }
                else{
                    nueva = letra;
                }  
            } 
            
            cadena2 = cadena2 + nueva;
        }
        
        System.out.println("El texto introducido encriptado es: " + cadena2);
    }
}

