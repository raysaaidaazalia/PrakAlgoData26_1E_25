package P9;

public class surat25 {
    String idSurat25;
    String namaMahasiswa25;
    String kelas25;
    char jenisIzin25;
    int durasi25;

surat25() {

}
surat25(String idSurat25,String namaMahasiswa25, String kelas25, char jenisIzin25, int  durasi25) {
this.idSurat25=idSurat25;
this.namaMahasiswa25 = namaMahasiswa25;
this.kelas25 = kelas25;
this.jenisIzin25 = jenisIzin25;
this.durasi25 = durasi25;
    
}
void tampilSurat() {
   System.out.println("ID Surat      : " + idSurat25);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa25);
        System.out.println("Kelas         : " + kelas25);
        if (jenisIzin25 == 'S' || jenisIzin25 == 's') {
            System.out.println("Jenis Izin    : Sakit");
        } else if (jenisIzin25 == 'I' || jenisIzin25 == 'i') {
            System.out.println("Jenis Izin    : Izin Keperluan Lain");
        } else {
            System.out.println("Jenis Izin    : Tidak diketahui");
        }
        System.out.println("Durasi        : " + durasi25 + " hari");
    }
}

