package P9;

import java.util.Scanner;

import P1.bintang25;

public class mahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
    
        StackTugasMahasiswa25 stack25 = new StackTugasMahasiswa25(5);
        do{
            System.out.println("\nMenu:");
            System.out.println("1.Mengumpulkan tugas");
            System.out.println("2.Menilai tugas");
            System.out.println("3.Melihat tugas teratas");
            System.out.println("4.Melihat daftar tugas");
            System.out.println("pilih: ");
            pilih=scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama25 = scan.nextLine();
                    System.out.print("Nim:");
                    String nim25 = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas25 = scan.nextLine();
                    mahasiswa25 mhs = new mahasiswa25(nama25, nim25, kelas25);
                    stack25.push25(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n",mhs.nama25);
                    break;
                case 2:
                    mahasiswa25 dinilai = stack25.pop25();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+dinilai.nama25);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai25 = scan.nextInt();
                        dinilai.tugasDinilai(nilai25);
                        System.out.printf("Nilai tugas %s adalah %d\n",dinilai.nama25, nilai25);
                    }
                    break;
                case 3:
                    mahasiswa25 lihat = stack25.peek25();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir di kumpulkan oleh " + lihat.nama25);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNim\tKelas");
                    stack25.print25();
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        }while (pilih >= 1 && pilih <= 4);     
        }
    }

