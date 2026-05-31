package pertemuan14;

public class BinaryTreeArray25 {
    mahasiswa25[] dataMahasiswa25;
    int idxLast25;

public BinaryTreeArray25(){
    this.dataMahasiswa25 = new mahasiswa25[10];
}
void populateData25(mahasiswa25 dataMhs25[], int idxLast) {
    this.dataMahasiswa25 = dataMhs25;
    this.idxLast25 = idxLast;
}
void traverseInOrder25(int idxStart25){
  if(idxStart25 <= idxLast25) {
    if(dataMahasiswa25[idxStart25] != null){
        traverseInOrder25(2*idxStart25 + 1);
        dataMahasiswa25[idxStart25].tampilInformasi();
        traverseInOrder25(2*idxStart25+2);
    }
  }
}
void add(mahasiswa25 data) {
    idxLast25++;
    dataMahasiswa25[idxLast25] = data;
}
void traversePreOrder(int idxStart25) {
    if (idxStart25 <= idxLast25) {
        if (dataMahasiswa25[idxStart25] != null) {

            dataMahasiswa25[idxStart25].tampilInformasi();

            traversePreOrder(2 * idxStart25 + 1);

            traversePreOrder(2 * idxStart25 + 2);
        }
    }
}
}
