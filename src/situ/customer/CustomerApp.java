package situ.customer;
import java.util.Scanner;
public class CustomerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner (System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter a customer number: ");
            String num = sc.nextLine();
            System.out.println();

            Customer c = CustomerDB.getCustomer(num);

            if (c.getName().equals("Unknown")){
                    System.out.println("There is no customer number "+ num +" in our records.\n" );
                }
            else {
                String message = c.getNameAndAddress();
                System.out.println(message);
                System.out.println();

            }
            System.out.print("Display another customer? (y/n): ");
            System.out.print("");
            choice = sc.nextLine();
            System.out.println();

	


        }
    }

}
