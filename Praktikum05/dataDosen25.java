package Praktikum05;

public class dataDosen25 {

dosen25 [] listdosen25 =new dosen25[5];
int idx;
void tambah(dosen25 d){
  if (idx < listdosen25.length) {
    listdosen25[idx]=d;
        idx++;
      }else{
        System.out.println("data sudah penuh");
      }
    }
void tampil(){
    for (int i = 0; i < listdosen25.length; i++) {
        listdosen25[i].tampilInformasi25();
        System.out.println("-----------------------");
    }
}
void bubblesort25(){
    for (int i = 0; i < listdosen25.length; i++) {
        for (int j = 1; j < listdosen25.length; j++) {
           if (listdosen25[j].usia25>listdosen25[j-1].usia25) {
            dosen25 tmp25 = listdosen25[j];
            listdosen25[j]=listdosen25[j-1];
            listdosen25[j-1]=tmp25;
           } 
        }
    }
}
void SelectionSort25(){
    for (int i = 0; i < listdosen25.length-1; i++) {
        int idxmin =i;
        for (int j = i+1; j < listdosen25.length; j++) {
        if (listdosen25[j].usia25<listdosen25[idxmin].usia25) {
         idxmin=j;   
        }
        }
   dosen25 tmp = listdosen25[idxmin];
    listdosen25[idxmin]=listdosen25[i];
   listdosen25[i]=tmp;
    }
 }
  }

