package sdlstack;

public class MyStack {

    private MyNode last; // node paling atas stack
    private int size; // jumlah isi stack

    /**
     * Konstruktor
     */
    public MyStack() {
        last = null;
        size = 0;
    }

    /**
     * Fungsi memeriksa stack kosong atau tidak
     * @return
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Fungsi push ke stack
     * @param node
     */
    public void push(MyNode node) {

        // jika stack kosong
        if (isEmpty()) {

            last = node;

        } else {

            // node baru menunjuk last lama
            node.setNext(last);

            // last pindah ke node baru
            last = node;
        }

        // size bertambah
        size++;
    }

    /**
     * Fungsi pop stack
     * @return
     */
    public MyNode pop() {

        // cek stack kosong
        if (isEmpty()) {

            return null;

        } else {

            // simpan node yang akan diambil
            MyNode temp = last;

            // pindahkan last
            last = last.getNext();

            // size berkurang
            size--;

            return temp;
        }
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

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        MyNode node1 = new MyNode(null, "A", 4);
        MyNode node2 = new MyNode(null, "B", 3);
        MyNode node3 = new MyNode(null, "C", 2);
        MyNode node4 = new MyNode(null, "D", 1);

        // test stack isi satu node
        stack.push(node1);

        MyNode node5 = stack.pop();

        System.out.println(node5);

        MyNode node6 = stack.pop();

        System.out.println(node6);

        // test stack diisi banyak node
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        stack.push(node4);

        node5 = stack.pop();

        System.out.println(node5);
    }
    
    // jumlah semua numbers tanpa pop
public int getTotalNumbers() {

    MyNode current = last;
    int total = 0;

    while (current != null) {
        total += current.getNumbers();
        current = current.getNext();
    }

    return total;
}

// gabungkan semua item tanpa pop
public String getTotalString() {

    MyNode current = last;
    String hasil = "";

    while (current != null) {
        hasil += current.getItem();

        if (current.getNext() != null) {
            hasil += " ";
        }

        current = current.getNext();
    }

    return hasil;
}
}

