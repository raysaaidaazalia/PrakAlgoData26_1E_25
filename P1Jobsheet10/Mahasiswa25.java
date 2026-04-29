package P1Jobsheet10;

public class Mahasiswa25 {
    String nim25;
    String nama25;
    String prodi25;
    String kelas25;

public Mahasiswa25(String nim25,String nama25 , String prodi25, String kelas25) {
    this.nim25=nim25;
    this.nama25=nama25;
    this.prodi25=prodi25;
    this.kelas25=kelas25;
}
public void tampilkanData() {
    System.out.println(nim25 + " - "+nama25+" - "+prodi25+" - "+ kelas25);

}
}