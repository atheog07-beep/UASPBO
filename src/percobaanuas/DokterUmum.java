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
    
    public String Diagnosa(String keluhan){
        if(keluhan.equalsIgnoreCase("Flu")){
            System.out.println("kurangi konsumsi minum/makan yang dingin");
        }else if(keluhan.equalsIgnoreCase("Maag")){
            System.out.println("jangan telat makan, kurangi makanan pedas");
        }else if(keluhan.equalsIgnoreCase("Hipertensi")){
            System.out.println("perbanyak makan sayur dan buah");
        }else if(keluhan.equalsIgnoreCase("Diare")){
            System.out.println("perbanyak minum air putih");
        }else if(keluhan.equalsIgnoreCase("Asma")){
            System.out.println("menjauhi lingkungan yang berasap, hindari aktivitas berat");
        }
        return "tidak valid";
    }
    
    @Override
     public String getInfo(){
        return "[Dokter Umum] " + super.getInfo() + " | Poli: " + Poliklinik;
    }
    
    
}
