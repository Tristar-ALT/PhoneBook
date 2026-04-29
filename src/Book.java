import java.util.Arrays;

public class Book {
    private String[][] book;

    public Book(String[][] book) {
        this.book = book;
    }

    public Book() {
        book = new String[10][2];
    }

    public void addContact(String name, String number) {
        String[][] temp = Arrays.copyOf(book, book.length+1);
        temp[book.length] = new String[]{name, number};
        book = temp;
    }
}
