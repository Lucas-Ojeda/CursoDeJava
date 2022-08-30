package Tp10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num,aleatorio,cont=0, intentos=1;

        aleatorio = (int)(Math.random()*100);

        do{

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

            if(aleatorio > num){
                JOptionPane.showMessageDialog(null, "Digite un número mayor");
            }else if(aleatorio < num){
                JOptionPane.showMessageDialog(null, "Digite un número menor");
            }else{
                JOptionPane.showMessageDialog(null,"El número es correcto!!! Felicidades \n\nEl número era: "+aleatorio);
            }

            JOptionPane.showMessageDialog(null, "Número de intentos: "+intentos);

            intentos++;
            cont++;

        }while(num != aleatorio);

    }
}
