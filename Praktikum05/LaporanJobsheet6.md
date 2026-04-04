# Laporan praktikum 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 5.2.1: Mengimplementasikan Sorting menggunakan object

#### code program

<img width="592" height="906" alt="image" src="https://github.com/user-attachments/assets/7c013c6b-430a-436c-a176-827ab2fb06ce" />
<img width="823" height="559" alt="image" src="https://github.com/user-attachments/assets/e861247d-8dc4-415b-97f8-7be8e06b93bc" />

#### hasil running

<img width="853" height="333" alt="image" src="https://github.com/user-attachments/assets/852d3243-47d9-4686-b2e4-27afd052092f" />

### Pertanyaan

1. Jelaskan fungsi kode program berikut

<img width="183" height="106" alt="image" src="https://github.com/user-attachments/assets/a11a2051-e389-4c9c-8526-85eaccda7f9d" />

##### = data di atas membandingkan dua data dalam array,tujuannya untuk mengurutkan dari kecil ke besar atau sebaliknya.

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!

<img width="455" height="152" alt="image" src="https://github.com/user-attachments/assets/eb33d329-508c-49f8-8569-d91ece5f60ec" />

##### = fungsinya untuk mencari nilai terkecil dalam array lalu di urutkan.

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

<img width="287" height="44" alt="image" src="https://github.com/user-attachments/assets/df352cf1-cfc6-453b-9b56-8f17dad79b81" />

##### = data tersebut memindahkan data yang nilainya lebih besar ke kanan,agar data tetap terurut.

4. Pada Insertion sort, apakah tujuan dari perintah 

<img width="191" height="44" alt="image" src="https://github.com/user-attachments/assets/e08707ed-7cea-418c-b3d3-56d23cd1928f" />

##### =tujuannya untuk menyimpan nilai key di tempat yang benar atau semestinya.

## Percobaan 5.3.1 : Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort)

#### code program

<img width="420" height="343" alt="image" src="https://github.com/user-attachments/assets/5b10833d-4044-43eb-a6f1-f710c7208705" />
<img width="842" height="924" alt="image" src="https://github.com/user-attachments/assets/64918257-0a3b-43b1-ac31-e6a368e63e25" />
<img width="1052" height="747" alt="image" src="https://github.com/user-attachments/assets/ad3f2132-1845-4db7-8c99-e9706a8f8e33" />

#### hasil runninng

<img width="435" height="813" alt="image" src="https://github.com/user-attachments/assets/552fa26e-5fe9-4baa-ab2e-1567ff892b25" />

### Pertanyaan 

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

<img width="570" height="80" alt="image" src="https://github.com/user-attachments/assets/0bc6f1e0-0bf8-4e05-ae02-0ccf55b5dcb3" />

a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?

##### =karena elemen terakhir tidak perlu dibandingkan lagi,sehingga perulangan berhenti sebelum data yang terakhir

b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?

##### =karena setiap tahap double sort dan data yang paling besar sudah berada di paling akhir,jadi tidak usah membandingkan kembali

c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

##### = i = n-1 maka tahap double sort akan terjadi sebanyak 50-1 = 49 kali

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)
yang terdiri dari nim, nama, kelas, dan ipk!

##### code program

<img width="812" height="769" alt="image" src="https://github.com/user-attachments/assets/1dc4b054-3d4d-43ad-b8cb-b6b2474ad064" />
<img width="848" height="932" alt="image" src="https://github.com/user-attachments/assets/3f657f58-4f93-4252-9bf8-92f16b678e8e" />
<img width="632" height="916" alt="image" src="https://github.com/user-attachments/assets/9074ed5f-ab74-4fba-ae7b-dd1455f2ae58" />

##### hasil running

<img width="193" height="400" alt="image" src="https://github.com/user-attachments/assets/b7c8a0d6-3cf8-4d9d-93a3-9b917d6ef141" />

## Percobaan 5.4.1 : Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

#### code program

<img width="640" height="892" alt="image" src="https://github.com/user-attachments/assets/29931308-aba3-4152-ad0e-39d45327ef12" />
<img width="642" height="846" alt="image" src="https://github.com/user-attachments/assets/7f7607ad-b954-41f8-bee8-387f5c3ee9ef" />

#### hasil running

<img width="529" height="962" alt="image" src="https://github.com/user-attachments/assets/66650236-d8f2-4f71-bbb7-200b7e52f558" />

### Pertanyaan

1.Di dalam method selection sort, terdapat baris program seperti di bawah ini:

<img width="871" height="255" alt="image" src="https://github.com/user-attachments/assets/3cd0313b-b604-4aa8-91e6-2d725091cb1d" />

Untuk apakah proses tersebut, jelaskan!

##### = proses tersebut fungsinya untuk menukar posisi data minimum dengan data dengan index saat ini.

## Percobaan 5.5.1 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

####  code program

<img width="575" height="886" alt="image" src="https://github.com/user-attachments/assets/8dd633cf-aae7-4af7-8d12-2b7dfa21814c" />
<img width="563" height="736" alt="image" src="https://github.com/user-attachments/assets/8c73bdaf-6169-41fa-b60a-c03976ba7311" />

#### hasil running

<img width="302" height="455" alt="image" src="https://github.com/user-attachments/assets/65103380-a50c-46c6-bc84-d4a38eee48d5" />

### Pertanyaan

1.Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending

#### code program

<img width="539" height="266" alt="image" src="https://github.com/user-attachments/assets/99b17654-2cf1-405c-8df8-5e39b9fe5da2" />

#### hasil running

<img width="543" height="482" alt="image" src="https://github.com/user-attachments/assets/0739577f-da37-4cb0-a71f-0846e3b0f6bb" />

## Latihan Praktikum

#### Code program

<img width="907" height="833" alt="image" src="https://github.com/user-attachments/assets/1d326951-4b04-45f6-91b5-0afe1b6e6e3e" />
<img width="544" height="834" alt="image" src="https://github.com/user-attachments/assets/facfceb4-705f-4c38-975f-607acaabd1fd" />
<img width="397" height="290" alt="image" src="https://github.com/user-attachments/assets/ab4c4daf-1b7b-4c63-ad72-1bbfbabcd67b" />

#### hasil running

<img width="426" height="946" alt="image" src="https://github.com/user-attachments/assets/96239d17-d986-4b73-9736-f4c375f7a327" />


