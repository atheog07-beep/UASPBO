package percobaanuas;

/**
 *
 * @author ath07
 */
public class Pasien {
    
    private MedicalReport NMR;
    private double TinggiBadan;
    private double BeratBadan;

    public Pasien(MedicalReport NMR, double TinggiBadan, double BeratBadan) {
        this.NMR = NMR;
        this.TinggiBadan = TinggiBadan;
        this.BeratBadan = BeratBadan;
    }

    public MedicalReport getNMR() {
        return NMR;
    }

    public double getTinggiBadan() {
        return TinggiBadan;
    }

    public double getBeratBadan() {
        return BeratBadan;
    }
    
    public int getUmur(){
        return 0;
    }

}