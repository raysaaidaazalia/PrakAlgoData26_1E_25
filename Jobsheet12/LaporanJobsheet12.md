# Laporan praktikum 12 DoubleLinkedList 

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1

#### code program

##### class Mahasiswa25

<img width="560" height="260" alt="image" src="https://github.com/user-attachments/assets/2f079fd7-4111-4184-9892-64d68c8cd7c7" />

##### class Node25

<img width="341" height="209" alt="image" src="https://github.com/user-attachments/assets/c02ad8d4-36a2-4ff1-8fc9-78bcd742a378" />

##### class DoubleLinkedList25

<img width="410" height="460" alt="image" src="https://github.com/user-attachments/assets/b2133432-b159-4932-ad3e-51b328fe61e7" />

<img width="438" height="467" alt="image" src="https://github.com/user-attachments/assets/dfb7004a-8e42-4b97-8ce9-6729f3a8cfe0" />

<img width="463" height="391" alt="image" src="https://github.com/user-attachments/assets/509fe4cb-c705-4c87-a0a8-571a4c94e4db" />

##### class DoubleLinkedListMain25

<img width="535" height="460" alt="image" src="https://github.com/user-attachments/assets/fd87bccd-4e29-4bd7-bd3d-04a3db78a8e5" />

<img width="419" height="439" alt="image" src="https://github.com/user-attachments/assets/631dee59-ca2b-4996-b478-1ad7c4d1d278" />


### Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!

##### = jika single linked list pointer nya hanya satu setelah Node,jika double linked list pointernya ada 2 di sebelah kanan dan sebelah kiri Node.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!

##### = next digunakan untuk menyimpan alamat Node selanjutnya atau digunakan untuk maju,prev digunakan untuk menyimpan Node sebelumnya atau digunakan untuk mundur

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!

<img width="209" height="53" alt="image" src="https://github.com/user-attachments/assets/13a47ec1-a273-43be-8014-a5e644ca168b" />

##### = kode tersebut digunakan untuk menginisialisasi Linked list dengan keadaan kosong,yang artinya Linked list belum memiliki Node sama sekali

4. Perhatikan potongan kode berikut:
if (isEmpty()) {
 head = tail = newNode;
}
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?

##### = Karena Node tersebut menjadi Node pertama dan terakhir,sehingga head dan tail harus merujuk pada Node yang sama.

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika
tidak terdapat data pada linked list!

<img width="302" height="136" alt="image" src="https://github.com/user-attachments/assets/7cbd4270-bad5-4de8-b557-472e5f51f03b" />

6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!

<img width="363" height="148" alt="image" src="https://github.com/user-attachments/assets/be0d89fd-1a51-4567-9e7c-b55e12b8db3c" />

## Percobaan 2

#### code program

<img width="406" height="269" alt="image" src="https://github.com/user-attachments/assets/631f34c6-94bc-43db-afa1-1904cf477ae8" />

#### hasil running

<img width="347" height="351" alt="image" src="https://github.com/user-attachments/assets/439055d9-5d37-4775-8ff2-de8c831b2f94" />

### Pertanyaan

1.Perhatikan potongan kode berikut pada method removeFirst():
head = head.next;
head.prev = null;
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

##### = head = head.next gunanya untuk memindahkan posisi head ke Node selanjutnya
##### = head.prev = null gunanya untuk menghapus hubungan Node baru dengan Node lama dan menandakan bahwa Node baru sekarang menjadi Node lama.

2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data
yang berhasil dihapus!

<img width="439" height="358" alt="image" src="https://github.com/user-attachments/assets/766093e1-a90e-417e-a241-1f618ccbe9cb" />

## Tugas

1.Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks
tertentu!

<img width="301" height="248" alt="image" src="https://github.com/user-attachments/assets/99aaaf57-5d65-4fad-8529-e9d3ff50cb1f" />

2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data
key tertentu!

<img width="422" height="324" alt="image" src="https://github.com/user-attachments/assets/348fbf0b-e5d6-495d-b8b8-83ca27e18ec9" />

3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!

<img width="425" height="322" alt="image" src="https://github.com/user-attachments/assets/937eb0f6-e30a-431b-b33b-de51ca221d5a" />

4. Tambahkan method:
a. getFirst()
b. getLast()
c. getIndex()
untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu.

<img width="334" height="341" alt="image" src="https://github.com/user-attachments/assets/3f009450-996b-4ce4-a61b-5279bc5dbe4c" />

5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List

<img width="175" height="72" alt="image" src="https://github.com/user-attachments/assets/4170aa5f-d3f9-451f-baf2-a2287178bf31" />

<img width="224" height="170" alt="image" src="https://github.com/user-attachments/assets/5998588c-6070-49ff-9305-c06d382e7fd6" />

#### code program 

##### class DoubleLinkedlist25

<img width="373" height="463" alt="image" src="https://github.com/user-attachments/assets/b8c21f1b-09ef-40fd-a836-31d5c2212b47" />

<img width="473" height="491" alt="image" src="https://github.com/user-attachments/assets/71d17e56-0719-4824-af4d-3e4c914dc9e7" />

<img width="455" height="467" alt="image" src="https://github.com/user-attachments/assets/cdbb58df-7544-4448-8ad7-e81918aca8c9" />

<img width="453" height="458" alt="image" src="https://github.com/user-attachments/assets/155affc2-603c-4a10-b771-f3fb3d5531c0" />

<img width="491" height="464" alt="image" src="https://github.com/user-attachments/assets/2291ba53-6b64-46e5-819c-937ea3283ce4" />

<img width="337" height="448" alt="image" src="https://github.com/user-attachments/assets/cd2d178e-8eb1-4d4a-b600-4d477932eeef" />

##### DoubleLinkedlistMain25

<img width="355" height="470" alt="image" src="https://github.com/user-attachments/assets/a2b7b4c6-13be-4288-829e-3733e2c659ee" />

<img width="212" height="430" alt="image" src="https://github.com/user-attachments/assets/4e7f9827-37b2-4b23-80f8-84d2e5db3ed8" />

#### hasil running
   
 <img width="292" height="469" alt="image" src="https://github.com/user-attachments/assets/b9bcef70-6d91-4726-8403-8687dcf7e664" />
