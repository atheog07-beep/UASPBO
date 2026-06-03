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

    public Tagihan(String IDTagihan, double JasaDokter, double JasaAdministrasi, double TotalTagihan, double biayaResep) {
        this.IDTagihan = IDTagihan;
        this.JasaDokter = JasaDokter;
        this.JasaAdministrasi = JasaAdministrasi;
        this.TotalTagihan = TotalTagihan;
        this.biayaResep = biayaResep;
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

    
}
