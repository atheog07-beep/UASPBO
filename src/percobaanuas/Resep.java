package percobaanuas;

public class Resep {
 
private String IDResep;
private Pasien pasien;
private Pemeriksaan pemeriksaan;
private Obat[] daftarObat;
private String[] Dosis;
private int jumlahObat;
private double HargaResep;

    public Resep(String IDResep, Pasien pasien, int maxObat) {
        this.IDResep = IDResep;
        this.pasien = pasien;
        this.pemeriksaan = pemeriksaan;
        this.daftarObat = new Obat[maxObat];
        this.Dosis = new String[maxObat];
        this.jumlahObat = 0;
        this.HargaResep = 0;
    }
    
    public void tambahObat(Obat obat, String dosis) {
        if (jumlahObat < daftarObat.length) {
            daftarObat[jumlahObat] = obat;
            this.Dosis[jumlahObat] = dosis;
            jumlahObat++;
        }
    }
    public void isiResep(String keluhan) {
        obat(keluhan);
    }
    
    public void obat(String keluhan) {
        if (keluhan.equalsIgnoreCase("flu")) {
            Obat pct = new Obat("Paracetamol",5000, "Panadol", 67, true);
            Obat dkg = new Obat("Dekongestan", 5000, "Dekolgen", 70, true );
            Obat vit = new Obat("Multivitamin", 16000, "Vitacimin", 2000, false);
            tambahObat(pct, "3x sehari");tambahObat(dkg, "3x sehari");tambahObat(vit, "1x sehari");
           
        }  else if(keluhan.equalsIgnoreCase("Maag")) {
            Obat ats = new Obat("Antasida", 25000, "Promag", 119, true);
            Obat h2 = new Obat("H2 Bloker", 4000, "Ranitidine", 100, true);
            tambahObat(ats, "2x sehari");tambahObat(h2, "1x sehari");
        } else if(keluhan.equalsIgnoreCase("Hipertensi")) {
            Obat adp = new Obat("Amlodipine", 40000, "Norvask", 120, true);
            tambahObat(adp, "3x sehari");
        }else if(keluhan.equalsIgnoreCase("Diare")) {
            Obat PF = new Obat("Pemadat Feces", 7000, "Neo Entrostop",80, true);
            Obat Ort = new Obat("Oralit", 5000, "Oralit", 150, true);
            tambahObat(PF, "1x sehari");tambahObat(Ort, "3x sehari");
        }
        else if(keluhan.equalsIgnoreCase("Sakit Gigi")) {
            Obat pct = new Obat("Paracetamol",5000, "Panadol", 67, true);
            Obat IP = new Obat("Ibuprofen", 4000, "Farsifen", 99, true);
            tambahObat(pct, "2x sehari");tambahObat(IP, "1x sehari");
        } else if(keluhan.equalsIgnoreCase("Asma")) {
            Obat sbt = new Obat("Salbutamol",120000, "Ventolin Inhaler", 80, true);
            Obat BD = new Obat("Budesonide", 450000, "Symbicort Turbuhaler", 30, true);
            tambahObat(sbt, "sebutuhnya");tambahObat(BD, "1x sehari");
        }else {
            Obat pct = new Obat("Paracetamol",5000, "Panadol", 67, true);
            tambahObat(pct, "3x sehari");
        }
    }
    
    public void cetakResep() {
        System.out.println("---------- RESEP ----------");
        System.out.println("ID Resep : " + IDResep);
        System.out.println("Pasien   : " + pasien.getNama());
        System.out.println("Obat     :");
        for (int i = 0; i < jumlahObat; i++) {
            System.out.println("  " + (i+1) + ". " + daftarObat[i].getNamaObat()
                + " (" + daftarObat[i].getMerkObat() + ") - " + Dosis[i]
                + " | Rp " + String.format("%,.0f", daftarObat[i].getHargaObat()));
        }
        System.out.printf("Total Resep: Rp %,.0f%n", hitungHargaResep());
        System.out.println("---------------------------");
        }
    
    public double hitungHargaResep() {
        HargaResep = 0;
        for (int i = 0; i < jumlahObat; i++) {
            HargaResep += daftarObat[i].getHargaObat();
        }
        return HargaResep;
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
        return daftarObat;
    }

    public String[] getDosis() {
        return Dosis;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public double getHargaResep() {
        return HargaResep;
    }

    public void TambahObat(){  
    }
    
    public double HitungHargaResep(){
        return 0;
    }
    

}
    
    
    

