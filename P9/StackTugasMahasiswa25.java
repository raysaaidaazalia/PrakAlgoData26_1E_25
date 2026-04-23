package P9;

public class StackTugasMahasiswa25 {
  mahasiswa25[] stack25;
  int top25;
  int size25;
public StackTugasMahasiswa25(int size25){
    this.size25 = size25;
    stack25 = new mahasiswa25[size25];
    top25 = -1;
}
public boolean isFull() {
    if (top25 == size25 -1) {
        return true;
    }else {
        return false;
    }
}
public boolean isEmpty(){
    if (top25 == -1) {
        return true;
    }else{
        return false;
    }
}
public void push25(mahasiswa25 mhs){
    if (!isFull()) {
        top25++;
        stack25[top25] = mhs;
    }else{
        System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
    }
}
public mahasiswa25 pop25(){
    if (!isEmpty()) {
      mahasiswa25 m = stack25[top25];
      top25--;
      return m;
    }else{
        System.out.println("Stack kosong ! Tidak ada tugas untuk dinilai.");
        return null;
    }
}
public mahasiswa25 peek25() {
 if (!isEmpty()) {
    return stack25[top25];
 }else{
    System.out.println("Stack kosong ! Tidak ada tugas yang dikumpulkan. ");
    return null;
 }
}
public void print25(){
    for (int i = 0; i <=top25; i++) {
        System.out.println(stack25[i].nama25 + "\t" + stack25[i].nim25 +"\t"+stack25[i].kelas25);
    }
    System.out.println(" ");
}
}
