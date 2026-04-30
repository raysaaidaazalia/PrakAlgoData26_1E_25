# Laporan praktikum 10 Queue 

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1

#### code program

##### Class Queue

<img width="807" height="978" alt="image" src="https://github.com/user-attachments/assets/f14b3636-138e-46ba-be0d-729ca09ea347" />

<img width="761" height="986" alt="image" src="https://github.com/user-attachments/assets/9c0e1708-23c9-4f83-a064-53e1de5e575b" />

<img width="738" height="214" alt="image" src="https://github.com/user-attachments/assets/e3234df7-bd9b-45d7-8486-40dbde31d9e5" />

##### Class  Queue main

<img width="1113" height="936" alt="image" src="https://github.com/user-attachments/assets/46bd4fb2-0bf7-49a9-b4b0-74115dca494b" />

<img width="907" height="235" alt="image" src="https://github.com/user-attachments/assets/21b0514d-9de7-4b0e-8276-b64b44a0436d" />

#### Hasil running

<img width="555" height="959" alt="Screenshot 2026-04-29 150337" src="https://github.com/user-attachments/assets/92b85237-39d0-480d-a97d-33e7091cc04c" />

### Pertanyaan

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?

##### = Karena saat queue masih kosong, belum ada data yang masuk. Jadi posisi front dan rear belum menunjuk ke indeks mana pun, maka diberi nilai -1. Sedangkan size = 0 berarti jumlah data di dalam queue masih kosong.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

<img width="431" height="77" alt="image" src="https://github.com/user-attachments/assets/0c802554-495a-4caf-ac26-c34269d0e025" />

##### = maksud nya adalah jika posisi rear sudah sampai indeks terakhir array, maka rear dikembalikan lagi ke indeks 0.
 
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

<img width="353" height="83" alt="image" src="https://github.com/user-attachments/assets/104bc485-d639-46f0-90d2-8b30e13e52a7" />

##### = maksud nya adalah jika data yang dikeluarkan berada di posisi terakhir array, maka posisi front diputar lagi ke indeks 0.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?

##### = Karena data paling depan dalam queue belum tentu ada di indeks 0.Posisi front bisa berpindah-pindah.Jadi kalau dimulai dari 0, hasilnya bisa salah atau menampilkan data yang sudah keluar.

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

<img width="287" height="52" alt="image" src="https://github.com/user-attachments/assets/3d0dea15-f50c-4b9f-ab1d-53fb4291b6ac" />

##### = maksudnya adalah Kalau i sudah sampai indeks terakhir, maka akan kembali ke indeks 0.

6. Tunjukkan potongan kode program yang merupakan queue overflow!

<img width="655" height="101" alt="image" src="https://github.com/user-attachments/assets/cec3a463-4e2b-4b92-beea-4945c74495d4" />

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

<img width="703" height="103" alt="image" src="https://github.com/user-attachments/assets/7f87729e-4287-4485-bf88-ffb60373cc38" />

<img width="733" height="118" alt="image" src="https://github.com/user-attachments/assets/00c1fb52-a916-4913-84db-ceb6b05259ad" />

## Percobaan 2

#### Code program

##### class Mahasiswa25

<img width="1098" height="684" alt="image" src="https://github.com/user-attachments/assets/2ff10e9f-4b67-4275-9974-c65ddd58613e" />

##### class antrianLayanan

<img width="943" height="917" alt="image" src="https://github.com/user-attachments/assets/60c46957-9001-4504-9d62-e2c80b1a3533" />

<img width="1053" height="923" alt="image" src="https://github.com/user-attachments/assets/0ccb9a52-ddba-424e-b11b-f22aa74e0eb3" />

<img width="1016" height="594" alt="image" src="https://github.com/user-attachments/assets/adfe4a65-5698-4775-ad4f-f33fde50ee4a" />

#### class LayananAkademikSiakad

<img width="1064" height="931" alt="image" src="https://github.com/user-attachments/assets/fe53b0f5-ac60-46d1-9d19-110aa4e9221e" />

<img width="1025" height="913" alt="image" src="https://github.com/user-attachments/assets/3d3ca4a5-d257-4bfd-8c42-365273a55b2b" />

#### hasil running

<img width="680" height="918" alt="image" src="https://github.com/user-attachments/assets/a53f0593-a27c-4aa0-b054-16042a60daf1" />

<img width="784" height="926" alt="image" src="https://github.com/user-attachments/assets/dcf59f97-4e76-4e7f-8671-58b2c6f13865" />

<img width="666" height="822" alt="image" src="https://github.com/user-attachments/assets/15498dd1-b6f1-45be-aa6d-fe6ab6fca5ab" />

### Pertanyaan

1.Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga
method LihatAkhir dapat dipanggil!

#### code program

<img width="722" height="281" alt="image" src="https://github.com/user-attachments/assets/7930bc02-00a9-455e-a2d5-8c11f850cd88" />

<img width="521" height="76" alt="image" src="https://github.com/user-attachments/assets/64a5f351-dda1-4292-a0a0-958ec6e4a54e" />

<img width="523" height="36" alt="image" src="https://github.com/user-attachments/assets/4c0e7450-4aaf-4903-a34d-b0d1646a97b1" />

#### hasil running

<img width="514" height="944" alt="image" src="https://github.com/user-attachments/assets/bf2a9d4d-7b58-470b-99c9-09b202c2fe71" />

## TUGAS PRAKTIKUM

#### code program

##### class mahasiswa
<img width="917" height="538" alt="image" src="https://github.com/user-attachments/assets/9d68f882-854d-4b10-ad5b-bb971ccbbcfd" />

##### class antrianKRS
<img width="1081" height="938" alt="image" src="https://github.com/user-attachments/assets/e9fc0505-56b2-4b93-a7b3-a51b5e95f491" />

<img width="1053" height="928" alt="image" src="https://github.com/user-attachments/assets/be0d9e25-036e-4bf6-8f85-e8abdf9ffb7d" />

<img width="927" height="924" alt="image" src="https://github.com/user-attachments/assets/0465cb81-dc60-4bca-9b21-d2b4073d8ba7" />

<img width="967" height="746" alt="image" src="https://github.com/user-attachments/assets/a351ec15-03af-488e-b6fb-084d66d36c9d" />

##### class krsmain

<img width="1111" height="925" alt="image" src="https://github.com/user-attachments/assets/347e912f-3f20-4ce6-b4d1-57f94d12b40e" />

<img width="1012" height="928" alt="image" src="https://github.com/user-attachments/assets/703dacad-8aba-4ba2-981a-041cae61972e" />

