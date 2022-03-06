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
public class Burung extends Hewan{
    private String jenis;

    public Burung(String jenis, int kaki, String jenisKelamin, String nama) {
        super(kaki, jenisKelamin, nama);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void terbang(){
        System.out.println("burung "+super.nama + " sedang terbang");
    }
    
}
