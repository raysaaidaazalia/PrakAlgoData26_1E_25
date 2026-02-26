package P3;

import java.util.Scanner;

import P2.mataKuliah25;

public class MatakuliahDemo25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        Matakuliah25[] arrayofmatakuliah25 = new Matakuliah25[3];
        String kode25, nama25, dummy25;
        int sks25, jumlahJam25;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode25 = raysha.nextLine();
            System.out.print("Nama  : ");
            nama25 = raysha.nextLine();
            System.out.print("Sks  : ");
            dummy25 = raysha.nextLine();
            sks25 = Integer.parseInt(dummy25);
            System.out.print("Jumlah jam  : ");
            dummy25 = raysha.nextLine();
            jumlahJam25 = Integer.parseInt(dummy25);
            System.out.println("-----------------------------------");

            arrayofmatakuliah25[i] = new Matakuliah25(kode25, nama25, sks25, jumlahJam25);

        }
        for (int i = 0; i <3; i++) {
            System.out.println("Data Matakuliah ke- " + (i+1));
            System.out.println("Kode  :" + arrayofmatakuliah25[i].kode25);
            System.out.println("Nama  :"+ arrayofmatakuliah25[i].nama25);
            System.out.println("Sks   :"+arrayofmatakuliah25[i].sks25);
            System.out.println("Jumlah jam   :"+arrayofmatakuliah25[i].jumlahJam25);
            System.out.println("---------------------------------------------");
            
        }
    }
}
