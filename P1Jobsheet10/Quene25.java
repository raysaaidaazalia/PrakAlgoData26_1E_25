package P1Jobsheet10;

public class Quene25 {
    int [] data25;
    int front25;
    int rear25;
    int size25;
    int max25;
public Quene25 (int n25){
    max25 = n25;
    data25 = new int[max25];
    size25=0;
    front25=rear25= -1;
}
public boolean isEmpty() {
    if (size25 == 0) {
        return true;
    }else{
        return false;
    }
}
public boolean isFull(){
    if (size25 == max25) {
        return true;
    }else{
        return false;
    }
}
public void peek25 () {
    if (!isEmpty()) {
        System.out.println("Elemen terdepan: "+ data25[front25]);
    }else{
        System.out.println("Queue masih kosong ");
    }
}
public void print() {
    if (isEmpty()) {
        System.out.println("Queue masih kosong");
    }else {
        int i = front25;
        while (i != rear25) {
            System.out.println(data25[i]+" ");
            i = (i + 1) % max25;
        }
        System.out.println(data25[i] + " ");
        System.out.println("Jumlah elemen ="+ size25);
    }
}
public void clear() {
    if (!isEmpty()) {
        front25 = rear25 = -1;
        size25 = 0;
        System.out.println("Quene berhasil dikosongkan");
    }else{
        System.out.println("Quene masih kosong");
    }
}
public void Enqueue(int dt25) {
    if (isFull()) {
        System.out.println("Queue sudah penuh");
    }else{
        if (isEmpty()) {
            front25 = rear25 = 0;
        }else{
           if (rear25 == max25 - 1) {
             rear25 = 0;
           }else{
            rear25++;
           }
        }data25 [ rear25]=dt25;
        size25++;
    }
}
public int Dequeue () {
    int dt25 = 0;
    if (isEmpty()) {
        System.out.println("Queue masih kosong");
    }else{
        dt25 = data25[front25];
        size25--;
    }if (isEmpty()) {
        front25 = rear25 = -1;
    }else{
        if (front25 == max25 -1) {
            front25 = 0;
        }else{
            front25++;
        }
    }return dt25;
}

}
    

