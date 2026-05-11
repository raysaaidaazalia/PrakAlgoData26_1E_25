package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain25 {
 public static Mahasiswa25 inputMahasiswa25(Scanner Raysha) {
    System.out.print("Masukkan NIM   : ");
    String nim25 = Raysha.nextLine();

    System.out.print("Masukkan Nama  : ");
    String nama25 = Raysha.nextLine();

    System.out.print("Masukkan Kelas : ");
    String kelas25 = Raysha.nextLine();

    System.out.print("Masukkan IPK   : ");
    double ipk25 = Raysha.nextDouble();
    Raysha.nextLine();

    return new Mahasiswa25(nim25, nama25, kelas25, ipk25);
}
public static void main(String[] args) {
    Scanner Raysha = new Scanner(System.in);
 DoublelinkedList25 list25 = new DoublelinkedList25();
 int pilihan25;
 do {
    System.out.println("\n ===== MENU DOUBLE LINKED LIST =====");
    System.out.println("1.Tambah data di awal");
    System.out.println("2.Tambah data di akhir");
    System.out.println("3.Sisipkan data di tengah (setelah NIM)");
    System.out.println("4.Hapus data di awal");
    System.out.println("5.Hapus data di akhir");
    System.out.println("6.Tampilkan data");
    System.out.println("0.Keluar");
    System.out.println("Pilih menu");
    pilihan25 = Raysha.nextInt();
    Raysha.nextLine();

    switch (pilihan25) {
        case 1:
            Mahasiswa25 mhsAwal25 = inputMahasiswa25(Raysha);
            list25.addFirst(mhsAwal25);
            break;
        case 2:
            Mahasiswa25 mhsAkhir25 = inputMahasiswa25(Raysha);
            list25.addLast(mhsAkhir25);
            break;
        case 3:
            System.out.println("Masukkan NIM yang dicari: ");
            String keyNim25 = Raysha.nextLine();
            System.out.println("Masukkan data baru: ");
            Mahasiswa25 dataBaru25 = inputMahasiswa25(Raysha);
            list25.inserAfter(keyNim25, dataBaru25);
            break;
        case 4:
            list25.removeFirst();
        break;
        case 5:
            list25.removeLast();
        break;
        case 6:
            list25.print();
        break;
        case 0:
            System.out.println("Program selesai.");
        break;
        default:
            System.out.println("Menu tidak valid.");
        break;
    }
 }while  (pilihan25 != 0);
}
}