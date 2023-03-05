/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store;

/**
 *
 * @author aliya
 */
public class Bia_Bag {
    // Property
    String jenisTas;
    String kodeTas;
    int stok;
    double harga;
    
    //Constructor
    public Bia_Bag(String jenisTas, String kodeTas, int stok, double harga){
        this.jenisTas = jenisTas;
        this.kodeTas = kodeTas;
        this.stok = stok;
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
