# Laporan praktikum ARRAY OF OBJECTS jobsheet 3

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

#### code program

<img width="622" height="263" alt="Screenshot 2026-02-26 081400" src="https://github.com/user-attachments/assets/a0bcd25a-8ca2-498d-8c5c-6862c83d5846" />
<img width="866" height="894" alt="Screenshot 2026-02-26 081343" src="https://github.com/user-attachments/assets/00fb0018-468c-4566-a587-70350efafeb6" />

#### hasil running

<img width="557" height="324" alt="Screenshot 2026-02-26 081443" src="https://github.com/user-attachments/assets/f7186b7e-7faa-4a6e-98d6-92ca5dc2c1de" />

### pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!

*****=tidak,di dalam class boleh hanya memiliki atribut saja,method hanya untuk mengolah data.

2. Apa yang dilakukan oleh kode program berikut?
   
<img width="885" height="60" alt="image" src="https://github.com/user-attachments/assets/c8a86b40-4106-4504-a717-15a531d0fcac" />

*****=membuat objek baru dari class mahasiswa25

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?

<img width="907" height="64" alt="image" src="https://github.com/user-attachments/assets/30900f96-fdc3-4934-89a8-a2b3dd86f01b" />

*****=tidak,vscode akan otomatis membuat default constructor kosong.

4. Apa yang dilakukan oleh kode program berikut?

 <img width="913" height="156" alt="image" src="https://github.com/user-attachments/assets/81c3c1ab-beb7-4c21-8713-b38010dbc01f" />

*****=untuk mengakses objek di index tertentu.

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

*****=agar tidak kesusahan,dan lebih gampang jika ada yang salah akan ketahuan.

## Percobaan 2: Menerima Input Isian Array Menggunakan Looping

#### Code program

<img width="857" height="811" alt="image" src="https://github.com/user-attachments/assets/e14e581f-209f-4eb8-a3e8-39041d641b88" />

#### hasil running

<img width="845" height="619" alt="image" src="https://github.com/user-attachments/assets/90c0e8e4-d297-4eb4-9eee-b7bc2c4865f7" />

### Pertanyaan

1.Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.

#### code program

<img width="897" height="471" alt="Screenshot 2026-02-26 085743" src="https://github.com/user-attachments/assets/3caf4bd6-9112-40c6-9fa4-4c1b35d0a265" />
<img width="980" height="889" alt="Screenshot 2026-02-26 085750" src="https://github.com/user-attachments/assets/37381de7-cf6d-4e06-b2da-a676e69147a2" />

#### hasil running

<img width="741" height="783" alt="Screenshot 2026-02-26 085729" src="https://github.com/user-attachments/assets/a86942f3-0a23-4747-98c7-608c3667ab86" />

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

<img width="717" height="145" alt="image" src="https://github.com/user-attachments/assets/57528121-5641-40fa-9501-c58f7f5303a6" />

*****=Karena array sudah dibuat, tapi setiap elemennya belum dibuat object oleh "new"

## Percobaan 3: Constructor Berparameter

#### Code program

<img width="919" height="464" alt="image" src="https://github.com/user-attachments/assets/4e581733-89b0-406a-89b9-522beafeb52a" />
<img width="988" height="920" alt="image" src="https://github.com/user-attachments/assets/24ecd824-095f-426c-a1d0-265167040185" />

#### hasil running

<img width="908" height="724" alt="image" src="https://github.com/user-attachments/assets/e94292d8-a9b3-43a1-89fa-76658c8c262d" />

### Pertanyaan

1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
   
   *****= ya,bisa asalkan parameter nya berbeda(jumlah atau tipe nya juga berbeda)
   
   <img width="803" height="596" alt="image" src="https://github.com/user-attachments/assets/4048198b-a677-4b27-b179-c3449579e65d" />

2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah

#### code program

<img width="961" height="605" alt="image" src="https://github.com/user-attachments/assets/9b779c59-8b23-4694-9295-96ae87633b03" />
<img width="1036" height="878" alt="image" src="https://github.com/user-attachments/assets/2d48d287-022e-4264-a32d-092de575edd2" />

#### hasil running

<img width="713" height="735" alt="image" src="https://github.com/user-attachments/assets/04f7a1df-6d61-4b5c-ae5f-86fc8038caf6" />

3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar

#### code program

<img width="824" height="748" alt="image" src="https://github.com/user-attachments/assets/3b455ad3-33ca-4f89-8450-4d811fc43f1e" />
<img width="827" height="769" alt="image" src="https://github.com/user-attachments/assets/d4a15a2a-bbdd-4953-8c4d-5b7ee0335cf3" />

#### hasil running

<img width="624" height="775" alt="image" src="https://github.com/user-attachments/assets/abe1781f-0aef-497e-81cb-93b3be2aabf6" />

4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner

#### code program

<img width="981" height="840" alt="image" src="https://github.com/user-attachments/assets/1807d074-1559-4e5b-b04f-95a6ae85cd73" />

#### hasil running

<img width="725" height="684" alt="image" src="https://github.com/user-attachments/assets/0fcf8f2f-b82e-4646-a68d-fa96a84c58e4" />

## Tugas 1

### Pertanyaan

1. Buatlah program untuk menampilkan informasi tentang dosen. Program dapat menerima input
semua informasi terkait dosen dan menampilkanya kembali ke layar. Program ini terdiri dari class
Dosen<NoPresensi> dengan attribute/property sebagai berikut;
String kode
String nama
Boolean jenisKelamin
int usia
dengan methode constructor sebagai berikut;
public dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
…………….;
…………….;
}
Kemudian buatlah class DosenDemo<NoPresensi> untuk proses input dan menampilkan data
beberapa dosen. Gunakan looping dengan FOR untuk pembuatan array of object. Gunakan
looping dengan FOREACH untuk menampilkan data ke layar.

### Jawaban

#### Code program

<img width="1002" height="783" alt="image" src="https://github.com/user-attachments/assets/06e256c9-3a68-475f-bc93-b6e272d2a3a9" />
<img width="1002" height="840" alt="image" src="https://github.com/user-attachments/assets/0a28432a-d8c1-43c9-90c9-969fc887de27" />

#### hasil running

<img width="757" height="691" alt="image" src="https://github.com/user-attachments/assets/d3cb81fe-66d2-4259-9a6b-73b94253906b" />

## Tugas 2

### Pertanyaan

Tambahkan class baru DataDosen<NoPresensi> dengan beberapa method berikut;
a. dataSemuaDosen(Dosen[] arrayOfDosen)untuk menampilkan data semua dosen
b. jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan data
jumlah dosen per jenis kelamin (Pria / Wanita)
c. rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan
rata-rata usia dosen per jenis kelamin (Pria / Wanita)
d. infoDosenPalingTua(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling
tua
e. infoDosenPalingMuda(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling
muda
Semua method tersebut harus bisa dipanggil/ditest dari class DosenDemo

#### code program

<img width="775" height="876" alt="image" src="https://github.com/user-attachments/assets/8e87332b-2e94-40bb-8c7e-f216deb2dc87" />
<img width="550" height="876" alt="image" src="https://github.com/user-attachments/assets/97159b7e-f86a-41f1-ab9f-f0708fde8729" />

#### hasil running

<img width="504" height="935" alt="image" src="https://github.com/user-attachments/assets/79ba87e9-c47a-47a7-bf95-b55597baf147" />










