# Laporan Praktikum Algoritma dan Struktur data Jobsheet 1 Konsep Dasar Pemograman

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## 2.2.1 Praktikum Pemilihan

### Pertanyaan Percobaan 1

Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai 
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan 
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka 
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan 
konversi nilai dengan ketentuan sebagai berikut: 
<img width="699" height="349" alt="image" src="https://github.com/user-attachments/assets/5f9ce423-2b43-4b1a-a1a3-5656e4421f98" />

Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E 
maka TIDAK LULUS. 
• Input dari program berupa komponen nilai tugas, kuis, UTS, UAS 
• Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan 
• Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/ 
TIDAK LULUS

### Jawaban Percobaan 1

#### Code program

<img width="1404" height="930" alt="image" src="https://github.com/user-attachments/assets/65222e13-977c-41a4-97f3-b134ca04ea61" />
<img width="1380" height="529" alt="image" src="https://github.com/user-attachments/assets/a161db0c-5b88-4115-a6df-70762b84cce1" />

#### Hasil running program

<img width="1120" height="595" alt="image" src="https://github.com/user-attachments/assets/4287da2f-8b0b-465b-942c-45342edcec6d" />

## 2.2.2 Praktikum Perulangan

### Pertanyaan Percobaan 2

1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n,  dengan 
n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya 
a. Bilangan kelipatan 3 dicetak dengan simbol # 
b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya 
c. Bilangan ganjil dicetak dengan simbol * 
d. Bilangan 10 dan 15 tidak dicetak 
*bila n<10 maka tambahkan 10 (n+=10) 
Contoh 1: Input NIM: 2541720102 maka n=12 
Output: * 2 # 4 * # * 8 # * # 
Contoh 2: Input NIM: 2541720120 maka n=20 
Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20

### Jawaban Percobaan 2

#### Code program

<img width="657" height="887" alt="image" src="https://github.com/user-attachments/assets/c614b06b-8be6-4765-9dde-8d6026f5eec9" />

#### Hasil running program

<img width="1090" height="295" alt="image" src="https://github.com/user-attachments/assets/c631b36e-141f-411d-abde-b603702c774a" />

## 2.2.3 Praktikum Array

### Pertanyaan Percobaan 3

1. Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh 
semester lalu. Formula untuk menghitung IP semester sebagai berikut:  
<img width="512" height="87" alt="image" src="https://github.com/user-attachments/assets/92acab41-822f-41fd-a09f-0777eb39656c" />
Nilai setara didapatkan dari tabel konversi berikut ini:
<img width="687" height="348" alt="image" src="https://github.com/user-attachments/assets/06f4717f-30ac-494f-8c30-b8c0d01ef2c5" />
Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah 
tersebut.

### Jawaban Percobaan 3

#### Code program 

<img width="954" height="893" alt="image" src="https://github.com/user-attachments/assets/9c2f3975-6c2f-4dba-9535-388d7f6cf455" />
<img width="1089" height="431" alt="image" src="https://github.com/user-attachments/assets/2953cb88-5e4e-47b7-a26c-378aa92f61aa" />

#### Hasil running program

<img width="1095" height="608" alt="image" src="https://github.com/user-attachments/assets/8895ae2c-c1d8-4078-ae0c-90bb4a8ac8d8" />

## 2.2.4 Praktikum Fungsi

### Pertanyaan Percobaan 4

RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga
bunga yang dijual selalu dicatat dengan rincian seperti berikut ini: 
Baris = Cabang Toko, Kolom = Stock bunga pada hari x 
<img width="892" height="218" alt="image" src="https://github.com/user-attachments/assets/d91bafaa-c960-41fd-b7ff-4c1288a7ea69" />
Rincian Harga Aglonema =75.000, Keladi = 50.000, Alocasia =60.000, Mawar =10.000. 
1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual. 
2. Tampilkan status  dari setiap cabang dengan ketentuan sebagai berikut ini : 
a. Jika pendapatan cabang > Rp1.500.000, maka cabang tersebut mendapat status 
“Sangat Baik” 
b. Jika pendapatan ≤ Rp1.500.000, status “Perlu Evaluasi”.

### Jawaban Percobaan 4

#### Code program

<img width="1213" height="879" alt="image" src="https://github.com/user-attachments/assets/58916111-c745-4476-9301-023ad23d13ab" />
<img width="1136" height="328" alt="image" src="https://github.com/user-attachments/assets/290709d4-8b41-4c8a-8f1c-23a1c17344a7" />

#### Hasil running program

<img width="1269" height="328" alt="image" src="https://github.com/user-attachments/assets/8aaa5543-5342-485f-826f-551d92c16a25" />

## Tugas 1

### Pertanyaan tugas 1

1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama 
adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua 
dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. 
Ilustrasi tampilan array tersebut adalah sebagai berikut:
<img width="819" height="425" alt="image" src="https://github.com/user-attachments/assets/7d4cbebf-91f3-42e8-ba95-9193ac75c919" />
Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan 
nama kota dari kode plat nomor tersebut.

### Jawaban tugas 1

#### Code program

<img width="1032" height="694" alt="image" src="https://github.com/user-attachments/assets/67fc9202-93d5-440b-9c66-276bb41b9164" />

#### Hasil running progran

<img width="910" height="143" alt="image" src="https://github.com/user-attachments/assets/4bde9eb5-3f6b-4468-bafb-556267e17c82" />

## Tugas 2

### Pertanyaan tugas 2

 Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. 
Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan  
• Baris menyatakan jadwal ke-i 
• Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam Kuliah. Contoh :  
jadwal[0][0] = "Pemrograman Dasar" 
jadwal[0][1] = "Lab Komputasi 1" 
jadwal[0][2] = "Senin" 
jadwal[0][3] = "08.00–10.00" 
• Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna. 
Buatkan fungsi untuk  
a. Menginput data jadwal kuliah ke dalam array 2 dimensi 
b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel 
c. Menampilkan jadwal kuliah berdasarkan hari tertentu 
d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu

### Jawaban tugas 2

#### Code program

<img width="1277" height="873" alt="image" src="https://github.com/user-attachments/assets/a4a32a4d-0b1e-47b1-b69c-024105b3f20e" />
<img width="1285" height="886" alt="image" src="https://github.com/user-attachments/assets/08b1ab6f-d264-4ec4-b6a7-0c6274ae8e4e" />
<img width="1264" height="695" alt="image" src="https://github.com/user-attachments/assets/1e6ccb22-30f7-48f0-981f-3a120f9e39c5" />

#### Hasil running program

<img width="814" height="845" alt="image" src="https://github.com/user-attachments/assets/92965271-3476-42a3-9531-a101b1c5e07c" />
