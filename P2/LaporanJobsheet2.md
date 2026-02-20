# Laporan Praktikum Algoritma dan Struktur data Jobsheet 2 Object

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1: Deklarasi Class, Atribut dan Method

#### code program

<img width="835" height="835" alt="Screenshot 2026-02-20 132325" src="https://github.com/user-attachments/assets/df6b064d-53d3-462b-b863-d674492916f8" />

#### hasil running

<img width="1190" height="437" alt="Screenshot 2026-02-20 132219" src="https://github.com/user-attachments/assets/72fa0ef0-5b80-4464-8249-5dbca5723041" />

### Pertanyaan 

1. Sebutkan dua karakteristik class atau object!
   
   ##### = atribut,method
   
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
   
   ##### =nama25,nim25,kelas25,ipk25
   
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
   
   ##### = tampilkanInformasi25(),UbahKelas25(String kelasBaru25),updateIpk25(double ipkBaru25),nilaiKinerja25().
   
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

<img width="851" height="944" alt="image" src="https://github.com/user-attachments/assets/9031261b-ad2e-4ec1-9a06-020e1f61d68b" />

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
   
 ##### =mengecek nilai ipk,lalu membandingkan dengan rentang nilai,setelah itu di return kan ke nilaiKinerja().

6. Commit dan push kode program ke Github

## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

#### code program

<img width="832" height="621" alt="Screenshot 2026-02-20 132340" src="https://github.com/user-attachments/assets/b5454cc4-2f99-4db5-a447-0c8424cbfdfd" />

#### hasil running

<img width="832" height="621" alt="Screenshot 2026-02-20 132340" src="https://github.com/user-attachments/assets/183f195b-b901-47c8-9c5d-ea31a3126245" />

### Pertanyaan

1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
   
  ##### =Mahasiswa25 mhs2 = new Mahasiswa25();
  
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
   
  ##### =menggunakan titik (.) / ex= mhs2.updateIpk25()
  
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
   
  ##### =karena sebelum pemanggilan kedua nilai ipk dan kelas di ubah terlebih dahulu

## Percobaan 3:Membuat Konstruktor

#### code program 1

<img width="832" height="621" alt="Screenshot 2026-02-20 132340" src="Screenshot 2026-02-20 132946.png" />

#### code program 2

<img width="832" height= "621" alt="Screenshot 2026-02-20 132959" src="Screenshot 2026-02-20 132959.png" />

#### hasil running

<img width="832" height="621" alt="Screenshot 2026-02-20 133020" src="Screenshot 2026-02-20 133020.png">

1.Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!

#####  = public Mahasiswa25(String nim, String nama, String kelas, double ipk)

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?
   
 #####  =(mengisi deklarasi di baris sebelumnya) Mahasiswa25 mhs2 = new Mahasiswa25("2341760002","Andi","TI-1C",3.6);
 
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
   
  ##### = akan terjadi eror,dikarnakan tidak ada konstruktor,dan tidak ada parameternya
  
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
   
  ##### =Tidak,Karena pemanggilan method tergantung kebutuhan,bukan urutan.
  
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!

#### code program

<img width="1364" height="685" alt="image" src="https://github.com/user-attachments/assets/22f61783-c194-46b0-92ef-f6b45e02d8d1" />

#### hasil running

<img width="736" height="118" alt="image" src="https://github.com/user-attachments/assets/a7e68107-30db-41b5-8e68-aa53a65f28f8" />

6. Commit dan push kode program ke Github

## Percobaan 4:Latihan Praktikum

### Latihan praktikum 1

#### Pertanyaan

<img width="513" height="268" alt="image" src="https://github.com/user-attachments/assets/034e6e30-f28f-46b1-a087-3098a0bd4da9" />

