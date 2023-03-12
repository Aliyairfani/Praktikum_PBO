/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bia_bag_store_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

/**
 *
 * @author aliya
 */
public class Main {

    static ArrayList<Bia_Bag_1> bia_bag = new ArrayList<Bia_Bag_1>();
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
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
        System.out.println(".........................");
        System.out.println("--- Masukkan Data Tas ---");
        System.out.print("Jenis Tas : ");
        String addjenis = br.readLine();
        System.out.print("Kode Tas : ");
        String addkode = br.readLine();
        System.out.print("Stok : ");
        int addstok = Integer.parseInt(br.readLine());
        System.out.print("Harga : Rp");
        double addharga = Double.parseDouble(br.readLine());
        Bia_Bag_1 newBag = new Bia_Bag_1(addjenis, addkode, addstok, addharga);
        
        bia_bag.add(newBag);
        newBag.dataTas();
    }
    
    //Melihat data tas
    public static void readTas() throws IOException{
        System.out.println("..........................");
        System.out.println("--- Data Bia Bag Store ---");
        
        for (int i=0; i<bia_bag.size(); i++){
            System.out.println("Tas " + (i+1));
            
            System.out.println("Jenis Tas : " + bia_bag.get(i).getJenisTas());
            System.out.println("Kode Tas : " + bia_bag.get(i).getKodeTas());
            System.out.println("Stok : " + bia_bag.get(i).getStok());
            System.out.println("Harga : Rp" + bia_bag.get(i).getHarga());
            System.out.println("..........................");
        }
    }
    
    //Mengubah data tas
    public static void updateTas() throws IOException{
        readTas();
        
        System.out.println(".................................");
        System.out.println("--- Update Data Bia Bag Store ---");
        System.out.print("Masukkan data tas yang ingin di Update : ");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Jenis Tas : ");
        String addjenis = br.readLine();
        System.out.print("Kode Tas : ");
        String addkode = br.readLine();
        System.out.print("Stok : ");
        int addstok = Integer.parseInt(br.readLine());
        System.out.print("Harga : Rp");
        double addharga = Double.parseDouble(br.readLine());
        
        bia_bag.get(index-1).setJenisTas(addjenis);
        bia_bag.get(index-1).setKodeTas(addkode);
        bia_bag.get(index-1).setStok(addstok);
        bia_bag.get(index-1).setHarga(addharga);
        
        bia_bag.get(index-1).updateBag();
    }
    
    //Menghapus data tas
    public static void deleteTas() throws IOException{
        readTas();
        System.out.println(".................................");
        System.out.println("--- Hapus Data Bia Bag Store ---");
        System.out.print("Masukkan data yang ingin dihapus : ");
        System.out.println(".................................");
        int index = Integer.parseInt(br.readLine());
        
        bia_bag.remove(index-1);
    }
}

