package percobaanuas;

public class Cash implements Pembayaran {

    // ---------- Atribut ----------
    private double TotalBayar;
    private double UangdiBayar;
    private double Kembalian;
    private boolean SudahdiBayar;
    private Tagihan tagihan;

    public Cash(double TotalBayar, double UangdiBayar, double Kembalian, boolean SudahdiBayar, Tagihan tagihan) {
        this.TotalBayar = TotalBayar;
        this.UangdiBayar = UangdiBayar;
        this.Kembalian = Kembalian;
        this.SudahdiBayar = SudahdiBayar;
        this.tagihan = tagihan;
    }

    public double getTotalBayar() {
        return TotalBayar;
    }

    public double getUangdiBayar() {
        return UangdiBayar;
    }

    public double getKembalian() {
        return Kembalian;
    }

    public boolean isSudahdiBayar() {
        return SudahdiBayar;
    }

    @Override
    public void getTagihan() {
        
    }

    @Override
    public void Bayar() {

    }

    @Override
    public String Cetak() {
        return "Pembayaran Cash";
    }

    @Override
    public double Total() {
        return 0;
    }


}

