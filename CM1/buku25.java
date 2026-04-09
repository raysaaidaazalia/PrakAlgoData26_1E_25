package CM1;

public class buku25 {
    String kodeBuku25;
    String judul25;
    int tahunTerbit25;

buku25(){

}
 buku25(String kodeBuku25,String judul25,int tahunTerbit25){
        this.kodeBuku25=kodeBuku25;
        this.judul25=judul25;
        this.tahunTerbit25=tahunTerbit25;

 }
 void tampilBuku25(){
   System.out.println("Kode buku: "+kodeBuku25);
   System.out.println("judul: "+judul25);
   System.out.println("tahun terbit: "+tahunTerbit25);
 }   
}
