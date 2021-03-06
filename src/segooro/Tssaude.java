/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.io.Serializable;

/**
 *
 * @author a
 */
public class Tssaude extends Seguro  implements Serializable{  //Declaração da class
   public double despesas_a_reembolsar=0;  //Valor a reembolsar ao final do ano
   private int maximo_a_reembolsar=0;  //Valor maximo de reembolso
      
    public Tssaude(float p, int m){  //Construtor
        super(p,tseguro.Saude);  //Usa o metodo da superclass
        this.maximo_a_reembolsar=m;  //Atribui o maximo
    }
    
   @Override
    public String toString(){  //Metodo ToString
        String exit=super.toString();  //Variavel de saida
        exit=exit+" Valor até ao momento a reembolsar em 02/01/2015 e de:"+this.getDespesas_a_reembolsar()+"€"; //Agrega ainda o valor a receber no inicio do ano      
        return exit;  //Variavel de saida
    } 
    
   @Override
    public void despesa(double v){  //Activa despesa
        this.despesas_a_reembolsar=this.despesas_a_reembolsar+(v*0.30);  //Adiciona 30% do valor pago como reembolso
        if ((this.despesas_a_reembolsar>this.maximo_a_reembolsar)&&this.maximo_a_reembolsar!=0) //controla se chegou ao maximo
           this.despesas_a_reembolsar=this.maximo_a_reembolsar;  //Fica com o maximo
    }

    /**
     * @return the despesas_a_reembolsar
     */
    public double getDespesas_a_reembolsar() {
        return despesas_a_reembolsar;
    }

    /**
     * @param despesas_a_reembolsar the despesas_a_reembolsar to set
     */
    public void setDespesas_a_reembolsar(double despesas_a_reembolsar) {
        this.despesas_a_reembolsar = despesas_a_reembolsar;
    }
    
    
}
