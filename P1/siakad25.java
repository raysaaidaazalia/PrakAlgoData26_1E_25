package P1;
 import java.util.Scanner;

public class siakad25{

    public static void main(String[] args) {
        Scanner raysha=new Scanner(System.in);
     
    System.out.println("=====================");
    System.out.println("Program menghitung IP semester");

    String matkul[]={"pancasila","KTI","CTPS","matematika","bahasa inggris","Daspro","prak daspro","K3"};
    double nilai25[]=new double [matkul.length];
    String nilaiHuruf25[] = new String[matkul.length];
    double nilaisetara25[]=new double[matkul.length];
    int sks25[] = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka " + matkul[i] + " : ");
            nilai25[i] = raysha.nextDouble();
            if (nilai25[i] > 80) {
                nilaiHuruf25[i] = "A";
                nilaisetara25[i]=4;
            } else if (nilai25[i] > 73) {
                nilaiHuruf25[i] = "B+";
                nilaisetara25[i]=3.5;
            } else if (nilai25[i] > 65) {
                nilaiHuruf25[i] = "B";
                nilaisetara25[i]=3;
            } else if (nilai25[i] > 60) {
                nilaiHuruf25[i] = "C+";
                nilaisetara25[i]=2.5;
            } else if (nilai25[i] > 50) {
                nilaiHuruf25[i] = "C";
                nilaisetara25[i]=2;
            } else if (nilai25[i] > 39) {
                nilaiHuruf25[i] = "D";
                nilaisetara25[i]=1;
            } else {
                nilaiHuruf25[i] = "E";
                nilaisetara25[i]=0;
            }
        }
        int totalsks25 = 0;
        double totalBobot25 = 0;
        for (int i = 0; i < matkul.length; i++) {
            totalsks25 += sks25[i];
            totalBobot25 += nilaisetara25[i] * sks25[i];
        }
        double ip25= totalBobot25 / totalsks25;
        System.out.println("\n===== HASIL NILAI =====");
         System.out.println("MK"+"\t\t\t"+"nilai angka"+"\t" +"nilai huruf"+"\t"+"bobot nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println( matkul[i] +"\t\t\t"+ nilai25[i] +"\t\t" + nilaiHuruf25[i]+"\t\t" +nilaisetara25[i]);
        }
        System.out.print( "IP= ");
        System.out.printf("%3.2f",ip25);
       
    
    }

} 

