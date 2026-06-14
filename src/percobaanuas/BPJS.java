package percobaanuas;

public class BPJS implements Pembayaran {    // class BPJS menerapkan / mengimplementasikan interface Pembayaran

    private String nomorBPJS;    // menyimpan nomor kepesertaan BPJS
    private int kelasBPJS;    // menyimpan kelas BPJS
    private String namaKelas;    // menyimpan nama kelas BPJS
    private double totalBayar;    // menyimpan total biaya yang harus dibayar pasien
    private Tagihan tagihan;    // menyimpan objek tagihan yang akan diproses

    public BPJS(String nomorBPJS, int kelasBPJS, String namaKelas, double totalBayar, Tagihan tagihan) {    // constructor untuk menginisialisasi data BPJS
        this.nomorBPJS = nomorBPJS;    // mengisi atribut nomor BPJS
        this.kelasBPJS = kelasBPJS;    // mengisi atribut kelas BPJS
        this.namaKelas = namaKelas;    // mengisi atribut nama kelas BPJS
        this.totalBayar = totalBayar;    // mengisi atribut total pembayaran
        this.tagihan = tagihan;    // menghubungkan objek tagihan dengan BPJS
    }

    public String getNomorBPJS() {    // getter untuk mengambil nomor BPJS
        return nomorBPJS;
    }

    public int getKelasBPJS() {    // getter untuk mengambil kelas BPJS
        return kelasBPJS;
    }

    public String getNamaKelas() {    // getter untuk mengambil nama kelas BPJS
        return namaKelas;
    }

    public double getTotalBayar() {    // getter untuk mengambil total pembayaran
        return totalBayar;
    }

    // method implementasi dari interface Pembayaran

    @Override
    public void Bayar() {    // method untuk menghitung pembayaran menggunakan BPJS
        double Tanggungan;    // menyimpan persentase biaya yang ditanggung BPJS

        switch (kelasBPJS) {    // menentukan persentase tanggungan berdasarkan kelas BPJS
            case 1:
                Tanggungan = 1.0;    // kelas 1 menanggung 100% biaya
                break;
            case 2:
                Tanggungan = 0.75;    // kelas 2 menanggung 75% biaya
                break;
            default:
                Tanggungan = 0.5;    // kelas 3 menanggung 50% biaya
                break;
        }

        double ditanggung = (tagihan.getJasaDokter() + tagihan.getJasaAdministrasi() * Tanggungan);    // menghitung biaya yang ditanggung BPJS

        totalBayar = tagihan.getTotalTagihan() - ditanggung;    // menghitung sisa biaya yang harus dibayar pasien

        System.out.println(Cetak());    // menampilkan bukti pembayaran
    }

    @Override
    public String Cetak() {    // method untuk mencetak bukti pembayaran
        return String.format(    // mengembalikan String yang berisi informasi pembayaran
            "===== BUKTI PEMBAYARAN BPJS =====%n" +
            "Nomor BPJS  : %s%n" +
            "Kelas       : %s%n" +
            "Total Bayar : Rp %,.0f%n" +
            "================================",
            nomorBPJS, namaKelas, totalBayar);
    }    // (nomorBPJS) mengisi placeholder %s pertama
         // (namaKelas) mengisi placeholder %s kedua
         // (totalBayar) mengisi placeholder %,.0f untuk total pembayaran

    @Override
    public double Total() {    // method untuk mengambil total pembayaran
        return totalBayar;    // mengembalikan nilai total pembayaran
    }

    @Override
    public void getTagihan() {    // method untuk menampilkan informasi tagihan
        tagihan.cetakTagihan();    // memanggil method cetakTagihan() dari objek tagihan
    }

    @Override
    public void setTagihan(Tagihan tagihan) {    // method untuk mengubah atau menetapkan objek tagihan
        this.tagihan = tagihan;    // mengganti referensi tagihan yang digunakan
    }

}
