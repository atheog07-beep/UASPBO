package percobaanuas;

public class MedicalRecord {
    
    private Pasien data;
    private Pemeriksaan[] riwayatPemeriksaan;
    private int jmlRiwayat;
    

    public MedicalRecord(Pasien data) {
        this.data = data;
    }

    public Pasien getData() {
        return data;
    }
    public void tambahRiwayat(Pemeriksaan p) {
        
    }
    public void cetakRiwayat() {
    }
    
    
}
