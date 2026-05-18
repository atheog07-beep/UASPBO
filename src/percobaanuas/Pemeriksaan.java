/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pemeriksaan {
    
    private String IDPeriksa;
    private String TanggalPeriksa;
    private Pasien pasien;
    private Dokter dokter;
    private String Keluhan;
    private String Diagnosa;
    private String Resep;
    private String Tensi;
    private double SuhuTubuh;
    private double TinggiBadan;
    private double BeratBadan;

    public Pemeriksaan(String IDPeriksa, String TanggalPeriksa, Pasien pasien, Dokter dokter, String Keluhan, String Diagnosa, String Resep, String Tensi, double SuhuTubuh, double TinggiBadan, double BeratBadan) {
        this.IDPeriksa = IDPeriksa;
        this.TanggalPeriksa = TanggalPeriksa;
        this.pasien = pasien;
        this.dokter = dokter;
        this.Keluhan = Keluhan;
        this.Diagnosa = Diagnosa;
        this.Resep = Resep;
        this.Tensi = Tensi;
        this.SuhuTubuh = SuhuTubuh;
        this.TinggiBadan = TinggiBadan;
        this.BeratBadan = BeratBadan;
    }

    public String getIDPeriksa() {
        return IDPeriksa;
    }

    public void setIDPeriksa(String IDPeriksa) {
        this.IDPeriksa = IDPeriksa;
    }

    public String getTanggalPeriksa() {
        return TanggalPeriksa;
    }

    public void setTanggalPeriksa(String TanggalPeriksa) {
        this.TanggalPeriksa = TanggalPeriksa;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public void setDiagnosa(String Diagnosa) {
        this.Diagnosa = Diagnosa;
    }

    public String getResep() {
        return Resep;
    }

    public void setResep(String Resep) {
        this.Resep = Resep;
    }

    public String getTensi() {
        return Tensi;
    }

    public void setTensi(String Tensi) {
        this.Tensi = Tensi;
    }

    public double getSuhuTubuh() {
        return SuhuTubuh;
    }

    public void setSuhuTubuh(double SuhuTubuh) {
        this.SuhuTubuh = SuhuTubuh;
    }

    public double getTinggiBadan() {
        return TinggiBadan;
    }

    public void setTinggiBadan(double TinggiBadan) {
        this.TinggiBadan = TinggiBadan;
    }

    public double getBeratBadan() {
        return BeratBadan;
    }

    public void setBeratBadan(double BeratBadan) {
        this.BeratBadan = BeratBadan;
    }
    
    public void ProsesPemeriksaan(){
    }
    
    public void CetakHasil(){
    }
}
