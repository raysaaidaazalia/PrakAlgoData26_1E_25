package P9;

import java.util.Scanner;

public class suratDemo25 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       stacksurat25 stack25 = new stacksurat25(5);
       int pilih;

       do {
       System.out.println("\nMenu: ");
       System.out.println("1.Masukkan data ");
       System.out.println("2.proses surat izin ");
       System.out.println("3.lihat surat izin terakhir ");
       System.out.println("4.cari surat ");
       System.out.println("5.tampilkan semua surat");
       System.out.println("6.keluar");
       System.out.println("Pilih: ");
       pilih =  scan.nextInt();
       scan.nextLine();

       switch (pilih) {
        case 1:
            System.out.print("Id surat :");
            String idSurat25 = scan.nextLine();
            System.out.print("Nama Mahasiswa :");
            String nama25 = scan.nextLine();
            System.out.print("Kelas :");
            String kelas25 = scan.nextLine();
            System.out.print("Jenis izin (S/I): ");
            char jenisIzin25 = scan.nextLine().charAt(0);
            System.out.print("Durasi izn :");
            int durasi25 = scan.nextInt();
            scan.nextLine();

            surat25 surat = new surat25(idSurat25,nama25,kelas25,jenisIzin25,durasi25);
            stack25.push25(surat);
            System.out.println("Surat izin berhasil diterima.");
            break;
        case 2:
            surat25 terakhir = stack25.pop25();
            if (terakhir != null) {
                System.out.println("Surat izin berikut sedang di proses:  ");
                System.out.println("ID surat : "+terakhir.idSurat25);
                System.out.println("Nama : " +terakhir.namaMahasiswa25);
                System.out.println("Kelas :"+terakhir.kelas25);
                System.out.println("jenis izin : "+ terakhir.jenisIzin25);
                System.out.println("Durasi : "+terakhir.durasi25+" hari");
            }
            break;
        case 3:
            surat25 surat25 =stack25.peek25();
           if (surat25 != null ) {
             System.out.println("Surat izin terakhir: ");
             surat25.tampilSurat();
           }
           break;
        case 4:
            System.out.println("Masukkan nama mahasiswa yang dicari: ");
            String namaCari25 = scan.nextLine();
            stack25.cariSurat25(namaCari25);
        break;
        case 5:
            stack25.print();
        break;
        case 6:
            System.out.println("Program selesai.");
        break;
        default:
            System.out.println("Pilihan tidak valid");
            break;
       }
    }while (pilih !=6 )  ;
    }
       
    }


