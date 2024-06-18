public class Libro {
  // proprieta
  private String titolo;
  private String autore;
  private String isbn;
  private String annoPubblicazione;

  // costruttore


    public Libro(String annoPubblicazione, String isbn, String autore, String titolo) {
        this.annoPubblicazione = annoPubblicazione;
        this.isbn = isbn;
        this.autore = autore;
        this.titolo = titolo;
    }
    // non usero i set

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", isbn='" + isbn + '\'' +
                ", annoPubblicazione='" + annoPubblicazione + '\'' +
                '}';
    }
}
