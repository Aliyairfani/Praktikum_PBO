/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_4;

/**
 *
 * @author aliya
 */
public final class Sling_Bag extends Bia_Bag {
    
    private String slingCode;
    final String tipe = "Tas Selempang";
    

    public Sling_Bag(String slingCode, String namaTas, String nomorSeri, int stok, int harga, String tipe) {
        super(namaTas, nomorSeri, stok, harga);
        this.slingCode = slingCode;
    }

    public String getSlingCode() {
        return slingCode;
    }

    public void setSlingCode(String slingCode) {
        this.slingCode = slingCode;
    }

    public String getTipe() {
        return tipe;
    }
    
    @Override
    public void isAdded(){
        System.out.println("Tas sling bag baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.slingCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
    
    public void display(){
        System.out.println("Sling Code : " + this.slingCode);
        System.out.println("Nama Tas : " + this.namaTas);
        System.out.println("Nomor Seri : " + this.nomorSeri);
        System.out.println("Stok : " + this.stok);
        System.out.println("Harga : Rp" + this.harga);
        System.out.println("Tipe Tas : " + this.tipe);
        System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(harga, stok));
    }
}
