package Praktikum14;
import java.util.ArrayList;

public class DemoArrayList25 {
    public static void main(String[] args) {

        ArrayList<Customer25> customers = new ArrayList<>(2);

        Customer25 customer1 = new Customer25(1, "Zakia");
        Customer25 customer2 = new Customer25(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer25(4, "Cica"));
    
        customers.add(2, new Customer25(100,"Rosa"));

        System.out.println("Index customer2 = "
                + customers.indexOf(customer2));

        Customer25 customer = customers.get(1);
        System.out.println(customer.name25);
        customer.name25 = "Budi Utomo";

        for (Customer25 cust25: customers) {
            System.out.println(cust25.toString());
        }

        ArrayList<Customer25> newCustomers = new ArrayList<>();

        newCustomers.add(new Customer25(201, "Della"));
        newCustomers.add(new Customer25(202, "Victor"));
        newCustomers.add(new Customer25(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer25 cust : customers) {
            System.out.println(cust.toString());
        }

       
        System.out.println(customers);
    }
}
