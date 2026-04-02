package Praktikum05;
public class Sorting25 {
    int [] data25;
    int jumlahData25;
Sorting25 (int Data25[], int jmlData25){
 jumlahData25 = jmlData25;
 data25=new int[jmlData25];
 for (int i = 0; i < jumlahData25; i++) {
    data25[i] = Data25[i];
 }
}
void bubblesort(){
    int temp=0;
    for (int i = 0; i < jumlahData25-1; i++) {
        for (int j = 1; j < jumlahData25-i; j++) {
         if (data25[j-1]>data25[j]);
         temp=data25[j];
         data25[j]=data25[j-1];
         data25[j-1]=temp;
        }
    }
}
void tampil(){
    for (int i = 0; i < jumlahData25; i++) {
        System.out.print(data25[i]+" ");
    }
    System.out.println();
}
void SelectionSort(){
    for (int i = 0; i < jumlahData25-1; i++) {
        int min=i;
        for (int j = 0; j < jumlahData25; j++) {
         if (data25[j]<data25[min]) {
            min=j;
         }   
        }
        int temp=data25[i];
        data25[i]=data25[min];
        data25[min]=temp;
    }
}
}