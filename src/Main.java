import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

              GestioneLibreria libreria = new GestioneLibreria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Aggiungi un libro");
            System.out.println("2. Rimuovi un libro");
            System.out.println("3. Ricerca libri per titolo");
            System.out.println("4. Ricerca Libri per ISBN");
            System.out.println("5. Mostra tutti i libri");
            System.out.println("6. Exit");
            System.out.print("Inserisci la scelta: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Inserisci il titolo: ");
                    String title = scanner.nextLine();
                    System.out.print("Inserisci l'autore: ");
                    String author = scanner.nextLine();
                    System.out.print("Inserisci ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Inserisci l'anno: ");
                    String year = scanner.next();
                    scanner.nextLine();
                    libreria.aggiungiLibro(new Libro(year,isbn,author,title));
                    break;
                case 2:
                    System.out.print("Inserisci ISBN del libro da rimuovere: ");
                    isbn = scanner.nextLine();
                    libreria.elimina(isbn);
                    break;
                case 3:
                    System.out.print("Inserisci il titolo del libro: ");
                    title = scanner.nextLine();
                    libreria.ricercaPerTitolo(title);
                    break;
                case 4:
                    System.out.print("Inserisci ISBN del libro da cercare: ");
                    isbn = scanner.nextLine();
                    libreria.ricercaPerIsbn(isbn);
                    break;
                case 5:
                    libreria.visualizzaLibri();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Codice errato. Riprova.");
                    break;
            }
        }
    }
}




