/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl.sekolah;

/**
 *
 * @author puspa
 */
public class Siswa {
    private int nomor;
    private String nama;

    public Siswa() {
    }

    public Siswa(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }

    /**
     * @return the nomor
     */
    public int getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
