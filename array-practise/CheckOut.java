import java.util.Scanner;
import java.util.ArrayList;


public class CheckOut {

    static ArrayList<Object[]> records = new ArrayList<>();
    static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.print("""
                1 => Enter customer details 

                2 => Show customer invoice

                3 => print receipt
                """);

        System.out.print("Enter any options from above:");
        String choice = input.nextLine();
        String more = "";

        switch (choice) {
            case "1":
                do {
                    System.out.print("Enter customer's name? ");
                    String name = input.nextLine();

                    System.out.print("Enter product purchased? ");
                    String product = input.nextLine();

                    System.out.print("Enter product price? ");
                    int price = input.nextInt();
                    
                    Object[] customerRecord = {name, product, price};
                    records.add(customerRecord);

                    System.out.println("Current Records:");
                    for (Object[] record : records) {
                        System.out.println(Arrays.toString(record));
                    }

                    System.out.print("Do you wish to continue (yes/no)? ");
                    more = input.nextLine();
                } while (more.equalsIgnoreCase("yes"));
                break;
            case "2":
                System.out.println("Showing customer invoice .");
                break;
            case "3":
                System.out.println("Printing receipt.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }
           }
}