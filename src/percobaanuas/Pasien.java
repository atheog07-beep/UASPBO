package percobaanuas; // Menentukan package tempat class Pasien berada

/**
 *
 * @author ath07
 */
public class Pasien { // Deklarasi class Pasien
    
    private String NMR; // Menyimpan Nomor Rekam Medis pasien
    private String nama; // Menyimpan nama pasien
    private int tahunLahir; // Menyimpan tahun lahir pasien
    private String alamat; // Menyimpan alamat pasien
    private int jenisKelamin; // Menyimpan jenis kelamin pasien (misal: 1=Laki-laki, 2=Perempuan)

    // Constructor untuk menginisialisasi data pasien saat objek dibuat
    public Pasien(String NMR, String nama, int tahunLahir, String alamat, int jenisKelamin) {
        this.NMR = NMR; // Mengisi atribut NMR dengan parameter NMR
        this.nama = nama; // Mengisi atribut nama dengan parameter nama
        this.tahunLahir = tahunLahir; // Mengisi atribut tahunLahir dengan parameter tahunLahir
        this.alamat = alamat; // Mengisi atribut alamat dengan parameter alamat
        this.jenisKelamin = jenisKelamin; // Mengisi atribut jenisKelamin dengan parameter jenisKelamin
    }

    // Method getter untuk mengambil nilai NMR
    public String getNMR() {
        return NMR; // Mengembalikan nilai NMR
    }

    // Method getter untuk mengambil nama pasien
    public String getNama() {
        return nama; // Mengembalikan nilai nama
    }

    // Method untuk menghitung umur pasien
    public int getUmur() {
        return 2026 - tahunLahir; // Menghitung umur berdasarkan tahun lahir
    }

    // Method getter untuk mengambil alamat pasien
    public String getAlamat() {
        return alamat; // Mengembalikan nilai alamat
    }

    // Method getter untuk mengambil jenis kelamin pasien
    public int getJenisKelamin() {
        return jenisKelamin; // Mengembalikan nilai jenisKelamin
    }

} // Akhir dari class Pasien
