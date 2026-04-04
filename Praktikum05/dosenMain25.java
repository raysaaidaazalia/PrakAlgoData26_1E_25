package Praktikum05;

public class dosenMain25 {
    public static void main(String[] args) {
        dataDosen25 list = new dataDosen25();
         dosen25 d1 = new dosen25("BD","HASYIM",false,30);
         dosen25 d2 = new dosen25("ASD","IMAM",false,38);
         dosen25 d3 = new dosen25("AG","ASTRI",true,25);
         dosen25 d4 = new dosen25("PKN","WIDYA",true,27);
         dosen25 d5 = new dosen25("ING","ATIKAH",true,29);

         list.tambah(d1);
         list.tambah(d2);
         list.tambah(d3);
         list.tambah(d4);
         list.tambah(d5);

         System.out.println("data sebelum di sorting: ");
         list.tampil();

         System.out.println("data setelah di sorting (bubblesort)");
         list.bubblesort25();
         list.tampil();

         System.out.println("data setelah di sorting (insertionsort)");
         list.SelectionSort25();
         list.tampil();
    }
}
