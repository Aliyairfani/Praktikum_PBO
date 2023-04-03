/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bia_bag_store_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

/**
 *
 * @author aliya
 */
public class Main {
    
    static ArrayList<Bia_Bag> bia_bag = new ArrayList<Bia_Bag>();
    static ArrayList<Sling_Bag> sling_bag = new ArrayList<Sling_Bag>();
    static ArrayList<Backpack> backpack = new ArrayList<Backpack>();
    static ArrayList<Hand_Bag> hand_bag = new ArrayList<Hand_Bag>();
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static final void alamatToko(){
        System.out.println("Alamat Bia Bag Store : Jalan Bangsawan No 7, Magic shop");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        while(true){
            System.out.println("----- Bia Bag Store -----");
            System.out.println("| 1. Input data tas    |");
            System.out.println("| 2. Tampilkan data tas|");
            System.out.println("| 3. Perbarui data tas |");
            System.out.println("| 4. Hapus data tas    |");
            System.out.println("| 5. Keluar            |");
            System.out.println("-------------------------");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan){
                case 1: 
                    createTas();
                    break;
                case 2:
                    readTas();
                    break;
                case 3:
                    updateTas();
                    break;
                case 4:
                    deleteTas();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Tidak Tersedia!");
                    break;
            }
        }
    }
    //Memasukkan data tas
    public static void createTas() throws IOException{
        System.out.println("--- Tambahkan data ---");
        System.out.println("1. Sling Bag");
        System.out.println("2. Backpack");
        System.out.println("3. Hand Bag");
        System.out.println(" Masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan){
            case 1:
                System.out.println(".........................");
                System.out.println("--- Masukkan Data Sling Bag ---");
                System.out.print("Sling Code : ");
                String addslingcode = br.readLine();
                System.out.print("Nama Tas : ");
                String addnama = br.readLine();
                System.out.print("Nomor Seri : ");
                String addnomorseri = br.readLine();
                System.out.print("Stok : ");
                int addstok = Integer.parseInt(br.readLine());
                System.out.print("Harga : Rp");
                int addharga = Integer.parseInt(br.readLine());
                Sling_Bag newSling = new Sling_Bag(addslingcode, addnama, addnomorseri, addstok, addharga, "Tas Punggung");
                System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(addharga, addstok));
                sling_bag.add(newSling);
                newSling.isAdded();
                System.out.println("\n");
                break;
            case 2:
                System.out.println(".........................");
                System.out.println("--- Masukkan Data Backpack ---");
                System.out.print("Backpack Code : ");
                String addbackpackcode = br.readLine();
                System.out.print("Nama Tas : ");
                String addnama2 = br.readLine();
                System.out.print("Nomor Seri : ");
                String addnomorseri2 = br.readLine();
                System.out.print("Stok : ");
                int addstok2 = Integer.parseInt(br.readLine());
                System.out.print("Harga : Rp");
                int addharga2 = Integer.parseInt(br.readLine());
                Backpack newBackpack = new Backpack(addbackpackcode, addnama2, addnomorseri2, addstok2, addharga2, "Tas Tangan");
                System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(addharga2, addstok2));
                backpack.add(newBackpack);
                newBackpack.isAdded();
                System.out.println("\n");
                break;
            case 3:
                System.out.println(".........................");
                System.out.println("--- Masukkan Data Hand Bag ---");
                System.out.print("Hand Code : ");
                String addhandcode = br.readLine();
                System.out.print("Nama Tas : ");
                String addnama3 = br.readLine();
                System.out.print("Nomor Seri : ");
                String addnomorseri3 = br.readLine();
                System.out.print("Stok : ");
                int addstok3 = Integer.parseInt(br.readLine());
                System.out.print("Harga : Rp");
                int addharga3 = Integer.parseInt(br.readLine());
                Hand_Bag newHand = new Hand_Bag(addhandcode, addnama3, addnomorseri3, addstok3, addharga3, "Tas Selempang");
                System.out.println("Total harga seluruh barang : Rp" + Bia_Bag.Total(addharga3, addstok3));
                hand_bag.add(newHand);
                newHand.isAdded();
                System.out.println("\n");
                break;
            default:
                System.out.println("Pilihan tidak tersedia! Silahkan pilih pada menu yang tersedia");
                break;
        }        
    }
    
    //Melihat data tas
    public static void readTas() throws IOException{
        System.out.println("--- Tambahkan data ---");
        System.out.println("1. Sling Bag");
        System.out.println("2. Backpack");
        System.out.println("3. Hand Bag");
        System.out.println(" Masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan){
            case 1:
                //tas1 tas = new tas1();
                System.out.println("..........................");
                System.out.println("--- Data Bia Sling Bag ---");

                for (int i=0; i<sling_bag.size(); i++){
                    System.out.println("Tas " + (i+1));
                    sling_bag.get(i).display();
                    alamatToko();
                    System.out.println("..........................");
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("..........................");
                System.out.println("--- Data Bia Backpack ---");

                for (int i=0; i<backpack.size(); i++){
                    System.out.println("Tas " + (i+1));
                    backpack.get(i).display();
                    alamatToko();
                    System.out.println("..........................");
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("..........................");
                System.out.println("--- Data Bia Hand Bag ---");

                for (int i=0; i<hand_bag.size(); i++){
                    System.out.println("Tas " + (i+1));
                    hand_bag.get(i).display();
                    alamatToko();
                    System.out.println("..........................");
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia! Silahkan pilih pada menu yang tersedia");
                break;
        }
    }
    
    //Mengubah data tas
    public static void updateTas() throws IOException{
        System.out.println("--- Tambahkan data ---");
        System.out.println("1. Sling Bag");
        System.out.println("2. Backpack");
        System.out.println("3. Hand Bag");
        System.out.println(" Masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Data Sling Bag yang ingin diubah : ");
                int index = Integer.parseInt(br.readLine());
        
                if(index <= sling_bag.size() || index > 0){
                    System.out.print("Sling Code : ");
                    String addslingcode = br.readLine();
                    System.out.print("Nama Tas : ");
                    String addnama = br.readLine();
                    System.out.print("Nomor Seri : ");
                    String addnomorseri = br.readLine();
                    System.out.print("Stok : ");
                    int addstok = Integer.parseInt(br.readLine());
                    System.out.print("Harga : Rp");
                    int addharga = Integer.parseInt(br.readLine());

                    sling_bag.get(index-1).setSlingCode(addslingcode);
                    sling_bag.get(index-1).setNamaTas(addnama);
                    sling_bag.get(index-1).setNomorSeri(addnomorseri);
                    sling_bag.get(index-1).setStok(addstok);
                    sling_bag.get(index-1).setHarga(addharga);
                    System.out.println("Total harga seluruh barang " + Bia_Bag.Total(addharga, addstok));
                    System.out.println("Data Sling Bag Berhasil Diubah!");
                    System.out.println("\n");
                }
                else{
                    System.out.println("Data yang dipilih tidak ada ");
                }
                break;
            case 2:
                System.out.print("Masukkan Data Backpack yang ingin diubah : ");
                int index2 = Integer.parseInt(br.readLine());
        
                if(index2 <= backpack.size() || index2 > 0){
                    System.out.print("Backpack Code : ");
                    String addbackpackcode = br.readLine();
                    System.out.print("Nama Tas : ");
                    String addnama = br.readLine();
                    System.out.print("Nomor Seri : ");
                    String addnomorseri = br.readLine();
                    System.out.print("Stok : ");
                    int addstok = Integer.parseInt(br.readLine());
                    System.out.print("Harga : Rp");
                    int addharga = Integer.parseInt(br.readLine());

                    backpack.get(index2-1).setBackpackCode(addbackpackcode);
                    backpack.get(index2-1).setNamaTas(addnama);
                    backpack.get(index2-1).setNomorSeri(addnomorseri);
                    backpack.get(index2-1).setStok(addstok);
                    backpack.get(index2-1).setHarga(addharga);
                    System.out.println("Total harga seluruh barang " + Bia_Bag.Total(addharga, addstok));
                    System.out.println("Data Backpack Berhasil Diubah!");
                    System.out.println("\n");
                }
                else{
                    System.out.println("Data yang dipilih tidak ada ");
                }
                break;
            case 3:
                System.out.print("Masukkan Data Backpack yang ingin diubah : ");
                int index3 = Integer.parseInt(br.readLine());
        
                if(index3 <= backpack.size() || index3 > 0){
                    System.out.print("Hand Code : ");
                    String addhandcode = br.readLine();
                    System.out.print("Nama Tas : ");
                    String addnama = br.readLine();
                    System.out.print("Nomor Seri : ");
                    String addnomorseri = br.readLine();
                    System.out.print("Stok : ");
                    int addstok = Integer.parseInt(br.readLine());
                    System.out.print("Harga : Rp");
                    int addharga = Integer.parseInt(br.readLine());

                    hand_bag.get(index3-1).setHandCode(addhandcode);
                    hand_bag.get(index3-1).setNamaTas(addnama);
                    hand_bag.get(index3-1).setNomorSeri(addnomorseri);
                    hand_bag.get(index3-1).setStok(addstok);
                    hand_bag.get(index3-1).setHarga(addharga);
                    System.out.println("Total harga seluruh barang " + Bia_Bag.Total(addharga, addstok));
                    System.out.println("Data Hand Bag Berhasil Diubah!");
                    System.out.println("\n");
                }
                else{
                    System.out.println("Data yang dipilih tidak ada ");
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia! Silahkan pilih pada menu yang tersedia");
                break;
        }   
    }
    
    //Menghapus data tas
    public static void deleteTas() throws IOException{
        System.out.println("--- Tambahkan data ---");
        System.out.println("1. Sling Bag");
        System.out.println("2. Backpack");
        System.out.println("3. Hand Bag");
        System.out.println(" Masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Data Sling Bag yang ingin dihapus : ");
                int index = Integer.parseInt(br.readLine());
        
                if(index <= sling_bag.size() || index > 0) {
                    sling_bag.remove(index - 1);
                    
                    System.out.println("Data sling bag berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan Data Backpack yang ingin dihapus : ");
                int index2 = Integer.parseInt(br.readLine());
        
                if(index2 <= backpack.size() || index2 > 0) {
                    backpack.remove(index2 - 1);
                    
                    System.out.println("Data Backpack berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 3:
                System.out.print("Masukkan Data Hand Bag yang ingin dihapus : ");
                int index3 = Integer.parseInt(br.readLine());
        
                if(index3 <= hand_bag.size() || index3 > 0) {
                    hand_bag.remove(index3 - 1);
                    
                    System.out.println("Data sling bag berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia! Silahkan pilih pada menu yang tersedia");
                break;
        }
    }
}

