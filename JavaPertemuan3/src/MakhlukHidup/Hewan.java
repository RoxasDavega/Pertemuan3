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
public class Hewan extends makhlukHidup implements Karnivora, Herbivora{
    int kaki;
    String jenisKelamin;
    String nama;
    
    public Hewan(int kaki, String jenisKelamin, String nama){
        this.kaki = kaki;
        this.jenisKelamin = jenisKelamin;
        this.nama = nama;
    }

    
    public void makan(){
        System.out.println(this.nama + " sedang makan");
    }
    
    public void makan(int porsi){
        System.out.println(this.nama + " sedang makan sebanyak "+porsi+" porsi");
    }
    
    protected void tidur(){
        System.out.println(this.nama+" sedang tidur");
    }

   @Override
    public void bernapas() {
        System.out.println("Hewan bernapas menggunakan paru-paru");
    }

    @Override
    public void berburu() {
        System.out.println("Hewan sedang berburu");
    }

    @Override
    public void gelud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makanRumput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
