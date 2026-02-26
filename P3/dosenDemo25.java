package P3;

import java.util.Scanner;

public class dosenDemo25 {
    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);
        Scanner raysha2 = new Scanner(System.in);
        dosen25[] arrayofdosen = new dosen25[3];
      
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));

            System.out.print("Kode  : ");
            String kode25 = raysha.nextLine();

            System.out.print("Nama   : ");
            String nama25 = raysha.nextLine();

            System.out.print("Jenis kelamin(true = pria,false = wanita)  :");
            boolean jenisKelamin25 = raysha2.nextBoolean();

            System.out.print("Usia   : ");
            int usia25 =raysha2.nextInt();

            System.out.println("------------------------------------");

           arrayofdosen[i]=new dosen25(kode25, nama25, jenisKelamin25, usia25);
            
        }
        System.out.println("Cek info:  ");
        for (dosen25 dsn25 : arrayofdosen) {
            dsn25.tampilkan_Info();
        System.out.println("------------------------------------------");
        }
        dataDosen25 data = new dataDosen25();
        data.cariUmurTertuaDanTermuda(arrayofdosen);
    }
}
