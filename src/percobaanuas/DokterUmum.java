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
    

    public DokterUmum(String Poliklinik, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.Poliklinik = Poliklinik;
        
    }

    public String getPoliklinik() {
        return Poliklinik;
    }

    public int getJUMLAH_MAX_PASIEN() {
        return JUMLAH_MAX_PASIEN;
    }

   

    public double getTarifKonsultasi() {
        return TarifKonsultasi;
    }
    @Override
    public void Periksa(Pasien pasien) {
        System.out.println("Dr. " + getNama() + " sedang memeriksa pasien: " + pasien.getNama());
    }
    
    
    
    @Override
     public String getInfo(){
        return "[Dokter Umum] " + super.getInfo() + " | Poli: " + Poliklinik;
    }

    @Override
    public String Saran(String keluhan) {
        if(keluhan.equalsIgnoreCase("Flu")){
            return " kurangi konsumsi minum/makan yang dingin";
        } else if(keluhan.equalsIgnoreCase("Maag")){
            return " jangan telat makan, kurangi makanan pedas";
        } else if(keluhan.equalsIgnoreCase("Hipertensi")){
            return " perbanyak makan sayur dan buah";
        } else if(keluhan.equalsIgnoreCase("Diare")){
            return " perbanyak minum air putih";
        } else if(keluhan.equalsIgnoreCase("Asma")){
            return " menjauhi lingkungan yang berasap, hindari aktivitas berat";
        }
        return "-";
    }

    @Override
    public String Diagnosa(String keluhan) {
        if (keluhan.equalsIgnoreCase("Flu")) 
            return "Flu";
        else if (keluhan.equalsIgnoreCase("Maag")) 
            return "Maag";
        else if (keluhan.equalsIgnoreCase("Hipertensi")) 
            return "Hipertensi";
        else if (keluhan.equalsIgnoreCase("Diare")) 
            return "Diare";
        else if (keluhan.equalsIgnoreCase("Asma")) 
            return "Asma";
        return "tidak valid";
    }
    
    
}
