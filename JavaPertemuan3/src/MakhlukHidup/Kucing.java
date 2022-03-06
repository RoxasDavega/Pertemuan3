/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakhlukHidup;

/**
 *
 * @author user
 */
public class Kucing extends Hewan{
    private String ras;
    

    public Kucing(String ras, int kaki, String jenisKelamin, String nama) {
        super(kaki, jenisKelamin, nama);
        this.ras = ras;   
        super.tidur();
    }
    
    public String getRas(){
        return this.ras;
    }
    
    public void setRas(String ras){
        this.ras = ras;
    }
    
    public void mencakar(){
        //super.getNama();
        System.out.println("kucing "+this.ras+" bernama "+ super.nama + " sedang mencakar");
    }
}
