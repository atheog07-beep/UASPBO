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
    private Resep Resep;
    private String Tensi;
    private double SuhuTubuh;
    private int NomorAntrian;

    public Pemeriksaan(String IDPeriksa, String TanggalPeriksa, Pasien pasien, Dokter dokter, String Keluhan, String Diagnosa, Resep Resep, String Tensi, double SuhuTubuh, int NomorAntrian) {
        this.IDPeriksa = IDPeriksa;
        this.TanggalPeriksa = TanggalPeriksa;
        this.pasien = pasien;
        this.dokter = dokter;
        this.Keluhan = Keluhan;
        this.Diagnosa = Diagnosa;
        this.Resep = Resep;
        this.Tensi = Tensi;
        this.SuhuTubuh = SuhuTubuh;
        this.NomorAntrian = NomorAntrian;
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

    public Resep getResep() {
        return Resep;
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
    
    
}