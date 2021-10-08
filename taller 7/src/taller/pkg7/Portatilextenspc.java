/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg7;

/**
 *
 * @author El Centurion
 */
public class Portatilextenspc {
     private int peso;
      
    public Portatilextenspc(String codigo, int precio, String eslogan, int peso){
        this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return super.toString()+" "+
                "Peso: "+this.peso;
    }
}
