/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class DokterUmum extends Dokter { //Kelas DokterUmum yang mewarisi kelas Dokter 
    
    private String Poliklinik; // atribut Poliklinik
    private final int JUMLAH_MAX_PASIEN = 80; //atribut konstanta jumlah maksimal pasien
    
    //constructor
    public DokterUmum(String Poliklinik, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi);
        this.Poliklinik = Poliklinik;
        
    }
    //metode getter untuk atribut poliklinik
    public String getPoliklinik() {
        return Poliklinik; //Mengembalikan nilai atribut Poliklinik
    }
    //metode getter untuk atribut JUMLAH_MAX_PASIEN
    public int getJUMLAH_MAX_PASIEN() {
        return JUMLAH_MAX_PASIEN; //Mengembalikan nilai konstanta JUMLAH_MAX_PASIEN
    }
    //metode getter untuk atribut tarif konsultasi yang diwarisi dari kelas induk
    public double getTarifKonsultasi() {
        return TarifKonsultasi; //Mengembalikan nilai tarif konsultasi
    }
    
    @Override //metode ini meng-override metode Periksa dari kelas induk
    public void Periksa(Pasien pasien) {
         //Menampilkan nama dokter dan nama pasien yang sedang diperiksa
        System.out.println("Dr. " + getNama() + " sedang memeriksa pasien: " + pasien.getNama());
    }
    
    
    
    @Override //metode ini meng-override metode Periksa dari kelas induk
     public String getInfo(){
         //Menggabungkan label dokter umum, info dasar dari kelas induk, dan nama poliklinik
        return "[Dokter Umum] " + super.getInfo() + " | Poli: " + Poliklinik;
    }
    /**
     * Memberikan saran kesehatan berdasarkan keluhan pasien.
     * Menangani 5 jenis keluhan: Flu, Maag, Hipertensi, Diare, dan Asma.
     * @param keluhan String keluhan yang disampaikan pasien
     * @return String saran yang sesuai dengan keluhan, atau "-" jika keluhan tidak dikenali
     */
    @Override//metode ini meng-override metode Periksa dari kelas induk
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
    /**
     * Menentukan diagnosa berdasarkan keluhan pasien.
     * Menangani 5 jenis keluhan: Flu, Maag, Hipertensi, Diare, dan Asma.
     * @param keluhan String keluhan yang disampaikan pasien
     * @return String hasil diagnosa, atau "tidak valid" jika keluhan tidak dikenali
     */
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
