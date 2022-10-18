
package introduccio_java;

import java.util.Scanner;


public class Calculadora_simple {


    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Primer número: ");
        int num1 = teclat.nextInt();
        
        System.out.println("Operació: ");
        char op = teclat.next().charAt(0);
        
        System.out.println("Segon número: ");
        int num2 = teclat.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacio = num1 * num2;
        int divisio = num1 / num2;
        int modul = num1 % num2;
        
        switch (op){
            case '+':
                System.out.println("Resultat: " + suma);
                break;
            case '-':
                System.out.println("Resultat: " + resta);
                break;
            case '*':
                System.out.println("Resultat: " + multiplicacio);
                break;
            case '/':
                System.out.println("Resultat: " + divisio);
                break;    
            case '%':
                System.out.println("Resultat: " + modul);
                break;
        }
        
        
        
    }
    
}
