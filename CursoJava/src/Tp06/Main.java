package Tp06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Usando la Clase Math ");
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        System.out.println("---->Ángulos<----");
        System.out.println("----------------------------------");

        System.out.println("introduzca un ángulo");
        Scanner l= new Scanner(System.in);
        Double a= l.nextDouble();
        System.out.println("introduzca otro ángulo");
        Double a1, a2, a3, a4, a5, a6, b1, b2;
        a6= l.nextDouble();
        a1= Math.sin(a);
        a2=Math.cos(a);
        a3=Math.tan(a);
        a4=Math.atan(a);
        a5=Math.atan2(a,a6);
        System.out.println("El valor del seno de "+a+" es: "+a1);
        System.out.println("El valor del coseno de "+a+" es: "+a2);
        System.out.println("El valor de la tangente de "+a+" es: "+a3);
        System.out.println("El valor del arcotangente de "+a+" es: "+a4);
        System.out.println("El valor del arcotangente entre "+a+" y "+a6+" es: "+a5);

        System.out.println("----------------------------------");
        System.out.println("---->Exponencial y Logaritmo Natural<----");
        System.out.println("----------------------------------");

        System.out.println("Introduzca un numero");
        double num= l.nextDouble();
        b1= Math.exp(num);
        b2=Math.log(num);
        System.out.println("El exponencial de "+num+" es: "+b1);
        System.out.println("El Logaritmo natural en base e de "+num+" es: "+b2);

        System.out.println("----------------------------------");
        System.out.println("---->Constantes PI y E<----");
        System.out.println("----------------------------------");
        System.out.println("El numero Pi es: "+Math.PI);
        System.out.println("El numero e es : "+Math.E);



    }

}
