package percobaanuas;

/**
 *
 * @author ath07
 */
public class Obat {
     private String NamaObat;
     private double HargaObat;
     private String MerkObat;
     private int StockObat;
     private boolean isKlaimBPJS;

    public Obat(String NamaObat, double HargaObat, String MerkObat, int StockObat, boolean isKlaimBPJS) {
        this.NamaObat = NamaObat;
        this.HargaObat = HargaObat;
        this.MerkObat = MerkObat;
        this.StockObat = StockObat;
        this.isKlaimBPJS = isKlaimBPJS;
    }

    public String getNamaObat() {
        return NamaObat;
    }

    public double getHargaObat() {
        return HargaObat;
    }

    public String getMerkObat() {
        return MerkObat;
    }

    public int getStockObat() {
        return StockObat;
    }

    public boolean isIsKlaimBPJS() {
        return isKlaimBPJS;
    }
     
    private void KurangStock(int jumlah){
        if (StockObat >= jumlah) {
            StockObat -= jumlah;
         } else {
            System.out.println("Stok obat tidak mencukupi.");
        }
        
    }

    public void cetakDataObat(){
    
    }
}
