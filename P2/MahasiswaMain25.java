package P2;

public class MahasiswaMain25 {
    public static void main(String[] args) {
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama25 ="Muhammad Ali Farhan";
        mhs1.nim25 ="2241720171";
        mhs1.kelas25 ="SI 2J";
        mhs1.ipk25=3.55;

        mhs1.tampilkanInformasi25();
        mhs1.ubahKelas25("SI 2K");
        mhs1.updateIpk25(3.60);
        mhs1.tampilkanInformasi25();

        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk25(3.30);
        mhs2.tampilkanInformasi25();
    }
}
