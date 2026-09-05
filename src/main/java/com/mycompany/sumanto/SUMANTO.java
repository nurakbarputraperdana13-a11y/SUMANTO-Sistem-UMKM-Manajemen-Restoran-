/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumanto;

/**
 *
 * @author LENOVO
 */
public class SUMANTO {

    public static void main(String[] args) {
        Makanan makanan1 = new Makanan(1 , "Mie Pedes lv 1", 45000);
        Makanan makanan2 = new Makanan(2 , "Mie Pedes lv 2", 50000);
        
        Makanan.list(); 
        makanan1.displayListMakanan();
        makanan2.displayListMakanan();
        
    }
}
