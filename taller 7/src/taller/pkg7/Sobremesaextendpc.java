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
public class Sobremesaextendpc {
       private String tipoTorre;
    
    public Sobremesaextendpc(String codigo,int precio,String eslogan,String tipoTorre ){
        this.tipoTorre=tipoTorre;
        
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }
    
    public String toString(){
        return super.toString()+" "+
                "Tipo Torre: "+this.tipoTorre;
    }
}
    

