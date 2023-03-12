/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_1;

/**
 *
 * @author aliya
 */
public class Bia_Bag_1 {
    // Property
    String jenisTas;
    String kodeTas;
    int stok;
    double harga;
    
    //Constructor
    public Bia_Bag_1(String jenisTas, String kodeTas, int stok, double harga){
        this.jenisTas = jenisTas;
        this.kodeTas = kodeTas;
        this.stok = stok;
        this.harga = harga;
    }

    //getter
    public String getJenisTas() {
        return jenisTas;
    }

    public String getKodeTas() {
        return kodeTas;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    //setter
    public void setJenisTas(String jenisTas) {
        this.jenisTas = jenisTas;
    }

    public void setKodeTas(String kodeTas) {
        this.kodeTas = kodeTas;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    //Method
    public void dataTas(){
        System.out.println("Jenis Tas " + this.jenisTas);
        System.out.println("Kode Tas " + this.kodeTas);
        System.out.println("Stok " + this.stok);
        System.out.println("Harga: Rp " + this.harga);
        System.out.println("Data Tas telah di Input!");
    }
    
    public void updateBag(){
        System.out.println("Jenis Tas " + this.jenisTas);
        System.out.println("Kode Tas " + this.kodeTas);
        System.out.println("Stok " + this.stok);
        System.out.println("Harga: Rp " + this.harga);
        System.out.println("Data Tas telah di Update!");
    }
}
