package Tp05;

import javax.xml.transform.Result;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      Fraccion f1= new Fraccion(6,5);
      Fraccion f2= new Fraccion(2,3);
      Fraccion f3= new Fraccion(7,2);
      Fraccion f4= new Fraccion(2,30);
      Fraccion f5= new Fraccion(1,15);
      Fraccion f6= f2.producto(f3);
      Fraccion f7= f1.resta(f6);
      Fraccion numerador = f7.suma(f4);
      Fraccion f8= new Fraccion(1,3);
      Fraccion f9= new Fraccion(5,1);
      Fraccion denominador= f8.cociente(f9);
      Fraccion result= numerador.cociente(denominador);
      System.out.println(result);





    }
}
