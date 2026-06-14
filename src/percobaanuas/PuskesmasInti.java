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
    //attribut class PuskesmasInti
    private MedicalRecord[] dataMR;
    private int jumlahMR;
    private Dokter[] daftarDokter;
    
    private int antrianCounter;
    private int periksaCounter;
    private int resepCounter;
    private int tagihanCounter;
    
    private Pemeriksaan periksaAktif;
    private Pembayaran bayarAktif;
    
    private Queue antrianPasien;
    
    //constructor class
    public PuskesmasInti() {
        this.dataMR = new MedicalRecord[100];
        this.jumlahMR = 0;
        this.daftarDokter = new Dokter[5];
        this.antrianPasien = new Queue();//buat queue kosong
        
    }
    
    /*
    Getter dan setter class
    */
    public MedicalRecord[] getDataMR() {return dataMR;}
    public void setDataMR(MedicalRecord[] dataMR) {this.dataMR = dataMR;}
    public int getJumlahMR() {return jumlahMR;}
    public void setJumlahMR(int jumlahMR) {this.jumlahMR = jumlahMR;}
    public Queue getAntrianPasien() {return antrianPasien;}
    public void setAntrianPasien(Queue antrianPasien) {this.antrianPasien = antrianPasien;} 
    public Dokter[] getDaftarDokter() {return daftarDokter;}
    public void setDaftarDokter(Dokter[] daftarDokter) { this.daftarDokter = daftarDokter;}
    public int getAntrianCounter() { return antrianCounter;}
    public void setAntrianCounter(int antrianCounter) { this.antrianCounter = antrianCounter;}
    public int getPeriksaCounter() {return periksaCounter;}
    public void setPeriksaCounter(int periksaCounter) { this.periksaCounter = periksaCounter;}
    public int getResepCouter() { return resepCounter; }
    public void setResepCouter(int resepCounter) {this.resepCounter = resepCounter;}
    public int getTagihanCounter() {return tagihanCounter;}
    public void setTagihanCounter(int tagihanCounter) {this.tagihanCounter = tagihanCounter;}
    public Pemeriksaan getPeriksaAktif() {return periksaAktif;}
    public void setPeriksaAktif(Pemeriksaan periksaAktif) {this.periksaAktif = periksaAktif;}
    public Pembayaran getBayarAktif() {return bayarAktif;}
    public void setBayarAktif(Pembayaran bayarAktif) { this.bayarAktif = bayarAktif;}
    
    public void inisialisasiDokter() {
        daftarDokter[0] = new DokterUmum("Poli Umum",  "255314130", "Fani",    "Sen-Jum 07:00-14:00",   100000);
        daftarDokter[1] = new DokterUmum("Poli Anak",  "255314115", "Angel",   "Sen-Jum 07:00-14:00",   120000);
        daftarDokter[2] = new DokterUmum("Poli Ispa",  "255314123", "Rian",    "Sen-Jum 07:00-14:00",   150000);
        daftarDokter[3] = new DokterSpesialis("Gigi",  "255314120", "Theo",    "Kamis-Minggu 10:00-15:00", 320000);
        daftarDokter[4] = new DokterSpesialis("Lansia","255314167", "Joey Ake","Senin-Minggu 07:00-16:00",  250000);
    }
    
    /**
     * method utuk masukan mr ke queue
     * Masukkan MedicalRecord ke antrian, return nomor antrian yang didapat
     * @param mr MedicalRecord pasien yang akan masuk antrian
     * @return nomor antrian
     */
    public int masukAntrian(MedicalRecord mr) {
        antrianCounter++;
        //bungkus MedicalRecord ke dalam PuskesmasNode, lalu enqueue
        PuskesmasNode node = new PuskesmasNode(mr);
        antrianPasien.enqueue(node);
        return antrianCounter;
    }
    
    /**
     * Method untuk ambil antrian
     * keluarkan MedicalRecord paling depan dari antrian 
     * @return MedicalRecord pasien, null jika antrian kosong
     */
    public MedicalRecord ambilAntrian() {
        PuskesmasNode node = antrianPasien.dequeue();
        if (node == null) return null;
        return node.getData();//langsung akses MedicalRecord dari PuskesmasNode
    }
    
    /**
     * method untuk lihat queue
     * melihat mr paling depan tanpa mengeluarkan (atau peek di SDL)
     * @return MedicalRecord pasien, null jika antrian kosong
     */
    public MedicalRecord lihatAntrian() {
        PuskesmasNode node = antrianPasien.peek();
        if (node == null) return null;
        return node.getData();//langsung akses MedicalRecord dari ListNode
    }
    
    /**
     * method untuk lihat jumlah pasien yang sedang dalam antrian
     * @return jumlah antrian
     */
    public int getSize() {
        return antrianPasien.getSize();
    }
    
    public void cetakAntrian() {
        if (antrianPasien.isEmpty()) {
            System.out.println("tidak ada pasien dalam antrian puskesmas");
            return;
        }

        System.out.printf("  %-12s %-12s %-20s%n", "No.Antrian", "NMR", "Nama");//tabel
        System.out.println("  ------------------------------------------");

        //iterasi linked list dari first ke last
        PuskesmasNode temp = antrianPasien.getAntrian().getFirst();
        //hitung nomor antrian mulai dari (antrianCounter - qSize + 1)
        int noMulai = antrianCounter - antrianPasien.getSize() + 1;
        int no = noMulai;

        while (temp != null) {
            Pasien p = temp.getData().getData();//PuskesmasNode -> MedicalRecord -> Pasien
            System.out.printf("  %-12d %-12s %-20s%n", no, p.getNMR(), p.getNama());
            no++;
            temp = temp.getNext();
        }
    }
    
    /**
     * method untuk daftarkan pasien baru
     * method juga membuat NMR otomatis
     * @param nama
     * @param tahunLahir
     * @param alamat
     * @param jenisKelamin
     * @return 
     */
    public MedicalRecord daftarPasienBaru(String nama, int tahunLahir, String alamat, int jenisKelamin) {
        String nmr = "MR-" + String.format("%03d", jumlahMR + 1);
        Pasien pasien = new Pasien(nmr, nama, tahunLahir, alamat, jenisKelamin);
        return daftarPasien(pasien);
    }
    
    
    /**
     * method untuk simpan pasien ke array dataMR
     * juga sebagai helper daftarPasienBaru, buat MR
     * @param pasien
     * @return 
     */
    public MedicalRecord daftarPasien(Pasien pasien) {
        MedicalRecord mr = new MedicalRecord(pasien);
        dataMR[jumlahMR] = mr;
        jumlahMR++;
        System.out.println("Pasien " + pasien.getNama() + " berhasil didaftarkan. NMR: " + pasien.getNMR());
        return mr;
    }
    /**
     * cari MR berdasarkan NMR
     * @param nmr
     * @return 
     */
    public MedicalRecord cariNMR(String nmr) {
        for (int i = 0; i < jumlahMR; i++) {
            if (dataMR[i].getData().getNMR().equalsIgnoreCase(nmr)) 
                return dataMR[i];
        }
        return null;
    }

    /**
     * method untuk melakukan pemeriksaan pasien oleh dokter
     * @param mr
     * @param dokter
     * @param keluhan
     * @param tensi
     * @param suhu
     * @param bb
     * @param tb
     * @return 
     */
    public Pemeriksaan lakukanPemeriksaan(MedicalRecord mr, Dokter dokter,String keluhan, String tensi, double suhu, double bb, double tb) {
        periksaCounter++;
        String idPeriksa = "PKS-" + String.format("%03d", periksaCounter);

        Pemeriksaan periksa = new Pemeriksaan(idPeriksa, "2026",
                mr.getData(), dokter, keluhan, periksaCounter);

        periksa.setTensi(tensi);
        periksa.setSuhuTubuh(suhu);
        periksa.setBeratBadan(bb);
        periksa.setTinggiBadan(tb);
        periksa.prosesPeriksa();

        resepCounter++;
        Resep resep = new Resep("RSP-" + String.format("%03d", resepCounter), mr.getData(), 5);
        resep.isiResep(keluhan);
        periksa.setResep(resep);

        mr.tambahRiwayat(periksa);
        periksaAktif = periksa;
        bayarAktif   = null;

        return periksa;
    }
    
    /**
     * method untuk membuat tagihan berdasarkan pemeriksaan aktif
     * @return 
     */
    public Tagihan buatTagihan() {
        if (periksaAktif == null) return null;  

        tagihanCounter++;
        double biayaResep   = periksaAktif.getResep().hitungHargaResep();
        double jasaDokter   = periksaAktif.getDokter().getTarifKonsultasi();
        double administrasi = 15000;//biaya admin hardcoded

        return new Tagihan("TGH-" + String.format("%03d", tagihanCounter),
                jasaDokter, administrasi, biayaResep);
    }
    
    /**
     * method untuk memproses pembayaran tagihan
     * @param metodeBayar
     * @param tagihan 
     */
    public void prosesPembayaran(Pembayaran metodeBayar, Tagihan tagihan) {
        metodeBayar.setTagihan(tagihan);
        metodeBayar.Bayar();
        bayarAktif = metodeBayar;
    }
    /*
    ambil dokter umum
    @return
    */
    public DokterUmum getDokterUmum() {
        for (int i = 0; i < daftarDokter.length; i++) {
            Dokter d = daftarDokter[i];      
            if (d instanceof DokterUmum) 
                return (DokterUmum) d;
        }
        return null;
    }
    /**
     * ambil dokter spesialis
     * @return 
     */
    public DokterSpesialis getDokterSpesialis() {
         for (int i = 0; i < daftarDokter.length; i++) {
            Dokter d = daftarDokter[i]; 
                return (DokterSpesialis) d;
         }
        return null;
    }
    /**
     * cetak daftar dokter
     */
    public void cetakDaftarDokter() {
        System.out.println("========== DAFTAR DOKTER PUSKESMAS ==========");
        System.out.printf("%-4s %-10s %-15s %-15s %-25s %-15s%n",
                "No.", "NIP", "Nama", "Spesialis/Poli", "Jadwal", "Tarif");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < daftarDokter.length; i++) {
            if (daftarDokter[i] != null) {
                Dokter d = daftarDokter[i];
                String tipe;
                if (d instanceof DokterSpesialis) {
                    tipe = "Sp. " + ((DokterSpesialis) d).getSpesialisasi();
                } else if (d instanceof DokterUmum) {
                    tipe = ((DokterUmum) d).getPoliklinik();
                } else {
                    tipe = "-";
                }
                System.out.printf("%-4d %-10s %-15s %-15s %-25s Rp %,.0f%n",
                        (i + 1),
                        d.getNIP(),
                        d.getNama(),
                        tipe,
                        d.getJadwal(),
                        d.getTarifKonsultasi());
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

}
