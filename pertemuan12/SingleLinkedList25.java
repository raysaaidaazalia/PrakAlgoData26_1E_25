package pertemuan12;
public class SingleLinkedList25 {
    NodeMahasiswa25 head25;
    NodeMahasiswa25 tail25;

boolean isEmty() {
    return (head25 == null);
}
public void print() {
    if(!isEmty()){
        NodeMahasiswa25 tmp25 = head25;
        System.out.println("Isi Linked List:\t");
        while (tmp25 !=null) {
            tmp25.data25.tampilInformasi25();
            tmp25=tmp25.next25;
        }
        System.out.println("");
    }else{
        System.out.println("Linked list kosong");
    }
}
public void  addFirst(Mahasiswa25 input){
    NodeMahasiswa25 ndInput  = new NodeMahasiswa25 (input, null);
    if (isEmty()) {
        head25 = ndInput;
        tail25 = ndInput;
    }else{
        ndInput.next25 = head25;
        head25 = ndInput;
    }
}
public void addLast (Mahasiswa25 input) {
    NodeMahasiswa25 ndInput = new NodeMahasiswa25(input, null);
    if (isEmty()) {
        head25 = ndInput;
        tail25 = ndInput;
    }else{
        tail25.next25 = ndInput;
        tail25 = ndInput;
    }
}
public void insertAfter(String key25, Mahasiswa25 input) {
    NodeMahasiswa25 ndInput = new NodeMahasiswa25(input, null);
    NodeMahasiswa25 temp25 = head25;
do {
    if (temp25.data25.nama25.equalsIgnoreCase(key25)) {
        ndInput.next25 = temp25.next25;
        temp25.next25 = ndInput;
        if (ndInput.next25 == null) {
            tail25 = ndInput;
        }
        break;
    }
    temp25 = temp25.next25;
}while (temp25 != null);
}
public void inserAt(int index,Mahasiswa25 input) {
    if (index < 0) {
        System.out.println("Index salah");
    }else if (index == 0) {
        addFirst(input);
    }else {
        NodeMahasiswa25 temp25 = head25;
        for (int i = 0; i < index - 1; i++) {
            temp25 = temp25.next25;
        }
        temp25.next25 = new NodeMahasiswa25(input,temp25.next25);
        if (temp25.next25.next25 == null) {
            tail25 = temp25.next25;
        }
    }
}
}
