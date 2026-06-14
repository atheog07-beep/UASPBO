package percobaanuas;

import java.util.Scanner;

/**
 * @author ath07 (revised + bugfix + antrian + menu obat)
 */
public class PuskesmasMain {

    // Array seluruh medical record pasien yang terdaftar
    private static MedicalRecord[] daftarMR = new MedicalRecord[100];
    private static int jumlahPasien = 0;

    public static void main(String[] args) {
        //buat objek scanner dan puskesmas
        Scanner fani = new Scanner(System.in);
        PuskesmasInti puskesmas = new PuskesmasInti();
        puskesmas.inisialisasiDokter();//inisialisi dokter puskesmas 
        
        //header puskesmas
        System.out.println("==========================================");
        System.out.println("      PUSKESMAS BETHESDA PAINGAN         ");
        System.out.println("==========================================");

        boolean jalan = true;//variabel jalan perulangan menu
        while (jalan) {//loop menu utama
            tampilkanMenuUtama();//panggil method tampil menu utama
            System.out.print("Pilih menu (1-7) : ");
            int pilihan = fani.nextInt();
            fani.nextLine();
            
            switch (pilihan) {//seleksi menu yang dipilih user
                case 1:
                    menuPendaftaran(fani, puskesmas);//menu pendaftaran
                    break;
                case 2:
                    menuPemeriksaan(fani, puskesmas);//menu pemeriksaan
                    break;
                case 3:
                    menuLihatPasien(puskesmas);//menu lihat pasien
                    break;
                case 4:
                    menuLihatDokter(puskesmas);//menu lihat dokter
                    break;
                case 5:
                    menuLihatRiwayatMR(fani);//menu lihat riwayat MR
                    break;
                case 6:
                    menuLihatObat();//menu lihat obat
                    break;
                case 7://menu jika exit
                    System.out.println("\n==========================================");
                    System.out.println("  TERIMA KASIH TELAH BERKUNJUNG");
                    System.out.println("  SEMOGA LEKAS SEHAT :)");
                    System.out.println("==========================================");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1 - 7!!\n");//jika input user tidak valid
            }
        }
        fani.close();//tutup Scanner
    }

    /**
     * tampilan menu utama program
     */
    private static void tampilkanMenuUtama() {
        System.out.println("\n==========================================");
        System.out.println("              MENU UTAMA                 ");
        System.out.println("==========================================");
        System.out.println(" 1. Pendaftaran Pasien");
        System.out.println(" 2. Pemeriksaan Pasien (Antrian)");
        System.out.println(" 3. Lihat Data Pasien & Antrian");
        System.out.println(" 4. Lihat Data Dokter");
        System.out.println(" 5. Lihat Riwayat Medical Record");
        System.out.println(" 6. Lihat Daftar Obat");
        System.out.println(" 7. Keluar");
        System.out.println("==========================================");
    }

    /**
     * menu untuk pendaftaran (untuk cek pasien lama & baru)
     * setelah pasien masuk, buat antrian (antrian pakai FIFO = first in first out)
     * @param fani
     * @param puskesmas 
     */
    private static void menuPendaftaran(Scanner fani, PuskesmasInti puskesmas) {
        //cetak menu
        System.out.println("\n==========================================");
        System.out.println("          PENDAFTARAN PASIEN             ");
        System.out.println("==========================================");
        System.out.println(" 1. Pasien Baru");
        System.out.println(" 2. Pasien Lama (sudah punya NMR)");
        System.out.println("==========================================");
        System.out.print("Pilih (1/2) : ");
        String pilihanTipe = fani.nextLine().trim();//input pasien lama/baru

        MedicalRecord mr = null;//siapkan objek MR

        if (pilihanTipe.equals("1")) {//jika pasien baru
            mr = inputPasienBaru(fani, puskesmas);//manggil method input pasien baru
        } else if (pilihanTipe.equals("2")) {
            mr = cariPasienLama(fani, puskesmas);//panggil mehod cariPasienLama
            if (mr == null) 
                return;//jika pasien tidak ditemuikan
        } else {
            System.out.println("Pilihan tidak valid!");//jika inputan user tidak valid
            return;
        }

        //masukkan ke antrian
        int noAntrian = puskesmas.masukAntrian(mr);
        //tampilan memasukan antrian sukses
        System.out.println("\n==========================================");
        System.out.println("  Pasien berhasil masuk antrian!");
        System.out.printf("  Nomor Antrian Anda : %d%n", noAntrian);
        System.out.println("  Silakan tunggu dipanggil untuk pemeriksaan.");
        System.out.println("==========================================");
    }

