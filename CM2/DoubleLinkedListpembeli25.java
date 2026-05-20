package CM2;

public class DoubleLinkedListpembeli25 {
    NodePembeli25 head25;
    NodePembeli25 tail25;
    int nomorAntrian25=1;
    pembeli25 pembeliKeluar25;
DoubleLinkedListpembeli25(){
    head25 = null;
    tail25 = null;
}
public boolean isEmty() {
     return head25 == null;
}
public void addlastpembeli25(String namaPembeli25, String noHp25) {
     pembeli25 pb25 = new pembeli25(nomorAntrian25++,namaPembeli25, noHp25 );
        NodePembeli25 baru25 = new NodePembeli25(pb25);
        if (head25 == null) {
            head25 = tail25 = baru25;
        } else {
            tail25.next25 = baru25;
            baru25.prev25 = tail25;
            tail25 = baru25;
        }
        System.out.println("Pembeli masuk antrean");
    }
public void printpembeli25() {
        if (isEmty()) {
            System.out.println("Antrean kosong");
        } else {
            NodePembeli25 temp25 = head25;
            while (temp25 != null) {
                System.out.println("===== DAFTAR ANTREAN =====");
                System.out.println("nomor antrian"+"    "+"nama pembeli"+"   "+"no hp");
                System.out.println("    "+temp25.data25.nomorAntrian25+"              "+temp25.data25.namaPembeli25 + "          " +temp25.data25.noHp25);
                temp25 = temp25.next25;
            }
        }
    }
  public void removeFirst(){
    if (isEmty()) {
        System.out.println("antrian masih kosong");
        return;
    }
    pembeliKeluar25 = head25.data25;
    if (head25 == tail25) {
        System.out.println("Data yang dihapus:");
        head25.data25.tampil();
        head25 = tail25 = null;

    } else {
        System.out.println("Data yang dihapus:");
        head25.data25.tampil();
        head25 = head25.next25;
        head25.prev25 = null;
    }
}
}


