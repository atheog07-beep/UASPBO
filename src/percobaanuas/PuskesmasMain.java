package percobaanuas;

import java.util.Scanner;

/**
 * Puskesmas Bethesda Paingan -- by kelompok II
 * @author ath07 (revised + bugfix)
 */
public class PuskesmasMain {

    //daftar semua medical record pasien yang sudah terdaftar
    private static MedicalRecord[] daftarMR = new MedicalRecord[100];
    private static int jumlahPasien = 0;//counter jml pasien
    
    public static void main(String[] args) {
        //buat objek 
        Scanner fani = new Scanner(System.in);
        PuskesmasInti puskesmas = new PuskesmasInti();
        
        puskesmas.inisialisasiDokter();//buat dokter
        
        //judul
        System.out.println("==========================================");
        System.out.println("      PUSKESMAS BETHESDA PAINGAN         ");
        System.out.println("==========================================");
        
        /**
         * Loop menu utama program
         */
        boolean jalan = true;
        while (jalan) {
            tampilkanMenuUtama();//tampil menu
            System.out.print("Pilih menu (1-5) : ");
            int pilihan = Integer.parseInt(fani.nextLine().trim());

            switch (pilihan) {
                case 1:
                    menuPendaftaran(fani, puskesmas);
                    break;
                case 2:
                    menuLihatPasien();
                    break;
                case 3:
                    menuLihatDokter(puskesmas);
                    break;
                case 4:
                    menuLihatRiwayatMR(fani);
                    break;
                case 5:
                    System.out.println("\n==========================================");
                    System.out.println("  TERIMA KASIH TELAH BERKUNJUNG");
                    System.out.println("  SEMOGA LEKAS SEHAT :)");
                    System.out.println("==========================================");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1 - 5!!\n");
            }
        }

        fani.close();
    }

    /**
     * Main menu program
     */
    private static void tampilkanMenuUtama() {
        System.out.println("\n==========================================");
        System.out.println("              MENU UTAMA                 ");
        System.out.println("==========================================");
        System.out.println(" 1. Pendaftaran & Pemeriksaan Pasien");
        System.out.println(" 2. Lihat Data Pasien");
        System.out.println(" 3. Lihat Data Dokter");
        System.out.println(" 4. Lihat Riwayat Medical Record Pasien");
        System.out.println(" 5. Keluar");
        System.out.println("==========================================");
    }

    /**
     * menu Pendaftaran pasien
     * 1. jika pasien baru -> input data pasien, masukan data pasien ke MR
     * 2. jika pasien lama -> input nmr, data pasien otomatis terisi
     * @param fani
     * @param puskesmas 
     */
    private static void menuPendaftaran(Scanner fani, PuskesmasInti puskesmas) {
        System.out.println("\n==========================================");
        System.out.println("          PENDAFTARAN PASIEN             ");
        System.out.println("==========================================");
        System.out.println(" 1. Pasien Baru");
        System.out.println(" 2. Pasien Lama (sudah punya NMR)");
        System.out.println("==========================================");
        System.out.print("Pilih (1/2) : ");
        String pilihanTipe = fani.nextLine().trim();

        MedicalRecord mr = null;

        if (pilihanTipe.equals("1")) {
            // ---- PASIEN BARU ----
            mr = inputPasienBaru(fani, puskesmas);
        } else if (pilihanTipe.equals("2")) {
            // ---- PASIEN LAMA ----
            mr = cariPasienLama(fani, puskesmas);
            if (mr == null) return; // tidak ditemukan, batalkan
        } else {
            System.out.println(" [!] Pilihan tidak valid.");
            return;
        }

        lanjutPemeriksaan(fani, puskesmas, mr);
    }

    /**
     * Input data pasien baru, simpan ke daftar global dan puskesmas
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

        int jenisKelamin = 0;
        while (jenisKelamin < 1 || jenisKelamin > 2) {
            System.out.print("Jenis Kelamin (1 = Laki-laki, 2 = Perempuan) : ");
            jenisKelamin = fani.nextInt();
            fani.nextLine();
            if (jenisKelamin < 1 || jenisKelamin > 2)
                System.out.println("Masukkan 1 atau 2!");
        }

        MedicalRecord mr = puskesmas.daftarPasienBaru(nama, tahunLahir, alamat, jenisKelamin);//buat mr 
        daftarMR[jumlahPasien] = mr;
        jumlahPasien++;//tambah jml pasien

        System.out.println("\n--- Data Pasien Berhasil Didaftarkan ---");
        System.out.println("NMR Pasien   : " + mr.getData().getNMR());
        System.out.println("Nama         : " + mr.getData().getNama());
        System.out.println("Umur         : " + mr.getData().getUmur() + " tahun");

        return mr;
    }

    /**
     * method  Cari pasien lama berdasarkan NMR yang diinput
     */
    private static MedicalRecord cariPasienLama(Scanner fani, PuskesmasInti puskesmas) {
        System.out.println("\n=== CARI PASIEN LAMA ===");

        if (jumlahPasien == 0) {//jika tdk ada pasien
            System.out.println("Belum ada pasien terdaftar di sistem!");
            return null;
        }

        //tampilkan daftar NMR sebagai referensi (opsional aja)
        System.out.println("Daftar NMR terdaftar :");
        System.out.println("----------------------------------");
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();//ambil data nmr
            System.out.printf("  %-10s  %s%n", p.getNMR(), p.getNama());
        }
        System.out.println("----------------------------------");

