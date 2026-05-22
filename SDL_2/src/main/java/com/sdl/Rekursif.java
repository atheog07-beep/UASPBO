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
       
    if(x == 1)
        return 7;
    else
        return 7 + paijo(x-1);
}
    
    
    /**
     * Fungsi rekursif up and down
     * @param n 
     */
    public static void upAndDown(int n){
        
    if(n == 0)
        return;

    System.out.println(n);
    upAndDown(n-1);
    System.out.println(n);
}
    
    
    /**
     * Fungsi deret fibonaci dengan masukan suku ke-1, suku ke-2 dan 
     * @param suku1
     * @param suku2
     * @param sukuKe_N
     * @return 
     */
    public static int fibonaci(int suku1, int suku2, int sukuKe_N){
       
        switch (sukuKe_N) {
            case 1:
                return suku1;
            case 2:
                return suku2;
            default:
                return fibonaci(suku1, suku2, sukuKe_N-1) + fibonaci(suku1, suku2, sukuKe_N-2);
        }
}
    
    /**
     * Fungsi untuk buat penjumlah larik jika diberi data larik dan posisi indeks yang akan dijumlahkan
     * @param data
     * @param i
     * @return 
     */
    public static int arraySum(int[] data, int i) {
     
    if(i == 0)
        return 0;
    else
        return data[i-1] + arraySum(data, i-1);
}
    
    
    /**
     * Fungsi untuk mencari besar suku ke-N dari sebuah deret hitung
     * Contoh: awal= 1, selisih = 3, indeks_suku = 5
     * deretnya : [1,4,7,10,13], maka luarannya = 13
     * @param awal
     * @param selisih
     * @param indeks_suku
     * @return 
     */
    public static int deretHitung(int awal, int selisih, int indeks_suku){
       
    if(indeks_suku == 1)
        return awal;
    else
        return deretHitung(awal, selisih, indeks_suku-1) + selisih;
}
    
    
    /**
     * Fungsi pembuat data larik deret hitung
     * @param awal
     * @param start
     * @return 
     */

 
  public static int[] getDeretHitung(int[] awal, int start, int selisih, int lastIndex) {
    awal[0] = start;

    for (int i = 1; i < awal.length; i++) {
        awal[i] = awal[i - 1] + selisih;
    }

    return awal;
}
}
