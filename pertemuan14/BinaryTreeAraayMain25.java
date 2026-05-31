package pertemuan14;

public class BinaryTreeAraayMain25 {
    public static void main(String[] args){
        BinaryTreeArray25 bta25 = new BinaryTreeArray25();
        mahasiswa25 mhs1 = new mahasiswa25("244160121","Ali","A",3.57);
        mahasiswa25 mhs2 = new mahasiswa25("244160185","Candra","C",3.41);
        mahasiswa25 mhs3 = new mahasiswa25("244160200","Badar","B",3.75);
        mahasiswa25 mhs4 = new mahasiswa25("244160221","Dewi","B",3.35);

        mahasiswa25 mhs5 = new mahasiswa25("244160185","Devi","A",3.48);
        mahasiswa25 mhs6 = new mahasiswa25("244160205","Ehsan","D",3.61);
        mahasiswa25 mhs7 = new mahasiswa25("244160170","Fizi","B",3.86);

        mahasiswa25[] datamhs25 ={mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        int idxLast25 = 6;
        bta25.populateData25(datamhs25,idxLast25);
        System.out.println("\nInorder Travelsal Mahasiswa: ");
        bta25.traverseInOrder25(0);

        System.out.println("\nPreOrder Traversal Mahasiswa : ");
        bta25.traversePreOrder(0);
    }
}
