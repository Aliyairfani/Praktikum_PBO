/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_3;

/**
 *
 * @author aliya
 */
public class Backpack extends Bia_Bag {
    
    private String backpackCode;

    public Backpack(String backpackCode, String namaTas, String nomorSeri, int stok, int harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.backpackCode = backpackCode;
    }

    public String getBackpackCode() {
        return backpackCode;
    }

    public void setBackpackCode(String backpackCode) {
        this.backpackCode = backpackCode;
    }
   
    @Override
    public void isAdded(){
        System.out.println("Tas backpack baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.backpackCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
   
//    public void tas2(String nomorseri, int stok){
//        System.out.println("Tas dengan Nomor Seri " + nomorseri + "Tersedia stok " + stok);
//    }
}
