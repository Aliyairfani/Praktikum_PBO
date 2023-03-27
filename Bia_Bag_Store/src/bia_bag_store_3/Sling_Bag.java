/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_3;
/**
 *
 * @author aliya
 */
public class Sling_Bag extends Bia_Bag {
    private String slingCode;

    public Sling_Bag(String slingCode, String namaTas, String nomorSeri, int stok, int harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.slingCode = slingCode;
    }

    public String getSlingCode() {
        return slingCode;
    }

    public void setSlingCode(String slingCode) {
        this.slingCode = slingCode;
    }
    
    @Override
    public void isAdded(){
        System.out.println("Tas sling bag baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.slingCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
    
//    public void tas1(String nomorseri, int stok){
//        System.out.println("Tas dengan Nomor Seri " + nomorseri + "Tersedia stok " + stok);
//    }
}
