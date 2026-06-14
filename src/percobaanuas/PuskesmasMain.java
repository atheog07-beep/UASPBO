package percobaanuas; // Menentukan package tempat class berada

import java.util.Scanner; // Mengimpor class Scanner untuk input keyboard

/**
 * @author ath07 (revised + bugfix)
 */
public class PuskesmasMain { // Class utama program

    // Daftar seluruh medical record pasien yang terdaftar
    private static MedicalRecord[] daftarMR = new MedicalRecord[100];

    // Variabel penghitung jumlah pasien yang tersimpan
    private static int jumlahPasien = 0;

    public static void main(String[] args) { // Method utama program

        // Membuat objek Scanner untuk membaca input user
        Scanner fani = new Scanner(System.in);

        // Membuat objek puskesmas
        PuskesmasInti puskesmas = new PuskesmasInti();

        // Menginisialisasi data dokter yang tersedia
        puskesmas.inisialisasiDokter();

        // Menampilkan header aplikasi
        System.out.println("==========================================");
        System.out.println("      PUSKESMAS BETHESDA PAINGAN         ");
        System.out.println("==========================================");

        // Variabel kontrol perulangan menu
        boolean jalan = true;

        // Loop utama program
        while (jalan) {

            // Menampilkan menu utama
            tampilkanMenuUtama();

            // Meminta input pilihan menu
            System.out.print("Pilih menu (1-5) : ");

            // Membaca input dan mengubah ke integer
            int pilihan = Integer.parseInt(fani.nextLine().trim());

            // Seleksi menu yang dipilih user
            switch (pilihan) {

                case 1: // Menu pendaftaran pasien
                    menuPendaftaran(fani, puskesmas);
                    break;

                case 2: // Menu lihat data pasien
                    menuLihatPasien();
                    break;

                case 3: // Menu lihat data dokter
                    menuLihatDokter(puskesmas);
                    break;

                case 4: // Menu lihat riwayat medical record
                    menuLihatRiwayatMR(fani);
                    break;

                case 5: // Keluar program

                    System.out.println("\n==========================================");
                    System.out.println("  TERIMA KASIH TELAH BERKUNJUNG");
                    System.out.println("  SEMOGA LEKAS SEHAT :)");
                    System.out.println("==========================================");

                    jalan = false; // Menghentikan loop program
                    break;

                default: // Jika input tidak valid
                    System.out.println("Pilihan tidak valid. Masukkan angka 1 - 5!!\n");
            }
        }

        // Menutup Scanner
        fani.close();
    }

