/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumanto;
/**
 *
 * @author LENOVO
 */
public class Makanan {
    protected String id;
    protected String nama;
    protected double harga;
    protected boolean tersedia;
    protected int stock;
    
    Makanan (String id, String nama, double harga, boolean tersedia, int stock){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.tersedia = tersedia;
        this.stock = stock;
    }
    
    
    void displayListMakanan(String status){
        System.out.println("ID: " + id);  
        System.out.println("Nama: " + nama);  
        System.out.println("Harga: " + harga);  
        System.out.println("Tersedia: " + status);  
        System.out.println("Stock: " + stock +"\n");  
    }
}
