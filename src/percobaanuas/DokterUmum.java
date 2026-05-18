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
    private final int JumlahMaksPasien = 80;
    private int Antrian;

    public DokterUmum(String Poliklinik, int Antrian, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.Poliklinik = Poliklinik;
        this.Antrian = Antrian;
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
