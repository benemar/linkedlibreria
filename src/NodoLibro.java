public class NodoLibro {
private Libro libro;
private NodoLibro next;

 // costruttore
    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.next = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoLibro getNext() {
        return next;
    }

    public void setNext(NodoLibro next) {
        this.next = next;
    }


}
