/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl;

/**
 *
 * @author puspa
 */
public class Rekursif {
    /**
     * Fungsi rekursif faktorial
     * @param n
     * @return 
     */
    public static int faktorial(int n){
        // base case
        if (n ==0)
            return 1;
        else
            //making progress
            return n*faktorial(n-1);
    }
    
    /**
     * Fungsi rekursif deret fibonacci
     * @param suku
     * @return 
     */
    public static int fibo(int n){
        // base case
        if ((n==1)|| (n==2))
                return 1;
        else
            // making progress
            return fibo(n-2)+fibo(n-1);
    }
    
    /**
     * Fungsi rekursif paijo
     * @param x
     * @return 
     */
    public static int paijo(int x){
        return 0;
    }
    
    /**
     * Fungsi rekursif up and down
     * @param n 
     */
    public static void upAndDown(int n){
        
    }
    
    /**
     * Fungsi deret fibonaci dengan masukan suku ke-1, suku ke-2 dan 
     * @param suku1
     * @param suku2
     * @param jumlahSuku
     * @return 
     */
    public static int fibonaci(int suku1, int suku2, int sukuKe_N){
        return 0;
    }

    /**
     * Fungsi untuk buat penjumlah larik jika diberi data larik dan posisi indeks yang akan dijumlahkan
     * @param data
     * @param i
     * @return 
     */
    public static int arraySum(int[] data, int i) {
        return 0;
    }
    
    /**
     * Fungsi untuk mencari besar suku ke-N dari sebuah deret hitung
     * Contoh: awal= 1, selisih = 3, indeks_suku = 5
     * deretnya : [1,4,7,10,13], maka luarannya = 13
     * @param awal
     * @param selisih
     * @param jumlah_suku
     * @return 
     */
    public static int deretHitung(int awal, int selisih, int indeks_suku){
        return 0;
    }
    
}
