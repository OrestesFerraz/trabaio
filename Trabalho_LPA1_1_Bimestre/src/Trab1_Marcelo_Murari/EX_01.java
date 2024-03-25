/*
 Faça um programa que receba três números, calcule e mostre a multiplicação desses
números.
 */
package Trab1_Marcelo_Murari;


public class EX_01 {
    
    private double num1, num2, num3, result;
    
    EX_01(double num1, double num2, double num3) {
        
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        
        this.result = (this.num1 * this.num2) * this.num3;
    }
    
    public double Exibir() {
        return this.result;  
    }
}