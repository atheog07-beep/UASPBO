/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author asus
 */
public class BPJS implements Pembayaran{
    private String nomorBPJS;
    private int kelasBPJS;
    private String namaKelas;
    private double totalBayar;

    public BPJS(String nomorBPJS, int kelasBPJS, String namaKelas, double totalBayar) {
        this.nomorBPJS = nomorBPJS;
        this.kelasBPJS = kelasBPJS;
        this.namaKelas = namaKelas;
        this.totalBayar = totalBayar;
    }

    public String getNomorBPJS() {
        return nomorBPJS;
    }

    public void setNomorBPJS(String nomorBPJS) {
        this.nomorBPJS = nomorBPJS;
    }

    public int getKelasBPJS() {
        return kelasBPJS;
    }

    public void setKelasBPJS(int kelasBPJS) {
        this.kelasBPJS = kelasBPJS;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
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
