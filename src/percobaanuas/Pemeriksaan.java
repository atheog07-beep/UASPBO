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

    public Pemeriksaan(String IDPeriksa, String TanggalPeriksa, Pasien pasien, Dokter dokter, String Keluhan, String Diagnosa, String Tensi, double SuhuTubuh, double TinggiBadan, double BeratBadan, int NomorAntrian) {
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

    public void prosesPeriksa() {
        dokter.Periksa(pasien);
        Diagnosa = dokter.Diagnosa(Keluhan);
    }

    public String getIDPeriksa() {
        return IDPeriksa;
    }

    public String getTanggalPeriksa() {
        return TanggalPeriksa;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public String getTensi() {
        return Tensi;
    }

    public double getSuhuTubuh() {
        return SuhuTubuh;
    }

    public int getNomorAntrian() {
        return NomorAntrian;
    }

    
    public void ProsesPeriksa(){
    }
    
    public void CetakData(){
    }
    
    public double getTinggiBadan() {
        return TinggiBadan;
    }

    public double getBeratBadan() {
        return BeratBadan;
    }
    
}