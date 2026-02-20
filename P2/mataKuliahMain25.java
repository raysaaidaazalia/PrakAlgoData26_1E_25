package P2;

public class mataKuliahMain25 {
    public static void main(String[] args) {
        mataKuliah25 mhs1 = new mataKuliah25();
        mhs1.KodeMk25 ="ASD";
        mhs1.nama25="Raysha aida azalia";
        mhs1.sks25=24;
        mhs1.jumlahJam25=20;

        mhs1.tampilkanInformasi25();
        mhs1.ubahSks(20);
        mhs1.tambahJam(2);
        mhs1.kurangJam(4);

        System.out.println();
        
        mataKuliah25 mhsAnnisa25 =new mataKuliah25("DP","Annisa",20,18);
        mhsAnnisa25.tampilkanInformasi25();
    }
}
