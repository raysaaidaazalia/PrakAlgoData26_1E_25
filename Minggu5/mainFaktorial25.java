package Minggu5;

import java.util.Scanner;

public class mainFaktorial25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai25 = raysha.nextInt();

        faktorial25 fk25 = new faktorial25();
        System.out.println("Nilai faktorial"+" "+nilai25 + "Menggunakan BF: "+fk25.faktorialBF25(nilai25)); 
        System.out.println("Nilai faktorial"+" "+nilai25 + "menggunakan DC: "+fk25.faktorialDC25(nilai25));
    }
}
