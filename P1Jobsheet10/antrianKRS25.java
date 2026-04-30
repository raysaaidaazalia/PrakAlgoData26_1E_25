package P1Jobsheet10;

public class antrianKRS25 {
    Mahasiswa25[] data25;
    int front25;
    int rear25;
    int size25;
    int max25;
    int jumlahProses25;

public antrianKRS25(int max25) {
  this.max25=max25;
  this.data25= new Mahasiswa25[max25];
  this.front25 = rear25 = -1;
        size25 = 0;
        jumlahProses25 = 0;
} 
public boolean isEmpty25() {
    if (size25 == 0) {
        return true;
    }else{
        return false;
    }
}
public boolean isFull25(){
    if (size25 == max25) {
        return true;
    }else{
        return false;
    }
}
public void tambahAntrian25(Mahasiswa25 mhs) {
    if (isFull25()) {
        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
    }
    rear25 = (rear25 +1) % max25;
    data25[rear25]=mhs;
    size25++;
    System.out.println(mhs.nama25 + " berhasil masuk ke antrian");
}
public void clear25() {
    if (!isEmpty25()) {
        front25 = rear25 = -1;
        size25 = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }else{
        System.out.println("Antrian masih kosong");
    }
}
 public void enqueue25(Mahasiswa25 mhs) {
        if (isFull25()) {
            System.out.println("Antrian penuh");
        } else {
            if (isEmpty25()) {
                front25 = rear25 = 0;
            } else {
                rear25 = (rear25 + 1) % max25;
            }
            data25[rear25] = mhs;
            size25++;
        }
        System.out.println("Data berhasil di simpan");
    }
  public void dequeue25() {
        if (isEmpty25()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Diproses:");
            for (int i = 0; i < 2; i++) {
                if (!isEmpty25()) {
                    data25[front25].tampilkanData();

                    if (front25 == rear25) {
                        front25 = rear25 = -1;
                    } else {
                        front25= (front25+ 1) % max25;
                    }
                    size25--;
                    jumlahProses25++;
                }
            }
        }
    }
     public void peek25() {
        if (!isEmpty25()) {
            System.out.println("2 terdepan:");
            int i = front25;
            for (int j = 0; j < 2 && j < size25; j++) {
                data25[i].tampilkanData();
                i = (i + 1) % max25;
            }
        }
    }

    public void lihatAkhir25() {
        if (!isEmpty25()) {
            System.out.println("Paling belakang:");
            data25[rear25].tampilkanData();
        }
    }
    public void jumlah25() {
        System.out.println("Jumlah antrian: " + size25);
    }

    public void sudah25() {
        System.out.println("Sudah proses: " + jumlahProses25        );
    }

    public void belum25() {
        System.out.println("Belum proses: " + (30 - jumlahProses25));
    }
    public void print25() {
        if (isEmpty25()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front25;
            while (i != rear25) {
                data25[i].tampilkanData();
                i = (i + 1) % max25;
            }
            data25[i].tampilkanData();
        }
    }
}

