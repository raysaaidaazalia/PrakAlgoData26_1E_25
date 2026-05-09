# Laporan praktikum 11 Linked list 

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1

#### code program

##### class mahasiswa

<img width="396" height="366" alt="image" src="https://github.com/user-attachments/assets/9f3945ba-a6d2-45a1-9300-40ff083abc5c" />

##### class NodeMahasiswa

<img width="398" height="194" alt="image" src="https://github.com/user-attachments/assets/1332d1a6-ddb5-4612-a862-731694d7a6f0" />

##### SingleLinkedList25

<img width="499" height="467" alt="image" src="https://github.com/user-attachments/assets/cedc34e2-e21d-496f-b692-720fe365ad03" />

<img width="443" height="470" alt="image" src="https://github.com/user-attachments/assets/cb722292-f846-408b-81ab-05b8196c7069" />

<img width="386" height="95" alt="image" src="https://github.com/user-attachments/assets/b3338bbc-86d4-422a-be15-1fa09695f39e" />

##### SLLMain

<img width="568" height="314" alt="image" src="https://github.com/user-attachments/assets/5d19abde-6645-4a90-a994-7e959baf7662" />

#### hasil running

<img width="323" height="446" alt="image" src="https://github.com/user-attachments/assets/736de795-2f39-47c2-9c50-0ed5311c7acf" />

### Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

 ##### = karena yang pertama kali di jalan kan head bernilai null,method print() akan menampilkan isEmpty jika head = null maka linked akan menampilkan nilai kosong
 
2. Jelaskan kegunaan variable temp secara umum pada setiap method!

##### = karena head tidak bisa selalu kemana mana dan jika head pindah-pindah dia akan kehilangan alamat awalnya jadi temp di gunakan untuk membantu head mencari nilai yang di cari

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

##### code program

<img width="415" height="437" alt="image" src="https://github.com/user-attachments/assets/e6981e49-30a9-4fcb-9bf6-ecb4968c0fef" />

##### hasil running

<img width="243" height="407" alt="image" src="https://github.com/user-attachments/assets/f2492a7a-3535-457b-bd76-e9498cea8853" />

#### code program

<img width="453" height="464" alt="image" src="https://github.com/user-attachments/assets/22bdea4d-77f4-465b-afc7-8bd33467066d" />

<img width="334" height="426" alt="image" src="https://github.com/user-attachments/assets/819ead92-fd06-4bf3-bbd0-74aaa7a08b8b" />

<img width="558" height="416" alt="image" src="https://github.com/user-attachments/assets/f53b45c0-dd19-48fb-8813-073d420881cf" />

#### hasil running

<img width="677" height="288" alt="image" src="https://github.com/user-attachments/assets/cca9d6f3-f8bd-4406-bb78-f30c311b017e" />

### Pertanyaan

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

  ##### = break digunakan untuk menghentikan perulangan,karna jika remove berada di tengah maupun di belakang atau di tempat yang kita inginkan untuk meremove butuh menggunakan
  ##### lopping dan kondisi break agar jika sudah bertemu yang ingin kita hapus bisa menghentikan perulangan
  
2. Jelaskan kegunaan kode dibawah pada method remove
   
   <img width="303" height="170" alt="image" src="https://github.com/user-attachments/assets/0e166091-67f8-4ddd-8327-0cbd8b064e38" />

##### temp.next = temp.next.next digunakan untuk mengskip node yang akan dihapus
##### temp.next = null digunakan untuk mengecek apakah yang akan dihapus adalah node terakhir
##### tail = temp jika benar node terakhir yang akan di hapus maka tail pidah menjadi temp jadi sekarang nilai temp adalah tail.

## Tugas
Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan berikut ini :
a. Implementasi antrian menggunakan Queue berbasis Linked List!
b. Program merupakan proyek baru bukan modifikasi dari percobaan
c. Ketika seorang mahasiswa akan mengantri, maka dia harus mendaftarkan datanya
d. Cek antrian kosong, Cek antrian penuh, Mengosongkan antrian.
e. Menambahkan antrian
f. Memanggil antrian
g. Menampilkan antrian terdepan dan antrian paling akhir
h. Menampilkan jumlah mahasiswa yang masih mengantre.

#### code program

##### class MahasiswaTugas25

<img width="377" height="296" alt="image" src="https://github.com/user-attachments/assets/5042c8cc-85e7-48f5-a150-3a2b520b198f" />

##### class NodeTugas25

<img width="401" height="206" alt="image" src="https://github.com/user-attachments/assets/be93890c-ce47-4f18-acb2-02d97b410aaa" />

##### class QueueLinkedListTugas25

<img width="384" height="459" alt="image" src="https://github.com/user-attachments/assets/11a0cb12-ab72-4148-b743-ccef14c6a5ae" />

<img width="388" height="464" alt="image" src="https://github.com/user-attachments/assets/eb726bad-d460-4bc4-8e20-c997c355cfc7" />

<img width="457" height="437" alt="image" src="https://github.com/user-attachments/assets/d6acbeef-2226-4dc2-8f63-9e4bd766716e" />

##### class MainTugas25

<img width="503" height="463" alt="image" src="https://github.com/user-attachments/assets/07d75354-e05c-41cb-99ee-a0b5c6142613" />

<img width="509" height="461" alt="image" src="https://github.com/user-attachments/assets/cca70f98-9eca-49e0-b759-a465aaedc0da" />

<img width="439" height="145" alt="image" src="https://github.com/user-attachments/assets/13ef1e47-8534-4400-bc18-5671511a05b8" />

#### hasil running

<img width="277" height="467" alt="image" src="https://github.com/user-attachments/assets/5fd9a84f-f18a-4d50-86c9-f86fb3532994" />

<img width="247" height="301" alt="image" src="https://github.com/user-attachments/assets/438b7faa-6716-48d0-92e5-cb0fbe9c6dd0" />


