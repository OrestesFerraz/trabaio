/*
Faça um programa que receba o preço de um produto, calcule e mostre os preços a
pagar, sabendo-se que para pagamento à vista tem um desconto de 5% e para
pagamento a prazo tem um acréscimo de 10%.
 */
package Trab1_Marcelo_Murari;

import javax.swing.JOptionPane;


public class EX_03_Principal {
    
    public static void main (String args[]) {
        
        EX_03 ex03 = new EX_03();
        
        ex03.Porcentagem(Double.parseDouble(JOptionPane.showInputDialog("informe o preco")));
        
        JOptionPane.showMessageDialog(null, ex03.opcao(JOptionPane.showInputDialog("parcelado ou a vista?")));
    }
}
