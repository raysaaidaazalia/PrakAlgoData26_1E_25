package Jobsheet12;

public class DoublelinkedList25 {
    Node25 head25;
    Node25 tail25;

    public DoublelinkedList25() {
    head25 = null;
    tail25 = null;
    }
    public boolean isEmty() {
        return head25 == null;
    }
    public void addFirst (Mahasiswa25 data25){
        Node25 newNode25 = new Node25(data25);
        if (isEmty()) {
            head25 = tail25 = newNode25;
        }else{
            newNode25.next25 = head25;
            head25.prev25 = newNode25;
            head25 = newNode25;
        }
    }
    public void addLast(Mahasiswa25 data25) {
        Node25 newNode25 = new Node25(data25);
        if (isEmty()) {
            head25 = tail25 = newNode25;
        }else{
            tail25.next25 = newNode25;
            newNode25.prev25 = tail25;
            tail25 = newNode25;
        }   
    }
   public void inserAfter(String keynim25, Mahasiswa25 data25) {
    Node25 current25 = head25;
    while (current25 != null && !current25.data25.nim25.equals(keynim25) ) {
        current25 = current25.next25;
    }
    if (current25 == null) {
        System.out.println("Data dengan NIM "+keynim25 + "tidak ditemukan.");
        return;
    }
    Node25 newNode25 = new Node25(data25);

//jika current adalah tail,node baru ditambahkan di akhir
if (current25 == tail25) {
    newNode25.prev25 = current25;
    current25.next25 = newNode25;
    tail25 = newNode25;
}else {
    newNode25.prev25 = current25;
    newNode25.next25 = current25.next25;
    current25.next25.prev25 = newNode25;
    current25.next25 = newNode25;
}
System.out.println("Data berhasil disisipkan setelah NIM "+keynim25);
   }
   public void print() {
    if (isEmty()) {
        System.out.println("Linked list masih kosong");
        return;
    }
    Node25 current25 = head25;
    while (current25 != null) {
        current25.data25.tampil();
        current25 = current25.next25;
    }
   }
public void removeFirst() {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
    } else if (head25 == tail25) {
        System.out.println("Data yang dihapus:");
        head25.data25.tampil();
        head25 = tail25 = null;
    } else {
        System.out.println("Data yang dihapus:");
        head25.data25.tampil();

        head25 = head25.next25;
        head25.prev25 = null;
    }
}
public void removeLast() {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
    } else if (head25 == tail25) {
        System.out.println("Data yang dihapus:");
        tail25.data25.tampil();

        head25 = tail25 = null;
    } else {
        System.out.println("Data yang dihapus:");
        tail25.data25.tampil();

        tail25 = tail25.prev25;
        tail25.next25 = null;
    }
}
public void printReserve() {
    if (isEmty()) {
        System.out.println("Linked list masih kosong");
        return;
    }
    Node25 current25 = tail25;
    while (current25 != null) {
        current25.data25.tampil();
        current25=current25.prev25;
    }
}
}
