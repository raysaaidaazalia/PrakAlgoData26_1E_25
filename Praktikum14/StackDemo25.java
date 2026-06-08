package Praktikum14;
import java.util.Stack;

public class StackDemo25 {
    public static void main(String[] args) {

        Book25 book1 = new Book25("1234", "Dasar Pemrograman");
        Book25 book2 = new Book25("7145", "Hafalah Shalat Delisa");
        Book25 book3 = new Book25("3562", "Muhammad Al-Fatih");

        Stack<Book25> books = new Stack<>();

        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book25 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book25 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book25 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);

        System.out.println("Posisi Book1 = "
                + books.search(book1));
    }
}