    /** 
     * Input data pasien baru
     */
    private static MedicalRecord inputPasienBaru(Scanner fani, PuskesmasInti puskesmas) {
        System.out.println("\n=== REGISTRASI PASIEN BARU ===");
        //input data pasien
        System.out.print("Nama Pasien  : ");
        String nama = fani.nextLine();

        System.out.print("Tahun Lahir  : ");
        int tahunLahir = fani.nextInt();
        fani.nextLine();

        System.out.print("Alamat       : ");
        String alamat = fani.nextLine();
        
        //input jenis kelamin
        int jenisKelamin = 0;
        while (jenisKelamin < 1 || jenisKelamin > 2) {
            System.out.print("Jenis Kelamin (1 = Laki-laki, 2 = Perempuan) : ");
            jenisKelamin = fani.nextInt();
            fani.nextLine();
            if (jenisKelamin < 1 || jenisKelamin > 2)
                System.out.println("Masukkan 1 atau 2!");//jika input tidak valid
        }

        MedicalRecord mr = puskesmas.daftarPasienBaru(nama, tahunLahir, alamat, jenisKelamin);//buat MR baru
        daftarMR[jumlahPasien] = mr;//simpan MR ke array daftarMR
        jumlahPasien++;//tambah jumlah pasien
        
        //cetak info berhasil
        System.out.println("\n--- Data Pasien Berhasil Didaftarkan ---");
        System.out.println("NMR Pasien   : " + mr.getData().getNMR());
        System.out.println("Nama         : " + mr.getData().getNama());
        System.out.println("Umur         : " + mr.getData().getUmur() + " tahun");

        return mr;//mengembalikan objek mr
    }

    /** 
     * Cari pasien lama berdasarkan NMR 
     */
    private static MedicalRecord cariPasienLama(Scanner fani, PuskesmasInti puskesmas) {
        System.out.println("\n=== CARI PASIEN LAMA ===");

        if (jumlahPasien == 0) {//jika belum ada pasien
            System.out.println("Belum ada pasien terdaftar di sistem!");
            return null;
        }
        
        //cetak daftar NMR yang terdaftar
        System.out.println("Daftar NMR terdaftar :");
        System.out.println("----------------------------------");
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();
            System.out.printf("  %-10s  %s%n", p.getNMR(), p.getNama());
        }
        System.out.println("----------------------------------");

        System.out.print("Masukkan NMR Pasien : ");//masukkan nmr pasien
        String nmrInput = fani.nextLine().trim();

