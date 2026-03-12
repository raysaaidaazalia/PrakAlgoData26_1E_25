package Minggu5;

import java.util.Scanner;

public class mainSum25 {
    public static void main(String[] args) {
        Scanner raysha= new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen25 = raysha.nextInt();

        sum25 sm = new sum25(elemen25);
        for (int i = 0; i < elemen25; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan25[i]=raysha.nextDouble();  
        }
        System.out.println("Total keuntungan menggunakan bruteForce: "+sm.totalBF25());
        System.out.println("Total keuntungan menggunakan divide and conquer: "+sm.totalDC25(sm.keuntungan25,0,elemen25-1));
    }
}
