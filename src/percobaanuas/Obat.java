/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author ath07
 */
public class Obat {
     private String NamaObat;
     private double HargaObat;

    public Obat(String NamaObat, double HargaObat) {
        this.NamaObat = NamaObat;
        this.HargaObat = HargaObat;
    }

    public String getNamaObat() {
        return NamaObat;
    }

    public void setNamaObat(String NamaObat) {
        this.NamaObat = NamaObat;
    }

    public double getHargaObat() {
        return HargaObat;
    }

    public void setHargaObat(double HargaObat) {
        this.HargaObat = HargaObat;
    }
     
    public String DataObat(){
        return "";
    }
}
