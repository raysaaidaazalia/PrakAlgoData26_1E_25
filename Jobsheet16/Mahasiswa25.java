package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mahasiswa25 {
 String nim25;
 String nama25;
 String noTelp25;
 
 public Mahasiswa25() {

 }
 public Mahasiswa25(String nim25,String nama25, String noTelp25){
    this.nim25 = nim25;
    this.nama25 = nama25;
    this.noTelp25 = noTelp25;
 }
@Override
public String toString() {
    return "Mahasiswa25{" + "nim25=" + nim25 + ", nama25=" + nama25 + ", noTelp25=" + noTelp25 + '}';
}
List<Mahasiswa25> mahasiswas = new ArrayList<>();
public void tambah(Mahasiswa25...mahasiswa){
    mahasiswas.addAll(Arrays.asList(mahasiswa));
}
public void hapus(int index) {
    mahasiswas.remove(index);
}
public void update(int index, Mahasiswa25 mhs){
    mahasiswas.set(index, mhs);
}
public void tampil() {
    mahasiswas.stream().forEach(mhs ->{
        System.out.println(" "+mhs.toString());
    });
}
int binarySearch(String nim) {

    Collections.sort(mahasiswas,
            (a, b) -> a.nim25.compareTo(b.nim25));

    return Collections.binarySearch(
            mahasiswas,
            new Mahasiswa25(nim, "", ""),
            (a, b) -> a.nim25.compareTo(b.nim25));
}
void sortingAsc() {
    Collections.sort(mahasiswas,
            (a, b) -> a.nim25.compareTo(b.nim25));
}
void sortingDesc() {
    Collections.sort(mahasiswas,
            (a, b) -> b.nim25.compareTo(a.nim25));
}
public static void main(String[] args) {
    Mahasiswa25 lm25 = new Mahasiswa25();

    Mahasiswa25 mhs = new Mahasiswa25("201234", "Noureen", "08123456789");
    Mahasiswa25 mhs1 = new Mahasiswa25("201235", "Akhleema", "08123456788");
    Mahasiswa25 mhs2 = new Mahasiswa25("201236", "Shannum", "08123456787");

    lm25.tambah(mhs, mhs1, mhs2);
    lm25.tampil();

    lm25.sortingAsc();
    lm25.tampil();

    lm25.sortingDesc();
    lm25.tampil();

    lm25.update(
        lm25.binarySearch("201235"),
        new Mahasiswa25("201235", "Akhleema", "08123456780")
    );

    System.out.println();
    lm25.tampil();
}
}
