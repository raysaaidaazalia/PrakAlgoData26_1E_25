package P2;
public class mataKuliah25 {
String KodeMk25;
String nama25;
int sks25;
int jumlahJam25;

void tampilkanInformasi25(){
    System.out.println("KodeMk: "+KodeMk25);
    System.out.println("Nama: "+nama25);
    System.out.println("SKS: "+sks25);
    System.out.println("Jumlah Jam: "+jumlahJam25);
}
void ubahSks(int sksBaru25){
   sks25 =sksBaru25;
   System.out.println("Sks berhasil di ubah");
}
void tambahJam(int jam25){
   jumlahJam25+=jam25;
   System.out.println("jumlah jam setelah di tambah: "+jumlahJam25);
}
void kurangJam(int jam25){
  jumlahJam25 -= jam25;
  System.out.println("Jumlah jam setelah di kurang: " + jumlahJam25);
}
 public mataKuliah25() {
 }
public mataKuliah25(String kodeMk25,String nama25,int sks25,int jumlahJam25){
this.KodeMk25 =kodeMk25;
this.nama25 = nama25;
this.sks25 = sks25;
this.jumlahJam25 = jumlahJam25;
}
}

