import java.util.Scanner;

public class tugas2 {
    static Scanner raysha = new Scanner(System.in);
    static Scanner raysha2 = new Scanner(System.in);

    static void tampilkanJadwal25(String[][]jadwal,int n){
        System.out.println("===============================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruangan", "Hari", "Jam Kuliah");
        System.out.println("===============================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    static String [][] inputJadwal(String[][]jadwal,int n){
    System.out.println("input jadwal: ");
    for (int i = 0; i < n; i++) {
        System.out.println("jadwal ke- "+(i+1));
        
        System.out.print("mata kuliah: ");
        jadwal[i][0]=raysha2.nextLine();
        System.out.print("ruangan: ");
        jadwal[i][1]=raysha2.nextLine();
        System.out.print("hari: ");
        jadwal[i][2]=raysha2.nextLine();
        System.out.print("jam kuliah: ");
        jadwal[i][3]=raysha2.nextLine();
        System.out.println();
    }
    return jadwal;
}
    public static void main(String[] args) {
     
    System.out.println("Jumlah jadwal: ");
    int n = raysha.nextInt();
    String jadwal[][]=new String[n][4];
    int pilih25;
    inputJadwal(jadwal, n);
    do {
        System.out.println("====Menu jadwal====");
        System.out.println("1.tampilkan semua jadwal");
        System.out.println("2.cari jadwal berdasarkan hari");
        System.out.println("3.cari jadwal berdasarkan nama matkul");
        System.out.println("4.keluar");
        System.out.println("pilih: ");
        pilih25=raysha.nextInt();

        if (pilih25==1) {
        tampilkanJadwal25(jadwal, n); 
        }else if (pilih25==2) {
        System.out.println("masukkan hari yang di cari: ");
        String hari25=raysha2.nextLine();
        System.out.println("jadwal mata kuliah: "+hari25);
        System.out.println("===============================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruangan", "Hari", "Jam Kuliah");
        System.out.println("===============================================");
        boolean hasil25=false;
         for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari25)) {
                System.out.printf("%-20s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
               hasil25 = true;
            }
        }
        if (!hasil25) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }    
        }else if (pilih25==3) {
             System.out.println("masukkan nama matkul yang di cari: ");
             String matkul25=raysha2.nextLine();
             System.out.print("mata kuliah :" +matkul25);
              System.out.println("===============================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruangan", "Hari", "Jam Kuliah");
        System.out.println("===============================================");
        boolean hasil25=false;
         for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul25)) {
                System.out.printf("%-20s %-15s %-10s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
               hasil25 = true;
            }
        }
        if (!hasil25) {
            System.out.println("Mata kuliah tidak ditemukan.");  
        }
    }
            
    } while (pilih25!=4);
      System.out.println("program selesai");
    }
}


