package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo25 {
public static void main(String[] args) {
Scanner raysha = new Scanner(System.in);
System.out.println("Masukkan jumlah mahasiswa: ");
String dummy=raysha.nextLine();
int jumlahMhs=Integer.parseInt(dummy);

MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25(jumlahMhs);

for (int i = 0; i <jumlahMhs; i++) {
    System.out.println("Masukkan data mahasiswa ke-"+(i+1));
    System.out.print("Nim: ");
    String nim25=raysha.nextLine();
    System.out.print("Nama: ");
    String nama25 = raysha.nextLine();
    System.out.print("Kelas: ");
    String kelas25=raysha.nextLine();
    System.out.print("IPK: ");
    String ip = raysha.nextLine();
    double ipks25 = Double.parseDouble(ip);
    System.out.println("----------------------------");
    list.tambah(new Mahasiswa25(nim25,nama25,kelas25,ipks25));
}
list.tampil();
System.out.println("---------------------------------");
System.out.println("Pencarian data");
System.out.println("----------------------------------");
System.out.println("Masukkan ipk mahasiswa yang dicari: ");
System.out.println("IPK: ");
double cari25 = raysha.nextDouble();


// System.out.println("Menggunakan sequential searching");
// System.out.println("------------------------------------");
// double posisi = list.sequentialSearching25(cari25);
// int pss = (int)posisi;
// list.tampilPosisi(cari25,pss);
// list.tampilDataSearch(cari25,pss);


System.out.println("Menggunakan binary search");
System.out.println("------------------------------------");
double posisi2=list.findBinarySearch(cari25,0,jumlahMhs-1);
int pss=(int)posisi2;
list.tampilPosisi(cari25,pss);
list.tampilDataSearch(cari25,pss);


// MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
//     Mahasiswa25 m1 = new Mahasiswa25("123","zidan","2A",3.2);
//     Mahasiswa25 m2 = new Mahasiswa25("124","ayu","2A",3.5);
//     Mahasiswa25 m3 = new Mahasiswa25("125","sofi","2A",3.1);
//     Mahasiswa25 m4 = new Mahasiswa25("125","sita","2A",3.9);
//     Mahasiswa25 m5 = new Mahasiswa25("127","miki","2A",3.7);

//     list.tambah(m1);
//     list.tambah(m2);
//     list.tambah(m3);
//     list.tambah(m4);
//     list.tambah(m5);
}
}
