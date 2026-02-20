package P2;
public class Mahasiswa25 {
    String nama25;
    String nim25;
    String kelas25;
    double ipk25;

    void tampilkanInformasi25() {
        System.out.println("Nama: "+  nama25);
        System.out.println("NIM: "+nim25);
        System.out.println("IPK: "+ipk25);
        System.out.println("Kelas: "+kelas25);
    }
    void ubahKelas25 (String KelasBaru25) {
        kelas25 = KelasBaru25;
    }
    void updateIpk25 (double ipkBaru25) {
        ipk25 = ipkBaru25;
    }
    String nilaiKinerja25() {
        if (ipk25 >= 3.5) {
           return "Kinerja sangat baik" ;
        }else if (ipk25 >= 3.0) {
            return "Kinerja baik";   
        }else if (ipk25 >= 2.0) {
            return "Kinerja cukup";
        }else {
            return "Kinerja kurang";
        }
    }
}

