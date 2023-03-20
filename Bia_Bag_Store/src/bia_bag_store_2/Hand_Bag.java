/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_2;

/**
 *
 * @author aliya
 */
public class Hand_Bag extends Bia_Bag {
    
    private String handCode;

    public Hand_Bag(String handCode, String namaTas, String nomorSeri, int stok, double harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.handCode = handCode;
    }

    public String getHandCode() {
        return handCode;
    }

    public void setHandCode(String handCode) {
        this.handCode = handCode;
    }
    
}
