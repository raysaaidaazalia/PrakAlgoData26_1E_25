package Minggu5;

import java.util.Scanner;

public class mainPangkat25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen25=raysha.nextInt();

        pangkat25[] png25 = new pangkat25[elemen25];
        for (int i = 0; i < elemen25; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis25 = raysha.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = raysha.nextInt();
            png25[i]=new pangkat25( basis25,pangkat);  
        }
        System.out.println("Hasil pangkat bruteforce: ");
        for (pangkat25 p : png25) {
            System.out.println(p.nilai25+"^"+p.pangkat+": "+p.pangkatDC(p.nilai25,p.pangkat));
        }
        System.out.println("Hasil pangkat divide and conquer: ");
        for (pangkat25 p : png25) {
            System.out.println(p.nilai25+"^"+p.pangkat+": "+p.pangkatDC(p.nilai25,p.pangkat));
        }
    }
}
