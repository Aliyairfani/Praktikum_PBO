/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_3;

/**
 *
 * @author aliya
 */
public class Bia_Bag {
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
    
    public void isAdded(){
    System.out.println("Tas baru di input, dengan nama tas" + this.namaTas);
    System.out.println("dengan nomor seri tas" + this.nomorSeri);
    System.out.println("Data tas berhasil di input !");
    }
    
    //overloading
    static int Total(int harga, int stok){
        return(harga * stok);
    }
    
}
    