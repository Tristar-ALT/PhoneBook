import java.util.Scanner;
void main() {
    int answer = 0;
    while (answer != 3) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to your phonebook!\nType '1' to add a new contact.\nType '2' to view your contacts\nType '3' to exit.");
        answer = in.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        switch (answer) {
            case (1): {
                /* Adding To Be Implemented */
            }
            case (2): {
                /* Viewing to be implemented */
            }
            case (3): {
                /* Exiting to be implemented */
            }
            default: {
                /* Rewind to be implemented */
            }
        }
    }
}