package percobaanuas;

public class Cash implements Pembayaran {


    private double totalBayar;
    private double uangdiBayar;
    private double kembalian;
    private boolean sudahdiBayar;
    private Tagihan tagihan;

    public Cash(double totalBayar, double uangdiBayar, double kembalian, boolean sudahdiBayar, Tagihan tagihan) {
        this.totalBayar = totalBayar;
        this.uangdiBayar = uangdiBayar;
        this.kembalian = kembalian;
        this.sudahdiBayar = sudahdiBayar;
        this.tagihan = tagihan;
    }

    

    public double getTotalBayar() {
        return totalBayar;
    }

    public double getUangdiBayar() {
        return uangdiBayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    public boolean isSudahdiBayar() {
        return sudahdiBayar;
    }

    @Override
    public void getTagihan() {
        
    }

    @Override
    public void Bayar() {
        totalBayar = tagihan.getTotalTagihan();
        if (uangdiBayar > totalBayar) {
        kembalian = uangdiBayar - totalBayar;
        sudahdiBayar = true;
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
            totalBayar, uangdiBayar, kembalian,
            sudahdiBayar ? "LUNAS" : "BELUM LUNAS");
    }

    @Override
    public double Total() {
        return totalBayar;
    }

    @Override
    public void setTagihan(Tagihan tagihan) {
        this.tagihan = tagihan;
    }


}

