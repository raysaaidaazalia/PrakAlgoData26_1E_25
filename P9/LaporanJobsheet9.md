# Laporan praktikum 9 STACK 

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 2.1.1

#### code program

<img width="780" height="534" alt="image" src="https://github.com/user-attachments/assets/3e233eb2-72ee-491b-9bac-d8acd5525e15" />

<img width="1004" height="926" alt="image" src="https://github.com/user-attachments/assets/69b60b75-9e63-4340-a14c-361bf22dba6b" />

<img width="1153" height="689" alt="image" src="https://github.com/user-attachments/assets/d58ee871-ff1a-453d-81d1-975c04b8433c" />

<img width="1241" height="924" alt="image" src="https://github.com/user-attachments/assets/ca5fae4f-1345-4dd5-a711-8c7d1e1487f9" />

<img width="1168" height="798" alt="image" src="https://github.com/user-attachments/assets/38d0d7f4-692c-4e28-9b84-30f66800aef2" />

#### hasil running

<img width="184" height="928" alt="image" src="https://github.com/user-attachments/assets/983fd7f0-2346-48ec-a63e-f6feab0d3cbd" />

### Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana yang perlu diperbaiki?

#### code program
<img width="1096" height="212" alt="image" src="https://github.com/user-attachments/assets/861e7f5f-d6f8-48f7-a755-91407193e16e" />

#### hasil running 

<img width="678" height="924" alt="image" src="https://github.com/user-attachments/assets/5fd11b50-fef1-4259-a052-582c359401f3" />

##### = bagian print karena urutannya masi blm sama dari atas kebawah atau belum memenuhi syarat last in first out (LIFO).

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!

<img width="922" height="94" alt="image" src="https://github.com/user-attachments/assets/5fa15027-0db7-422a-8a25-4b5a72e52e58" />

##### = yang dapat di tampung di dalam stack ada 5

3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?

##### = untuk memastikan stack belum penuh saat mau menambahkan data baru,Kalau pengecekan ini dihapus, program akan tetap memaksa menambah data walaupun array sudah penuh.

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!

#### code program
<img width="1041" height="179" alt="image" src="https://github.com/user-attachments/assets/14adafd8-b909-47f6-9be5-b9b7b48a7fa6" />

<img width="706" height="275" alt="image" src="https://github.com/user-attachments/assets/62988a95-dfb0-420e-bde5-6de2e26eb39e" />

#### hasil running

<img width="739" height="205" alt="image" src="https://github.com/user-attachments/assets/d99f105b-bc3b-4f3b-a96d-99e9ec2a8841" />


5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!

#### code program

<img width="564" height="212" alt="image" src="https://github.com/user-attachments/assets/c62eea3e-51be-4c14-9f1a-382d87bbf9c2" />

<img width="993" height="115" alt="image" src="https://github.com/user-attachments/assets/482d12d4-0c47-44b8-90eb-ada045ac728d" />

#### hasil running

<img width="524" height="948" alt="image" src="https://github.com/user-attachments/assets/54927986-caa1-4688-9b72-598a0307e99b" />

6. Commit dan push kode program ke Github

## Percobaan 2.2.1

#### code program

<img width="843" height="388" alt="image" src="https://github.com/user-attachments/assets/031124e2-ddb1-47a7-8c1c-961e50c0cfd5" />

<img width="868" height="923" alt="image" src="https://github.com/user-attachments/assets/80860c9c-1ab2-41e2-8dbc-5f782b518c39" />

<img width="967" height="70" alt="image" src="https://github.com/user-attachments/assets/26bf224a-b261-4e14-9d81-35b6b180eca6" />

#### hasil running

<img width="471" height="340" alt="image" src="https://github.com/user-attachments/assets/218585af-6ffc-479f-a08a-0c194836e198" />

### Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
-menyiapkan stack untuk menyimpan sisa pembagian
-Nilai desimal dibagi 2 terus-menerus
-Setiap sisa hasil bagi (0 atau 1) dimasukkan ke stack
-Setelah nilai habis jadi 0, isi stack diambil satu per satu
-Karena stack bersifat LIFO, digit biner keluar dalam urutan yang benar

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!

#### code program

<img width="731" height="356" alt="image" src="https://github.com/user-attachments/assets/f74e4316-f4aa-4bac-9f61-eed4dfe4168d" />

#### hasil running

<img width="589" height="360" alt="image" src="https://github.com/user-attachments/assets/58302c8a-5875-4442-b5f5-418bd441ba30" />

hasil nya tetap sama asalkan seluruh method konsisten menggunakan variabel kode.

## Latihan praktikum

#### code program

##### class surat25

<img width="1190" height="895" alt="image" src="https://github.com/user-attachments/assets/60cbb2be-3fad-44b8-b4c2-e0a45d15f7e9" />

##### class stacksurat25

<img width="969" height="928" alt="image" src="https://github.com/user-attachments/assets/b78d3472-919a-4bfb-987f-f8e450c80573" />

<img width="989" height="936" alt="image" src="https://github.com/user-attachments/assets/68ea4626-71db-4939-901c-41158d009f31" />

##### class suratDemo25

<img width="1288" height="929" alt="image" src="https://github.com/user-attachments/assets/93ac7588-d7af-437c-a1eb-f0c85a6a9aec" />

<img width="1091" height="933" alt="image" src="https://github.com/user-attachments/assets/343dd18b-3502-4e4c-a7b8-e2c92b6975fa" />

<img width="681" height="254" alt="image" src="https://github.com/user-attachments/assets/c5d47823-bf60-4c09-a8fd-f6c2134503f0" />

#### hasil running

<img width="271" height="466" alt="image" src="https://github.com/user-attachments/assets/d3d0321c-abb9-4a1f-a37d-2587230ea9d8" />

<img width="540" height="937" alt="image" src="https://github.com/user-attachments/assets/9d43d8e5-4604-4165-be75-1fbe8b217206" />

<img width="524" height="906" alt="image" src="https://github.com/user-attachments/assets/d5932532-8bf7-4fdb-9f48-ab15f9875d0f" />

<img width="489" height="310" alt="image" src="https://github.com/user-attachments/assets/35a8d092-71b6-4cde-9f2a-684daad09721" />

