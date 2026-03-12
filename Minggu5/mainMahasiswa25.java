package Minggu5;

import java.util.Scanner;

public class mainMahasiswa25 {
    public static void main(String[] args) {
       int nilaiUts25[]={78,85,90,76,92,88,80,82};
    int nilaiUas25[]={82,88,87,79,95,85,83,84};

   mahasiswa25 mhs25 = new mahasiswa25();

        int tertinggi = mhs25.totalDCtinggi25(nilaiUts25,0,nilaiUts25.length-1);
        int terendah = mhs25.totalDCrendah25(nilaiUts25,0,nilaiUts25.length-1);
        double rata = mhs25.totalBF25(nilaiUas25);

        System.out.println("Nilai UTS Tertinggi : " + tertinggi);
        System.out.println("Nilai UTS Terendah : " + terendah);
        System.out.println("Rata-rata Nilai UAS : " + rata);
    }
}
