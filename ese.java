class Book {
    String bookId;
    String title;
    String author;

    void input(String b, String t, String a) {
        this.bookId = b;
        this.title = t;
        this.author = a;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class AudioBook extends Book {
    double length;
    String narrator;

    void input(String bookId, String title, String author, double length, String narrator) {
        super.input(bookId, title, author);
        this.length = length;
        this.narrator = narrator;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Length: " + length + " hours");
        System.out.println("Narrator: " + narrator);
    }
}

public class ese {
    public static void main(String[] args) {
        AudioBook[] audioBooks = new AudioBook[3];

        audioBooks[0] = new AudioBook();
        audioBooks[0].input("001", "Book Title 1", "Author 1", 5.5, "Narrator 1");

        audioBooks[1] = new AudioBook();
        audioBooks[1].input("002", "Book Title 2", "Author 2", 7.0, "Narrator 2");

        audioBooks[3] = new AudioBook();
        audioBooks[3].input("004", "meow", "Al Baraa", 8.0, "Al Baraa");

        audioBooks[2] = new AudioBook();
        audioBooks[2].input("003", "Book Title 3", "Author 3", 6.2, "Narrator 3");

        AudioBook longestAudioBook = audioBooks[0];
        for (int i = 1; i < audioBooks.length; i++) {
            if (audioBooks[i].length > longestAudioBook.length) {
                longestAudioBook = audioBooks[i];
            }
        }

        System.out.println("The audiobook with the highest length:");
        longestAudioBook.display();
    }
}
