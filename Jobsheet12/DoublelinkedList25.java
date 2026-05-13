package Jobsheet12;

public class DoublelinkedList25 {
    Node25 head25;
    Node25 tail25;
    int size25;

    public DoublelinkedList25() {
    head25 = null;
    tail25 = null;
    size25 = 0;
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
        size25++;
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
        size25--;
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
size25++;
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
        return;
    } else if (head25 == tail25) {
        System.out.println("Data yang di hapus: ");
        head25.data25.tampil();
        head25 = tail25 = null;
    } else {
        System.out.println("Data yang di hapus: ");
        head25.data25.tampil();
        head25 = head25.next25;
        head25.prev25 = null;
    }
    size25--;
}
public void removeLast() {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
        return;
    } else if (head25 == tail25) {
        System.out.println("Data yang di hapus: ");
        tail25.data25.tampil();
        head25 = tail25 = null;
    } else {
        System.out.println("Data yang di hapus: ");
        tail25.data25.tampil();
        tail25 = tail25.prev25;
        tail25.next25 = null;
    }
    size25--;
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
public void add(int index,Mahasiswa25 data25){
    if (index < 0 || index > size25) {
        System.out.println("Index salah");
    }else if (index == 0) {
        addFirst(data25);
    }else if (index == size25) {
        addLast(data25);
    }else {
        Node25 newNode25 = new Node25(data25);
        Node25 temp = head25;
        for (int i = 0; i < index-1; i++) {
            temp= temp.next25;
        }
        newNode25.next25 = temp.next25;
        newNode25.prev25 = temp;
        temp.next25.prev25=newNode25;
        temp.next25 = newNode25;

        size25++;
    }
}
public void getFirst() {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
    } else {
        head25.data25.tampil();
    }
}
public void getLast() {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
    } else {
        tail25.data25.tampil();
    }
}
public void getIndex(int index25) {
    Node25 temp25 = head25;
    int i = 0;
    while (temp25 != null && i < index25) {
        temp25 = temp25.next25;
        i++;
    }
    if (temp25 == null) {
        System.out.println("Index tidak ditemukan");
    } else {
        System.out.println("Data pada index " + index25);
        temp25.data25.tampil();
    }
}
public void remove(int index25) {
    if (isEmty()) {
        System.out.println("Linked list masih kosong, tidak dapat dihapus!");
     if (index25 == 0) {
        removeFirst();
        return;
    }
    Node25 temp25 = head25;
    int i = 0;
    while (temp25 != null && i < index25) {
        temp25 = temp25.next25;
        i++;
    }
    if (temp25 == null) {
        System.out.println("Index tidak ditemukan");
    } else if (temp25 == tail25) {
        removeLast();
    } else {
        System.out.println("Data yang dihapus:");
        temp25.data25.tampil();
        temp25.prev25.next25 = temp25.next25;
        temp25.next25.prev25 = temp25.prev25;
    }
    size25--;
    }
}
public void removeAfter(String keyNim25) {
    if (isEmty()) {
        System.out.println("Linked List masih kosong");
        return;
    }
    Node25 current25 = head25;
    while (current25 != null && !current25.data25.nim25.equals(keyNim25)) {
        current25 = current25.next25;
    }
    if (current25 == null) {
        System.out.println("Data dengan NIM " + keyNim25 + " tidak ditemukan");
    } else if (current25.next25 == null) {
        System.out.println("Tidak ada node setelah data tersebut");
    } else {
        Node25 hapus = current25.next25;
        if (hapus == tail25) {
            tail25 = current25;
            tail25.next25 = null;
        } else {
            current25.next25 = hapus.next25;
            hapus.next25.prev25 = current25;
        }
        size25--;
        System.out.println("Data berhasil dihapus");
        hapus.data25.tampil();
    }
}
public int size25() {
    return size25;
}
}
