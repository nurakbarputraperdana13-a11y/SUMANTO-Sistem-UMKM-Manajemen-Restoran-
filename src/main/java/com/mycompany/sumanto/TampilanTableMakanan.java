/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumanto;

/**
 *
 * @author LENOVO
 */
public class TampilanTableMakanan {
    static void tampilkan(Makanan[] makanan){
           
        System.out.println("+----+------------+----------+----------+------+");
        System.out.println("| ID | Nama       | Harga    | Tersedia | Stok |");
        System.out.println("+----+------------+----------+----------+------+");
        
        for (Makanan mkn : makanan){
            System.out.printf(
                    "| %-2s | %-10s | %-8.1f | %-8s | %-4d |%n",
                    mkn.id, mkn.nama, mkn.harga, mkn.tersedia, mkn.stock);
        }
        System.out.println("+----+------------+----------+----------+------+");
    }
}
