package CM2;

public class Doublelinkedlistpesanan25 {
    NodePesanan25 head25;
    NodePesanan25 tail25;
Doublelinkedlistpesanan25(){
    head25 = null;
    tail25= null;
}
 public boolean isEmpty() {
        return head25 == null;
    }
public void addlastpesanan25(pembeli25 pembeli, pesanan25 pesanan) {
        NodePesanan25 newNode = new NodePesanan25(null, pembeli, pesanan, null);
        if (isEmpty()) {
            head25 = tail25 = newNode;
        } else {
            tail25.next25 = newNode;
            newNode.prev25 = tail25;
            tail25 = newNode;
        }
        System.out.println("Pesanan berhasil ditambahkan!");
    }
   public void sortingPesanan() {
    if (head25 == null) {
        return;
    }
    for (NodePesanan25 i = head25; i.next25 != null; i = i.next25) {
        for (NodePesanan25 j = head25; j.next25 != null; j = j.next25) {
            if (j.data25.namaPesanan25.compareToIgnoreCase( j.next25.data25.namaPesanan25) > 0) {
                pesanan25 temp = j.data25;
                j.data25 = j.next25.data25;
                j.next25.data25 = temp;
            }
        }
    }
}
  public void printPesanan25() {
        if (isEmpty()) {
            System.out.println("Data pesanan kosong");
        } else {
            sortingPesanan();
            NodePesanan25 temp25 = head25;
            int total25 = 0;
            System.out.println("===== LAPORAN PESANAN =====");
            while (temp25 != null) {
                System.out.println("Kode Pesanan : " + temp25.data25.kodePesanan25);
                System.out.println("Nama Pesanan : " + temp25.data25.namaPesanan25);
                System.out.println("Harga : " + temp25.data25.harga25);
                System.out.println();
                total25 += temp25.data25.harga25;
                temp25 = temp25.next25;
            }
            System.out.println("Total Pendapatan : " + total25);
        }
    }
}
