package percobaanuas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ath07
 */

public class Asuransi implements Pembayaran {

    // ---------- Atribut ----------
    
    private String nomorAsuransi;
    private String namaPerusahaan;
    private String jenisAsuransi;
    private double totalBayar;
    private double potongan;

    
    // ---------- Constructor ----------
    
    public Asuransi(String nomorAsuransi, String namaPerusahaan,
            String jenisAsuransi, double totalBayar, double potongan) {

        this.nomorAsuransi = nomorAsuransi;
        this.namaPerusahaan = namaPerusahaan;
        this.jenisAsuransi = jenisAsuransi;
        this.totalBayar = totalBayar;
        this.potongan = potongan;
    }

    
    // ---------- Getter & Setter ----------
    
    public String getNomorAsuransi() {
        return nomorAsuransi;
    }

    public void setNomorAsuransi(String nomorAsuransi) {
        this.nomorAsuransi = nomorAsuransi;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getJenisAsuransi() {
        return jenisAsuransi;
    }

    public void setJenisAsuransi(String jenisAsuransi) {
        this.jenisAsuransi = jenisAsuransi;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    
    // ---------- Method ----------
    
    public double hitungTagihan() {
        return totalBayar - potongan;
    }

    @Override
    public void Bayar() {

    }

    @Override
    public String Cetak() {
        return "Pembayaran Asuransi";
    }

    @Override
    public double Total() {
        return hitungTagihan();
    }
}
    

