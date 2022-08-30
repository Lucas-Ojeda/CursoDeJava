package Tp08;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        double a, b;
        Scanner l=new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Calculando la Raiz Cuadrada de un numero");
        System.out.println("------------------------------------------");
        System.out.println("Ingrese un numero");
        a=l.nextDouble();
        if(a<0){
            System.out.println("Error");
        }
        else {
            b=Math.sqrt(a);
            System.out.println("La raiz cuadrada de "+a+" es: "+b);
       }
    }
}
