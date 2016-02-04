package situ.customer;
import java.util.Scanner;
public class CustomerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner (System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String num = sc.nextLine();

            Customer c = CustomerDB.getCustomer(num);

            String message = c.getName() + "\n" + c.getAddress() + "\n" + c.getCity() + ", " + c.getState() + " " + c.getPostalCode();
            System.out.println(message);

            System.out.print("Display another customer? (y/n): BBBBBBBBBBBBBBBBBBBBBB");
            choice = sc.nextLine();
            System.out.println();


        }
    }

}
