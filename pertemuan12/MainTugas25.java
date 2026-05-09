package pertemuan12;

import java.util.Scanner;

public class MainTugas25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
      System.out.println("Masukkan kapasitas Antrian: ");
        int n25 =raysha.nextInt();
        raysha.nextLine();
        QueueLinkedListTugas25 antrian25 = new QueueLinkedListTugas25(n25);
        System.out.println("Menu: ");
            System.out.println("1.Menambahkan Antrian");
            System.out.println("2.Memanggil antrian");
            System.out.println("3.Memanggil antrian paling depan");
            System.out.println("4.Memanggil antrian paling belakang");
            System.out.println("5.Jumlah antrian saat ini");
            System.out.println("6.cek antrian kosong");
            System.out.println("7.cek antrian penuh");
            System.out.println("8.kosongkan antrian");
            System.out.println("9.keluar");
            int pilih25;
        do {
            System.out.println("Pilih: ");
            pilih25 =raysha.nextInt();
            raysha.nextLine();
        switch (pilih25) {
            case 1:
                 System.out.print("NIM       : ");
                    String nim = raysha.nextLine();
                    System.out.print("Nama      : ");
                    String nama = raysha.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = raysha.nextLine();
                    MahasiswaTugas25 mhs = new MahasiswaTugas25(nim, nama, kelas);
                    antrian25.enqueue(mhs);
                System.out.println("Data berhasil di tambahkan");
            break;
            case 2:
                antrian25.dequeue();
                break;
            case 3:
                antrian25.manggilDepan();
            break;
            case 4:
                antrian25.manggilBelakang();
            break;
            case 5:
                antrian25.jumlahAntri();
            break;
            case 6:
                 if (antrian25.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
            break;
            case 7:
                if (antrian25.isFull()) {
                    System.out.println("Antrian penuh");
                }else{
                    System.out.println("Antrian belum penuh");
                }
            break;
            case 8:
                antrian25.clear();
            break;
            case 9:
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
            }
        }
        while (pilih25 != 9);
    }
}
