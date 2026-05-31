package pertemuan14;

public class BinarytreeMain25 {
    public static void main(String[] args) {
        Binarytree25 bst25 = new Binarytree25();
        bst25.add25(new mahasiswa25("244160121", "Ali", "A", 3.57));
        bst25.add25(new mahasiswa25("244160221", "Badar", "B", 3.85));
        bst25.add25(new mahasiswa25("244160185", "Candra", "C", 3.21));
        bst25.add25(new mahasiswa25("244160200", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order travelsal) :");
        bst25.traverseInOrder25(bst25.root25);

        System.out.println("\nPencarian data mahasiswa :");
        System.out.println("cari mahasiswa dengan ipk : 3.54 :");
        String hasilCari25 = bst25.find25(3.54) ? "ditemukan" : "tidak ditemukan";
        System.out.println(hasilCari25);

        System.out.println("cari mahasiswa dengan ipk : 3.22 :");
        String hasilCari25_2 = bst25.find25(3.22) ? "ditemukan" : "tidak ditemukan";
        System.out.println(hasilCari25_2);

        bst25.add25(new mahasiswa25("244160131", "Devi", "A", 3.72));
        bst25.add25(new mahasiswa25("244160205", "Ehsan", "D", 3.37));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa");
        System.out.println("InOrder Travelsal: ");
        bst25.traverseInOrder25(bst25.root25);
        System.out.println("\nPreOrder Travelsal:");
        bst25.traversePreOrder25(bst25.root25);
        System.out.println("\nPostOrder Travelsal: ");
        bst25.traversePostOrder25(bst25.root25);

        System.out.println("\nPenghapusan data mahasiswa");
        bst25.delete25(3.57);
        System.out.println("\n Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in Order travelsal): ");
        bst25.traverseInOrder25(bst25.root25);
    }

}
