/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class PuskesmasInti {
    private MedicalRecord[] dataMR;
    private int jumlahMR;
    private Dokter[] daftarDokter;
    
    private int antrianCounter;
    private int periksaCounter;
    private int resepCouter;
    private int tagihanCounter;
    
    private Pemeriksaan periksaAktif;
    private Pembayaran bayarAktif;
    
    public PuskesmasInti() {
        this.dataMR = new MedicalRecord[100];
        this.jumlahMR = 0;
        this.daftarDokter = new Dokter[5];
        
    }
 
    public void intiDokter() {
        daftarDokter[0] = new DokterUmum("Poli Umum", "255314130", "Fani", "Sen-Jum 07:00-14:00", 100000);
        daftarDokter[1] = new DokterUmum("Poli Anak", "255314115", "Angel", "Sen-Jum 07:00-14:00", 120000);
        daftarDokter[2] = new DokterUmum("Poli Ispa", "255314123", "Rian","Sen-Jum 07:00-14:00", 150000);
        daftarDokter[3] = new DokterSpesialis("Gigi", "255314120", "Theo", "Kamis-Minggu 10:00-15:00", 320000);
        daftarDokter[4] = new DokterSpesialis("Lansia", "255314167", "Joey Ake", "Senin-Minngu 07:00-16:00", 250000);
        
    }
    public MedicalRecord daftarPasienBaru(String nama, int tahunLahir, String alamat, int jenisKelamin) {
        String nmr = "MR - " + jumlahMR + 1;
        Pasien pasien = new Pasien(nmr, nama, tahunLahir, alamat, jenisKelamin);
        return daftarPasien(pasien);
    }
    public MedicalRecord daftarPasien(Pasien pasien){
        MedicalRecord mr = new MedicalRecord(pasien);
        dataMR[jumlahMR] = mr;
        jumlahMR++;
        //simpandata
        return mr;
    }
    
    public MedicalRecord cariNMR(String nmr) {
        for (int i = 0; i < jumlahMR; i++) {
            if(dataMR[i].getData().getNMR().equalsIgnoreCase(nmr)) {
                return dataMR[i];
            }
        }
        return null;
    }
    
    
    
}
