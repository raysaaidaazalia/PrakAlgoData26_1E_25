package Praktikum05;

public class MahasiswaBerprestasi25 {
    
    Mahasiswa25 [] listmhs = new Mahasiswa25[5];
    int idx;
void tambah (Mahasiswa25 m){
      if (idx < listmhs.length) {
        listmhs[idx]=m;
        idx++;
      }else{
        System.out.println("data sudah penuh");
      }
    }
void tampil(){
    for (int i = 0; i < listmhs.length ; i++) {
        listmhs[i].tampilInformasi();
       System.out.println("-------------------"); 
    }
        
    }
void bubblesort(){
    for (int i = 0; i < listmhs.length-1; i++) {
        for (int j = 1; j < listmhs.length-i; j++) {
            if (listmhs[j].ipk25>listmhs [j-1].ipk25) {
                Mahasiswa25 tmp25 = listmhs[j];
                listmhs[j]=listmhs[j-1];
                listmhs[j-1]=tmp25;
            }
        }
    }
}
 void SelectionSort25(){
    for (int i = 0; i < listmhs.length-1; i++) {
        int idxmin =i;
        for (int j = i+1; j < listmhs.length; j++) {
        if (listmhs[j].ipk25<listmhs[idxmin].ipk25) {
         idxmin=j;   
        }
        }
    Mahasiswa25 tmp = listmhs[idxmin];
    listmhs[idxmin]=listmhs[i];
    listmhs[i]=tmp;
    }
 }
void insertionSort25(){
    for (int i = 0; i < listmhs.length; i++) {
        Mahasiswa25 temp = listmhs[i];
        int j=i;
        while (j>0 && listmhs[j-1].ipk25<temp.ipk25) {
            listmhs[j] = listmhs [j-1];
            j--;
        }
    listmhs[j]=temp;
    }
}
int sequentialSearching25(double cari25){
  int posisi = -1;
  for (int j = 0; j < listmhs.length; j++) {
    if (listmhs[j].ipk25==cari25) {
        posisi=j;
        break;
    }
  }
  return posisi;
}
void tampilPosisi(double  x25,int pos25){
    if (pos25!=-1) {
      System.out.println("data mahasiswa dengan IPK: "+x25+" ditemukan pada indeks "+pos25);  
    }
    else{
        System.out.println("data "+x25+"tidak ditemukan");
    }
}
void tampilDataSearch(double x25,int pos25){
if (pos25!=-1) {
    System.out.println("Nim\t:"+listmhs[pos25].nim25);
    System.out.println("Nama\t:"+listmhs[pos25].nama25);
    System.out.println("Kelas\t:"+listmhs[pos25].kelas25);
    System.out.println("ipk\t:"+x25);
}
else{
    System.out.println("Data mahasiswa dengan IPK"+x25+"tidak ditemukan");
}
}
int findBinarySearch(double cari25,int left25,int ringht25){
  int mid25;
  if (ringht25>=left25) {
    mid25=(left25+ringht25)/2;
    if (cari25==listmhs[mid25].ipk25) {
        return (mid25);
    }
    else if (listmhs[mid25].ipk25>cari25) {
        return findBinarySearch(cari25, left25, mid25-1);
    }
    else{
        return findBinarySearch(cari25, mid25+1, ringht25);
    }
  }
  return -1;
}
}


