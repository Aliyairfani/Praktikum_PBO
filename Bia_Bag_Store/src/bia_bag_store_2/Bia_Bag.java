/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_2;

/**
 *
 * @author aliya
 */
public class Bia_Bag {
    //Constructor
    public Bia_Bag(String namaTas, String nomorSeri, int stok, double harga) {
        this.namaTas = namaTas;
        this.nomorSeri = nomorSeri;
        this.stok = stok;
        this.harga = harga;
    }
    // Property
    protected String namaTas;
    protected String nomorSeri;
    protected int stok;
    protected double harga;

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

    public double getHarga() {
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

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
    