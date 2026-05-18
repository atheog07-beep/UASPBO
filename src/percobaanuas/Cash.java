/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class Cash implements Pembayaran {

    // ---------- Atribut ----------
    
    private String idPembayaran;
    private String namaPasien;
    private double totalBayar;
    private double uangBayar;
    private double kembalian;

    
    // ---------- Constructor ----------
    
    public Cash(String idPembayaran, String namaPasien,
            double totalBayar, double uangBayar) {

        this.idPembayaran = idPembayaran;
        this.namaPasien = namaPasien;
        this.totalBayar = totalBayar;
        this.uangBayar = uangBayar;
        this.kembalian = hitungKembalian();
    }

    
    // ---------- Getter & Setter ----------
    
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public double getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(double uangBayar) {
        this.uangBayar = uangBayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    
    // ---------- Method ----------
    
    public double hitungKembalian() {
        return uangBayar - totalBayar;
    }

    @Override
    public void Bayar() {

    }

    @Override
    public String Cetak() {
        return "Pembayaran Cash";
    }

    @Override
    public double Total() {
        return totalBayar;
    }
}

