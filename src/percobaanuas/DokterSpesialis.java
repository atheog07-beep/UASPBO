/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author asus
 */
public class DokterSpesialis extends Dokter {// Deklarasi Kelas DokterSpesialis mewarisi kelas Dokter (inheritance)
    
    private String spesialisasi;//deklarasi Atribut spesialisasi dokter

    //deklarasi constructor
    public DokterSpesialis(String Spesialisasi, String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        super(NIP, Nama, Jadwal, TarifKonsultasi); //Memanggil konstruktor kelas induk (Dokter) untuk menginisialisasi atribut bawaan
        this.spesialisasi = Spesialisasi; //Menginisialisasi atribut spesialisasi dengan nilai yang diberikan
    }
    //metode getSpesialisi
    public String getSpesialisasi() {
        return spesialisasi; //Mengembalikan nilai atribut spesialisasi
    }
    //mwtode getTarifKonsultasi
    public double getTarifKonsultasi() {
        return TarifKonsultasi; //Mengembalikan nilai tarif konsultasi yang diwarisi dari kelas induk
    }  
    
    @Override //metode ini meng-override metode dari kelas induk
    public void Periksa(Pasien pasien) {
        //Menampilkan nama dokter beserta spesialisasinya dan nama pasien yang diperiksa
        System.out.println("Dr. Sp. " + getNama() + " (" + spesialisasi + ") memeriksa: " + pasien.getNama());
    }
    
    @Override //metode ini meng-override metode dari kelas induk
     public String getInfo(){
          //Menggabungkan informasi spesialisasi dengan informasi dasar dari kelas induk
         return "[Spesialis " + spesialisasi + "] " + super.getInfo();
    }

    @Override //metode ini meng-override metode dari kelas induk
    public String Saran(String keluhan) {
        if (keluhan.equalsIgnoreCase("Sakit Gigi")) //Mengecek apakah keluhan adalah "Sakit Gigi"
            return " Menjaga kebersihan gigi"; //Mengembalikan saran untuk keluhan sakit gigi
        else if (keluhan.equalsIgnoreCase("Hipertensi")) //Mengecek apakah keluhan adalah "Hipertensi"
            return " Perbanyak makan sayur dan buah"; //Mengembalikan saran untuk keluhan hipertensi
        return "-"; //Mengembalikan tanda "-" jika keluhan tidak dikenali
    }

    @Override //metode ini meng-override metode dari kelas induk
    public String Diagnosa(String keluhan) {
        if (keluhan.equalsIgnoreCase("Sakit Gigi")) //Mengecek apakah keluhan adalah "Sakit Gigi"
            return "Sakit Gigi"; //Mengembalikan diagnosa "Sakit Gigi"
        else if (keluhan.equalsIgnoreCase("Hipertensi")) //Mengecek apakah keluhan adalah "Hipertensi"
            return "Hipertensi"; //Mengembalikan diagnosa "Hipertensi"
        return "tidak valid"; //Mengembalikan "tidak valid" jika keluhan tidak sesuai
    }
  
}
