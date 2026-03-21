/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdl;

/**
 * Kelas ini merupakan kelas untuk memodelkan rangkaian data numerik.
 *
 * @author puspa
 */
public class MyLarik {

    // size/panjang larik dengan tipe data int
    private int size; // ukuran larik
    // larik penyimpan data bertipe double
    private double data[]; // larik penyimpan data

    /**
     * Konstruktor
     */
    public MyLarik() {
    }

    /**
     * Konstruktor; dengan tugas meng-instance-kan larik data
     *
     * @param size
     */
    public MyLarik(int size) {
        this.size = size;
        this.data = new double[size];
    }

    /**
     * Konstruktor dengan parameter data yang sudah dibuat
     *
     * @param data
     */
    public MyLarik(double[] data) {
        this.data = data;
        this.size = this.data.length;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the data
     */
    public double[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(double[] data) {
        this.data = data;
    }

    /**
     * Fungsi untuk mengisi suatu nilai di larik data
     *
     * @param indeks
     * @param value
     */
    public void append(int indeks, double value) {
        this.data[indeks] = value;
    }

    /**
     * Fungsi untuk mengambil nilai dari larik data sesuai posisi masukan
     * indeks.
     *
     * @param indeks
     * @return
     */
    public double getValue(int indeks) {
        if (indeks < 0 || indeks >= size) {
            return -1;
        }

        return this.data[indeks];
    }

    /**
     * Fungsi menghitung rerata larik data. Asumsi semua data sudah terisi
     *
     * @return
     */
    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            sum = sum + d;
        }
        return sum / data.length;
    }

    /**
     * Fungsi menghitung varians larik data. Asumsi semua data sudah terisi.
     *
     * @return
     */
    public double getVarians() {
        double rerata = this.getAverage();
        double varians = 0;
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            varians = varians + Math.pow((d - rerata), 2);
        }
        return varians / size;
    }

    /**
     * Fungsi menghitung total jumlah data dengan pendekatan looping
     *
     * @param indeks
     * @return
     */
    public double getLoopSum(int indeks) {
        double sum = 0;

        if (indeks >= size) {
            indeks = size - 1;
        }

        for (int i = 0; i <= indeks; i++) {
            sum += data[i];
        }

        return sum;
    }

    /**
     * Fungsi untuk menghitung total jumlah data dengan pendekatan rekursif
     *
     * @param indeks
     * @return
     */
    public double getRekursifSum(int indeks) {
        if (indeks < 0) {
            return 0;
        } else {
            return data[indeks] + getRekursifSum(indeks - 1);
        }
    }

    /**
     * Fungsi cetak data
     */
    public void cetakData() {
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            System.out.println(d);
        }
    }

    /**
     * Fungsi cari sequential
     *
     * @param x
     * @return
     */
    public int sequentialSearch(double x) {
        for (int i = 0; i < data.length; i++) {
            double d = data[i];
            if (x == d) {
                return i;
            }
        }
        return -1;

    }

    /**
     * Fungsi interpolationSearch
     */
    public int interpolationSearch(double data_cari) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high && data_cari >= data[low] && data_cari <= data[high]) {

            if (data[high] == data[low]) {
                if (data[low] == data_cari) {
                    return low;
                } else {
                    return -1;
                }
            }

            // rumus interpolation
            int mid = low + (int) ((data_cari - data[low]) * (high - low)
                    / (data[high] - data[low]));

            // jika ditemukan
            if (data[mid] == data_cari) {
                return mid;
            }

            // jika data lebih besar maka geser ke kanan
            if (data[mid] < data_cari) {
                low = mid + 1;
            } // jika data lebih kecil maka geser ke kiri
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(double data_cari) {
        int awal = 0;
        int akhir = data.length - 1;

        while (awal <= akhir) {
            int tengah = (awal + akhir) / 2;

            if (data[tengah] == data_cari) {
                return tengah;
            } else if (data[tengah] > data_cari) {
                akhir = tengah - 1;
            } else {
                awal = tengah + 1;
            }
        }
        return -1;
    }

}
