import java.util.Arrays;

public class Book {
    private String[][] book;

    public Book(String[][] book) {
        this.book = book;
    }

    public Book() {
        book = new String[0][2];
    }

    public void addContact(String name, String number) {
        String[][] temp = Arrays.copyOf(book, book.length+1);
        temp[book.length] = new String[]{name, number};
        book = temp;
    }

    public String viewContacts() {
        String complete = "Contacts:\n";
        for (String[] i : book) {
            complete = complete + "\nName: " + i[0] + "\nNumber: " + i[1];
        }
        return complete;
    }
}
