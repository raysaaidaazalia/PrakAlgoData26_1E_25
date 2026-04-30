package P1Jobsheet10;

import java.util.Scanner;

public class krsMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS25 mhs = new antrianKRS25(10);
        int pilih;

        do {
            System.out.println("\n1.Menambahkan Mahasiswa ");
            System.out.println("2.Proses krs");
            System.out.println("3.Menampilkan semua isi antrian");
            System.out.println("4.melihat 2 orang terdepan");
            System.out.println("5.melihat mahasiswa paling belakang");
            System.out.println("6.jumlah antrian");
            System.out.println("7.jumlah mahasiswa yg sudah di proses");
            System.out.println("8.Mengkosongkan antrian");
            System.out.println("0.keluar");
            System.out.println("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nim: ");
                    String nim25 = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama25 = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi25 = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas25 = sc.nextLine();

                    Mahasiswa25 m = new Mahasiswa25(nim25, nama25, prodi25, kelas25);
                    mhs.enqueue25(m);
                    break;
                case 2:
                    mhs.dequeue25();
                    break;

                case 3: 
                    mhs.print25();
                    break;
                case 4:
                    mhs.peek25();
                    break;
                case 5:
                    mhs.lihatAkhir25();
                    break;
                case 6:
                    mhs.jumlah25();
                    break;
                case 7:
                    mhs.sudah25();
                    break;
                case 8:
                    mhs.belum25();
                    break;
                case 9: 
                mhs.clear25();
                break;
            }
        }while (pilih != 0);
    }
    
}
