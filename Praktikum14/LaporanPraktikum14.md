# Laporan praktikum 14 Collection

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

#### class Book25

<img width="429" height="283" alt="image" src="https://github.com/user-attachments/assets/7e22b38f-3fd9-499d-91a4-b79115605dc3" />

#### class Customer25

<img width="442" height="337" alt="image" src="https://github.com/user-attachments/assets/0cca28cf-455d-4695-b514-03d6b6790e1d" />

### 13.3 Praktikum - Implementasi ArrayList

#### class DemoArrayList25

1. Buat file DemoArrayList.java. Lakukan import java.util.ArrayList
   
<img width="266" height="54" alt="image" src="https://github.com/user-attachments/assets/8e506a01-5419-4790-94f2-0ba54a713835" />

2. Pada fungsi main(), instansiasi collection baru dengan nama customers bertipe ArrayList
of Customer dengan size 2. Selanjutnya, buat object customer1 dan customer2 kemudian
tambahkan ke dalam ArrayList customers dengan method add.

<img width="518" height="165" alt="image" src="https://github.com/user-attachments/assets/291b6a54-a18e-4ca3-91ba-81e63c90a3cd" />

3. mengunakan looping dengan foreach untuk mencetak data customers

<img width="373" height="59" alt="image" src="https://github.com/user-attachments/assets/0e706bdc-926d-4cf8-aec9-fc63c904c5a1" />

4.menambah object customer baru ke dalam customers. Apakah object dapat
ditambahkan meskipun melebihi kapasitas?

<img width="412" height="29" alt="image" src="https://github.com/user-attachments/assets/70eacb02-05d8-4faa-a738-440735503d04" />

5. Compile dan run kode program, di mana object yang baru ditambahkan? Di awal, di
tengah, atau di akhir collection?

<img width="171" height="43" alt="image" src="https://github.com/user-attachments/assets/82391fbc-4024-4ce5-b598-1b4ed5b47aea" />

di akhir

6. menambahkan object baru pada index tertentu

<img width="472" height="38" alt="image" src="https://github.com/user-attachments/assets/d27ea747-68ef-46cf-93d3-65104f8f36d2" />

7. Compile dan run kode program. Index pada ArrayList dimulai dari 0 atau 1?

<img width="152" height="49" alt="image" src="https://github.com/user-attachments/assets/0fcfb400-c937-44e4-a715-6a59b30c66c5" />

di mulai dari 0

8.menggunakan method indexOf() untuk mengetahui posisi dari suatu objek

<img width="483" height="211" alt="image" src="https://github.com/user-attachments/assets/bf9416c1-b735-4224-ab3d-123759aece08" />

9. menggunakan method get() Untuk mengembalikan object pada index tertentu

<img width="570" height="410" alt="image" src="https://github.com/user-attachments/assets/9602850d-ee4a-4cfd-8264-0baaac908af3" />

10. Cobalah hapus angka 2 saat instansiasi object customers. Apakah ArrayList dapat
diinstansiasi tanpa harus menentukan size di awal?

bisa, ArrayList bisa dibuat tanpa menentukan ukuran awal.

<img width="593" height="456" alt="image" src="https://github.com/user-attachments/assets/73cac54f-fd8a-4153-ab63-3ef66afc089e" />

11. Anda juga dapat menambahkan sekumpulan customer baru ke dalam ArrayList secara
sekaligus. Misalnya terdapat ArrayList newCustomers. Tambahkan seluruh object customer sekaligus ke dalam customers.

<img width="467" height="253" alt="image" src="https://github.com/user-attachments/assets/dbe9b96f-db01-4af3-8c35-317e620aeb48" />

12. Karena sudah menyediakan method toString(), pengecekan data customers untuk
proses debugging juga dapat dilakukan lebih sederhana dengan cara berikut

<img width="275" height="50" alt="image" src="https://github.com/user-attachments/assets/4a151939-10bb-4179-8d58-332da13ecd47" />

### 13.4 Praktikum - Implementasi Stack

#### class StackDemo25

1. Buat file StackDemo.java. Lakukan import java.util.Stack; lalu pada fungsi main() buat beberapa object bertipe Book. Selanjutnya Instansiasi object books bertipe Stack of Book kemudian tambahkan object yang sudah
dibuat ke dalamnya menggunakan method push()

