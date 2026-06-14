package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pasien {
    //attribut pasien
    private String NMR;
    private String nama;
    private int tahunLahir;
    private String alamat;
    private int jenisKelamin;
    
    //consdtructor berparameter
    public Pasien(String NMR, String nama, int tahunLahir, String alamat, int jenisKelamin) {
        this.NMR = NMR;
        this.nama = nama;
        this.tahunLahir = tahunLahir;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    //getters
    public String getNMR() {return NMR;}
    public String getNama() {return nama;}
    public int getUmur() {return 2026 - tahunLahir;}
    public String getAlamat() {return alamat;}
    public int getJenisKelamin() {return jenisKelamin;}
}