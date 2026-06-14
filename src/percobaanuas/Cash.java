package percobaanuas;

public class Cash implements Pembayaran {    // class Cash menerapkan / mengimplementasikan interface Pembayaran

    private double totalBayar;    // menyimpan total biaya yang harus dibayar
    private double uangdiBayar;    // menyimpan jumlah uang yang diberikan pasien
    private double kembalian;    // menyimpan jumlah uang kembalian
    private boolean sudahdiBayar;    // menyimpan status pembayaran
    private Tagihan tagihan;    // menyimpan objek tagihan yang akan dibayar

    public Cash(double totalBayar, double uangdiBayar, double kembalian, boolean sudahdiBayar, Tagihan tagihan) {    // constructor untuk menginisialisasi data pembayaran cash
        this.totalBayar = totalBayar;    // mengisi atribut total bayar
        this.uangdiBayar = uangdiBayar;    // mengisi atribut uang yang dibayarkan
        this.kembalian = kembalian;    // mengisi atribut kembalian
        this.sudahdiBayar = sudahdiBayar;    // mengisi atribut status pembayaran
        this.tagihan = tagihan;    // menghubungkan objek tagihan dengan pembayaran cash
    }

    public double getTotalBayar() {    // getter untuk mengambil total pembayaran
        return totalBayar;
    }

    public double getUangdiBayar() {    // getter untuk mengambil jumlah uang yang dibayarkan
        return uangdiBayar;
    }

    public double getKembalian() {    // getter untuk mengambil jumlah kembalian
        return kembalian;
    }

    public boolean isSudahdiBayar() {    // getter untuk mengambil status pembayaran
        return sudahdiBayar;
    }

    // method implementasi dari interface Pembayaran

    @Override
    public void getTagihan() {    // method untuk menampilkan informasi tagihan
        
    }

    @Override
    public void Bayar() {    // method untuk melakukan pembayaran secara tunai
        totalBayar = tagihan.getTotalTagihan();    // mengambil total tagihan yang harus dibayar

        if (uangdiBayar > totalBayar) {    // memeriksa apakah uang yang dibayarkan mencukupi
            kembalian = uangdiBayar - totalBayar;    // menghitung jumlah kembalian
            sudahdiBayar = true;    // mengubah status pembayaran menjadi lunas
            System.out.println(Cetak());    // menampilkan bukti pembayaran
        } else {
            System.out.println("uang tidak cukup");    // menampilkan pesan jika uang kurang
        }
    }

    @Override
    public String Cetak() {    // method untuk mencetak bukti pembayaran
        return String.format(    // mengembalikan String yang berisi informasi pembayaran
            "===== BUKTI PEMBAYARAN CASH =====%n" +
            "Metode      : Tunai%n" +
            "Total Bayar : Rp %,.0f%n" +
            "Uang Masuk  : Rp %,.0f%n" +
            "Kembalian   : Rp %,.0f%n" +
            "Status      : %s%n" +
            "================================",
            totalBayar, uangdiBayar, kembalian,
            sudahdiBayar ? "LUNAS" : "BELUM LUNAS");
    }    // (totalBayar) mengisi placeholder %,.0f untuk total pembayaran
         // (uangdiBayar) mengisi placeholder %,.0f untuk uang yang dibayarkan
         // (kembalian) mengisi placeholder %,.0f untuk jumlah kembalian
         // (sudahdiBayar ? "LUNAS" : "BELUM LUNAS") mengisi placeholder %s untuk status pembayaran

    @Override
    public double Total() {    // method untuk mengambil total pembayaran
        return totalBayar;    // mengembalikan nilai total pembayaran
    }

    @Override
    public void setTagihan(Tagihan tagihan) {    // method untuk mengubah atau menetapkan objek tagihan
        this.tagihan = tagihan;    // mengganti referensi tagihan yang digunakan
    }

}
