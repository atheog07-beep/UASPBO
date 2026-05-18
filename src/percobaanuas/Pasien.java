/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pasien {
    
    private String NIK;
    private String Nama;
    private int Umur;
    private String Alamat;
    private int JenisKelamin;
    private String Keluhan;
    private int NomorAntrian;

    public Pasien(String NIK, String Nama, int Umur, String Alamat, int JenisKelamin, String Keluhan, int NomorAntrian) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.Umur = Umur;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
        this.Keluhan = Keluhan;
        this.NomorAntrian = NomorAntrian;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(int JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public int getNomorAntrian() {
        return NomorAntrian;
    }

    public void setNomorAntrian(int NomorAntrian) {
        this.NomorAntrian = NomorAntrian;
    }
    
    public void Daftar(int NomorAntrian){
}
    public String toString(){
    
        return null;
    
    }
}
