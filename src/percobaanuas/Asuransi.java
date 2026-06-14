package percobaanuas;    // package tempat class berada

public class Asuransi implements Pembayaran {    // class Asuransi menerapkan / mengimplementasikan interface Pembayaran 

    // ---------- Atribut ----------
    
    private double totalBayar;    // menyimpan total biaya yang harus dibayarkan
    private String NomorAsuransi;    // menyimpan nomor asuransi pelanggan 
    private String JenisAsuransi;    // menyimpan jenis asuransi yang digunakan
    private final double PERSENTASE_COVER = 100;    // persentase biaya yang ditanggung asuransi adalah semuanya ( 100% )
    private Tagihan tagihan;    // menyimpan objek tagihan yang akan dibayar

    public Asuransi(String NomorAsuransi, String JenisAsuransi, Tagihan tagihan) {    // constructor untuk menginisialisasi data asuransi
        this.NomorAsuransi = NomorAsuransi;    // mengisi atribut nomor asuransi 
        this.JenisAsuransi = JenisAsuransi;    // mengisi atribut jenis asuransi
        this.tagihan = tagihan;    // menghubungkan objek tagihan dengan asuransi
    }

    public String getNomorAsuransi() {    // getter untuk mengambil nomor asuransi 
        return NomorAsuransi;
    }

    public String getJenisAsuransi() {    // getter untuk mengambil jenis asuransi
        return JenisAsuransi;
    }

    public double getPERSENTASE_COVER() {    // getter untuk mengambil persentase cover asuransi
        return PERSENTASE_COVER;
    }

// method implementasi dari interface Pembayaran 
    
    @Override
    public void getTagihan() {    // method untuk menampilkan informasi tagihan
        tagihan.cetakTagihan();    // memanggil method cetakTagihan() dari onjek tagihan
    }
    
   
    // ---------- Method ----------
    
    @Override
    public void Bayar() {    // method untuk melakukan pembayaran 
      totalBayar = 0;    // karena seluruh biaya ditanggung asuransi, maka total yang harus dibayar adalah 0
        System.out.println(Cetak());   // menampilkan bukti pembayaran  
    }

    @Override
    public String Cetak() {    // method untuk mencetak bukti pembayaran 
        return String.format(    // mengembalikan String yang berisi informasi pembayaran 
            "===== BUKTI PEMBAYARAN ASURANSI =====%n" +
            "No. Asuransi : %s%n" +
            "Jenis        : %s%n" +
            "Cover        : %.0f%%%n" +
            "Total Bayar  : Rp %,.0f (DITANGGUNG ASURANSI)%n" +
            "=====================================",
            NomorAsuransi, JenisAsuransi, PERSENTASE_COVER, totalBayar);
    }    // (NomorAsuransi) mengisi placeholder %s pertama
        // (JenisAsuransi) mengisi placeholder %s kedua
        // (PERSENTASE_COVER) mengisi placeholder %.0f unutk persentase cover
        // (totalBayar) mengisi placeholder %,.0f untuk total pembayaran

    
    @Override
    public double Total() {    // mthod untuk mengambil total pembayaran 
        return totalBayar;    // mengembalikan nilai total bayar 
    }

    @Override
    public void setTagihan(Tagihan tagihan) {    // method untuk mengubah atau menetapkan objek tagihan
      this.tagihan = tagihan;    // mengganti referensi tagihan yang digunakan 
    }

   
}
    

