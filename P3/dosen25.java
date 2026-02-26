package P3;

public class dosen25 {
    String kode25;
    String nama25;
    Boolean jenisKelamin25;
    int usia25;

    public dosen25(String kode25, String nama25, Boolean jenisKelamin25, int usia25) {
        this.kode25 = kode25;
        this.nama25 = nama25;
        this.jenisKelamin25 = jenisKelamin25;
        this.usia25 = usia25;
    }

    void tampilkan_Info() {
        System.out.println("Kode  : " + kode25);
        System.out.println("nama  : " + nama25);
        System.out.print("jenis kelamin  : ");
         if (jenisKelamin25 == true) {
        System.out.println("pria");
    }else{
        System.out.println("wanita");
    }
        System.out.println("usia  : " + usia25);

    }
}
