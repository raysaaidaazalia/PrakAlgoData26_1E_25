package pertemuan12;

public class Mahasiswa25 {
    String nim25;
    String nama25;
    String kelas25;
    Double ipk25;
 
   Mahasiswa25 () {

   }
   Mahasiswa25(String nim25,String nama25, String kelas25,Double ipk25) {
    this.nim25=nim25;
    this.nama25= nama25;
    this.kelas25=kelas25;
    this.ipk25=ipk25;
   }
  public void tampilInformasi25(){
     System.out.println("Nim: "+nim25);
     System.out.println("nama: "+ nama25);
     System.out.println("kelas: "+kelas25);
     System.out.println("Ipk: "+ipk25);
   }
}
