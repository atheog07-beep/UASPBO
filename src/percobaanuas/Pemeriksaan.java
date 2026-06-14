package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pemeriksaan {

    // atribut pemeriksaan
    private String idPeriksa;
    private String tanggalPeriksa;
    private Pasien pasien;
    private Dokter dokter;
    private String keluhan;
    private String diagnosa;
    private String tensi;
    private double suhuTubuh;
    private double tinggiBadan;
    private double beratBadan;
    private int nomorAntrian;
    private Resep resep;
    private String saran;

    // constructor pemeriksaan
    public Pemeriksaan(String idPeriksa, String tanggalPeriksa,
                       Pasien pasien, Dokter dokter,
                       String keluhan, int nomorAntrian) {
        this.idPeriksa = idPeriksa;
        this.tanggalPeriksa = tanggalPeriksa;
        this.pasien = pasien;
        this.dokter = dokter;
        this.keluhan = keluhan;
        this.nomorAntrian = nomorAntrian;
    }
    /**
     * method untuik proses periksa dari dokter
     */
    public void prosesPeriksa() {
        dokter.Periksa(pasien);
        diagnosa = dokter.Diagnosa(keluhan);
        saran = dokter.Saran(keluhan);
    }
    //getters dan setters
    public String getSaran() { return saran; }
    public void setSaran(String saran) { this.saran = saran; }

    public String getIdPeriksa() { return idPeriksa; }
    public void setIdPeriksa(String idPeriksa) { this.idPeriksa = idPeriksa; }

    public String getTanggalPeriksa() { return tanggalPeriksa; }
    public void setTanggalPeriksa(String tanggalPeriksa) { this.tanggalPeriksa = tanggalPeriksa; }

    public Resep getResep() { return resep; }
    public void setResep(Resep resep) { this.resep = resep; }

    public Pasien getPasien() { return pasien; }
    public void setPasien(Pasien pasien) { this.pasien = pasien; }

    public Dokter getDokter() { return dokter; }
    public void setDokter(Dokter dokter) { this.dokter = dokter; }

    public String getKeluhan() { return keluhan; }
    public void setKeluhan(String keluhan) { this.keluhan = keluhan; }

    public String getDiagnosa() { return diagnosa; }
    public void setDiagnosa(String diagnosa) { this.diagnosa = diagnosa; }

    public String getTensi() { return tensi; }
    public void setTensi(String tensi) { this.tensi = tensi; }

    public double getSuhuTubuh() { return suhuTubuh; }
    public void setSuhuTubuh(double suhuTubuh) { this.suhuTubuh = suhuTubuh; }

    public double getTinggiBadan() { return tinggiBadan; }
    public void setTinggiBadan(double tinggiBadan) { this.tinggiBadan = tinggiBadan; }

    public double getBeratBadan() { return beratBadan; }
    public void setBeratBadan(double beratBadan) { this.beratBadan = beratBadan; }

    public int getNomorAntrian() { return nomorAntrian; }
    public void setNomorAntrian(int nomorAntrian) { this.nomorAntrian = nomorAntrian; }
    
    /**
     * mthod untuk cetakData
     */
    public void CetakData() {
        System.out.println("========== PEMERIKSAAN ==========");
        System.out.println("ID Periksa  : " + idPeriksa);
        System.out.println("Tanggal     : " + tanggalPeriksa);
        System.out.println("Antrian     : " + nomorAntrian);
        System.out.println("Pasien      : " + pasien.getNama());
        System.out.println("Dokter      : " + dokter.getNama());
        System.out.println("Keluhan     : " + keluhan);
        System.out.println("Diagnosa    : " + diagnosa);
        System.out.println("Saran       : " + saran);
        System.out.println("Tensi       : " + tensi);
        System.out.println("Suhu        : " + suhuTubuh + " C");
        System.out.println("BB / TB     : " + beratBadan + " kg / " + tinggiBadan + " cm");
        System.out.println("=================================");
    }
}
