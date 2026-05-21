package percobaanuas;

public class MedicalReport {
    
    private String NMR;
    private String Nama;
    private String TanggalLahir;
    private String Alamat;
    private int JenisKelamin;

    public MedicalReport(String NMR, String Nama, String TanggalLahir, String Alamat, int JenisKelamin) {
        this.NMR = NMR;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
    }

    public String getNMR() {
        return NMR;
    }

    public void setNMR(String NMR) {
        this.NMR = NMR;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(int JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    
    
    
}
