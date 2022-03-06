/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapertemuan3;

import MakhlukHidup.Burung;
import MakhlukHidup.Hewan;
import MakhlukHidup.Kucing;

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan hewan = new Hewan(4, "Jantan","Asep");
        hewan.makan();
        
        Kucing kucing = new Kucing("Persia", 4, "Betina","Fulanah");
        kucing.makan();
        kucing.mencakar();
        
        kucing.setRas("Bengal");
        
        kucing.mencakar();
        
        Hewan hw = new Kucing("BSH",4,"Jantan","Ucup");
        Hewan br = new Burung("Elang", 2, "Jantan", "Fulan");
       
        hewan.bernapas();
    }
    
}
