package P2;

public class dosen25 {
String idDosen25;
String namaDosen25;
boolean statusAktif25;
int tahunBergabung25;
String bidangKeahlian25;

void tampilkanInformasi25(){
    System.out.println("id dosen: "+idDosen25);
    System.out.println("Nama dosen: "+namaDosen25);
    System.out.print("Status: ");
    if (statusAktif25 == true) {
        System.out.println("aktif");
    }else{
        System.out.println("tidak aktif");
    }
    System.out.println("Tahun bergabung: "+tahunBergabung25);
    System.out.println("Bidang keahlian: "+bidangKeahlian25);
}
void setStatusAktif(boolean statusAktif25){
 statusAktif25=statusAktif25;
}
int hitungMasaKerja(int thnSkrng25){
  thnSkrng25-=tahunBergabung25;
  System.out.println("masa kerja: "+thnSkrng25 + " tahun");
  return thnSkrng25;
}
void ubahKeahlian(String bidang25){
 bidangKeahlian25=bidang25;
}
public dosen25() {
 }
public dosen25(String idDosen,String namaDosen,boolean statusAktif,int tahunBergabung,String bidangKeahlian){
idDosen25=idDosen;
namaDosen25=namaDosen;
statusAktif25=statusAktif;
tahunBergabung25=tahunBergabung;
bidangKeahlian25=bidangKeahlian;

}

}
