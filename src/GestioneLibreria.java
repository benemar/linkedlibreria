public class GestioneLibreria {
    private NodoLibro head;

    // costruttore
    public GestioneLibreria() {
        this.head = null;
    }

    // metodi di gestione della linkedlist
    //Metodo per aggiungere un libro

    // aggiungo in testa
    // creo il nodo di testa
    public void addAtHead(Libro dato){
        // creo il nodo
        NodoLibro newNodo = new NodoLibro(dato);
        // faccio si che il valore del nuovo nodo punti alla testa della lista
        newNodo.setNext(head);
        // punto all'indirizzo di memoria della testa
        head = newNodo;
        //l'attrib head viene aggiornato per puntare al nuovo nodo
        // il nuovo nodo diventa il primo elemento della lista
    }




   public void aggiungiLibro (Libro libro){
      NodoLibro newNodo = new NodoLibro(libro)  ;
      if (head ==null){

          // punto all'indirizzo di memoria della testa
          head = newNodo;
          //l'attrib head viene aggiornato per puntare al nuovo nodo
          // il nuovo nodo diventa il primo elemento della lista
      }
      NodoLibro corrente = head;
      // controllo se la lista ha dei nodi all'intterno
      while (corrente.getNext()!= null){
          corrente = corrente.getNext();
      }
      //trovo il primo nodo con indirizzo null
        corrente.setNext(newNodo);

   }

   // stampa libri
   // stampa libri
   public void visualizzaLibri() {
       if (head == null) {
           System.out.println("Libreria vuota");
       } else {
           NodoLibro corrente = head;
           while (corrente != null) {
               System.out.println(corrente.getLibro());
               corrente = corrente.getNext();
           }
       }
   }


    // eliminiamo ul libro
    public void elimina(String isbn) {
        // lista vuota
        if (head == null) {
            System.out.println("Libreria vuota");
            return;
        }
        // controllo se il libro è il primo della lista
        if (head.getLibro().getIsbn().equals(isbn)) {
            head = head.getNext();
            System.out.println("Libro con ISBN " + isbn + " eliminato");
            return;
        }
        NodoLibro corrente = head;
        while (corrente.getNext() != null) {
            if (corrente.getNext().getLibro().getIsbn().equals(isbn)) {
                // salto l'oggetto libro nel nodo con l'isbn trovato
                corrente.setNext(corrente.getNext().getNext());
                System.out.println("Libro con ISBN " + isbn + " eliminato");
                return;
            }
            corrente = corrente.getNext();
        }
        System.out.println("Libro con ISBN " + isbn + " non trovato");
    }

    @Override
    public String toString() {
        return "GestioneLibreria{" +
                "head=" + head +
                '}';
    }

    public void ricercaPerTitolo(String titolo) {
        NodoLibro corrente = head;
        while (corrente != null) {
            if (corrente.getLibro().getTitolo().equalsIgnoreCase(titolo)) {
                System.out.println("Libro trovato: " + corrente.getLibro());
                return;
            }
            corrente = corrente.getNext();
        }
        System.out.println("Libro con titolo '" + titolo + "' non trovato");
    }

    public void ricercaPerIsbn(String isbn) {
        NodoLibro corrente = head;
        while (corrente != null) {
            if (corrente.getLibro().getIsbn().equals(isbn)) {
                System.out.println("Libro trovato: " + corrente.getLibro());
                return;
            }
            corrente = corrente.getNext();
        }
        System.out.println("Libro con ISBN '" + isbn + "' non trovato");
    }
}
