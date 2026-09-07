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
        
        String status;
        
        Makanan[] daftarMakanan = {
            new Makanan("01", "Mie", 45000, true, 13),
            new Makanan("02", "Shushi", 50000, false, 0),
            new Makanan("03"," Ayam Bakar", 30000, true, 10)
        };
        
        TampilanTableMakanan.tampilkan(daftarMakanan);
        System.out.println("");
        
        for (Makanan makanan : daftarMakanan){
            status = (makanan.tersedia == true) ? "ya" : "tidak";
            makanan.displayListMakanan(status);
        }
        
        
    }
}
