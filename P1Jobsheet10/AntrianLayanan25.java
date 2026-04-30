package P1Jobsheet10;

public class AntrianLayanan25 {
    Mahasiswa25[] data25;
int front25;
int rear25;
int size25;
int max25;

public AntrianLayanan25 (int max25) {
    this.max25=max25;
    this.data25=new Mahasiswa25[max25];
    this.front25=0;
    this.rear25=-1;
    this.size25=0;
}
public boolean isEmpty() {
    if (size25 == 0) {
        return true;
    }else{
        return false;
    }
}
public boolean isFull(){
    if (size25 == max25) {
        return true;
    }else{
        return false;
    }
}

public void tambahAntrian(Mahasiswa25 mhs) {
    if (isFull()) {
        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
    }
    rear25 = (rear25 +1) % max25;
    data25[rear25]=mhs;
    size25++;
    System.out.println(mhs.nama25 + " berhasil masuk ke antrian");
}
public Mahasiswa25 layananMahasiswa25() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
        return null;
    }
    Mahasiswa25 mhs = data25[front25];
    front25 = (front25 +1) % max25;
    size25--;
    return mhs;
}
public void lihatTerdepan()  {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    }else {
        System.out.println("Mahasiswa terdepan: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data25[front25].tampilkanData();
    }
}
public void tampilkanSemua25() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }
    System.out.println("Daftar Mahasiswa dalam Antrian: ");
    System.out.println("NIM - NAMA- PRODI - KELAS");
    for (int i = 0; i < size25; i++) {
        int index = (front25 + i) % max25;
        System.out.print((i + 1)+". ");
        data25[index].tampilkanData();
    }
}
public int getJumlahAntrian () {
    return size25;
}
public void lihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
    } else {
        System.out.println("Mahasiswa paling belakang:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data25[rear25].tampilkanData();
    }
}
}


