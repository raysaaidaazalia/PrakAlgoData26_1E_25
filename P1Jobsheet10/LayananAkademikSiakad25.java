package P1Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSiakad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan25 antrian = new AntrianLayanan25(5);
        int pilihan;
       
        do {
            System.out.println("\n=== Menu Antrian layanan Akademik ===");
            System.out.println("1.Tambah Mahasiswa ke Antrian");
            System.out.println("2.Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa terdepan");
            System.out.println("4. Lihat semua Antrian");
            System.out.println("5.Jumlah mahasiswa dalam antrian");
            System.out.println("6.lihat antrian terakhir");
            System.out.println("0.Keluar");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Nim: ");
                String nim25 = sc.nextLine();
                System.out.print("Nama: ");
                String nama25 = sc.nextLine();
                System.out.print("Prodi: ");
                String prodi25 = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas25 = sc.nextLine();
                Mahasiswa25 mhs = new Mahasiswa25(nim25, nama25, prodi25, kelas25);
                antrian.tambahAntrian(mhs);
                break;
            case 2:
                Mahasiswa25 dilayani = antrian.layananMahasiswa25();
                if (dilayani != null) {
                    System.out.println("Melayani mahasiswa: ");
                    dilayani.tampilkanData();
                }
                    break;
            case 3: 
                antrian.lihatTerdepan();
                break;
            case 4:
                antrian.tampilkanSemua25();
                break;
            case 5:
                System.out.println("Jumlah dalam antrian: "+ antrian.getJumlahAntrian());
                break;
            case 6:
                antrian.lihatAkhir();
                break;
             case 0:
                System.out.println("Terima kash.");
                break;    
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
     while (pilihan != 0);  
     sc.close(); 
}

    }

