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
    
    @Override
    public void Periksa(Pasien pasien) {
        System.out.println("Dr. Sp. " + getNama() + " (" + spesialisasi + ") memeriksa: " + pasien.getNama());
    }
    
    @Override
     public String getInfo(){
         return "[Spesialis " + spesialisasi + "] " + super.getInfo();
    }

    @Override
    public String Saran(String keluhan) {
        if (keluhan.equalsIgnoreCase("Sakit Gigi"))
            return " Menjaga kebersihan gigi";
        else if (keluhan.equalsIgnoreCase("Hipertensi"))
            return " Perbanyak makan sayur dan buah";
        return "-";
    }

    @Override
    public String Diagnosa(String keluhan) {
        if (keluhan.equalsIgnoreCase("Sakit Gigi"))
            return "Sakit Gigi";
        else if (keluhan.equalsIgnoreCase("Hipertensi"))
            return "Hipertensi";
        return "tidak valid";
    }
  
}
