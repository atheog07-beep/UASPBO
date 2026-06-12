package percobaanuas;

public class BPJS implements Pembayaran{
    private String nomorBPJS;
    private int kelasBPJS;
    private String namaKelas;
    private double totalBayar;
    private Tagihan tagihan;

    public BPJS(String nomorBPJS, int kelasBPJS, String namaKelas, double totalBayar, Tagihan tagihan) {
        this.nomorBPJS = nomorBPJS;
        this.kelasBPJS = kelasBPJS;
        this.namaKelas = namaKelas;
        this.totalBayar = totalBayar;
        this.tagihan = tagihan;
    }

    public String getNomorBPJS() {
        return nomorBPJS;
    }

    public int getKelasBPJS() {
        return kelasBPJS;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    @Override
    public void Bayar() {
        double Tanggungan;
        
        switch (kelasBPJS){
            case 1 : Tanggungan = 1.0; break;
            case 2 : Tanggungan = 0.75; break;
            default : Tanggungan = 0.5; break;
        }
        double ditanggung =  (tagihan.getJasaDokter() + tagihan.getJasaAdministrasi() * Tanggungan);
        totalBayar = tagihan.getTotalTagihan() - ditanggung;
        System.out.println(Cetak());
    }

    @Override
    public String Cetak() {
        
    }

    @Override
    public double Total() {
        return totalBayar;
    }

    @Override
    public void getTagihan() {
        tagihan.cetakTagihan();
    }

    @Override
    public void setTagihan(Tagihan tagihan) {

    }
    

}
