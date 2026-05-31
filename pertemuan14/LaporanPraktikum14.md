# Laporan praktikum 14 tree

#### Nama : Raysha aida azalia
#### NIM : 254107020024
#### Kelas : TI 1E

## Percobaan 1

#### code program

##### class Mahasiswa25

<img width="1244" height="827" alt="Screenshot 2026-05-31 101431" src="https://github.com/user-attachments/assets/f4cd018b-db82-4ba0-9956-1537ee2fd2d1" />

##### class Node25

<img width="810" height="521" alt="Screenshot 2026-05-31 104625" src="https://github.com/user-attachments/assets/9544c9e3-e3b4-41f5-8922-66b5051c3ab5" />

##### class Binarytree25

<img width="693" height="938" alt="Screenshot 2026-05-31 104724" src="https://github.com/user-attachments/assets/b1f78e8c-ec70-4f8e-be12-43a26926d1fb" />

<img width="577" height="961" alt="Screenshot 2026-05-31 104751" src="https://github.com/user-attachments/assets/5b25ff6d-467c-4b6d-bcbd-dd6f916510d1" />

<img width="692" height="952" alt="Screenshot 2026-05-31 104807" src="https://github.com/user-attachments/assets/6883145c-309b-4c37-98a5-4b5621d4a9a8" />

<img width="580" height="275" alt="Screenshot 2026-05-31 104818" src="https://github.com/user-attachments/assets/e4f2cf40-0b76-444a-bac2-b1b1dfc32497" />

##### class BinaryTreeMain25

<img width="1107" height="869" alt="image" src="https://github.com/user-attachments/assets/3c1a951d-5d28-48d5-8bf8-b3e2f86cf232" />

#### hasil running

<img width="698" height="938" alt="Screenshot 2026-05-31 104905" src="https://github.com/user-attachments/assets/9f9ce17a-30e7-463e-8d60-1a8c00950374" />

###  Pertanyaan

1.Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?

##### = Karena di binary search tree data di susun terurut,mulai dari nilai paling kecil di sebelah kiri lalu nilai paling besar berada di sebelah kanan.Jadi saat mencari data 
tidak perlu cek semua node satu-satu.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

##### = atribut left dan right gunanya untuk menyimpan hubungan antar node left untuk menunjuk anak kiri sedangkan right untuk menunjuk anak kanan,jadi setiap node tersambung ke node di bawah

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

##### = root adalah node yang paling atas, semua proses biasanya mulai dari root

b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

##### = nilai root akan null, karena tree masih kosong dan belum ada data yang masuk.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

##### = akan terjadi pembuatan node baru dan itu akan menjadi root karena baru ada satu data.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?

<img width="798" height="387" alt="Screenshot 2026-05-31 105019" src="https://github.com/user-attachments/assets/9e671b59-f600-4aa6-ba51-4d94351338a8" />

##### = Pada method add(), program membandingkan data baru dengan data pada node saat ini. Kalau nilainya lebih kecil data akan ditempatkan ke kiri. Kalau lebih besar akan ditempatkan ke kanan. Proses ini dilakukan terus sampai menemukan tempat kosong. Tujuannya supaya susunan binary search tree tetap terurut.

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua
anak. Bagaimana method getSuccessor() membantu dalam proses ini?

##### = Jika node yang dihapus punya 2 anak, program akan mencari pengganti dari subtree kanan yaitu nilai yang paling kecil. Pencarian ini dilakukan oleh method getSuccessor(). Setelah ditemukan, nilai tersebut menggantikan node yang dihapus. Setelah itu node penggantinya dihapus dari posisi lama.

## Percobaan 2

#### code program

#####  class binaryTreeArray25

<img width="725" height="674" alt="image" src="https://github.com/user-attachments/assets/ccf96f44-cd57-4310-9900-2d18a041ec43" />

##### class binaryTreeArrayMain25

<img width="1196" height="628" alt="image" src="https://github.com/user-attachments/assets/c62af949-f4c0-4221-a033-86cceb4ae7b5" />

#### hasil running

