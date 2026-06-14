/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanuas;

/**
 *
 * @author Ath07
 */
public class PuskesmasNode {
    private MedicalRecord data; // attribut data diganti dari MyItem ke MedicalRecord
    private PuskesmasNode next;      // attribut next bertipe ListNode

    /**
     * Konstruktor kosong
     */
    public PuskesmasNode() {
    }

    /**
     * Konstruktor dengan data dan next
     * @param data MedicalRecord yang disimpan
     * @param next node berikutnya
     */
    public PuskesmasNode(MedicalRecord data, PuskesmasNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Konstruktor dengan data saja, next otomatis null
     * @param data MedicalRecord yang disimpan
     */
    public PuskesmasNode(MedicalRecord data) {
        this.data = data;
        this.next = null;
    }

    /**
     * @return the data
     */
    public MedicalRecord getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(MedicalRecord data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public PuskesmasNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(PuskesmasNode next) {
        this.next = next;
    }

}
