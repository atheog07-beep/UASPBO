/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author Ath07
 */
public class PuskesmasList {
    private PuskesmasNode first; // attribut first bertipe ListNode
    private PuskesmasNode last;  // attribut last bertipe ListNode

    /**
     * Konstruktor
     */
    public  PuskesmasList() {
        this.first = null;
        this.last  = null;
    }

    /**
     * @return the first
     */
    public PuskesmasNode getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(PuskesmasNode first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public PuskesmasNode getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(PuskesmasNode last) {
        this.last = last;
    }

    /**
     * Fungsi cek list kosong
     * @return true jika list kosong
     */
    public boolean isEmpty() {
        if ((this.first == null) && (this.last == null))
            return true;
        else
            return false;
    }

    /**
     * Fungsi tambah node di awal
     * @param node node yang ditambahkan
     */
    public void addFirst(PuskesmasNode node) {
        if (isEmpty()) {
            first = node;
            last  = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    /**
     * Fungsi tambah node di akhir
     * @param node node yang ditambahkan
     */
    public void addLast(PuskesmasNode node) {
        if (isEmpty()) {
            first = node;
            last  = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    /**
     * Fungsi hapus node pertama
     * @return node yang dihapus, null jika kosong
     */
    public PuskesmasNode deleteFirst() {
        if (!isEmpty()) {
            if (first == last) {
                PuskesmasNode node = first;
                first = null;
                last  = null;
                return node;
            } else {
                PuskesmasNode node = first;
                first = first.getNext();
                return node;
            }
        }
        return null;
    }

    /**
     * Fungsi hapus node terakhir
     * @return node yang dihapus, null jika kosong
     */
    public PuskesmasNode deleteLast() {
        if (!isEmpty()) {
            if (first == last) {
                PuskesmasNode node = last;
                first = null;
                last  = null;
                return node;
            } else {
                PuskesmasNode bantu = first;
                while (bantu.getNext() != last) {
                    bantu = bantu.getNext();
                }
                PuskesmasNode node = last;
                bantu.setNext(null);
                last = bantu;
                return node;
            }
        }
        return null;
    }

    /**
     * Fungsi hitung jumlah node dalam list
     * @return jumlah node
     */
    public int getSize() {
        PuskesmasNode temp = first;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    /**
     * Fungsi mengubah seluruh node ke string (NMR + Nama pasien)
     * dari node first sampai last
     * @return string representasi isi list
     */
    @Override
    public String toString() {
        PuskesmasNode temp = first;
        String hasil = "";
        while (temp != null) {
            Pasien p = temp.getData().getData(); // ambil objek Pasien dari MedicalRecord
            hasil += "[" + p.getNMR() + " - " + p.getNama() + "] ";
            temp = temp.getNext();
        }
        return hasil;
    }
}
