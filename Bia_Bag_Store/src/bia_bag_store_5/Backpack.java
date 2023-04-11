/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_5;


/**
 *
 * @author aliya
 */
public final class Backpack extends Bia_Bag implements Gudang_Bp {
    
    private String backpackCode;
    public final String tipe = "Tas Punggung";

    public Backpack(String backpackCode, String namaTas, String nomorSeri, int stok, int harga, String tipe) {
        super(namaTas, nomorSeri, stok, harga);
        this.backpackCode = backpackCode;
    }

    public String getBackpackCode() {
        return backpackCode;
    }

    public void setBackpackCode(String backpackCode) {
        this.backpackCode = backpackCode;
    }

    public String getTipe() {
        return tipe;
    }
   
    @Override
    public void isAdded(){
        System.out.println("\nTas backpack baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.backpackCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
   
    public void display(){
        System.out.println("Backpack Code : " + this.backpackCode);
        System.out.println("Nama Tas : " + this.namaTas);
        System.out.println("Nomor Seri : " + this.nomorSeri);
        System.out.println("Stok : " + this.stok);
        System.out.println("Harga : Rp" + this.harga);
        System.out.println("Tipe Tas : " + this.tipe);
        System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(harga, stok));
        System.out.println("\nProduksi : " + produksi_Bp());
        System.out.println("Kontak Gudang : " + kontakGudangBp());
    }
    
    public String produksi_Bp(){
        return "Tas ini di produksi oleh PT. ranRansel";
    }
    
    public int kontakGudangBp(){
        return 2109276;
    }
}
