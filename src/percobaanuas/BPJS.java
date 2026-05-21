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

    public Tagihan getTagihan() {
        return tagihan;
    }
    
    @Override
    public void Bayar(){
        
      
    }
    @Override
    public String Cetak(){
        
        return null;
        
    }
    
    @Override
    public double Total(){
        
        return 0;
        
    }
}
