package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pasien {
    
    private MedicalRecord NMR;
    private String nama;
    private int umur;
    private String alamat;
    private int jenisKelamin;

    public Pasien(MedicalRecord NMR, String nama, int umur, String alamat, int jenisKelamin) {
        this.NMR = NMR;
        this.nama = nama;
        this.umur = umur;
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
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }

   

}