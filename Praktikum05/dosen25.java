package Praktikum05;

public class dosen25 {
    String kode25;
    String nama25;
    boolean jenis_kelamin25;
    int usia25;

dosen25(){

}
dosen25(String kode25,String nama25,Boolean jenis_Kelamin25,int usia25){
    this.kode25=kode25;
    this.nama25=nama25;
    this.jenis_kelamin25=jenis_kelamin25;
    this.usia25=usia25;
}
void tampilInformasi25(){
    System.out.println("Kode: "+kode25);
    System.out.println("Nama: "+nama25);
    System.out.println("jenis kelamin: ");
    if (jenis_kelamin25 == true) {
        System.out.println("Wanita");
    }else{
        System.out.println("pria");
    }
    System.out.println("usia: "+usia25);
}
} 
