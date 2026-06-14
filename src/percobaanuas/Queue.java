package percobaanuas; // nama package disesuaikan dengan project puskesmas

public class Queue { // inisialisasi class Queue
    private PuskesmasList antrian; // list yang digunakan sebagai antrian

    /**
     * Konstruktor default
     */
    public Queue() {
        this.antrian = new PuskesmasList();
    }

    /**
     * Konstruktor dengan list yang sudah ada
     * @param antrian list antrian
     */
    public Queue(PuskesmasList antrian) {
        this.antrian = antrian;
    }

    /**
     * Fungsi menambah pasien ke belakang antrian (enqueue)
     * @param node node berisi MedicalRecord pasien
     */
    public void enqueue(PuskesmasNode node) {
        antrian.addLast(node);
    }

    /**
     * Fungsi mengeluarkan pasien dari depan antrian (dequeue / FIFO)
     * @return node paling depan, null jika antrian kosong
     */
    public PuskesmasNode dequeue() {
        return antrian.deleteFirst();
    }

    /**
     * Fungsi melihat pasien paling depan tanpa mengeluarkan (peek)
     * @return node paling depan, null jika antrian kosong
     */
    public PuskesmasNode peek() {
        return antrian.getFirst();
    }

    /**
     * Fungsi memeriksa apakah antrian kosong
     * @return true jika antrian kosong
     */
    public boolean isEmpty() {
        return antrian.isEmpty();
    }

    /**
     * Fungsi menghitung jumlah pasien dalam antrian
     * @return jumlah pasien
     */
    public int getSize() {
        return antrian.getSize();
    }

    /**
     * Fungsi mendapatkan list antrian (untuk keperluan iterasi tampilan)
     * @return objek List antrian
     */
    public PuskesmasList getAntrian() {
        return antrian;
    }

} // tutup kurung kurawal class Queue
