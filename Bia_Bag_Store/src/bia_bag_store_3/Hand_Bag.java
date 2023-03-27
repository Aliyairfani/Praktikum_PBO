/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_3;
/**
 *
 * @author aliya
 */
public class Hand_Bag extends Bia_Bag {
    
    private String handCode;

    public Hand_Bag(String handCode, String namaTas, String nomorSeri, int stok, int harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.handCode = handCode;
    }

    public String getHandCode() {
        return handCode;
    }

    public void setHandCode(String handCode) {
        this.handCode = handCode;
    }
    
    @Override
    public void isAdded(){
        System.out.println("Tas hand bag baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.handCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
    
//    public void tas3(String nomorseri, int stok){
//        System.out.println("Tas dengan Nomor Seri " + nomorseri + "Tersedia stok " + stok);
//    }
}
