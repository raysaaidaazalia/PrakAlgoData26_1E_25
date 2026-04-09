package CM1;

public class pinjaman25 {
    Mahasiswa25 mhs;
    buku25 buku;
    int lamaPinjam25;
    int batasPinjam25=5;
    int denda25,terlambat25;

pinjaman25(){

}
pinjaman25(Mahasiswa25 mhs,buku25 buku,int lamaPinjam25){
this.mhs=mhs;
this.buku = buku;
this.lamaPinjam25=lamaPinjam25;
hitungDenda25();
}
void hitungDenda25(){
    if (lamaPinjam25>batasPinjam25) {
        terlambat25=lamaPinjam25-batasPinjam25;
        denda25=terlambat25*2000;
    }else{
       denda25 =0;
       terlambat25 = 0;
    }
}
void tampilPinjaman25() {
        System.out.println("Nama mahasiswa : " +mhs.Nama25 +"|" +"Judul buku   : " + buku.judul25 +"|"+"Lama pinjam    :" + lamaPinjam25+"|"+"Terlambat: "+terlambat25+"|"+"Denda  : Rp " + denda25);
    }
void bubbleSort25(pinjaman25[] dataPinjam) {
    for (int i = 0; i < dataPinjam.length - 1; i++) {
        for (int j = 0; j < dataPinjam.length - i - 1; j++) {
            if (dataPinjam[j].denda25 < dataPinjam[j + 1].denda25) {
                pinjaman25 temp = dataPinjam[j];
                dataPinjam[j] = dataPinjam[j + 1];
                dataPinjam[j + 1] = temp;
            }
        }
    }
}
}






