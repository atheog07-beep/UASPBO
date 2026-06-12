package percobaanuas;

import java.util.Scanner;

/**
 *
 * @author ath07
 */
public class PuskesmasMain {

    public static void main(String[] args) {
        
        Tagihan tagihan = new Tagihan();
        
        Scanner fani = new Scanner(System.in);
        PuskesmasInti puskesmas = new PuskesmasInti();
        puskesmas.inisialisasiDokter();
        
        System.out.println("==========================");
        System.out.println("PUSKESMAS BETHESDA PAINGAN");
        System.out.println("==========================");
        
    
        System.out.println("\n=== PENDAFTARAN PASIEN ===");
        
        System.out.println("Nama Pasien : ");
        String nama = fani.nextLine();
        
        System.out.println("Tahun Lahir : ");
        int tahunLahir = fani.nextInt();
        fani.nextLine();
        
        System.out.println("Alamat : ");
        String alamat = fani.nextLine();
        
        System.out.println("Jenis Kelamin (1 = Laki-laki, 2 = Perempuan");
        int jenisKelamin = fani.nextInt();
        fani.nextLine();
        
        MedicalRecord mr = puskesmas.daftarPasienBaru(nama, tahunLahir, alamat, jenisKelamin);
        System.out.println("NMR Pasien : " + mr.getData().getNMR());
        System.out.println("Umur : " + mr.getData().getUmur()+ " tahun ");
        
        
        System.out.println("\n=== PILIH DOKTER ===");
        puskesmas.cetakDaftarDokter();
        
        int pilihanDokter = 0;
        while (pilihanDokter < 1 || pilihanDokter > 5){
            System.out.println("Pilih nomor dokter (1-5) : ");
            pilihanDokter = fani.nextInt();
            fani.nextLine();
            if (pilihanDokter < 1 || pilihanDokter > 5){
                System.out.println(" [!] Pilihan tidak valid. Masukkan angka 1 - 5");
            } 
        }
        
        Dokter dokter = puskesmas.getDaftarDokter()[pilihanDokter - 1];
        System.out.println("Dokter dipilih : " + dokter.getNama());
        
        
        System.out.println("\n=== INPUT DATA PEMERIKSAAN ===");
        System.out.println("Keluhan yang tersedia : Flu | Maag | Hipertensi | Diare | Sakit Gigi | Asma");
        System.out.println("Keluhan : ");
        String keluhan = fani.nextLine();
        
        
        System.out.println("Tensi : ");
        String tensi = fani.nextLine();
        
        System.out.println("Suhu Tubuh : ");
        double suhu = fani.nextDouble();
        
        System.out.println("Berat Badan : ");
        double BeratBadan = fani.nextDouble();
        
        System.out.println("Tinggi Badan : ");
        double TinggiBadan = fani.nextDouble();
        fani.nextLine();
        
        System.out.println("\n--- PROSES PEMERIKSAAN ---");
        Pemeriksaan periksa = puskesmas.lakukanPemeriksaan(mr, dokter, keluhan, tensi, suhu, BeratBadan, TinggiBadan);
        
        
        periksa.CetakData();
        periksa.getResep().cetakResep();
       
        
        System.out.println("\n=== METODE PEMBAYARAN ===");
        System.out.println(" 1. Cash ");
        System.out.println(" 2. BPJS ");
        System.out.println(" 3. Asuransi ");
        
        int pilihanBayar = 0;
        while(pilihanBayar < 1 || pilihanBayar > 3){
            System.out.print("Pilih metode pembayaran(1-3) : ");
            pilihanBayar = fani.nextInt();
            fani.nextLine();
        if (pilihanBayar < 1 || pilihanBayar > 3){
            System.out.println(" [!] Pilihan tidak valid. Masukkan angka 1 - 3");
        }
        
        Pembayaran metodeBayar = null;
        
        switch (pilihanBayar){
            
            case 1:
                System.out.printf("Total yang harus dibayar : Rp ", tagihan.getTotalTagihan());
                System.out.println("Uang yang dibayarkan (Rp) : ");
                double uangDiBayar = fani.nextDouble();
                fani.nextLine();
                metodeBayar = new Cash(0, uangDiBayar, 0, false, null);
                break;
                
            case 2 :
                System.out.print("Nomor BPJS : ");
                String nomorBPJS = fani.nextLine();
                
                int kelasBPJS = 0;
                while (kelasBPJS < 1 || kelasBPJS > 3){
                    System.out.println("Kelas BPJS (1 / 2 / 3)");
                    kelasBPJS = fani.nextInt();
                    fani.nextLine();
                if (kelasBPJS < 1 || kelasBPJS > 3){
                    System.out.println(" [!] Kelas Tidak Valid");
                }
                }
                
            String namaKelas;
            switch (kelasBPJS){
                case 1 : namaKelas = "Kelas 1"; break;
                case 2 : namaKelas = "Kelas 2"; break;
                default : namaKelas = "Kelas 3"; break;
            }
            
            metodeBayar = new BPJS(nomorBPJS, kelasBPJS, namaKelas, 0, null);
            break;
            
            case 3:
                System.out.print("Nomor Asuransi : ");
                String nomorAsuransi = fani.nextLine();
                System.out.println("Jenis Asuransi : ");
                String jenisAsuransi = fani.nextLine();
                metodeBayar = new Asuransi(nomorAsuransi, jenisAsuransi, null);
                break;      
        }
        
            System.out.println("\n=== PROSES PEMBAYARAN ===");
            puskesmas.prosesPembayaran(metodeBayar,tagihan);
            
        
            System.out.println("\n=== Tampilkan Riwayat Medical Record? : ");
            String jawab = fani.nextLine();
            
            if(jawab.equalsIgnoreCase("y")){
               mr.cetakRiwayat();
            }
            
            
            System.out.println("============================");
            System.out.println(" TERIMA KASIH TELAH BERKUNJUNG");
            System.out.println(" SEMOGA LEKAS SEHAT");
            System.out.println("==============================");
        }
        
    }
    
}
