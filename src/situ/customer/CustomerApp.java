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
            System.out.println();

            Customer c = CustomerDB.getCustomer(num);

            String message = c.getName() + "\n" + c.getAddress() + "\n" + c.getCity() + ", " + c.getState() + " " + c.getPostalCode();
            System.out.println(message);
            System.out.println();

            System.out.print("Display another customer? (y/n): ");
            System.out.print("");
            choice = sc.nextLine();
            System.out.println();

	


        }
    }

}
