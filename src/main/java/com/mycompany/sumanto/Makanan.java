/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumanto;
/**
 *
 * @author LENOVO
 */
public class Makanan extends StockMakanan implements ProsesMasak{
    private String id;
    private String nama;
    private double harga;
    
    Makanan (String id, String nama, double harga, boolean tersedia, int stock){
        setId(id);
        setNama(nama);
        setHarga(harga);
        setTersedia(tersedia);
        setStock(stock);
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        if(harga <= 0){
            System.out.println("masukan angka yang valid");
            this.harga = 0;
        }else {
            this.harga = harga;
        }
    }
    
            
    public void displayListMakanan(String status){
        System.out.println("ID: " + getId());  
        System.out.println("Nama: " + getNama());  
        System.out.println("Harga: " + getHarga());  
        System.out.println("Tersedia: " + status);  
        System.out.println("Stock: " + getStock());  
        System.out.println("");
    }

    @Override
    public void apakahStockTersedia() {
        if(getTersedia() == false || getStock() == 0){
            System.out.println("Stock: Tersedia");
        }
        else{
            System.out.println("Stock: Habis");
        }
    }

    @Override
    public String prosesMasak() {
        String pesan = null;
        if(masak > 5){
            pesan = "Gosong\n";
        }
        return pesan;
    }
    
}