Buat program untuk mengimplementasikan class MataKuliah berdasarkan class diagram di atas,
yang terdiri dari:
- Class MataKuliah (MataKuliah<NoAbsen>.java)
- Class MataKuliahMain (MataKuliahMain<NoAbsen>.java)
Pada class MataKuliahMain buatlah minimal 2 objek. Gunakan konstruktor default dan
konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah
dibuat pada class MataKuliah.
Penjelasan dari atribut dan method pada class MataKuliah tersebut adalah sebagai berikut:
a. Atribut
• kodeMK (String): kode unik untuk mata kuliah.
• nama (String): nama lengkap dari mata kuliah
• sks (int): SKS (Satuan Kredit Semester)
• jumlahJam (int): jumlah total jam pertemuan per minggu untuk mata kuliah
b. Method
• tampilInformasi(): method ini digunakan untuk menampilkan semua informasi yang
berkaitan dengan mata kuliah.
ubahSKS(int sksBaru): method ini memungkinkan pengubahan nilai SKS untuk mata
kuliah. Setelah mengubah nilai, method ini memberi tahu pengguna bahwa SKS telah
diubah.
• tambahJam(int jam): method ini menambahkan jumlah jam tambahan ke jumlah jam
yang sudah ada untuk mata kuliah.
• kurangiJam(int jam): method ini berfungsi untuk mengurangi jumlah jam dari mata
kuliah. Sebelum mengurangi, method ini melakukan pengecekan untuk memastikan
bahwa jumlah jam yang tersisa cukup untuk dikurangi. Jika jumlah jam tidak mencukupi
(jumlah jam awal lebih kecil dari jam pengurang), method ini akan memberi tahu
pengguna bahwa pengurangan tidak dapat dilakukan. Jika pengurangan berhasil, method
ini mengupdate jumlah jam dan mencetak nilai jumlah jam yang baru.

#### Jawaban 

#### code program

<img width="1128" height="890" alt="image" src="https://github.com/user-attachments/assets/0083687a-85f7-4130-9013-e790e28269d8" />
<img width="1154" height="581" alt="image" src="https://github.com/user-attachments/assets/513fbd05-8982-4f2d-aefc-cc6efe845899" />

#### hasil running

<img width="774" height="323" alt="image" src="https://github.com/user-attachments/assets/512e4013-b814-4f28-a4dd-eee00156ec8d" />

### Latihan praktikum 2

#### Pertanyaan

<img width="483" height="298" alt="image" src="https://github.com/user-attachments/assets/1d82c830-518c-4c24-9805-9ea2eda50e1c" />

Buat program untuk mengimplementasikan class Dosen berdasarkan class diagram di atas, yang
terdiri dari:
- Class Dosen (Dosen<NoAbsen>.java)
- Class DosenMain (DosenMain<NoAbsen>.java)
Pada class DosenMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor
berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada
class Dosen
Penjelasan dari atribut dan method pada class Dosen tersebut adalah sebagai berikut:
a. Atribut
• idDosen (String): id unik untuk setiap dosen.
• nama (String): nama lengkap dari dosen.
• statusAktif (boolean): menunjukkan apakah dosen tersebut aktif (true) atau tidak aktif
(false) dalam menjalankan tugasnya.
• tahunBergabung (int): tahun ketika dosen mulai bergabung dengan perguruan tinggi
• bidangKeahlian (String): bidang keahlian dosen, yang menjelaskan spesialisasi atau fokus
akademik dosen
b. Method
• tampilInformasi(): method ini digunakan untuk menampilkan informasi lengkap tentang
dosen
• setStatusAktif(status: boolean): method ini digunakan untuk mengatur status aktif
dosen. Jika parameter status diatur ke true, berarti dosen tersebut menjadi aktif.
Sebaliknya, jika false, dosen tersebut dinyatakan tidak aktif.
• hitungMasaKerja(thnSkrg: int): method ini menghitung dan mengembalikan (me-returnkan) masa kerja dosen dalam tahun, berdasarkan tahun bergabung dan tahun saat ini
(thnSkrg) yang menjadi parameter input method ini. Hasil perhitungan memberikan
informasi tentang lamanya dosen bekerja di perguruan tinggi.
• ubahKeahlian(bidang: String): method ini digunakan untuk mengubah bidang keahlian
dosen.

#### Jawaban

#### code program

<img width="970" height="933" alt="Screenshot 2026-02-20 222231" src="https://github.com/user-attachments/assets/a3fa8283-93c4-47d6-adf5-31520d5734b9" />
<img width="1339" height="618" alt="image" src="https://github.com/user-attachments/assets/368659f0-1a57-4017-bc40-725a561ea80c" />

#### hasil running

<img width="794" height="371" alt="image" src="https://github.com/user-attachments/assets/a331a6b5-fc25-4883-ac54-8dec2cbb1396" />







