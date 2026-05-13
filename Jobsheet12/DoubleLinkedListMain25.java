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
    System.out.println("7. Tambah data pada indeks tertentu");
    System.out.println("8. Hapus data setelah NIM tertentu");
    System.out.println("9. Hapus data pada indeks tertentu");
    System.out.println("10. Tampilkan data pertama");
    System.out.println("11. Tampilkan data terakhir");
    System.out.println("12. Tampilkan data pada indeks tertentu");
    System.out.println("13. Tampilkan jumlah data");
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
        case 7:
    System.out.print("Masukkan index: ");
    int indexTambah25 = Raysha.nextInt();
    Raysha.nextLine();

    System.out.println("Masukkan data baru: ");
    Mahasiswa25 dataIndex25 = inputMahasiswa25(Raysha);

    list25.add(indexTambah25, dataIndex25);
    break;

case 8:
    System.out.print("Masukkan NIM key: ");
    String keyRemove25 = Raysha.nextLine();

    list25.removeAfter(keyRemove25);
    break;

case 9:
    System.out.print("Masukkan index: ");
    int indexHapus25 = Raysha.nextInt();
    Raysha.nextLine();

    list25.remove(indexHapus25);
    break;

case 10:
    list25.getFirst();
    break;

case 11:
    list25.getLast();
    break;

case 12:
    System.out.print("Masukkan index: ");
    int indexCari25 = Raysha.nextInt();
    Raysha.nextLine();

    list25.getIndex(indexCari25);
    break;

case 13:
    System.out.println("Jumlah data: " + list25.size25());
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