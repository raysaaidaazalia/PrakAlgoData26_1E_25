package CM1;

import java.util.Scanner;

public class mainCm25 {
    public static void main(String[] args) {
      
      Scanner raysha = new Scanner(System.in);
      Scanner raysha2 = new Scanner(System.in);

        Mahasiswa25 m1 = new Mahasiswa25("Andi", "22001", "Teknik Informatika");
        Mahasiswa25 m2 = new Mahasiswa25("Budi", "22002", "Teknik Informatika");
        Mahasiswa25 m3 = new Mahasiswa25("Citra", "22003", "Sistem Informasi Bisnis");

        Mahasiswa25[] dataMhs = {m1, m2, m3};

        buku25 b1 = new buku25("B001", "Algoritma", 2020);
        buku25 b2 = new buku25("B002", "Basis Data", 2019);
        buku25 b3 = new buku25("B003", "Pemrograman", 2021);
        buku25 b4 = new buku25("B004", "Fisika", 2024);

        buku25[] dataBuku = {b1, b2, b3, b4};

                buku25 b5 = new buku25("B002","Basis data",2019);
                Mahasiswa25 m4 = new Mahasiswa25("Citra","22003","Teknik Informatika");
                Mahasiswa25 m5  = new Mahasiswa25("Andi","22001","Teknik informatika");
        
        pinjaman25 p1 = new pinjaman25(m1,b1,7);
        pinjaman25 p2 = new pinjaman25(m2,b2,3);
        pinjaman25 p3 = new pinjaman25(m3,b3,10);
        pinjaman25 p4 = new pinjaman25(m4,b4,6);
        pinjaman25 p5 = new pinjaman25(m5,b5,4);

        pinjaman25[] dataPinjam = {p1,p2,p3,p4,p5};


        int pilih;
        do{
            System.out.println("==== SISTEM PEMINJAMAN RUANG BACA JTI ====");
            System.out.println("1.Tampilan Mahasiswa");
            System.out.println("2.Tampilan buku");
            System.out.println("3.Tampilan peminjaman");
            System.out.println("4.Urutkan berdasarkan denda");
            System.out.println("5.cari berdasarkan NIM");
            System.out.println("6.keluar");
            System.out.println("pilih: ");
            pilih=raysha2.nextInt();

            if (pilih == 1) {
                System.out.print("Daftar mahasiswa: ");
                for (int i = 0; i < dataMhs.length; i++) {
                    dataMhs[i].tampilMahasiswa25();
                    System.out.println();
                }        
            }
            else if (pilih == 2) {
                System.out.println("daftar buku: ");
                for (int i = 0; i < dataBuku.length; i++) {
                    dataBuku[i].tampilBuku25();
                    System.out.println();
                }  
        }
    else if (pilih == 3) {
        System.out.println("daftar peminjaman: ");
      for (int i = 0; i < dataPinjam.length; i++) {
        dataPinjam[i].tampilPinjaman25();
      }       
        
    }
    else if (pilih == 4) { 
    System.out.println("setelah di urutkan berdasarkan denda");
    for (int i = 0; i < dataPinjam.length; i++) { 
        dataPinjam[i].bubbleSort25(dataPinjam);
        dataPinjam[i].tampilPinjaman25();
       
    }
   }
    else if (pilih == 5) {
      System.out.println("Masukkan Nim yang di cari: ");  
      String key=raysha.nextLine();
      boolean ketemu= false;
      for (int i = 0; i < dataPinjam.length; i++) {
        if (dataPinjam[i].mhs.Nim25.equals(key)) {
            dataPinjam[i].tampilPinjaman25();
            ketemu = true;
        }
    }
    if (ketemu == false) {
        System.out.println("Data tidak ditemukan");
    }
}
else if (pilih == 6) {
    break;
}
        }
        
while(pilih== -1);
}
}