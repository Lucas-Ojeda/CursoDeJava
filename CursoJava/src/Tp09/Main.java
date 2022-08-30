package Tp09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int alt, gen, pes;
        System.out.println("---------------------------");
        System.out.println("Calculando el peso ideal");
        System.out.println("---------------------------");
        System.out.println("Ingrese la altura en centimetros de la persona");
        alt=l.nextInt();
        System.out.println("Si la persona es hombre ingrese un 1, si es mujer 2");
        gen=l.nextInt();
        while (gen!= 1 && gen!= 2){
            System.out.println("Si la persona es hombre ingrese un 1, si es mujer 2");
            gen= l.nextInt();
        }
        if(gen==1){
            pes=alt-110;
        }else{
            pes=alt-120;
        }
        System.out.println("El peso ideal es : "+pes);

    }
}
