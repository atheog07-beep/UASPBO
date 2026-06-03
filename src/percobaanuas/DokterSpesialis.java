/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author asus
 */
public class DokterSpesialis extends Dokter {
    
    private String spesialisasi;

    public DokterSpesialis(String Spesialisasi, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.spesialisasi = Spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public double getTarifKonsultasi() {
        return TarifKonsultasi;
    }

    public String Diagnosa(String keluhan){
        return "";
    }
    
    
    @Override
    public void Periksa(Pasien pasien) {
       
    }
    
    @Override
     public String getInfo(){
        return "";
    }
    
     
}
