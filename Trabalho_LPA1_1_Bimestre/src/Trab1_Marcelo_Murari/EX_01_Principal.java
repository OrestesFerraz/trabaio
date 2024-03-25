/*
  Faça um programa que receba três números, calcule e mostre a multiplicação desses
números.
 */
package Trab1_Marcelo_Murari;

import javax.swing.JOptionPane;

public class EX_01_Principal {
    
    public static void main (String args[]) {
        
        double num1, num2, num3;
        num1= Double.parseDouble(
            JOptionPane.showInputDialog("informe o número 1"));
       num2 = Double.parseDouble(
            JOptionPane.showInputDialog("informe o número 2 "));
       num3 = Double.parseDouble(
            JOptionPane.showInputDialog("informe o número 3 "));
       
        EX_01 ex01 = new EX_01(num1, num2, num3);
        
        
       
       JOptionPane.showMessageDialog(null,"o resultado é " + ex01.Exibir());
    }
}
