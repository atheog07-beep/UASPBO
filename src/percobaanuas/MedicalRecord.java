package percobaanuas;

public class MedicalRecord {
    
    private Pasien data;
    private Pemeriksaan[] riwayatPemeriksaan;
    private int jmlRiwayat;
    

    public MedicalRecord(Pasien data) {
        this.data = data;
        this.riwayatPemeriksaan = new Pemeriksaan[50];
        this.jmlRiwayat = 0;
    }

    public Pasien getData() {
        return data;
    }
    public void tambahRiwayat(Pemeriksaan p) {
        if (jmlRiwayat < riwayatPemeriksaan.length) {
            riwayatPemeriksaan[jmlRiwayat] = p;
            jmlRiwayat++;
        }
    }
    public void cetakRiwayat() {
        System.out.println("------- RIWAYAT MEDICAL RECORD ------");
        System.out.println("Pasien : " + data.getNama() + " (" + data.getNMR() + ")");
        if (jmlRiwayat == 0) {
            System.out.println("Belum ada riwayat pemeriksaan.");
        } else {
            for (int i = 0; i < jmlRiwayat; i++) {
                System.out.println("\n[Kunjungan " + (i+1) + "]");
                riwayatPemeriksaan[i].CetakData();
                if (riwayatPemeriksaan[i].getResep() != null) {
                    riwayatPemeriksaan[i].getResep().cetakResep();
                }
            }
        }
        System.out.println("==================================");
    }
    
    public int getJmlRiwayat() { return jmlRiwayat; }
    public Pemeriksaan[] getRiwayatPemeriksaan() { return riwayatPemeriksaan; }
}
