package pertemuan12;

import java.util.Scanner;

public class SLLMain25 {
    public static void main(String[] args) {
        Scanner Raysha = new Scanner(System.in);
        SingleLinkedList25 sll = new SingleLinkedList25();
        String dummy;
    
        System.out.println("Jumlah mahasiswa");
        dummy = Raysha.nextLine();
        int jmlMhs25 = Integer.parseInt(dummy);
        for (int i = 0; i < jmlMhs25; i++) {
        System.out.println("Masukkan data mahasiswa");
        System.out.print("Nim: ");
        String nim25 = Raysha.nextLine();
        System.out.print("Nama: ");
        String nama25 = Raysha.nextLine();
        System.out.print("Kelas: ");
        String kelas25 = Raysha.nextLine();
        System.out.print("IPK: ");
        dummy =Raysha.nextLine();
        Double ipk25 = Double.parseDouble(dummy);

        Mahasiswa25 mhs = new Mahasiswa25(nim25,nama25,kelas25,ipk25);
    
       sll.addLast(mhs);
        }
        sll.print();
    }
}
