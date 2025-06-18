import java.util.Scanner;

class Customer {
    private int id;
    private String name;
    private String city;

    // Default constructor
    public Customer() {
        this.id = 0;
        this.name = "Unknown";
        this.city = "Unknown";
    }

    // Parameterized constructor
    public Customer(String name, int id, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Setters
    public void setCustomerId(int id) {
        this.id = id;
    }

    public void setCustomerName(String name) {
        this.name = name;
    }

    public void setCustomerCity(String city) {
        this.city = city;
    }

    // toString method to display customer info
    public String toString() {
        return "Customer ID: " + id + "\nCustomer Name: " + name + "\nCustomer City: " + city + "\n";
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First customer using default constructor
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println();

        Customer c1 = new Customer(); // default constructor invoked
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println("Customer 1 Details:\n" + c1);

        // Second customer using parameterized constructor
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        Customer c2 = new Customer(name, id, city); // parameterized constructor invoked
        System.out.println("Customer 2 Details:\n" + c2);

        sc.close();
    }
}
