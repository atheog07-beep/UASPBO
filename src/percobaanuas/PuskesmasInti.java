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
    private int resepCounter;
    private int tagihanCounter;
    
    private Pemeriksaan periksaAktif;
    private Pembayaran bayarAktif;
    
    public PuskesmasInti() {
        this.dataMR = new MedicalRecord[100];
        this.jumlahMR = 0;
        this.daftarDokter = new Dokter[5];
        
    }

    public MedicalRecord[] getDataMR() {
        return dataMR;
    }

    public void setDataMR(MedicalRecord[] dataMR) {
        this.dataMR = dataMR;
    }

    public int getJumlahMR() {
        return jumlahMR;
    }

    public void setJumlahMR(int jumlahMR) {
        this.jumlahMR = jumlahMR;
    }

    public Dokter[] getDaftarDokter() {
        return daftarDokter;
    }

    public void setDaftarDokter(Dokter[] daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public int getAntrianCounter() {
        return antrianCounter;
    }

    public void setAntrianCounter(int antrianCounter) {
        this.antrianCounter = antrianCounter;
    }

    public int getPeriksaCounter() {
        return periksaCounter;
    }

    public void setPeriksaCounter(int periksaCounter) {
        this.periksaCounter = periksaCounter;
    }

    public int getResepCouter() {
        return resepCounter;
    }

    public void setResepCouter(int resepCounter) {
        this.resepCounter = resepCounter;
    }

    public int getTagihanCounter() {
        return tagihanCounter;
    }

    public void setTagihanCounter(int tagihanCounter) {
        this.tagihanCounter = tagihanCounter;
    }

    public Pemeriksaan getPeriksaAktif() {
        return periksaAktif;
    }

    public void setPeriksaAktif(Pemeriksaan periksaAktif) {
        this.periksaAktif = periksaAktif;
    }

    public Pembayaran getBayarAktif() {
        return bayarAktif;
    }

    public void setBayarAktif(Pembayaran bayarAktif) {
        this.bayarAktif = bayarAktif;
    }
    

    public void inisialisasiDokter() {
        daftarDokter[0] = new DokterUmum("Poli Umum",  "255314130", "Fani",    "Sen-Jum 07:00-14:00",   100000);
        daftarDokter[1] = new DokterUmum("Poli Anak",  "255314115", "Angel",   "Sen-Jum 07:00-14:00",   120000);
        daftarDokter[2] = new DokterUmum("Poli Ispa",  "255314123", "Rian",    "Sen-Jum 07:00-14:00",   150000);
        daftarDokter[3] = new DokterSpesialis("Gigi",  "255314120", "Theo",    "Kamis-Minggu 10:00-15:00", 320000);
        daftarDokter[4] = new DokterSpesialis("Lansia","255314167", "Joey Ake","Senin-Minggu 07:00-16:00",  250000);
    }

    public MedicalRecord daftarPasienBaru(String nama, int tahunLahir, String alamat, int jenisKelamin) {
        String nmr = "MR-" + String.format("%03d", jumlahMR + 1);
        Pasien pasien = new Pasien(nmr, nama, tahunLahir, alamat, jenisKelamin);
        return daftarPasien(pasien);
    }

    public MedicalRecord daftarPasien(Pasien pasien) {
        MedicalRecord mr = new MedicalRecord(pasien);
        dataMR[jumlahMR] = mr;
        jumlahMR++;
        System.out.println("Pasien " + pasien.getNama() + " berhasil didaftarkan. NMR: " + pasien.getNMR());
        return mr;
    }

    public MedicalRecord cariNMR(String nmr) {
        for (int i = 0; i < jumlahMR; i++) {
            if (dataMR[i].getData().getNMR().equalsIgnoreCase(nmr)) return dataMR[i];
        }
        return null;
    }


    public Pemeriksaan lakukanPemeriksaan(MedicalRecord mr, Dokter dokter,String keluhan, String tensi, double suhu, double bb, double tb) {
        antrianCounter++;
        periksaCounter++;

        String idPeriksa = "PKS-" + String.format("%03d", periksaCounter);
        Pemeriksaan periksa = new Pemeriksaan(idPeriksa, "2026-06-12",
                mr.getData(), dokter, keluhan, antrianCounter);

        periksa.setTensi(tensi);
        periksa.setSuhuTubuh(suhu);
        periksa.setBeratBadan(bb);
        periksa.setTinggiBadan(tb);

        periksa.ProsesPeriksa();

        resepCounter++;
        Resep resep = new Resep("RSP-" + String.format("%03d", resepCounter), mr.getData(), 5);
        resep.isiResep(keluhan);
        periksa.setResep(resep);

        mr.tambahRiwayat(periksa);
        periksaAktif = periksa;
        bayarAktif = null;

        return periksa;
    }

    public Tagihan buatTagihan() {
        if (periksaAktif == null) return null;  

        tagihanCounter++;
        double biayaResep   = periksaAktif.getResep().hitungHargaResep();
        double jasaDokter   = periksaAktif.getDokter().getTarifKonsultasi();
        double administrasi = 15000;

        return new Tagihan("TGH-" + String.format("%03d", tagihanCounter),
                jasaDokter, administrasi, biayaResep);
    }

    public void prosesPembayaran(Pembayaran metodeBayar, Tagihan tagihan) {
        metodeBayar.setTagihan(tagihan);
        metodeBayar.Bayar();
        bayarAktif = metodeBayar;
    }

    public DokterUmum getDokterUmum() {
        for (Dokter d : daftarDokter) if (d instanceof DokterUmum) return (DokterUmum) d;
        return null;
    }

    public DokterSpesialis getDokterSpesialis() {
        for (Dokter d : daftarDokter) if (d instanceof DokterSpesialis) return (DokterSpesialis) d;
        return null;
    }

    public void cetakDaftarDokter() {
        System.out.println("========== DAFTAR DOKTER PUSKESMAS ==========");
        for (int i = 0; i < daftarDokter.length; i++) {
            if (daftarDokter[i] != null) System.out.println((i+1) + ". " + daftarDokter[i].getNama());
        }
        System.out.println("=============================================");
    }

}
