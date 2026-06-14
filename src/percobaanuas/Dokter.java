package percobaanuas;

/**
 *
 * @author ath07
 */
public abstract class Dokter {
    
    private String NIP;
    private String Nama;
    private String Jadwal;
    
    protected double TarifKonsultasi;

    public Dokter(String NIP, String Nama, String Jadwal, double TarifKonsultasi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Jadwal = Jadwal;
        this.TarifKonsultasi = TarifKonsultasi;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJadwal() {
        return Jadwal;
    }

    public void setJadwal(String Jadwal) {
        this.Jadwal = Jadwal;
    }

    public double getTarifKonsultasi() {
        return TarifKonsultasi;
    }

    public void setTarifKonsultasi(double TarifKonsultasi) {
        this.TarifKonsultasi = TarifKonsultasi;
    }
    
    public abstract void Periksa(Pasien pasien);
    
    public String getInfo(){
         return "NIP: " + NIP + " | Nama: " + Nama + " | Jadwal: " + Jadwal
               + " | Tarif: Rp " + String.format("%,.0f", TarifKonsultasi);
    }
    
    public abstract String Saran(String keluhan);
    public abstract String Diagnosa(String keluhan);
}
