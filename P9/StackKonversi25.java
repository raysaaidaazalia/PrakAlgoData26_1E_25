package P9;

public class StackKonversi25 {
    int [] tumpukanBiner;
    int  size25;
    int top25;

public StackKonversi25() {
    this.size25 =32;
    tumpukanBiner = new int[size25];
    top25 =-1;
}
public boolean isEmpty(){
    return top25 == -1;
}
public boolean isFull(){
    return top25 == size25 -1;
}
public void push25(int data25) {
    if (isFull()) {
        System.out.println("Stack penuh");
    }else{
        top25++;
        tumpukanBiner[top25] = data25;
    }  
}
public int pop25() {
    if (isEmpty()) {
        System.out.println("Stack kosong");
        return -1;
    }else{
        int data25 = tumpukanBiner[top25];
        top25--;
        return data25;
    }
}
}
