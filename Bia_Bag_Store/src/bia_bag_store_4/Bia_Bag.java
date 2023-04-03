/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_4;

/**
 *
 * @author aliya
 */
public abstract class Bia_Bag {
    //Constructor
    public Bia_Bag(String namaTas, String nomorSeri, int stok, int harga) {
        this.namaTas = namaTas;
        this.nomorSeri = nomorSeri;
        this.stok = stok;
        this.harga = harga;
    }
    // Property
    protected String namaTas;
    protected String nomorSeri;
    protected int stok;
    protected int harga;
    
    //getter
    public String getNamaTas() {
        return namaTas;
    }

    public String getNomorSeri() {
        return nomorSeri;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }

    //setter
    public void setNamaTas(String namaTas) {
        this.namaTas = namaTas;
    }

    public void setNomorSeri(String nomorSeri) {
        this.nomorSeri = nomorSeri;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public abstract void isAdded();
    public abstract void display();
    
//    public final void alamatToko(){
//       System.out.println("Jalan Bangsawan No 7, Magic shop");
//    }
    
    //overloading
    static int Total(int harga, int stok){
        return(harga * stok);
    }
}
    