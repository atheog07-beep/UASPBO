package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pasien {
    
    private MedicalRecord NMR;
    private String nama;
    private int tahunLahir;
    private String alamat;
    private int jenisKelamin;

    public Pasien(MedicalRecord NMR, String nama, int tahunLahir, String alamat, int jenisKelamin) {
        this.NMR = NMR;
        this.nama = nama;
        this.tahunLahir = tahunLahir;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public MedicalRecord getNMR() {
        return NMR;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return 2026 - tahunLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }

   

}