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
    public String Diagnosa(String keluhan){
        if(keluhan.equalsIgnoreCase("Sakit Gigi")){
            System.out.println("menjaga kebersihan gigi");
        }else if(keluhan.equals("Hipertensi")){
            System.out.println("perbanyak makan sayur dan buah");
        }
        return "tidak valid";
    }
    
    
    @Override
    public void Periksa(Pasien pasien) {
        System.out.println("Dr. Sp. " + getNama() + " (" + spesialisasi + ") memeriksa: " + pasien.getNama());
    }
    
    @Override
     public String getInfo(){
         return "[Spesialis " + spesialisasi + "] " + super.getInfo();
    }
    
     
}
