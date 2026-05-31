package pertemuan14;

public class mahasiswa25 {
    String nim25;
    String nama25;
    String kelas25;
    Double ipk25;

    public mahasiswa25() {
    }

    public mahasiswa25(String nim25, String nama25, String kelas25, Double ipk25) {
        this.nim25 = nim25;
        this.nama25 = nama25;
        this.kelas25 = kelas25;
        this.ipk25 = ipk25;
    }

    public void tampilInformasi() {
        System.out.println("NIM : " + this.nim25 + "  " +
                "Nama : " + this.nama25 + "  " +
                "Kelas : " + this.kelas25 + "  " +
                "IPK : " + this.ipk25);
    }

}