package P3;

public class dataDosen25 {
    
void dataSemuadosen(dosen25[]arrayofdosen25){
    for (dosen25 dsn25 : arrayofdosen25) {
        dsn25.tampilkan_Info();
    }
}
void jumlahDosenPerJenisKelamin25(dosen25[] arrayofdosen) {
        int pria25 = 0, wanita25 = 0;
        for (dosen25 dsn25 : arrayofdosen) {
            if (dsn25.jenisKelamin25)
                pria25++;
            else
                wanita25++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria25);
        System.out.println("Jumlah Dosen Wanita : " + wanita25);
}
void rerataUsiaDosenPerJenisKelamin25(dosen25[] arrayofdosen25) {
      int pria25=0 ,wanita25= 0;
      int totalPria25=0 , totalwanita25=0;
    for (dosen25 dsn25: arrayofdosen25) {
        if (dsn25.jenisKelamin25 == true) {
            totalPria25+=dsn25.usia25;
            pria25++;
        }else{
            totalwanita25+=dsn25.usia25;
            wanita25++;
        }
    }
    System.out.println("Rata rata usia pria:  "+totalPria25/pria25);
   System.out.println("Rata rata usia wanita: "+totalwanita25/wanita25);
}
void cariUmurTertuaDanTermuda(dosen25[] arrayofdosen25) {
    int umurTertua25 = arrayofdosen25[0].usia25;
    int umurTermuda25 = arrayofdosen25[0].usia25;
    for (int i = 0; i < arrayofdosen25.length; i++) {
        if (arrayofdosen25[i].usia25 > umurTertua25) {
            umurTertua25 = arrayofdosen25[i].usia25;
        }
        if (arrayofdosen25[i].usia25 < umurTermuda25) {
            umurTermuda25 = arrayofdosen25[i].usia25;
        }
    }
    for (int i = 0; i < arrayofdosen25.length; i++) {
        if (arrayofdosen25[i].usia25 == umurTertua25) {
            System.out.println("Dosen Paling Tua:");
            arrayofdosen25[i].tampilkan_Info();
        }
        if (arrayofdosen25[i].usia25 == umurTermuda25) {
            System.out.println("Dosen Paling Muda:");
            arrayofdosen25[i].tampilkan_Info();
        }
    }
}
}

