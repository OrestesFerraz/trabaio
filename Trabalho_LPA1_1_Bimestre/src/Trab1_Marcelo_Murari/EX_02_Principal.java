/*
Faça um programa que receba dois números, calcule e mostre a divisão do primeiro
número pelo segundo. Informe ao usuário que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
 */
package Trab1_Marcelo_Murari;

import javax.swing.JOptionPane;

public class EX_02_Principal {
    
    public static void main (String args[]) {
        double n1, n2;
        
        EX_02 ex02 = new EX_02();
        
        ex02.calculo(Double.parseDouble(JOptionPane.showInputDialog("informe o numero 1")),
                Double.parseDouble(JOptionPane.showInputDialog("informe o numnero 2")));
        
        JOptionPane.showMessageDialog(null, "o resultado é " + ex02.exib());
    }
}