    /**
     * Method untuk menampilkan menu utama
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
 * Method menu pendaftaran pasien
 * 1. Pasien Baru
 * 2. Pasien Lama
 */
private static void menuPendaftaran(Scanner fani, PuskesmasInti puskesmas) {

    // Menampilkan judul menu pendaftaran
    System.out.println("\n==========================================");
    System.out.println("          PENDAFTARAN PASIEN             ");
    System.out.println("==========================================");
    System.out.println(" 1. Pasien Baru");
    System.out.println(" 2. Pasien Lama (sudah punya NMR)");
    System.out.println("==========================================");

    // Meminta pilihan jenis pasien
    System.out.print("Pilih (1/2) : ");
    String pilihanTipe = fani.nextLine().trim();

    // Menyiapkan objek Medical Record
    MedicalRecord mr = null;

    // Jika pasien baru
    if (pilihanTipe.equals("1")) {

        // Memanggil method input pasien baru
        mr = inputPasienBaru(fani, puskesmas);

    // Jika pasien lama
    } else if (pilihanTipe.equals("2")) {

        // Mencari pasien berdasarkan NMR
        mr = cariPasienLama(fani, puskesmas);

        // Jika pasien tidak ditemukan
        if (mr == null)
            return;

    } else {

        // Jika pilihan tidak valid
        System.out.println(" [!] Pilihan tidak valid.");
        return;
    }

    // Melanjutkan ke proses pemeriksaan
    lanjutPemeriksaan(fani, puskesmas, mr);
}

/**
 * Input data pasien baru
 */
private static MedicalRecord inputPasienBaru(Scanner fani, PuskesmasInti puskesmas) {

    // Menampilkan judul registrasi pasien baru
    System.out.println("\n=== REGISTRASI PASIEN BARU ===");

    // Input nama pasien
    System.out.print("Nama Pasien  : ");
    String nama = fani.nextLine();

    // Input tahun lahir pasien
    System.out.print("Tahun Lahir  : ");
    int tahunLahir = fani.nextInt();
    fani.nextLine();

    // Input alamat pasien
    System.out.print("Alamat       : ");
    String alamat = fani.nextLine();

    // Variabel jenis kelamin
    int jenisKelamin = 0;

    // Validasi input jenis kelamin
    while (jenisKelamin < 1 || jenisKelamin > 2) {

        System.out.print("Jenis Kelamin (1 = Laki-laki, 2 = Perempuan) : ");

        // Membaca input jenis kelamin
        jenisKelamin = fani.nextInt();
        fani.nextLine();

        // Jika input salah
        if (jenisKelamin < 1 || jenisKelamin > 2)
            System.out.println("Masukkan 1 atau 2!");
    }

    // Mendaftarkan pasien baru dan membuat medical record
    MedicalRecord mr = puskesmas.daftarPasienBaru(
            nama,
            tahunLahir,
            alamat,
            jenisKelamin
    );

    // Menyimpan medical record ke array
    daftarMR[jumlahPasien] = mr;

    // Menambah jumlah pasien
    jumlahPasien++;

    // Menampilkan data pasien yang berhasil didaftarkan
    System.out.println("\n--- Data Pasien Berhasil Didaftarkan ---");
    System.out.println("NMR Pasien   : " + mr.getData().getNMR());
    System.out.println("Nama         : " + mr.getData().getNama());
    System.out.println("Umur         : " + mr.getData().getUmur() + " tahun");

    // Mengembalikan objek medical record
    return mr;
}

/**
 * Mencari pasien lama berdasarkan NMR
 */
private static MedicalRecord cariPasienLama(Scanner fani, PuskesmasInti puskesmas) {

    // Menampilkan judul pencarian pasien
    System.out.println("\n=== CARI PASIEN LAMA ===");

    // Jika belum ada pasien terdaftar
    if (jumlahPasien == 0) {

        System.out.println("Belum ada pasien terdaftar di sistem!");
        return null;
    }

    // Menampilkan daftar pasien terdaftar
    System.out.println("Daftar NMR terdaftar :");
    System.out.println("----------------------------------");

    for (int i = 0; i < jumlahPasien; i++) {

        // Mengambil data pasien
        Pasien p = daftarMR[i].getData();

        // Menampilkan NMR dan nama pasien
        System.out.printf("  %-10s  %s%n",
                p.getNMR(),
                p.getNama());
    }

    System.out.println("----------------------------------");

    // Input NMR pasien
    System.out.print("Masukkan NMR Pasien : ");
    String nmrInput = fani.nextLine().trim();

    // Mencari pasien berdasarkan NMR
    MedicalRecord mr = puskesmas.cariNMR(nmrInput);

    // Jika tidak ditemukan
    if (mr == null) {

        System.out.println(" [!] Pasien dengan NMR \"" + nmrInput + "\" tidak ditemukan.");
        System.out.println("     Pastikan NMR benar, atau daftarkan sebagai pasien baru.");

        return null;
    }

    // Menampilkan data pasien yang ditemukan
    System.out.println("\n--- Data Pasien Ditemukan ---");
    System.out.println("NMR      : " + mr.getData().getNMR());
    System.out.println("Nama     : " + mr.getData().getNama());
    System.out.println("Umur     : " + mr.getData().getUmur() + " tahun");
    System.out.println("Alamat   : " + mr.getData().getAlamat());

    // Mengembalikan medical record
    return mr;
}

/**
 * Proses pemeriksaan setelah pasien dipilih
 */
private static void lanjutPemeriksaan(Scanner fani, PuskesmasInti puskesmas, MedicalRecord mr) {

    // Menampilkan menu pemilihan dokter
    System.out.println("\n=== PILIH DOKTER ===");

    // Menampilkan daftar dokter yang tersedia
    puskesmas.cetakDaftarDokter();

    // Variabel untuk menyimpan pilihan dokter
    int pilihanDokter = 0;

    // Validasi agar pilihan dokter hanya 1 sampai 5
    while (pilihanDokter < 1 || pilihanDokter > 5) {

        // Meminta nomor dokter
        System.out.print("Pilih nomor dokter (1-5) : ");

        // Membaca input dokter
        pilihanDokter = fani.nextInt();
        fani.nextLine();

        // Jika pilihan tidak valid
        if (pilihanDokter < 1 || pilihanDokter > 5)
            System.out.println("Pilihan tidak valid. Masukkan angka 1 - 5!");
    }

    // Mengambil objek dokter dari array dokter
    Dokter dokter = puskesmas.getDaftarDokter()[pilihanDokter - 1];

    // Menampilkan dokter yang dipilih
    System.out.println("Dokter dipilih : " + dokter.getNama());

    // Menampilkan menu input pemeriksaan
    System.out.println("\n=== INPUT DATA PEMERIKSAAN ===");

    // Menampilkan daftar keluhan yang tersedia
    System.out.println("Keluhan yang tersedia : Flu | Maag | Hipertensi | Diare | Sakit Gigi | Asma");

    // Input keluhan pasien
    System.out.print("Keluhan      : ");
    String keluhan = fani.nextLine();

    // Input tensi pasien
    System.out.print("Tensi        : ");
    String tensi = fani.nextLine();

    // Input suhu tubuh pasien
    System.out.print("Suhu Tubuh   : ");
    double suhu = fani.nextDouble();

    // Input berat badan pasien
    System.out.print("Berat Badan  : ");
    double beratBadan = fani.nextDouble();

    // Input tinggi badan pasien
    System.out.print("Tinggi Badan : ");
    double tinggiBadan = fani.nextDouble();

    // Membersihkan buffer enter
    fani.nextLine();

    // Menampilkan proses pemeriksaan
    System.out.println("\n--- PROSES PEMERIKSAAN ---");

    // Membuat objek pemeriksaan
    Pemeriksaan periksa = puskesmas.lakukanPemeriksaan(
            mr,
            dokter,
            keluhan,
            tensi,
            suhu,
            beratBadan,
            tinggiBadan
    );

    // Menampilkan hasil pemeriksaan
    periksa.CetakData();

    // Menampilkan resep yang diberikan
    periksa.getResep().cetakResep();

    // Membuat objek tagihan
    Tagihan tagihan = puskesmas.buatTagihan();

    // Menampilkan rincian tagihan
    tagihan.cetakTagihan();

    // Masuk ke menu pembayaran
    menuPembayaran(fani, puskesmas, tagihan);

    // Menanyakan apakah ingin melihat riwayat medical record
    System.out.print("\nTampilkan Riwayat Medical Record? (y/n) : ");

    // Membaca jawaban user
    String jawab = fani.nextLine();

    // Jika user memilih ya
    if (jawab.equalsIgnoreCase("y")) {

        // Menampilkan riwayat medical record pasien
        mr.cetakRiwayat();
    }
}
