/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_4;

/**
 *
 * @author aliya
 */
public final class Hand_Bag extends Bia_Bag {
    
    private String handCode;
    final String tipe = "Tas Tangan";
    

    public Hand_Bag(String handCode, String namaTas, String nomorSeri, int stok, int harga, String tipe) {
        super(namaTas, nomorSeri, stok, harga);
        this.handCode = handCode;
    }

    public String getHandCode() {
        return handCode;
    }

    public void setHandCode(String handCode) {
        this.handCode = handCode;
    }

    public String getTipe() {
        return tipe;
    }
    
    @Override
    public void isAdded(){
        System.out.println("Tas hand bag baru di input, dengan nama tas " + this.namaTas);
        System.out.println("dengan kode tas " + this.handCode);
        System.out.println("dengan nomor seri tas " + this.nomorSeri);
        System.out.println("Data berhasil ditambahkan!");
    }
    
    public void display(){
            System.out.println("Hand Code : " + this.handCode);
            System.out.println("Nama Tas : " + this.namaTas);
            System.out.println("Nomor Seri : " + this.nomorSeri);
            System.out.println("Stok : " + this.stok);
            System.out.println("Harga : Rp" + this.harga);
            System.out.println("Tipe Tas : " + this.tipe);
            System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(harga, stok));
        }
}