<img width="562" height="253" alt="image" src="https://github.com/user-attachments/assets/ee4dc48f-5f9c-49aa-b1a3-6e27714e284f" />

2. Class Stack juga sudah memiliki method pop() dan peek() seperti yang Anda diimpelementasikan secara manual pada praktikum sebelumnya

<img width="392" height="166" alt="image" src="https://github.com/user-attachments/assets/6fce68fb-6cf9-4d0d-9350-8ffdfd9c13ce" />

3. Mengapa perlu ada pengecekan (temp != null)?

Karena untuk menghindari NullPointerException jika sewaktu waktu stack kosong dan tidak ada data yang dapat diambil.

4.melakukan looping untuk mencetak data buku pada stack

<img width="339" height="54" alt="image" src="https://github.com/user-attachments/assets/8a9645bb-e5fe-4242-9174-ee7679ea8083" />

5. Jika diperlukan pada proses debugging, books juga dapat dicetak dengan cara berikut

<img width="305" height="26" alt="image" src="https://github.com/user-attachments/assets/33310bc7-7cb6-4abc-8fa4-eb46204c7958" />

6. Bagaimana cara melakukan pencarian elemen pada stack menggunakan method search()?

<img width="290" height="38" alt="image" src="https://github.com/user-attachments/assets/621c45d3-b1ce-427a-b8ec-336c805f3e9c" />

### 13.5 Praktikum - Implementasi TreeSet

#### class TreeSetDemo

1. Buat file TreeSetDemo.java kemudian import java.util.TreeSet; lalu tambahkan fungsi main() kemudian instansiasi object TreeSet of String. Tambahkan
beberapa nilai bertipe String ke dalam TreeSet

<img width="526" height="263" alt="image" src="https://github.com/user-attachments/assets/dccad103-9cad-4b27-8701-42a88619022f" />

2. Cetak data pada ts dengan looping

<img width="308" height="52" alt="image" src="https://github.com/user-attachments/assets/3b665629-ff55-48af-a557-7550559c40df" />

3. Compile dan run program. Mengapa urutan yang ditampilkan berbeda dengan urutan penambahan data ke dalam TreeSet fruits?

Urutan berbeda karena TreeSet otomatis mengurutkan data secara ascending, bukan berdasarkan urutan input.

4. Tambahkan kode program sebagai berikut:

<img width="428" height="194" alt="image" src="https://github.com/user-attachments/assets/08516b3e-321c-417a-9017-295ac82b7913" />

5. Apa yang dilakukan oleh method first(), last(), remove(), pollFirst(), dan pollLast()?

- first() = gunanya untuk mengambil data pertama
- last() = gunanya untuk mengambil data terakhir
- remove() = gunanya untuk menghapus elemen tertentu
- pollFirst() = gunanya untuk mengambil dan menghapus elemen pertama
- pollLast()  = gunanya untuk mengambil dan menghapus elemen terakhir

### 13.6 Praktikum – Sorting

Selain pencarian data menggunakan method get() atau search(), Java Collection Framework juga menyediakan fungsi untuk melakukan pengurutan data.
Untuk melakukan pengurutan data String, int, atau primitive data type lain, Anda dapat melakukan cara berikut:

<img width="466" height="340" alt="image" src="https://github.com/user-attachments/assets/18a7e6b1-b937-4458-b184-8d6908f02990" />

Khusus untuk collection of objects, pengurutan data harus menentukan berdasarkan atribut mana pengurutan dilakukan. Misalnya ingin dilakukan pengurutan data customer pada
praktikum di atas berdasarkan atribut name. Gunakan kode program berikut (berikan nama variabel c1 dan c2 secara random. Anda bisa menggunakan nama variabel lainnya)

<img width="504" height="326" alt="image" src="https://github.com/user-attachments/assets/92a34264-f3a3-4ae5-a424-faa591a7fcc7" />

Kedua cara di atas dapat digunakan untuk mengurutkan data pada jenis collection lain yang tidak melakukan pengurutan secara otomatis seperti TreeSet.
