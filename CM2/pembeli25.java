package CM2;

public class pembeli25 {
    String namaPembeli25;
    String noHp25;
    int nomorAntrian25;
pembeli25(int nomorAntrian25,String namaPembeli25,String noHp25){
    this.namaPembeli25=namaPembeli25;
    this.noHp25=noHp25;
    this.nomorAntrian25=nomorAntrian25;
}
public void tampil(){
    System.out.println("Nomer antrian: "+nomorAntrian25);
    System.out.println("Nama pembeli: "+namaPembeli25);
    System.out.println("No hp: "+noHp25);
}
}
