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
            new Makanan("01", "Mie", 0, true, 13),
            new Makanan("02", "Shushi", 50000, false, 0),
            new Makanan("03"," Ayam Bakar", 30000, true, 10)
        };
        
        //ubah data pake set
        daftarMakanan[0].setId("001");
        daftarMakanan[0].setNama("Mie Pedas");
        daftarMakanan[0].setHarga(20000);
        daftarMakanan[0].setTersedia(false);
        daftarMakanan[0].setStock(0);
        
        TampilanTableMakanan.tampilkan(daftarMakanan);
        System.out.println("");
        
        for (Makanan makanan : daftarMakanan){

            status = (makanan.getTersedia() == true) ? "ya" : "tidak";
            makanan.displayListMakanan(status);
        }
        
        
    }
}
