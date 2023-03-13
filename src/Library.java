import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    ArrayList<Book> bookList;
    Scanner scanner;

    public Library() {
        bookList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("Ingresa el título del libro:");
        String name = scanner.nextLine();

        System.out.println("Ingresa el autor o la autora del libro:");
        String author = scanner.nextLine();

        System.out.println("Ingresa el año de publicación:");
        int year = scanner.nextInt();

        bookList.add(new Book(name, author, year));
    }

    public void findByAuthor() {
        System.out.println("Ingresa el autor o la autora del libro:");
        String author = scanner.nextLine();

        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + ", " + book.year);
            }
        }
    }

    public void printAll() {
        System.out.println("Un total de " + bookList.size() + " libros encontrados.");
        for (Book book : bookList) {
            System.out.println(book.getAuthor() + " " + book.getTitle() + ", " + book.getYear());
        }
    }

}
