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
        TotalBayar = tagihan.getTotalTagihan();
        if (UangdiBayar > TotalBayar) {
        Kembalian = UangdiBayar - TotalBayar;
        SudahdiBayar = true;
            System.out.println(Cetak());
    } else {
            System.out.println("uang tidak cukup");
        }
    }

    @Override
    public String Cetak() {
        return String.format(
            "===== BUKTI PEMBAYARAN CASH =====%n" +
            "Metode      : Tunai%n" +
            "Total Bayar : Rp %,.0f%n" +
            "Uang Masuk  : Rp %,.0f%n" +
            "Kembalian   : Rp %,.0f%n" +
            "Status      : %s%n" +
            "================================",
            TotalBayar, UangdiBayar, Kembalian,
            SudahdiBayar ? "LUNAS" : "BELUM LUNAS");
    }

    @Override
    public double Total() {
        return TotalBayar;
    }

    @Override
    public void setTagihan(Tagihan tagihan) {
        this.tagihan = tagihan;
    }


}

