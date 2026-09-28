/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumanto;

/**
 *
 * @author LENOVO
 */
    public class MakananUtama extends Makanan{
        private String bahanPokok;
        private int rating;
   
        MakananUtama(String id, String nama, double harga, boolean tersedia, int stock,String bahanPokok,int rating ){
            super(id, nama, harga, tersedia, stock);
            this.bahanPokok = bahanPokok;
            this.rating = rating;
            
        }
        
        public void tampilkanMakananUtama(){
            System.out.println("Bahan Pokok: " + bahanPokok);
            System.out.println("Rating: " + rating);
            System.out.println("");
        }
        
        String getBahanPokok(){
            return bahanPokok;
        }
        
        void setBahanPokok(String bahanPokok){
            if(bahanPokok == ""){
                System.out.println("Bahan Blm Disi");
                bahanPokok = "Kosong";
            }
            else {
                this.bahanPokok = bahanPokok;
            }
        }
        
        int getRating(){
            return rating;
        }
        
        void setRating(int rating){
            if(rating < 0 || rating > 5){
                System.out.println("Masukan rating yang valid");
                rating = 0;
            }
            else{
                this.rating = rating;
            }
        }
        
        @Override
        public void displayListMakanan(String status){
            super.displayListMakanan(status);
            tampilkanMakananUtama();
        }
}