        MedicalRecord mr = puskesmas.cariNMR(nmrInput);
        if (mr == null) {//jika pasien tidak ditemukan
            System.out.println("     Pasien dengan NMR \"" + nmrInput + "\" tidak ditemukan!");
            System.out.println("     Pastikan NMR benar, atau daftarkan sebagai pasien baru.");
            return null;
        }
        //cetak pasien yang ditemukan
        System.out.println("\n--- Data Pasien Ditemukan ---");
        System.out.println("NMR      : " + mr.getData().getNMR());
        System.out.println("Nama     : " + mr.getData().getNama());
        System.out.println("Umur     : " + mr.getData().getUmur() + " tahun");
        System.out.println("Alamat   : " + mr.getData().getAlamat());
        return mr;
    }

    /**
     * Menu pemeriksaan
     * ambil antrian terdepan, lalu panggil method lanjut pemeriksaan
     * @param fani
     * @param puskesmas 
     */
    private static void menuPemeriksaan(Scanner fani, PuskesmasInti puskesmas) {
        System.out.println("\n==========================================");
        System.out.println("        PEMERIKSAAN PASIEN               ");
        System.out.println("==========================================");

        //cek apakah ada pasien di antrian
        if (puskesmas.getSize() == 0) {
            System.out.println("Tidak ada pasien dalam antrian saat ini!");
            return;
        }

        //tampilkan siapa yang akan diperiksa selanjutnya
        MedicalRecord mrDepan = puskesmas.lihatAntrian();
        System.out.println("  Pasien berikutnya :");
        System.out.println("  Nama  : " + mrDepan.getData().getNama());
        System.out.println("  NMR   : " + mrDepan.getData().getNMR());
        System.out.println("  Sisa antrian : " + puskesmas.getSize() + " pasien");
        System.out.println("==========================================");

        System.out.print("Panggil pasien ini untuk diperiksa? (y/n) : ");//panggil pasien untuk diperiksa
        String konfirmasi = fani.nextLine().trim();
        if (!konfirmasi.equalsIgnoreCase("y"))//jika panggil maka lanjut proses pemeriksaan
            return;

        //Keluarkan dari antrian
        MedicalRecord mr = puskesmas.ambilAntrian();
         System.out.println("\n  Memanggil : " + mr.getData().getNama() + "...");

        //lanjut ke proses pemeriksaan
        lanjutPemeriksaan(fani, puskesmas, mr);
    }

    /** 
     * Proses pemeriksaan setelah pasien dipanggil dari antrian
     */
    private static void lanjutPemeriksaan(Scanner fani, PuskesmasInti puskesmas, MedicalRecord mr) {

        //pilih dokter
        System.out.println("\n=== PILIH DOKTER ===");
        puskesmas.cetakDaftarDokter();

        int pilihanDokter = 0;
        while (pilihanDokter < 1 || pilihanDokter > 5) {
            System.out.print("Pilih nomor dokter (1-5) : ");//input dokter
            pilihanDokter = fani.nextInt();
            fani.nextLine();
            if (pilihanDokter < 1 || pilihanDokter > 5)
                System.out.println("Pilihan tidak valid. Masukkan angka 1 - 5!");//jika inputan tidak valid
        }

        Dokter dokter = puskesmas.getDaftarDokter()[pilihanDokter - 1];//ambil daftar dokter, dan kurangi pilihan dokter (krn sudah diambil)
        System.out.println("Dokter dipilih : " + dokter.getNama());//nama dokter

        //Input data pemeriksaan
        System.out.println("\n=== INPUT DATA PEMERIKSAAN ===");
        System.out.println("Keluhan yang tersedia : Flu | Maag | Hipertensi | Diare | Sakit Gigi | Asma");//keluhan yang ada
        System.out.print("Keluhan      : ");
        String keluhan = fani.nextLine();

        System.out.print("Tensi        : ");
        String tensi = fani.nextLine();

        System.out.print("Suhu Tubuh   : ");
        double suhu = fani.nextDouble();

        System.out.print("Berat Badan  : ");
        double beratBadan = fani.nextDouble();

        System.out.print("Tinggi Badan : ");
        double tinggiBadan = fani.nextDouble();
        fani.nextLine();

        //roses pemeriksaan
        System.out.println("\n--- PROSES PEMERIKSAAN ---");
        Pemeriksaan periksa = puskesmas.lakukanPemeriksaan(
                mr, dokter, keluhan, tensi, suhu, beratBadan, tinggiBadan);
        periksa.CetakData();
        periksa.getResep().cetakResep();

        //tagihan & pembayaran
        Tagihan tagihan = puskesmas.buatTagihan();
        tagihan.cetakTagihan();
        menuPembayaran(fani, puskesmas, tagihan);

        //tawaran lihat riwayat MR
        System.out.print("\nTampilkan Riwayat Medical Record? (y/n) : ");
        String jawab = fani.nextLine();
        if (jawab.equalsIgnoreCase("y")) {
            mr.cetakRiwayat();
        }
    }

    /**
     * menu untuk melihat daftar pasien
     * @param puskesmas 
     */
    private static void menuLihatPasien(PuskesmasInti puskesmas) {
        System.out.println("\n=== DATA PASIEN TERDAFTAR ===");

        if (jumlahPasien == 0) {//jika belum ada pasien
            System.out.println("Belum ada pasien yang terdaftar!");
            return;
        }

        //buat set NMR yang sedang di antrian untuk penanda
        boolean[] diAntrian = tandaiAntrian(puskesmas);

        System.out.printf("%-5s %-12s %-20s %-6s %-15s %-12s %-10s%n",//cetak tabel
                "No.", "NMR", "Nama", "Umur", "Alamat", "J. Kelamin", "Antrian");
        System.out.println("-------------------------------------------------------------------------");
        
        //loop untuk cetak pasien
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();//ambil data pasienn
            String jk = (p.getJenisKelamin() == 1) ? "Laki-laki" : "Perempuan";//cek apakah pasien laki2 atau perempuan
            String statusAntrian = diAntrian[i] ? "Menunggu" : "-";//cek apakah pasien menunggu atau tidak
            System.out.printf("%-5d %-12s %-20s %-6d %-15s %-12s %-10s%n",
                    (i + 1), p.getNMR(), p.getNama(),
                    p.getUmur(), p.getAlamat(), jk, statusAntrian);//cetak data
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Total pasien terdaftar : " + jumlahPasien);//total pasien

        //tampilkan antrian aktif
        System.out.println("\n=== ANTRIAN SAAT INI (" + puskesmas.getSize() + " pasien) ===");
        puskesmas.cetakAntrian();//cetak antrian
    }

    /**
     * menandai index di daftarMR yang sedang ada di antrian puskesmas.
     * Iterasi linked list dari first ke last menggunakan getNext()
     */
    private static boolean[] tandaiAntrian(PuskesmasInti puskesmas) {
        boolean[] diAntrian = new boolean[jumlahPasien];//buat array boolean 
        //ambil node paling depan dari linked list di dalam Queue
        PuskesmasNode temp = puskesmas.getAntrianPasien().getAntrian().getFirst();
        //loop untuk menandai indeks pasien
        while (temp != null) {
            MedicalRecord mrAntrian = temp.getData(); //akses MR langsung
            //cocokkan dengan daftarMR lokal
            for (int i = 0; i < jumlahPasien; i++) {
                if (daftarMR[i] == mrAntrian) {
                    diAntrian[i] = true;
                    break;
                }
            }
            temp = temp.getNext(); // traversal ke node berikutnya
        }
        return diAntrian;
    }

    /**
     * menu untuk lihat daftar dokter
     * @param puskesmas 
     */
    private static void menuLihatDokter(PuskesmasInti puskesmas) {
        System.out.println("\n=== DATA DOKTER PUSKESMAS ===");
        puskesmas.cetakDaftarDokter();//cetak ddaftar dokter
    }

    /**
     * menu untuk lihat riwayat medical record
     * cari dulu s
     * @param fani 
     */
    private static void menuLihatRiwayatMR(Scanner fani) {
        System.out.println("\n=== LIHAT RIWAYAT MEDICAL RECORD ===");

        if (jumlahPasien == 0) {//jika MR kosong
            System.out.println("Belum ada pasien yang terdaftar!");
            return;
        }
        
        System.out.println("Daftar Pasien Terdaftar :");//cetak tabel
        System.out.println("------------------------------------------");
        System.out.printf(" %-5s %-12s %-20s %-10s%n", "No.", "NMR", "Nama", "Kunjungan");
        System.out.println("------------------------------------------");
        //cetak data mr
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();
            System.out.printf(" %-5d %-12s %-20s %-10d%n",
                    (i + 1), p.getNMR(), p.getNama(), daftarMR[i].getJmlRiwayat());
        }
        System.out.println("------------------------------------------");

        System.out.print("Pilih nomor pasien (1-" + jumlahPasien + ") : ");//pilih pasien
        int pilihan = fani.nextInt();
        fani.nextLine();

        if (pilihan < 1 || pilihan > jumlahPasien) {
            System.out.println("Pilihan tidak valid!");//jika pilihan tidak valid
            return;
        }
        daftarMR[pilihan - 1].cetakRiwayat();//cetak riwayat mt
    }

    /**
     * menu lihat obat
     * buat objek baru, terpisah dari yang di obat (khusus untul tampil data saja)
     */
    private static void menuLihatObat() {
        System.out.println("\n==========================================");
        System.out.println("           DAFTAR OBAT PUSKESMAS         ");
        System.out.println("==========================================");
        //buat objek obat
        Obat pct = new Obat("Paracetamol",   5000,   "Panadol",              67,   true);
        Obat dkg = new Obat("Dekongestan",   5000,   "Dekolgen",             70,   true);
        Obat vit = new Obat("Multivitamin",  16000,  "Vitacimin",            2000, false);
        Obat ats = new Obat("Antasida",      25000,  "Promag",               119,  true);
        Obat h2  = new Obat("H2 Bloker",     4000,   "Ranitidine",           100,  true);
        Obat adp = new Obat("Amlodipine",    40000,  "Norvask",              120,  true);
        Obat pf  = new Obat("Pemadat Feces", 7000,   "Neo Entrostop",        80,   true);
        Obat ort = new Obat("Oralit",        5000,   "Oralit",               150,  true);
        Obat ibp = new Obat("Ibuprofen",     4000,   "Farsifen",             99,   true);
        Obat sbt = new Obat("Salbutamol",    120000, "Ventolin Inhaler",     80,   true);
        Obat bds = new Obat("Budesonide",    450000, "Symbicort Turbuhaler", 30,   true);

        //masukkan ke array
        Obat[] daftarObat = { pct, dkg, vit, ats, h2, adp, pf, ort, ibp, sbt, bds };

        System.out.printf("%-5s %-18s %-24s %-12s %-6s %-6s%n",//header tabel
                "No.", "Nama Obat", "Merk", "Harga", "BPJS", "Stok");
        System.out.println("----------------------------------------------------------------------------");

        //cetak setiap baris obat
        for (int i = 0; i < daftarObat.length; i++) {
            Obat o = daftarObat[i];
            String bpjs = o.isIsKlaimBPJS() ? "Ya" : "Tidak";//apakah bisa claim bpjs atau tidak, 1(true) = ya
            System.out.printf("%-5d %-18s %-24s Rp %-10.0f %-6s %-6d%n",
            (i + 1),
            o.getNamaObat(),
            o.getMerkObat(),
            o.getHargaObat(),
            bpjs,
            o.getStockObat());
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    /**
     * menu pembayaran utama
     * @param fani
     * @param puskesmas
     * @param tagihan 
     */
    private static void menuPembayaran(Scanner fani, PuskesmasInti puskesmas, Tagihan tagihan) {
        //cetak pilihan
        System.out.println("\n=== METODE PEMBAYARAN ===");
        System.out.println(" 1. Cash");
        System.out.println(" 2. BPJS");
        System.out.println(" 3. Asuransi");

        int pilihanBayar = 0;
        //pilih metode pembayaran
        while (pilihanBayar < 1 || pilihanBayar > 3) {
            System.out.print("Pilih metode pembayaran (1-3) : ");
            pilihanBayar = fani.nextInt();
            fani.nextLine();
            if (pilihanBayar < 1 || pilihanBayar > 3)
                System.out.println("Pilihan tidak valid. Masukkan angka 1 - 3!");
        }

        Pembayaran metodeBayar = null;
        //pilihan pembayaran
        switch (pilihanBayar) {
            case 1:// Cash
                System.out.print("Uang yang dibayarkan (Rp) : ");
                double uangDiBayar = fani.nextDouble();
                fani.nextLine();
                metodeBayar = new Cash(0, uangDiBayar, 0, false, null);//buat objek cash
                break;
            case 2://BPJS
                //input data bpjs
                System.out.print("Nomor BPJS : ");
                String nomorBPJS = fani.nextLine();
                int kelasBPJS = 0;
                while (kelasBPJS < 1 || kelasBPJS > 3) {
                    System.out.print("Kelas BPJS (1 / 2 / 3) : ");//input kelas di BPJS
                    kelasBPJS = fani.nextInt();
                    fani.nextLine();
                    if (kelasBPJS < 1 || kelasBPJS > 3)
                        System.out.println("Kelas tidak valid!");
                }
                String namaKelas;
                switch (kelasBPJS) {//pilihan kelas BPJS, akan return kelas berapa sesuai input
                    case 1:  namaKelas = "Kelas 1"; break;
                    case 2:  namaKelas = "Kelas 2"; break;
                    default: namaKelas = "Kelas 3"; break;
                }
                metodeBayar = new BPJS(nomorBPJS, kelasBPJS, namaKelas, 0, null);//buat objek bpjs
                break;
            case 3://Asuransi
                System.out.print("Nomor Asuransi : ");
                String nomorAsuransi = fani.nextLine();
                System.out.print("Jenis Asuransi : ");
                String jenisAsuransi = fani.nextLine();
                metodeBayar = new Asuransi(nomorAsuransi, jenisAsuransi, null);//buat objek asuransi
                break;
        }

        System.out.println("\n=== PROSES PEMBAYARAN ===");
        puskesmas.prosesPembayaran(metodeBayar, tagihan);
    }
}
