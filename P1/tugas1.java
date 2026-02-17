package P1;
import java.util.Scanner;

public class tugas1 {
    static String cari25;

    public static void main(String[] args) {
        Scanner raysha = new Scanner(System.in);

        String[] plat25 = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        String[] kota25 = { "banten", "jakarta", "bandung", "cirebon", "bogor", "pekalongan",
                "semarang", "surabaya", "malang", "tegal" };

        System.out.print("Masukkan kode plat mobil: ");
        String cari25 = raysha.nextLine();

        for (int i = 0; i < plat25.length; i++) {
            if (plat25[i].equalsIgnoreCase(cari25)) {
                System.out.print("kota: " + kota25[i]);
            }
        }

    }
}
