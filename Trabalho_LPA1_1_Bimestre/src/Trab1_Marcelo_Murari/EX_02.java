/*
 Faça um programa que receba dois números, calcule e mostre a divisão do primeiro
número pelo segundo. Informe ao usuário que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
 */
package Trab1_Marcelo_Murari;


public class EX_02 {
    
    public double n1, n2, R;
    
    public void calculo (double n1, double n2) {
        
        this.n1 = n1;
        this.n2 = n2;
        
        this.R = this.n1 / this.n2;
    }
    
    public double exib () {
        return this.R;
    }
}
