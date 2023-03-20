/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_2;

/**
 *
 * @author aliya
 */
public class Backpack extends Bia_Bag {
    
    private String backpackCode;

    public Backpack(String backpackCode, String namaTas, String nomorSeri, int stok, double harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.backpackCode = backpackCode;
    }

    public String getBackpackCode() {
        return backpackCode;
    }

    public void setBackpackCode(String backpackCode) {
        this.backpackCode = backpackCode;
    }
   
}
