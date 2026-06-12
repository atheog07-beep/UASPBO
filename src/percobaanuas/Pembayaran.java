package percobaanuas;

public interface Pembayaran {
    
    public void Bayar();
    public String Cetak();
    public double Total();
    public void getTagihan();
    public void setTagihan(Tagihan tagihan);
}
