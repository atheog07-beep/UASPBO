package percobaanuas; // Menentukan package tempat class Tagihan berada

/**
 *
 * @author asus
 */
public class Tagihan { // Deklarasi class Tagihan
    
    private String IDTagihan; // Menyimpan ID atau nomor tagihan
    private double JasaDokter; // Menyimpan biaya jasa dokter
    private double JasaAdministrasi; // Menyimpan biaya administrasi
    private double TotalTagihan; // Menyimpan total seluruh tagihan
    private double biayaResep; // Menyimpan biaya resep atau obat

    // Constructor untuk menginisialisasi data tagihan
    public Tagihan(String IDTagihan, double JasaDokter, double JasaAdministrasi, double biayaResep) {
        this.IDTagihan = IDTagihan; // Mengisi atribut IDTagihan
        this.JasaDokter = JasaDokter; // Mengisi atribut JasaDokter
        this.JasaAdministrasi = JasaAdministrasi; // Mengisi atribut JasaAdministrasi
        this.biayaResep = biayaResep; // Mengisi atribut biayaResep
        this.TotalTagihan = JasaDokter + JasaAdministrasi + biayaResep; // Menghitung total tagihan
    }

    // Constructor kosong
    public Tagihan() {
    }
    
    // Method getter untuk mengambil ID tagihan
    public String getIDTagihan() {
        return IDTagihan; // Mengembalikan nilai IDTagihan
    }

    // Method getter untuk mengambil biaya jasa dokter
    public double getJasaDokter() {
        return JasaDokter; // Mengembalikan nilai JasaDokter
    }

    // Method getter untuk mengambil biaya administrasi
    public double getJasaAdministrasi() {
        return JasaAdministrasi; // Mengembalikan nilai JasaAdministrasi
    }

    // Method getter untuk mengambil total tagihan
    public double getTotalTagihan() {
        return TotalTagihan; // Mengembalikan nilai TotalTagihan
    }

    // Method getter untuk mengambil biaya resep
    public double getBiayaResep() {
        return biayaResep; // Mengembalikan nilai biayaResep
    }

    // Method untuk mencetak rincian tagihan ke layar
    public void cetakTagihan() {
        System.out.println("========== TAGIHAN =========="); // Menampilkan judul tagihan
        System.out.println("ID Tagihan     : " + IDTagihan); // Menampilkan ID tagihan
        System.out.printf("Jasa Dokter    : Rp %,.0f%n", JasaDokter); // Menampilkan biaya jasa dokter
        System.out.printf("Administrasi   : Rp %,.0f%n", JasaAdministrasi); // Menampilkan biaya administrasi
        System.out.printf("Biaya Resep    : Rp %,.0f%n", biayaResep); // Menampilkan biaya resep
        System.out.println("-----------------------------"); // Menampilkan garis pemisah
        System.out.printf("TOTAL          : Rp %,.0f%n", TotalTagihan); // Menampilkan total tagihan
        System.out.println("============================="); // Menampilkan garis penutup
    }
} // Akhir dari class Tagihan
