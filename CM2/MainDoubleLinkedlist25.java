package CM2;

import java.util.Scanner;

public class MainDoubleLinkedlist25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        DoubleLinkedListpembeli25 dllPembeli25 =new DoubleLinkedListpembeli25();
        Doublelinkedlistpesanan25 dllPesanan25 =new Doublelinkedlistpesanan25();
        int pilih25;
        do {
            System.out.println();
            System.out.println("===== ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih25 = raysha.nextInt();
            raysha.nextLine();

            switch (pilih25) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama25 = raysha.nextLine();
                    System.out.print("No HP : ");
                    String hp25 = raysha.nextLine();
                    dllPembeli25.addlastpembeli25(nama25, hp25);
                    break;

                case 2:
                    dllPembeli25.printpembeli25();
                    break;
                 case 3:
                     dllPembeli25.removeFirst();
                    if (dllPembeli25.pembeliKeluar25 != null) {
                        System.out.println("Pembeli dipanggil : " + dllPembeli25.pembeliKeluar25.namaPembeli25);
                        System.out.print("Kode Pesanan : ");
                        int kode25 =raysha.nextInt();
                        raysha.nextLine();
                        System.out.print("Nama Pesanan : " );
                        String namaPesanan25 = raysha.nextLine();
                        System.out.print("Harga : ");
                        int harga25 =raysha.nextInt();
                        pesanan25 ps25 = new pesanan25(kode25,namaPesanan25,harga25);
                        dllPesanan25.addlastpesanan25( dllPembeli25.pembeliKeluar25,ps25);
                        System.out.println("Pesanan berhasil ditambahkan");
                    }
                    break;
                case 4:
                    dllPesanan25.printPesanan25();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih25 != 5);
    }
}   

