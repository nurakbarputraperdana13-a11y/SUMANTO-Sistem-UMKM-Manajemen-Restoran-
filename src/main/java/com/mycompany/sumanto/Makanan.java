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
    int id;
    String nama;
    long harga;
    
    Makanan (int id, String nama, long harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    
    static void list(){
        System.out.println("       ==Menu Makanan==");
    }
    
    void displayListMakanan(){
        System.out.println(id + " || " + nama +" || " + harga);
    }
}
