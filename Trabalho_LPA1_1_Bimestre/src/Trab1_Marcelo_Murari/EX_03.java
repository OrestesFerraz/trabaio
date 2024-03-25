/*
Faça um programa que receba o preço de um produto, calcule e mostre os preços a
pagar, sabendo-se que para pagamento à vista tem um desconto de 5% e para
pagamento a prazo tem um acréscimo de 10%.
 */
package Trab1_Marcelo_Murari;


public class EX_03 {
    
    private String opc;
    
    private double preco, percnt;
    
    public void Porcentagem (double preco) {
        
        this.preco = preco;
        
    }
    
    public double opcao (String opc) {
        if ("parcelado".equals(opc)) {
            this.percnt = this.preco + (this.preco * 0.1);
        } else if ("a vista".equals(opc)) {
             this.percnt = this.preco - (this.preco * 0.05);
        }
         return this.percnt;
    }
}

