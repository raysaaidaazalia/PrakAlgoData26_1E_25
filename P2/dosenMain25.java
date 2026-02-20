package P2;

public class dosenMain25 {
    public static void main(String[] args) {
      dosen25 dosen1 = new dosen25();
      dosen1.idDosen25="12345"; 
      dosen1.namaDosen25="raysha aida";
      dosen1.tahunBergabung25=2012;
      dosen1.bidangKeahlian25="dasar pemograman";

      dosen1.tampilkanInformasi25();
      dosen1.setStatusAktif(true);
      dosen1.ubahKeahlian("administrasi");
      dosen1.hitungMasaKerja(2026);
      
      System.out.println();
    
     dosen25 dosenRaysha =new dosen25("1234","Raysha aida",true,2009,"Akutansi");
     dosenRaysha.tampilkanInformasi25();
    }
}
