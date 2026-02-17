package P1;

public class fungsi25 {
    static String CabangToko25[] = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
    static String bunga25[] = { "Aglonema", "keladi", "Alocasia", "Mawar" };
    static int stokBunga25[][] = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
    static int hargaBunga25[] = { 75000, 50000, 60000, 10000 };
    static String status;
    static int totalPendapatan25;

    static void tabel25() {
        System.out.println("=======tabel bunga=======");
       
        for (int i = 0; i < bunga25.length; i++) {
            System.out.printf("%21s", bunga25[i]);
        }
        System.out.println();
        for (int i = 0; i < CabangToko25.length; i++) {
            System.out.printf("%-15s", CabangToko25[i]);
            for (int j = 0; j < stokBunga25.length; j++) {
                System.out.printf("%-22d",stokBunga25[i][j]);
            }
            System.out.println();
        }
    }
    static int menghitungPendapatan25(int hargaBunga25, int stokBunga) {
        int totalPendapatan25 = stokBunga * hargaBunga25;
        return totalPendapatan25;
    }

    public static void main(String[] args) {
        tabel25();
        for (int i = 0; i < CabangToko25.length; i++) {
             int totalPendapatan25 = 0; // reset tiap cabang

            for (int j = 0; j < bunga25.length; j++) {
                totalPendapatan25 += menghitungPendapatan25(hargaBunga25[j], stokBunga25[i][j]);
            }
        if (totalPendapatan25 > 1500000) {
            status = "Sangat baik";
        } else {
            status = "perlu evaluasi";
        }
            System.out.println(CabangToko25[i] + " = Rp " + totalPendapatan25 + "  " + status );   
        }
    }
}