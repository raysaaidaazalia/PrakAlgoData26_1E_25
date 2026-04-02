package Praktikum05;

public class Mahasiswa25 {
    String nim25;
    String nama25;
    String kelas25;
    double ipk25;

Mahasiswa25(){

}
Mahasiswa25(String nm25,String name25,String kls25,double ip25){
    nim25=nm25;
    nama25=name25;
    ipk25=ip25;
    kelas25=kls25;
}
void tampilInformasi(){
    System.out.println("Nama: "+nama25);
    System.out.println("NIM: "+nim25);
    System.out.println("Kelas: "+kelas25);
    System.out.println("IPK: "+ipk25);
}
}
