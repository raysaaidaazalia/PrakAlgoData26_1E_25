package pertemuan14;

public class Binarytree25 {
    Node25 root25;

    public Binarytree25() {
        root25 = null;
    }

    public boolean isEmpty25() {
        return root25 == null;
    }

    public void add25(mahasiswa25 mahasiswa) {
        Node25 newNode25 = new Node25(mahasiswa);
        if (isEmpty25()) {
            root25 = newNode25;
        } else {
            Node25 current25 = root25;
            Node25 parent25 = null;
            while (true) {
                parent25 = current25;
                if (mahasiswa.ipk25 < current25.mahasiswa.ipk25) {
                    current25 = current25.left25;
                    if (current25 == null) {
                        parent25.left25 = newNode25;
                        return;
                    }
                } else {
                    current25 = current25.right25;
                    if (current25 == null) {
                        parent25.right25 = newNode25;
                        return;
                    }
                }
            }
        }
    }

    boolean find25(Double ipk25) {
        boolean result25 = false;
        Node25 current25 = root25;

        while (current25 != null) {
            if (Double.compare(current25.mahasiswa.ipk25, ipk25) == 0) {
                result25 = true;
                break;
            } else if (ipk25 > current25.mahasiswa.ipk25) {
                current25 = current25.right25;
            } else {
                current25 = current25.left25;
            }
        }

        return result25;
    }

    void traversePreOrder25(Node25 node25) {
        if (node25 != null) {
            node25.mahasiswa.tampilInformasi();
            traversePreOrder25(node25.left25);
            traversePreOrder25(node25.right25);
        }
    }

    void traverseInOrder25(Node25 node25) {
        if (node25 != null) {
            traverseInOrder25(node25.left25);
            node25.mahasiswa.tampilInformasi();
            traverseInOrder25(node25.right25);
        }
    }

    void traversePostOrder25(Node25 node25) {
        if (node25 != null) {
            traversePostOrder25(node25.left25);
            traversePostOrder25(node25.right25);
            node25.mahasiswa.tampilInformasi();
        }
    }

    Node25 getSuccessor25(Node25 del25) {
        Node25 successor25 = del25.right25;
        Node25 successorParent25 = del25;
        while (successor25.left25 != null) {
            successorParent25 = successor25;
            successor25 = successor25.left25;
        }
        if (successor25 != del25.right25) {
            successorParent25.left25 = successor25.right25;
            successor25.right25 = del25.right25;
        }
        return successor25;
    }

    void delete25(double ipk25) {
        if (isEmpty25()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node current yang akan di hapus
        Node25 current25 = root25;
        Node25 parent25 = root25;
        boolean isLeftChild25 = true;
        while (current25 != null) {
            if (current25.mahasiswa.ipk25 == ipk25) {
                break;
            } else if (ipk25 < current25.mahasiswa.ipk25) {
                parent25 = current25;
                current25 = current25.left25;
                isLeftChild25 = true;
            } else if (ipk25 > current25.mahasiswa.ipk25) {
                parent25 = current25;
                current25 = current25.right25;
                isLeftChild25 = false;
            }
        }
        // penghapusan
        if (current25 == null) {
            System.out.println("data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf) maka node dihapus
            if (current25.left25 == null && current25.right25 == null) {
                if (current25 == root25) {
                    root25 = null;
                } else {
                    if (isLeftChild25) {
                        parent25.left25 = null;
                    } else {
                        parent25.right25 = null;
                    }
                }
            } else if (current25.left25 == null) { // jika hanya punya 1 anak kanan
                if (current25 == root25) {
                    root25 = current25.right25;
                } else {
                    if (isLeftChild25) {
                        parent25.left25 = current25.right25;
                    } else {
                        parent25.right25 = current25.right25;
                    }
                }
            } else if (current25.right25 == null) { // jika hanya punya 1 anak kiri
                if (current25 == root25) {
                    root25 = current25.left25;
                } else {
                    if (isLeftChild25) {
                        parent25.left25 = current25.left25;
                    } else {
                        parent25.right25 = current25.left25;
                    }
                }
            } else { // jika punya 2 anak
                Node25 successor25 = getSuccessor25(current25);
                System.out.println("jika punya 2 anak, current = ");
                current25.mahasiswa.tampilInformasi();
                if (current25 == root25) {
                    root25 = successor25;
                } else {
                    if (isLeftChild25) {
                        parent25.left25 = successor25;
                    } else {
                        parent25.right25 = successor25;
                    }
                }
                successor25.left25 = current25.left25;
            }
        }
    }
void addRekursif(mahasiswa25 data25) {
    root25 = addRekursif(root25, data25);
}

Node25 addRekursif(Node25 current, mahasiswa25 data25) {
    if (current == null) {
        return new Node25(data25);
    }

    if (data25.ipk25 < current.mahasiswa.ipk25) {
        current.left25 = addRekursif(current.left25, data25);
    } else if (data25.ipk25 > current.mahasiswa.ipk25) {
        current.right25 = addRekursif(current.right25, data25);
    }

    return current;
}
Node25 cariMinIPK() {
    Node25 current = root25;

    while (current.left25 != null) {
        current = current.left25;
    }

    return current;
}
Node25 cariMaxIPK() {
    Node25 current = root25;

    while (current.right25 != null) {
        current = current.right25;
    }

    return current;
}
void tampilMahasiswaIPKdiAtas(Node25 node, double ipkBatas) {
    if (node != null) {

        tampilMahasiswaIPKdiAtas(node.left25, ipkBatas);

        if (node.mahasiswa.ipk25 > ipkBatas) {
            node.mahasiswa.tampilInformasi();
        }

        tampilMahasiswaIPKdiAtas(node.right25, ipkBatas);
    }
}


}
