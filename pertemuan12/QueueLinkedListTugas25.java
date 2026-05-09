package pertemuan12;

public class QueueLinkedListTugas25 {
    NodeTugas25 head25, tail25;
    int size25, max25;

public QueueLinkedListTugas25(int max25){
  this.max25=max25;
  this.size25=0;
}
public boolean isEmpty() {
    return (head25 == null);
}
public boolean isFull() {
    if (size25 == max25) {
        return true;
    }else{
        return false;
    }
}
public void print() {
if (!isEmpty()) {
    NodeTugas25 tmp25 = head25;
    System.out.println("isi antrian: ");
     while (tmp25 !=null) {
            tmp25.data25.tampilkan25();
            tmp25=tmp25.next25;
     }
     System.out.println(" ");
    }else{
        System.out.println("antrian kosong");
    } 
}
public void clear() {
    head25 = null;
    tail25 = null;
    size25=0;
    System.out.println("Antrian dikosong kan");
}
public void enqueue(MahasiswaTugas25 data25) {
    if (isFull()) {
        System.out.println("Antrian sudah penuh");
        return;
    } else {
        NodeTugas25 ndInput = new NodeTugas25(data25, null);
        if (isEmpty()) {
            head25 = ndInput;
            tail25 = ndInput;
        } else {
            tail25.next25 = ndInput;
            tail25 = ndInput;
        }
        size25++;
    }
}
public void dequeue() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return;
    } else {
        System.out.println("Memanggil antrian:");
        head25.data25.tampilkan25();
        head25 = head25.next25;
        size25--;
        if (head25 == null) {
            tail25 = null;
        }
    }
}
public void getData25(int index) {
    NodeTugas25 tmp25 = head25;
    for (int i = 0; i <index; i++) {
        tmp25 = tmp25.next25;
    }
    tmp25.data25.tampilkan25();
}
public void manggilDepan(){
    if (!isEmpty()) {
        System.out.println("Antrian paling depan");
        head25.data25.tampilkan25();
    }else{
        System.out.println("antrian kosong/tidak ada");
    }
}
public void manggilBelakang() {
    if (!isEmpty()) {
        System.out.println("Antrian paling belakang");
        tail25.data25.tampilkan25();
    }else{
        System.out.println("antrian kosong/tidak ada");
    }
}
public void jumlahAntri() {
    System.out.println("Jumlah mahasiswa yang masih mengantri adalah : "+size25);
}
}


