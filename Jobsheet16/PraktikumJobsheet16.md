# Laporan praktikum 16 Queue 

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1

#### code program

##### Class CobaList25

<img width="688" height="341" alt="Screenshot 2026-06-16 100942" src="https://github.com/user-attachments/assets/303e10c1-56b2-4d60-b133-93e0d0998e64" />

#### Hasil running

<img width="749" height="80" alt="Screenshot 2026-06-16 101216" src="https://github.com/user-attachments/assets/19859380-ec22-4fae-b021-b9b0b4b261bf" />

### Pertanyaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist? 

Karena ArrayList dibuat tanpa menentukan tipe data

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu! 

<img width="704" height="96" alt="Screenshot 2026-06-16 115758" src="https://github.com/user-attachments/assets/1b4fb18a-55ee-422b-abb0-4294bad2a279" />

3. Ubah kode pada baris kode 38  menjadi seperti ini 

<img width="295" height="17" alt="Screenshot 2026-06-16 101302" src="https://github.com/user-attachments/assets/6f117a2b-7bfd-4061-ae13-971ceaa56901" />

= yang sudah di ubah

<img width="355" height="25" alt="Screenshot 2026-06-16 120058" src="https://github.com/user-attachments/assets/8f161e6b-a170-4fb5-836c-2694608173c7" />

hasil running

<img width="659" height="152" alt="Screenshot 2026-06-16 120228" src="https://github.com/user-attachments/assets/6798cc8c-c57f-4dd5-b120-9d5d98e21b2c" />

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya 

<img width="413" height="54" alt="Screenshot 2026-06-16 101330" src="https://github.com/user-attachments/assets/1f8eba37-703c-4ae1-859a-de64b1a12b62" />

= yang sudah di tambahkan

<img width="605" height="74" alt="Screenshot 2026-06-16 120606" src="https://github.com/user-attachments/assets/8864e55c-cff4-40e3-bc30-88b6abd248a8" />

hasil running

<img width="673" height="145" alt="Screenshot 2026-06-16 120529" src="https://github.com/user-attachments/assets/b981570c-fc80-4c20-acc1-aadbbd2eab6f" />

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

<img width="673" height="145" alt="Screenshot 2026-06-16 120529" src="https://github.com/user-attachments/assets/72789f7c-936e-4b09-adce-eac7ec399f77" />

##### = penjelasannya Setelah kode ditambahkan dan dijalankan, isi ArrayList bisa ditampilkan lebih mudah tanpa harus mengambil data satu per satu dengan get(). Dengan menggunakan perulangan, semua data langsung tampil sesuai urutan saat dimasukkan. Cara ini membuat kode lebih singkat, mudah dipahami, dan cocok digunakan ketika jumlah data bisa bertambah atau berkurang.

## Percobaan 2

#### code program

##### class  LoopCollection

<img width="339" height="419" alt="Screenshot 2026-06-16 122842" src="https://github.com/user-attachments/assets/61b4bcd4-b32b-4faf-a268-eaee3cb64a5e" />

#### hasil running

<img width="276" height="85" alt="Screenshot 2026-06-16 122931" src="https://github.com/user-attachments/assets/dff76ce5-613c-4607-901c-32829311a06b" />

### Pertanyaan

1. Apakah perbedaan fungsi push() dan add() pada objek fruits? 

-kalo push() di objek fruits gunanya untuk Menambahkan elemen ke bagian atas Stack.
-kalo add() di objek fruits gunanya untuk Menambahkan elemen ke akhir collection.

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? 

<img width="271" height="99" alt="Screenshot 2026-06-16 124746" src="https://github.com/user-attachments/assets/6d3b1fd5-811a-4ccb-8f36-5b9fa40089e5" />

Setelah baris 43 dan 44 dihapus, data tetap bisa ditampilkan, tapi cara menampilkannya jadi berbeda. Hasilnya juga menunjukkan urutan normal dan urutan terbalik dari isi Stack.

3. Jelaskan fungsi dari baris 46-49? 

-Membuat iterator
-Menelusuri seluruh elemen
-Menampilkan elemen satu per satu

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian? 

<img width="338" height="383" alt="Screenshot 2026-06-16 125505" src="https://github.com/user-attachments/assets/2c84e665-10f8-489d-af0f-a73952058216" />

Karena List tidak memiliki method push,pop,peek.

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

<img width="251" height="16" alt="image" src="https://github.com/user-attachments/assets/82d25c86-cde1-4f74-b234-47d94f1b22ae" />

hasil running

<img width="274" height="92" alt="Screenshot 2026-06-16 130156" src="https://github.com/user-attachments/assets/ec6262fd-0c4a-438e-b627-c59d7f09896d" />

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

