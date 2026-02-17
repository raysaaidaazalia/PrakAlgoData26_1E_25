package P1;
import java.util.Scanner;

public class nilaiAkhir25{
public static void main(String[] args) {
Scanner raysha=new Scanner(System.in);
System.out.println("Program menghitung nilai akhir");
System.out.println("==============================");
System.out.println("Masukkan nilai (0-100)");
System.out.print("Masukkan nilai tugas: ");
double nilaitugas25=raysha.nextDouble();
System.out.print("Masukkan nilai Kuis: ");
double nilaiKuis25=raysha.nextDouble();
System.out.print("Masukkan nilai UTS: ");
double nilaiUts25=raysha.nextDouble();
System.out.print("Masukkan nilai UAS: ");
double nilaiUas25=raysha.nextDouble();
String status;
System.out.println("=======================");
System.out.println("=======================");

if ((nilaitugas25>=0 && nilaitugas25<=100)&&(nilaiKuis25>=0 && nilaiKuis25<=100)&&(nilaiUts25>=0&&nilaiUts25<=100)&&(nilaiUas25>=0&&nilaiUas25<=100)){
double nilaiakhir=(nilaitugas25*0.2)+(nilaiKuis25*0.2)+(nilaiUts25*0.3)+(nilaiUas25*0.3);
String nilai_huruf;
double nilai_setara;
         if(nilaiakhir >80){
            nilai_huruf="A";
            nilai_setara=4;
        }else if(nilaiakhir >73){
            nilai_huruf="B+";
            nilai_setara=3.5;
        }else if(nilaiakhir>65){
            nilai_huruf="B";
            nilai_setara=3;
        }else if(nilaiakhir>60){
            nilai_huruf="C+";
            nilai_setara=2.5;
        }else if(nilaiakhir>50){
            nilai_huruf="C";
            nilai_setara=2;
        }else if(nilaiakhir>39){
            nilai_huruf="D";
            nilai_setara=1;
        }else{
            nilai_huruf="E";
            nilai_setara=0;
        }

if (nilai_huruf.equals("A")||nilai_huruf.equals("B+")||nilai_huruf.equals("B")||nilai_huruf.equals("C+")||nilai_huruf.equals("C")){
    status="lulus";
}else{
    status="tidak lulus";
}

System.out.println("nilai akhir: "+nilaiakhir);
System.out.println("nilai huruf: "+nilai_huruf);
System.out.println("==========================");
System.out.println("status kelulusan: "+status);
}else{
        System.out.println("Nilai tidak valid");
}
}
}

