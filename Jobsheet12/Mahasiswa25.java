package Jobsheet12;

import java.security.PublicKey;

public class Mahasiswa25 {
    String nim25;
    String nama25;
    String kelas25;
    Double ipk25;
Mahasiswa25(String nim25,String nama25,String kelas25,Double ipk25){
    this.nim25 = nim25;
    this.nama25 = nama25;
    this.kelas25 = kelas25;
    this.ipk25 = ipk25;
}
public void tampil() {
    System.out.println("Nim : "+ nim25 + "\nNama : "+ nama25 + "\nKelas :"+ kelas25 + "\nIPK : "+ipk25);
}
}
