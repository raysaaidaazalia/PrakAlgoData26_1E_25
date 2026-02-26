package P3;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        Mahasiswa25[] arrayofmahasiswa25 = new Mahasiswa25[3];
        String dummy25;

        for (int i = 0; i < arrayofmahasiswa25.length; i++) {
            arrayofmahasiswa25[i] = new Mahasiswa25();

            System.out.println("Masukkan data mahasiswa ke- "+ (i+1));
            System.out.print("NIM:  ");
            arrayofmahasiswa25[i].nim25 = raysha.nextLine();
            System.out.print("Nama:  ");
            arrayofmahasiswa25[i].nama25= raysha.nextLine();
            System.out.print("Kelas:  ");
            arrayofmahasiswa25[i].kelas25=raysha.nextLine();
            System.out.print("IPK:   ");
            dummy25=raysha.nextLine();
            arrayofmahasiswa25[i].ipk25=Float.parseFloat(dummy25);
            System.out.println("-----------------------");
       
        }
        System.out.println("Cek informasi");
        for (Mahasiswa25 mhs25 : arrayofmahasiswa25) {
            mhs25.cekInfo25();
            System.out.println("------------------------------");
        }

    }  
    
}
