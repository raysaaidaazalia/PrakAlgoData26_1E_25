package P3;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Mahasiswa25[] arrayofmahasiswa25 = new Mahasiswa25[3];
        arrayofmahasiswa25[0] = new Mahasiswa25();
        arrayofmahasiswa25[0].nim25 ="254107020024";
        arrayofmahasiswa25[0].nama25="Raysha aida azalia";
        arrayofmahasiswa25[0].kelas25="TI-1E";
        arrayofmahasiswa25[0].ipk25=(float) 4.00;

        arrayofmahasiswa25[1] = new Mahasiswa25();
        arrayofmahasiswa25[1].nim25="254107020025";
        arrayofmahasiswa25[1].nama25="ACHMAD MAULANA HAMZAH";
        arrayofmahasiswa25[1].kelas25="TI-1E";
        arrayofmahasiswa25[1].ipk25=(float) 3.36;

        arrayofmahasiswa25[2]=new Mahasiswa25();
        arrayofmahasiswa25[2].nim25 ="234890290193";
        arrayofmahasiswa25[2].nama25="DIRHAMAWAN  PUTRANTO";
        arrayofmahasiswa25[2].kelas25="TI-1E";
        arrayofmahasiswa25[2].ipk25=(float) 3.80;

        System.out.println("NIM : " +arrayofmahasiswa25[0].nim25);
        System.out.println("Nama : "+ arrayofmahasiswa25[0].nama25);
        System.out.println("Kelas : "+arrayofmahasiswa25[0].kelas25);
        System.out.println("IPK : "+ arrayofmahasiswa25[0].ipk25);
        System.out.println();
        System.out.println("NIM : " +arrayofmahasiswa25[1].nim25);
        System.out.println("Nama : "+ arrayofmahasiswa25[1].nama25);
        System.out.println("Kelas : "+arrayofmahasiswa25[1].kelas25);
        System.out.println("IPK : "+ arrayofmahasiswa25[1].ipk25);
        System.out.println();
        System.out.println("NIM : " +arrayofmahasiswa25[2].nim25);
        System.out.println("Nama : "+ arrayofmahasiswa25[2].nama25);
        System.out.println("Kelas : "+arrayofmahasiswa25[2].kelas25);
        System.out.println("IPK : "+ arrayofmahasiswa25[2].ipk25);
    }  
    
}
