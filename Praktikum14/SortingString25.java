package Praktikum14;

import java.util.ArrayList;

public class SortingString25 {
    public static void main(String[] args) {

        ArrayList<Customer25> Customer25 = new ArrayList<>();

        Customer25.add(new Customer25(1, "Zainab"));
        Customer25.add(new Customer25(2, "Andi"));
        Customer25.add(new Customer25(3, "Rara"));

        Customer25.sort((c1, c2) -> c1.name25.compareTo(c2.name25));

        System.out.println(Customer25);
    }
}
