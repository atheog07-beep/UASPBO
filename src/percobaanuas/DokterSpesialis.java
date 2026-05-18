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
    
    private String Spesialisasi;

    public DokterSpesialis(String Spesialisasi, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.Spesialisasi = Spesialisasi;
    }

    public String getSpesialisasi() {
        return Spesialisasi;
    }

    public void setSpesialisasi(String Spesialisasi) {
        this.Spesialisasi = Spesialisasi;
    }

    public double getTarifKonsultasi() {
        return TarifKonsultasi;
    }

    public void setTarifKonsultasi(double TarifKonsultasi) {
        this.TarifKonsultasi = TarifKonsultasi;
    }
    
    
    
    @Override
    public void Periksa(Pasien pasien) {
       
    }
    
    @Override
     public String getInfo(){
        return "";
    }
    
     
}
