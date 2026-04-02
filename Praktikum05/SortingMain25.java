package Praktikum05;

public class SortingMain25 {
    public static void main(String[] args) {
    int a25[]={20,10,2,7,12};
    
   Sorting25 dataurut1=new Sorting25(a25, a25.length); 
   System.out.println("Data awal 1");
   dataurut1.tampil();;
   dataurut1.bubblesort();
   System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");   
   dataurut1.tampil();
    
   int b25[]={30,20,2,8,14};

   Sorting25 dataurut2 = new Sorting25(b25, b25.length);
   System.out.println("Data awal 2");
   dataurut2.tampil();
   dataurut2.bubblesort();
   System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
   dataurut2.tampil();
    }
}

