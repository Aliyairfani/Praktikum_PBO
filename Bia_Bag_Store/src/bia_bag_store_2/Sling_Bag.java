/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bia_bag_store_2;

/**
 *
 * @author aliya
 */
public class Sling_Bag extends Bia_Bag {
    private String slingCode;

    public Sling_Bag(String slingCode, String namaTas, String nomorSeri, int stok, double harga) {
        super(namaTas, nomorSeri, stok, harga);
        this.slingCode = slingCode;
    }

    public String getSlingCode() {
        return slingCode;
    }

    public void setSlingCode(String slingCode) {
        this.slingCode = slingCode;
    }
    
}
