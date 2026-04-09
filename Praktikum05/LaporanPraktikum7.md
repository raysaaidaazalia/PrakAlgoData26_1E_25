# Laporan Praktikum jobsheet 7 SEARCHING

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1: Deklarasi Class, Atribut dan Method

#### code program

<img width="957" height="693" alt="image" src="https://github.com/user-attachments/assets/84b586cb-7fc5-4136-8f82-c1b903e58e30" />
<img width="771" height="868" alt="image" src="https://github.com/user-attachments/assets/ddab3909-9928-4823-9102-a3527acfd033" />

#### hasil running

<img width="504" height="926" alt="Screenshot 2026-04-09 174621" src="https://github.com/user-attachments/assets/09e03584-a2f1-449d-902a-d4e58990389e" />

### Pertanyaan
1.jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!

##### =perbedaannya ada pada informasi yang ditampilkan,jika tampilPosisi() digunakan untuk menampilkan letak/index data yang di temukan didalam array
##### jika tampildataSearch() digunakan untuk menampilkan isi data mahasiswa yang ditemukan.

2. Jelaskan fungsi break pada kode program di bawah ini!

<img width="806" height="135" alt="image" src="https://github.com/user-attachments/assets/4686042e-5a91-4053-be68-dd524c57a0cb" />

##### = fungsi break untuk menghentikan data saat perulangan jika data yang di cari sudah ditemukan.

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

##### = fungsi variabel pos adalah untuk menyimpan posisi/index data yang berhasil di temukan.

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan.

##### =program akan menemukan data pertama yang di temukan,karena saat ada data yang cocok program langsung menyimpan index tersebut dan berhenti ketika ada break.

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?

##### =jika tidak ada break maka perulangan akan terus berjalan sampai elemen terakhir.

## Percobaan 2

#### code program

<img width="706" height="403" alt="image" src="https://github.com/user-attachments/assets/5d676591-baae-40b2-b928-e02f43a08f80" />
<img width="629" height="168" alt="image" src="https://github.com/user-attachments/assets/7ca7c852-61d7-42ca-8f89-e7f524319dfb" />

#### hasil running

<img width="630" height="920" alt="image" src="https://github.com/user-attachments/assets/2165c083-6ad4-4443-88a3-9b8572515e8d" />

### Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!

<img width="254" height="29" alt="image" src="https://github.com/user-attachments/assets/3dc71797-9417-4e22-a0b6-fcb86e2ef35b" />
   
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

<img width="457" height="91" alt="image" src="https://github.com/user-attachments/assets/c85067be-9470-4caa-a1ff-3438d2fcdeaa" />
 
3. Apa fungsi left, right, dan mid?

##### = left adalah batas kiri dari data yang ada,right adalah batas kanan dari data yang ada,dan mid adalah indeks tengah yang dipakai untuk membandingkan nilai yang dicari
   
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?

##### =program masi tetap jalan,tetapi tidak akurat hasil binary search bisa salah,karena binary seach hanya bekerja dengan benar jika data sudah terurut

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai

##### =hasilnya tidak sesuai,bisa saja data 3.2 ada,tetapi program tidak menemukannya atau menuju sisi yang salah.

<img width="715" height="329" alt="image" src="https://github.com/user-attachments/assets/b735760a-17c7-40af-abaf-b3b917a5b29c" />

#### code program

<img width="686" height="327" alt="image" src="https://github.com/user-attachments/assets/0dfc25c4-6401-4712-a166-0c0488113f86" />

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.

##### =Binary search menyatakan data tidak ditemukan ketika batas pencapaian sudah habis,yaitu ketika left lebih besar daripada right,artinya tidak ada lagi bagian array yang bisa di periksa

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.

#### code program

<img width="598" height="292" alt="image" src="https://github.com/user-attachments/assets/8b528c5c-aa06-4a12-9c6b-a97fd04c8c96" />
<img width="675" height="274" alt="image" src="https://github.com/user-attachments/assets/286cd369-674a-42af-a817-89b807bff58e" />


#### hasil running

<img width="497" height="506" alt="image" src="https://github.com/user-attachments/assets/85637468-91ff-47a2-a147-6f2c04f46298" />

