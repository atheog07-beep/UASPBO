package percobaanuas;

/**
 *
 * @author asus
 */
public class Tagihan {
    
    private String IDTagihan;
    private double JasaDokter;
    private double JasaAdministrasi;
    private double TotalTagihan;
    private double biayaResep;

    public Tagihan(String IDTagihan, double JasaDokter, double JasaAdministrasi, double biayaResep) {
        this.IDTagihan = IDTagihan;
        this.JasaDokter = JasaDokter;
        this.JasaAdministrasi = JasaAdministrasi;
        this.biayaResep = biayaResep;
        this.TotalTagihan = JasaDokter + JasaAdministrasi + biayaResep;
    }

    public String getIDTagihan() {
        return IDTagihan;
    }

    public double getJasaDokter() {
        return JasaDokter;
    }

    public double getJasaAdministrasi() {
        return JasaAdministrasi;
    }

    public double getTotalTagihan() {
        return TotalTagihan;
    }

    public double getBiayaResep() {
        return biayaResep;
    }

    public void cetakTagihan() {
        System.out.println("========== TAGIHAN ==========");
        System.out.println("ID Tagihan     : " + IDTagihan);
        System.out.printf("Jasa Dokter    : Rp %,.0f%n", JasaDokter);
        System.out.printf("Administrasi   : Rp %,.0f%n", JasaAdministrasi);
        System.out.printf("Biaya Resep    : Rp %,.0f%n", biayaResep);
        System.out.println("-----------------------------");
        System.out.printf("TOTAL          : Rp %,.0f%n", TotalTagihan);
        System.out.println("=============================");
    }
}
