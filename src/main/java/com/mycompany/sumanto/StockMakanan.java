/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumanto;

/**
 *
 * @author LENOVO
 */
public abstract class StockMakanan {
    private boolean tersedia;
    private int stock;
    
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public boolean getTersedia(){return tersedia;}
    public void setTersedia(boolean tersedia){this.tersedia = tersedia;}
    
    public abstract void apakahStockTersedia();
    
    public void tampilkanStock(){
        System.out.println("Stock: " + stock);
        if(tersedia == false){
            System.out.println("Stock: Tersedia");
        }
        else{
            System.out.println("Stock: Habis");
        }
    }
}
