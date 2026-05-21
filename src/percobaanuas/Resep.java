package percobaanuas;

public class Resep {
 
private String IDResep;
private Pasien pasien;
private Pemeriksaan pemeriksaan;
private Obat[] DaftarObat;
private String[] Dosis;
private int JumlahObat;
private double HargaResep;

    public Resep(String IDResep, Pasien pasien, Pemeriksaan pemeriksaan, Obat[] DaftarObat, String[] Dosis, int JumlahObat, double HargaResep) {
        this.IDResep = IDResep;
        this.pasien = pasien;
        this.pemeriksaan = pemeriksaan;
        this.DaftarObat = DaftarObat;
        this.Dosis = Dosis;
        this.JumlahObat = JumlahObat;
        this.HargaResep = HargaResep;
    }

    public String getIDResep() {
        return IDResep;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Pemeriksaan getPemeriksaan() {
        return pemeriksaan;
    }

    public Obat[] getDaftarObat() {
        return DaftarObat;
    }

    public String[] getDosis() {
        return Dosis;
    }

    public int getJumlahObat() {
        return JumlahObat;
    }

    public double getHargaResep() {
        return HargaResep;
    }

    public void TambahObat(){  
    }
    
    public double HitungHargaResep(){
        return 0;
    }
    
    public void CetakResep(){
    }
}
