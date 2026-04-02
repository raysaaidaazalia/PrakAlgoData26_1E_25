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
    for (Mahasiswa25 m : listmhs) {
    m.tampilInformasi();
    System.out.println("-----------------------------------");    
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
 
}