<img width="167" height="68" alt="Screenshot 2026-06-16 130634" src="https://github.com/user-attachments/assets/4db03b51-87a4-4d14-b2ce-e2362fb53ee0" />

hasil running 

<img width="272" height="114" alt="Screenshot 2026-06-16 130653" src="https://github.com/user-attachments/assets/7895aef6-2c4e-46b2-95c7-40b3b40920f4" />

## Percobaan 3

#### Code program

##### Class Mahasiswa25

<img width="536" height="465" alt="image" src="https://github.com/user-attachments/assets/50986b9c-ca49-4b07-be87-ba32191f1cb0" />

<img width="554" height="234" alt="image" src="https://github.com/user-attachments/assets/6a4ead62-d9ba-4088-8101-3ff92b17de06" />

#### hasil running

<img width="704" height="126" alt="image" src="https://github.com/user-attachments/assets/8161e6a1-a584-4e02-9aa9-5ac48882d3e6" />

### Pertanyaan

1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa? 

menggunakan konsep:Varargs (Variable Arguments), kelebihannya Jumlah parameter tidak dibatasi,Lebih fleksibel,Kode lebih singkat

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection! 

<img width="522" height="132" alt="image" src="https://github.com/user-attachments/assets/04dcc7d9-347b-46c7-94b7-ec70ad50891d" />

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

<img width="295" height="102" alt="image" src="https://github.com/user-attachments/assets/10290165-8e19-4acc-9e38-6cea2f8d0915" />

<img width="218" height="71" alt="image" src="https://github.com/user-attachments/assets/38130904-267b-4534-9898-8bde15f8276d" />

<img width="170" height="88" alt="image" src="https://github.com/user-attachments/assets/77deb062-ff64-4ef9-a925-2cc48e89867f" />

hasil running

<img width="727" height="182" alt="image" src="https://github.com/user-attachments/assets/66fccd84-fa8a-4d2a-bb81-effab2660ec1" />

## Tugas Praktikum 1

#### code program

##### class MahasiswaTugas25

<img width="424" height="196" alt="image" src="https://github.com/user-attachments/assets/75f045c7-ce6d-4bbe-8132-d29225a2ace3" />

##### class MataKuliahTugas25

<img width="447" height="192" alt="image" src="https://github.com/user-attachments/assets/b6771868-4173-489e-baf9-1472815d5f4a" />

##### class NilaiTugas25

<img width="473" height="238" alt="image" src="https://github.com/user-attachments/assets/ed45af5f-ce69-4af9-b581-a8e2d2557411" />

##### class MainTugas25

<img width="655" height="445" alt="image" src="https://github.com/user-attachments/assets/b35f9ddb-79d8-40c9-96b4-da9e310b923b" />

<img width="645" height="448" alt="image" src="https://github.com/user-attachments/assets/e72a34ce-a82e-4c7b-b63a-32d016e0bf81" />

<img width="494" height="449" alt="image" src="https://github.com/user-attachments/assets/22b134b2-439d-4ff5-b25c-d40ddc8f6ded" />

<img width="622" height="442" alt="image" src="https://github.com/user-attachments/assets/743053f3-ac08-4103-9492-10768d406ae4" />

<img width="661" height="457" alt="image" src="https://github.com/user-attachments/assets/6c8ac578-a577-4d79-a710-c52826c05834" />

<img width="368" height="49" alt="image" src="https://github.com/user-attachments/assets/1e96af8f-6420-41bd-94b8-6491c81a4da6" />

#### hasil running

<img width="335" height="457" alt="image" src="https://github.com/user-attachments/assets/25bc78be-2884-4793-b22e-528b8d2c6cdb" />

<img width="320" height="470" alt="image" src="https://github.com/user-attachments/assets/871615b4-ca96-4271-b92dzf6f375041ae2" />

<img width="302" height="186" alt="image" src="https://github.com/user-attachments/assets/fe425521-44a4-446e-bfe2-8911a91f6e41" />

## Tugas Praktikum 2
Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1!

yang di tambahin atau di modif

<img width="398" height="133" alt="image" src="https://github.com/user-attachments/assets/8d4576e4-41ff-4288-9114-7ba90876209e" />



<img width="373" height="88" alt="image" src="https://github.com/user-attachments/assets/2fb1f559-ad93-4415-a718-4e9757d9c4eb" />



<img width="301" height="42" alt="image" src="https://github.com/user-attachments/assets/490dd087-0620-4041-a654-08d4194886e8" />



<img width="503" height="357" alt="image" src="https://github.com/user-attachments/assets/3c9bd8ab-c991-4b2d-8870-f97ce26b61da" />



##### hasil running

<img width="352" height="449" alt="image" src="https://github.com/user-attachments/assets/8039453f-f145-4fe7-8a90-3f37dce22c1d" />
