import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            printMenu();

            int command = scanner.nextInt();
            if (command == 0) {
                System.out.println("Salir.");
                break;
            } else if (command == 1) {
                library.addBook();
            } else if (command == 2) {
                library.findByAuthor();
            } else if (command == 3) {
                library.printAll();
            } else {
                System.out.println("Lo siento, hasta ahora tal comando no existe.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("¿Qué te gustaría hacer? ");
        System.out.println("1 - Agregar el libro.");
        System.out.println("2 - Buscar los libros de un autor o una autora."");
        System.out.println("3 - Ver la lista de libros.");
        System.out.println("0 - Salir.");
    }

}
