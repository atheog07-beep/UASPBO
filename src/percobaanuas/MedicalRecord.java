package percobaanuas;

public class MedicalRecord { //Deklarasi kelas MedicalRecord
    
    private Pasien data; //Atribut untuk menyimpan data pasien pemilik rekam medis
    private Pemeriksaan[] riwayatPemeriksaan; //Array untuk menyimpan daftar riwayat pemeriksaan pasien
    private int jmlRiwayat; //atribut untuk mencatat jumlah riwayat pemeriksaan yang sudah tersimpan
    
    //constructor
    public MedicalRecord(Pasien data) {
        this.data = data;
        this.riwayatPemeriksaan = new Pemeriksaan[50];// Membuat array Pemeriksaan dengan kapasitas maksimal 50 data
        this.jmlRiwayat = 0; //Menginisialisasi jumlah riwayat dengan 0 (belum ada riwayat)
    }
    //metode getter untuk atribut Data
    public Pasien getData() {
        return data; //Mengembalikan objek pasien yang tersimpa
    }
    /**
     * Menambahkan data pemeriksaan baru ke dalam riwayat pemeriksaan pasien.
     * Pemeriksaan hanya ditambahkan jika array belum penuh (maksimal 50).
     * @param p Objek Pemeriksaan yang akan ditambahkan ke riwayat
     */
    public void tambahRiwayat(Pemeriksaan p) {
        if (jmlRiwayat < riwayatPemeriksaan.length) {
            riwayatPemeriksaan[jmlRiwayat] = p;
            jmlRiwayat++;
        }
    }
     /**
     * Mencetak seluruh riwayat pemeriksaan pasien ke layar (console).
     * Menampilkan setiap kunjungan beserta resep jika tersedia.
     */
    public void cetakRiwayat() {
        System.out.println("------- RIWAYAT MEDICAL RECORD ------");
        System.out.println("Pasien : " + data.getNama() + " (" + data.getNMR() + ")");
        if (jmlRiwayat == 0) { //Mengecek apakah belum ada riwayat pemeriksaan yang tersimpan
            System.out.println("Belum ada riwayat pemeriksaan.");
        } else {
            for (int i = 0; i < jmlRiwayat; i++) { //Perulangan untuk menampilkan setiap riwayat pemeriksaan satu per satu
                System.out.println("\n[Kunjungan " + (i+1) + "]");
                riwayatPemeriksaan[i].CetakData();
                if (riwayatPemeriksaan[i].getResep() != null) { //Mengecek apakah pemeriksaan ke-i memiliki resep obat
                    riwayatPemeriksaan[i].getResep().cetakResep(); //Jika ada resep, mencetak detail resep obat tersebut
                }
            }
        }
        System.out.println("==================================");
    }
    //metode getter untuk atribut jmlRiwayat dan riwayatPemeriksaan
    public int getJmlRiwayat() { return jmlRiwayat; }
    public Pemeriksaan[] getRiwayatPemeriksaan() { return riwayatPemeriksaan; }
}