<img width="881" height="273" alt="image" src="https://github.com/user-attachments/assets/c2245a18-158f-4eb5-8976-28ed4f03d1b0" />

### Pertanyaan

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

##### = atribut data untuk menyimpan seluruh node binary tree dalam bentuk array,Jadi data mahasiswa disimpan di setiap indeks array.
##### = atribut idxLast untuk menandai index terakhir yang terisi data.

2. Apakah kegunaan dari method populateData()?

##### = Method populateData() digunakan untuk mengisi data ke array binary tree sekaligus menyimpan informasi indeks terakhir yang terisi. Jadi method ini membantu memasukkan seluruh data mahasiswa ke dalam tree yang berbentuk array.

3. Apakah kegunaan dari method traverseInOrder()?

##### = Method traverseInOrder() digunakan untuk menampilkan isi binary tree dengan urutan kiri ke root lalu ke kanan,Jadi program akan membaca anak kiri terlebih dahulu, lalu node utama, kemudian anak kanan. jadi data akan urut

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan right child masing-masing?

##### = Kalau suatu node berada di indeks 2, maka posisi anak kirinya ada di indeks 5 dengan rumus 2 * i + 1, dan anak kanannya ada di indeks 6 dengan rumus 2 * i + 2.

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

##### = int idxLast = 6 digunakan untuk menunjukkan bahwa indeks terakhir yang berisi data ada di indeks ke-6. Jadi program tahu batas akhir data yang akan dibaca saat traversal dan tidak memproses array yang masih kosong.

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan
rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?

##### =Indeks 2*idxStart+ 1 digunakan untuk mencari posisi anak kiri, sedangkan 2*idxStart+2 untuk anak kanan. Rumus ini dipakai karena binary tree disimpan dalam array. Tujuannya agar hubungan antara parent, anak kiri, dan anak kanan tetap terurut.

### Tugas

1. Buat method di dalam class BinaryTree00 yang akan menambahkan node dengan cara rekursif (addRekursif()).

<img width="775" height="496" alt="image" src="https://github.com/user-attachments/assets/d378e0a4-70bb-4f50-9886-5f5af70abedb" />

2. Buat method di dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK
paling kecil dan IPK yang paling besar (cariMinIPK() dan cariMaxIPK()) yang ada di dalam
binary search tree.

<img width="742" height="514" alt="image" src="https://github.com/user-attachments/assets/a7e4863c-449e-42f0-874f-6cdb396e45ab" />

3. Buat method dalam class BinaryTree00 untuk menampilkan data mahasiswa dengan IPK di
atas suatu batas tertentu, misal di atas 3.50 (tampilMahasiswaIPKdiAtas(double ipkBatas))
yang ada di dalam binary search tree.

<img width="865" height="450" alt="image" src="https://github.com/user-attachments/assets/50cddcaa-1815-4195-8fa7-a7b4a9f7f559" />

4. Modifikasi class BinaryTreeArray00 di atas, dan tambahkan :
• method add(Mahasiswa data) untuk memasukkan data ke dalam binary tree
• method traversePreOrder()

<img width="855" height="512" alt="image" src="https://github.com/user-attachments/assets/9384ee09-2163-424b-b307-5b3cea788c60" />

##### = untuk main nya binaryTreeMain25

<img width="967" height="325" alt="image" src="https://github.com/user-attachments/assets/3bcc189e-5ecb-454d-a6f3-c912e6e4a41e" />

##### = untuk main nya binaryTreeArrayMain25

<img width="984" height="179" alt="image" src="https://github.com/user-attachments/assets/fe3d7577-45d8-4e2e-923a-5dfadd7fa8ed" />

#### hasil running BinaryTreeMain25 untuk tugas saja

<img width="714" height="264" alt="image" src="https://github.com/user-attachments/assets/20881e87-e476-4f82-9bee-3b0f3308895d" />

#### hasil running BinaryTreeArrayMain25 untuk tugas

<img width="718" height="504" alt="image" src="https://github.com/user-attachments/assets/c39db7ce-cd82-401d-a9ca-cc4976b2a6e4" />