        System.out.print("Masukkan NMR Pasien : ");
        String nmrInput = fani.nextLine().trim();//input nmr pasien

        MedicalRecord mr = puskesmas.cariNMR(nmrInput);

        if (mr == null) {//nmr tidak ditemukan
            System.out.println(" [!] Pasien dengan NMR \"" + nmrInput + "\" tidak ditemukan.");
            System.out.println("     Pastikan NMR benar, atau daftarkan sebagai pasien baru.");
            return null;
        }
        //jika pasien ditemukan
        System.out.println("\n--- Data Pasien Ditemukan ---");
        System.out.println("NMR      : " + mr.getData().getNMR());
        System.out.println("Nama     : " + mr.getData().getNama());
        System.out.println("Umur     : " + mr.getData().getUmur() + " tahun");
        System.out.println("Alamat   : " + mr.getData().getAlamat());
        return mr;
    }

    /**
     * Proses pemeriksaan setelah pasien diidentifikasi (baru / lama)
     */
    private static void lanjutPemeriksaan(Scanner fani, PuskesmasInti puskesmas, MedicalRecord mr) {
        //pilih dokter
        System.out.println("\n=== PILIH DOKTER ===");
        puskesmas.cetakDaftarDokter();

        int pilihanDokter = 0;
        while (pilihanDokter < 1 || pilihanDokter > 5) {
            System.out.print("Pilih nomor dokter (1-5) : ");
            pilihanDokter = fani.nextInt();
            fani.nextLine();
            if (pilihanDokter < 1 || pilihanDokter > 5)
                System.out.println("Pilihan tidak valid. Masukkan angka 1 - 5!");
        }

        Dokter dokter = puskesmas.getDaftarDokter()[pilihanDokter - 1];//daftar dokter berkurang 1
        System.out.println("Dokter dipilih : " + dokter.getNama());

        //input data pemeriksaan
        System.out.println("\n=== INPUT DATA PEMERIKSAAN ===");
        System.out.println("Keluhan yang tersedia : Flu | Maag | Hipertensi | Diare | Sakit Gigi | Asma");//penyakit yang tersedia
        //input keluhan, tensi, suhu tubuh, bb, tb
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

        System.out.println("\n--- PROSES PEMERIKSAAN ---");
        Pemeriksaan periksa = puskesmas.lakukanPemeriksaan(mr, dokter, keluhan, tensi, suhu, beratBadan, tinggiBadan);//buat pemeriksaan
        periksa.CetakData();//cetak data pemeriksaan
        periksa.getResep().cetakResep();//cetak resep

        //pembayaran, lalu cetak info pembayaran
        //buat tagihan
        Tagihan tagihan = puskesmas.buatTagihan();
        tagihan.cetakTagihan();
        menuPembayaran(fani, puskesmas, tagihan);

        //tampilan MR
        System.out.print("\nTampilkan Riwayat Medical Record? (y/n) : ");
        String jawab = fani.nextLine();
        if (jawab.equalsIgnoreCase("y")) {
            mr.cetakRiwayat();
        }
    }

    /**
     * menu lihat pasien
     */
    private static void menuLihatPasien() {
        System.out.println("\n=== DATA PASIEN TERDAFTAR ===");

        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien yang terdaftar!");
            return;
        }

        System.out.printf("%-5s %-12s %-20s %-6s %-15s %-12s%n",
                "No.", "NMR", "Nama", "Umur", "Alamat", "J. Kelamin");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();//ambil data MR
            String jk = (p.getJenisKelamin() == 1) ? "Laki-laki" : "Perempuan";// simbol ? -> jika true maka laki2, false perempuan
            System.out.printf("%-5d %-12s %-20s %-6d %-15s %-12s%n",
                    (i + 1), p.getNMR(), p.getNama(), p.getUmur(), p.getAlamat(), jk);//cetak tabel pasien
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total pasien terdaftar : " + jumlahPasien);
    }

    /**
     * menu lihat daftar dokter
     * @param puskesmas 
     */
    private static void menuLihatDokter(PuskesmasInti puskesmas) {
        System.out.println("\n=== DATA DOKTER PUSKESMAS ===");
        puskesmas.cetakDaftarDokter();//cetak daftar dokter
    }

    /**
     * menu lihat Medical ReCORD.
     * 1. tampilkan dulu mr yang terdaftar
     * 2. pilih lihat pasien yang mana untuk melihat riwayatnya
     * @param fani 
     */
    private static void menuLihatRiwayatMR(Scanner fani) {
        System.out.println("\n=== LIHAT RIWAYAT MEDICAL RECORD ===");

        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien yang terdaftar!");
            return;
        }

        //tampilkan daftar NMR + nama semua pasien
        System.out.println("Daftar Pasien Terdaftar :");
        System.out.println("------------------------------------------");
        System.out.printf(" %-5s %-12s %-20s %-8s%n", "No.", "NMR", "Nama", "Kunjungan");
        System.out.println("------------------------------------------");
        for (int i = 0; i < jumlahPasien; i++) {
            Pasien p = daftarMR[i].getData();//ambil data mr
            System.out.printf(" %-5d %-12s %-20s %-8d%n",
                    (i + 1), p.getNMR(), p.getNama(), daftarMR[i].getJmlRiwayat());//cetak data mr
        }
        System.out.println("------------------------------------------");

        System.out.print("Pilih nomor pasien (1-" + jumlahPasien + ") : ");//pilih pasien yang mana
        int pilihan = fani.nextInt();
        fani.nextLine();

        if (pilihan < 1 || pilihan > jumlahPasien) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        MedicalRecord mr = daftarMR[pilihan - 1];//kurangi daftar MR 
        mr.cetakRiwayat();//cetask riwayat MR
    }

    /**
     * Menu Pembayaran
     * @param fani
     * @param puskesmas
     * @param tagihan 
     */
    private static void menuPembayaran(Scanner fani, PuskesmasInti puskesmas, Tagihan tagihan) {
        System.out.println("\n=== METODE PEMBAYARAN ===");
        System.out.println(" 1. Cash");
        System.out.println(" 2. BPJS");
        System.out.println(" 3. Asuransi");
        //pilih metode pembayaran
        int pilihanBayar = 0;
        while (pilihanBayar < 1 || pilihanBayar > 3) {
            System.out.print("Pilih metode pembayaran (1-3) : ");
            pilihanBayar = fani.nextInt();
            fani.nextLine();
            if (pilihanBayar < 1 || pilihanBayar > 3)
                System.out.println("Pilihan tidak valid. Masukkan angka 1 - 3!");
        }

        Pembayaran metodeBayar = null;//buat objek metodeBayar

        switch (pilihanBayar) {
            case 1://cash
                System.out.print("Uang yang dibayarkan (Rp) : ");
                double uangDiBayar = fani.nextDouble();
                fani.nextLine();
                metodeBayar = new Cash(0, uangDiBayar, 0, false, null);//buat objek cash
                break;

            case 2://bpjs
                System.out.print("Nomor BPJS : ");
                String nomorBPJS = fani.nextLine();
                int kelasBPJS = 0;
                while (kelasBPJS < 1 || kelasBPJS > 3) {
                    System.out.print("Kelas BPJS (1 / 2 / 3) : ");
                    kelasBPJS = fani.nextInt();
                    fani.nextLine();
                    if (kelasBPJS < 1 || kelasBPJS > 3)
                        System.out.println("Kelas tidak valid!");
                }
                String namaKelas;
                switch (kelasBPJS) {//kelas bpjs 1,2,3
                    case 1:  namaKelas = "Kelas 1"; break;
                    case 2:  namaKelas = "Kelas 2"; break;
                    default: namaKelas = "Kelas 3"; break;
                }
                metodeBayar = new BPJS(nomorBPJS, kelasBPJS, namaKelas, 0, null);//buat objek BPJS
                break;

            case 3://asuransi
                System.out.print("Nomor Asuransi : ");
                String nomorAsuransi = fani.nextLine();
                System.out.print("Jenis Asuransi : ");
                String jenisAsuransi = fani.nextLine();
                metodeBayar = new Asuransi(nomorAsuransi, jenisAsuransi, null);//buat objek asuransi
                break;
        }

        System.out.println("\n=== PROSES PEMBAYARAN ===");
        puskesmas.prosesPembayaran(metodeBayar, tagihan);//cetak proses pembayaran
    }
}