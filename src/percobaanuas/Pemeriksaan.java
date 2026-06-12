package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pemeriksaan {
    
    private String IDPeriksa;
    private String TanggalPeriksa;
    private Pasien pasien;
    private Dokter dokter;
    private String Keluhan;
    private String Diagnosa;
    private String Tensi;
    private double SuhuTubuh;
    private double TinggiBadan;
    private double BeratBadan;
    private int NomorAntrian;
    private Resep resep;

    public Pemeriksaan(String IDPeriksa, String TanggalPeriksa, Pasien pasien, Dokter dokter,String Keluhan, String Diagnosa, String Tensi, double SuhuTubuh, double TinggiBadan, double BeratBadan, int NomorAntrian) {
        this.IDPeriksa = IDPeriksa;
        this.TanggalPeriksa = TanggalPeriksa;
        this.pasien = pasien;
        this.dokter = dokter;
        this.Keluhan = Keluhan;
        this.Diagnosa = Diagnosa;
        this.Tensi = Tensi;
        this.SuhuTubuh = SuhuTubuh;
        this.TinggiBadan = TinggiBadan;
        this.BeratBadan = BeratBadan;
        this.NomorAntrian = NomorAntrian;
    }
    
    public Pemeriksaan(String IDPeriksa, String TanggalPeriksa,
                       Pasien pasien, Dokter dokter, String Keluhan, int NomorAntrian) {
        this.IDPeriksa = IDPeriksa;
        this.TanggalPeriksa = TanggalPeriksa;
        this.pasien = pasien;
        this.dokter = dokter;
        this.Keluhan = Keluhan;
        this.NomorAntrian = NomorAntrian;
    }
    public void ProsesPeriksa() {
        dokter.Periksa(pasien);
        Diagnosa = dokter.Diagnosa(Keluhan);
    }
    
    public String getIDPeriksa() {
        return IDPeriksa;
    }

    public void setIDPeriksa(String IDPeriksa) {
        this.IDPeriksa = IDPeriksa;
    }

    public String getTanggalPeriksa() {
        return TanggalPeriksa;
    }

    public void setTanggalPeriksa(String TanggalPeriksa) {
        this.TanggalPeriksa = TanggalPeriksa;
    }

    public void setResep(Resep resep) {
        this.resep = resep;
    }

    public Resep getResep() {
        return resep;
    }
    

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public void setDiagnosa(String Diagnosa) {
        this.Diagnosa = Diagnosa;
    }

    public String getTensi() {
        return Tensi;
    }

    public void setTensi(String Tensi) {
        this.Tensi = Tensi;
    }

    public double getSuhuTubuh() {
        return SuhuTubuh;
    }

    public void setSuhuTubuh(double SuhuTubuh) {
        this.SuhuTubuh = SuhuTubuh;
    }

    public double getTinggiBadan() {
        return TinggiBadan;
    }

    public void setTinggiBadan(double TinggiBadan) {
        this.TinggiBadan = TinggiBadan;
    }

    public double getBeratBadan() {
        return BeratBadan;
    }

    public void setBeratBadan(double BeratBadan) {
        this.BeratBadan = BeratBadan;
    }

    public int getNomorAntrian() {
        return NomorAntrian;
    }

    public void setNomorAntrian(int NomorAntrian) {
        this.NomorAntrian = NomorAntrian;
    }

    public void CetakData() {
        System.out.println("========== PEMERIKSAAN ==========");
        System.out.println("ID Periksa  : " + IDPeriksa);
        System.out.println("Tanggal     : " + TanggalPeriksa);
        System.out.println("Antrian     : " + NomorAntrian);
        System.out.println("Pasien      : " + pasien.getNama());
        System.out.println("Dokter      : " + dokter.getNama());
        System.out.println("Keluhan     : " + Keluhan);
        System.out.println("Diagnosa    : " + Diagnosa);
        System.out.println("Tensi       : " + Tensi);
        System.out.println("Suhu        : " + SuhuTubuh + " °C");
        System.out.println("BB / TB     : " + BeratBadan + " kg / " + TinggiBadan + " cm");
        System.out.println("=================================");
    }
    
}