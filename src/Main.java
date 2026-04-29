import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book = new Book();

        int answer = 0;

        while (answer != 3) {
            System.out.println("Welcome to your phonebook!");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");

            answer = in.nextInt();
            in.nextLine(); // clear buffer

            switch (answer) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = in.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = in.nextLine();

                    book.addContact(name, phone);

                    break;

                case 2:
                    System.out.println(book.viewContacts());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    // book.saveToFile(); (later)
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
            }

            System.out.println(); // spacing
        }

        in.close();
    }
}