package percobaanuas;

public class Asuransi implements Pembayaran {

    // ---------- Atribut ----------
    
    private String NomorAsuransi;
    private String JenisAsuransi;
    private final double PERSENTASE_COVER = 100;
    private Tagihan tagihan;

    public Asuransi(String NomorAsuransi, String JenisAsuransi, Tagihan tagihan) {
        this.NomorAsuransi = NomorAsuransi;
        this.JenisAsuransi = JenisAsuransi;
        this.tagihan = tagihan;
    }

    public String getNomorAsuransi() {
        return NomorAsuransi;
    }

    public String getJenisAsuransi() {
        return JenisAsuransi;
    }

    public double getPERSENTASE_COVER() {
        return PERSENTASE_COVER;
    }
    
    @Override
    public void getTagihan() {
        
    }
    
   
    // ---------- Method ----------
    
    @Override
    public void Bayar() {

    }

    @Override
    public String Cetak() {
        return "Pembayaran Asuransi";
    }

    @Override
    public double Total() {
        return 0;
    }

   
}
    

