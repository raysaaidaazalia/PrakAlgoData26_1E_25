package P9;

public class stacksurat25 {
    surat25 [] stack25;
    int size25;
    int top25;

stacksurat25(int size25) {
this.size25= size25;
stack25 = new surat25[size25];
top25 = -1;
}
boolean isFull(){
    return top25 == size25 -1;
}
boolean isEmpty(){
    return top25 == -1;
}
void push25(surat25 srt){
    if (isFull()) {
        System.out.println("Stack Surat penuh !tidak bisa di tambahkan.");
    }else{
        top25++;
        stack25[top25]=srt;
    }
}
surat25 pop25(){
   if (isEmpty()) {
        System.out.println("Stack kosong");
        return null;
    }else{
        surat25 s = stack25[top25];
        top25--;
        return s;
    }
}
surat25 peek25(){
    if (!isEmpty()) {
        return stack25[top25];
    }else{
        System.out.println("belum ada surat izin.");
        return null;
    }
}
boolean cariSurat25(String nama25) {
    for (int i = top25; i >=0 ; i--) {
        if (stack25[i].namaMahasiswa25.equalsIgnoreCase(nama25)) {
            System.out.println("Surat ditemukan: ");
            System.out.println("ID surat :"+stack25[i].idSurat25);
            System.out.println("Nama: "+stack25[i].namaMahasiswa25);
            System.out.println("Kelas : "+stack25[i].kelas25);
            System.out.println("Jenis Izin :"+stack25[i].jenisIzin25);
            System.out.println("Durasi : "+stack25[i].durasi25 + " hari");
            return true;
        }
    }
    System.out.println("Surat atas nama " + nama25 + "tidak ditemukan.");
    return false;
}

void print() {
    if (isEmpty()) {
        System.out.println("Tidak ada data surat");
    }else{
        System.out.println("Daftar surat dalam stack: ");
        for (int i = top25; i >= 0; i--) {
             System.out.println("ID surat :"+stack25[i].idSurat25);
            System.out.println("Nama: "+stack25[i].namaMahasiswa25);
            System.out.println("Kelas : "+stack25[i].kelas25);
            System.out.println("Jenis Izin :"+stack25[i].jenisIzin25);
            System.out.println("Durasi : "+stack25[i].durasi25 + " hari");
        }
    }
}
}

