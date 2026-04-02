# Laporan Praktikum Algoritma dan Struktur data Jobsheet 5 BRUTE FORCE DAN DIVIDE CONQUER

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## 5.2 :Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

#### code program

<img width="849" height="673" alt="image" src="https://github.com/user-attachments/assets/5b855067-0c33-460f-b74c-658f513757e1" />
<img width="954" height="383" alt="image" src="https://github.com/user-attachments/assets/1134023b-7b7f-4d3d-b507-2b83d84362ae" />

#### hasil running

<img width="520" height="137" alt="image" src="https://github.com/user-attachments/assets/a03b938c-bb69-4707-86a5-a9212580cb02" />

### Pertanyaan

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!

##### =if di gunakan untuk menentukan kondisi berhenti,jika else di gunakan untuk melanjutkan proses rekursif seperti (faktorial(n-1))

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!

##### =bisa menggunakan while,

<img width="1233" height="457" alt="image" src="https://github.com/user-attachments/assets/a673d17e-c666-4787-9455-a7b4d888caed" />

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
   
##### =fakto *=i : digunakan untuk menghitung di perulangan (brute force)
##### = jika int fakto = n * faktorialDC(n-1) : di gunakan untung proses rekursif pada (Divide and Conquer)

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

##### = jadi kesimpulannya faktoBF() digunakan untuk menghitung faktorial menggunakan perulangan, jika faktoDC() digunakan untuk menghitung faktorial menggunakan rekursif

## 5.3 :Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

#### code program

<img width="1081" height="861" alt="image" src="https://github.com/user-attachments/assets/53170ca4-7bf7-4a13-98b9-60479d4b1ea0" />
<img width="1251" height="861" alt="image" src="https://github.com/user-attachments/assets/fb4aa1a3-6ddd-4bf2-b74f-a74e02fba4df" />

#### hasil running

<img width="1209" height="495" alt="image" src="https://github.com/user-attachments/assets/c98b21ca-811f-4505-bbc2-602b95beef46" />

### Pertanyaan

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

   ##### =pangkatBF() :brute Force,menghitung pangkat dengan perkalian berulang seperti 2^4 =2 x 2 x 2 x 2 (jadi di lakukan loop atau rekursif sebanyak nilai pangkat)
   
   ##### =pangkatDC() :divide and conquer,menghitung pangkat dengan membagi pangkat menjadi dua bagian seperti 2^8 = (2^4) x (2^4) (cara ini lebih cepat dan efesien)
   
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

##### =ya,sudah ada 
<img width="588" height="89" alt="image" src="https://github.com/user-attachments/assets/9cb751da-a8d8-4c54-a6f6-d2f8c73a3b9e" />
  
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?

##### =menurut saya parameter tidak selalu diperlukan jika nilai dan pangkat sudah ada di atribut,contohnya seperti ini: 

<img width="454" height="179" alt="image" src="https://github.com/user-attachments/assets/8664cae5-e243-4176-a0b6-335ec0ff4e88" />

4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

##### = pangkatBF() : menghitung pangkat menggunakan perkalian berulang
##### = pangkatDC() : membagi masalah menjadi lebih kecil

## 5.4 :Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

#### code program

<img width="1065" height="782" alt="image" src="https://github.com/user-attachments/assets/5feee92a-d130-4225-943e-227e6380c7f5" />
<img width="1420" height="552" alt="image" src="https://github.com/user-attachments/assets/c982611a-0b0f-4558-bee2-7a618923ee1d" />

#### hasil running

<img width="1357" height="277" alt="image" src="https://github.com/user-attachments/assets/5adc7bd8-1b8d-40cb-9999-00e867eb9c25" />

### Pertanyaan

1. Kenapa dibutuhkan variable mid pada method TotalDC()?

##### = karena mid digunakan untuk membagi array menjadi dua bagian,yaitu bagian kiri dan bagian kanan,karena divide and conquer bekerja dengan cara membagi masalah besar menjadi beberapa masalah kecil
   
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
   
   <img width="412" height="65" alt="image" src="https://github.com/user-attachments/assets/4d33d2fb-85b1-4afc-a8cc-62e7f47939ed" />

##### =kode di atas untuk memanggil kembali method totalDC() secara rekursif untuk menghitung jumlah array pada bagian kiri dan kanan

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
   
  <img width="264" height="34" alt="image" src="https://github.com/user-attachments/assets/542d9464-00c7-492a-97e3-61c844c9e697" />

##### = kode di atas untuk menggabungkan/menghitung hasil dari bagian kiri dan kanan/untuk menghitung jumlah seluruh array

4. Apakah base case dari totalDC()?
   
##### =  iyaa,karena base case terjadi ketika array sudah tidak bisa di bagi lagi (l == r)
   
5. Tarik Kesimpulan tentang cara kerja totalDC()

##### = kesimpulannya, totalDC() menggunakan mid untuk membagi dua bagian,lalu menghitung jumlah bagian kiri dan menghitung jumlah bagian kanan,lalu menggabungkan kedua
##### nya,proses berhenti ketika tersisa satu elemen atau ketika sudah tidak bisa di bagi lagi

## 4.5 :Latihan praktikum

1. Sebuah kampus memiliki daftar nilai mahasiswa dengan data sesuai tabel di bawah ini

<img width="822" height="337" alt="image" src="https://github.com/user-attachments/assets/95ed67b9-35d7-4dd2-a900-1c712f5572cc" />

Tentukan:
a) Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer!
b) Nilai UTS terendah menggunakan Divide and Conquer!
c) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!

#### code program

<img width="667" height="820" alt="image" src="https://github.com/user-attachments/assets/eec83cdb-74b8-4897-9530-8fab4f595e91" />
<img width="790" height="417" alt="image" src="https://github.com/user-attachments/assets/92088683-7d65-4f6e-8f4d-05d3f2330af0" />

#### hasil running

<img width="1309" height="158" alt="image" src="https://github.com/user-attachments/assets/6057468e-f7d6-4f89-a5cd-de27ce0de5a4" />
