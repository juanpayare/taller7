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
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Portatilextenspc p = new Portatilextenspc("23AGLENOVO",320000,"Ideal para sus viajes",20);
        System.out.println(p.toString());
        Sobremesaextendpc s = new Sobremesaextendpc("345ALENOVO",4000000,"El que mas pesa, pero el que menos cuesta","ENERGETICA");
        System.out.println(s.toString());
    }
    
}
   
