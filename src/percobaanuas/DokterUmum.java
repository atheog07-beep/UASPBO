/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class DokterUmum extends Dokter {
    
    private String Poliklinik;
    private final int JUMLAH_MAX_PASIEN = 80;
    private int Antrian;

    public DokterUmum(String Poliklinik, int Antrian, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.Poliklinik = Poliklinik;
        this.Antrian = Antrian;
    }

    public String getPoliklinik() {
        return Poliklinik;
    }

    public int getJUMLAH_MAX_PASIEN() {
        return JUMLAH_MAX_PASIEN;
    }

    public int getAntrian() {
        return Antrian;
    }

    public double getTarifKonsultasi() {
        return TarifKonsultasi;
    }
    @Override
    public void Periksa(Pasien pasien) {
    }
    
    public String Diagnosa(){
        return "";
    }
    
    @Override
     public String getInfo(){
        return "";
    }
    
    
}
