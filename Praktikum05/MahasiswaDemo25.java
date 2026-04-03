package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo25 {
public static void main(String[] args) {
    // Scanner raysha = new Scanner(System.in);
    // Scanner raysha2 = new Scanner(System.in);
    

//     System.out.println("jumlah mahasiswa: ");
//     int jumlahMahasiswa25 = raysha.nextInt();
// for (int i = 0; i < jumlahMahasiswa25; i++) {
// System.out.println("Mahasiswa ke- "+(i+1));
// System.out.print("NIM : ");
// String nim25 = raysha2.nextLine();

// System.out.print("Nama : ");
// String nama25 = raysha2.nextLine();

// System.out.print("Kelas : ");
// String kelas25 = raysha2.nextLine();

// System.out.print("IPK : ");
// double ipk25 = raysha.nextDouble();

// Mahasiswa25 m25 = new Mahasiswa25(nim25,nama25,kelas25,ipk25);
// list.tambah(m25);

// }
MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
    Mahasiswa25 m1 = new Mahasiswa25("123","zidan","2A",3.2);
    Mahasiswa25 m2 = new Mahasiswa25("124","ayu","2A",3.5);
    Mahasiswa25 m3 = new Mahasiswa25("125","sofi","2A",3.1);
    Mahasiswa25 m4 = new Mahasiswa25("125","sita","2A",3.9);
    Mahasiswa25 m5 = new Mahasiswa25("127","miki","2A",3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
    list.bubblesort();
    list.tampil();
    
    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.SelectionSort25();
    list.tampil();
}
}
