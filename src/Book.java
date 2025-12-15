public class Book implements Comparable<Book> {
    private String tittle;

    public Book(String tittle) {
        this.tittle = tittle;
    }

    public int compareTo(Book o) {
        return tittle.compareTo(o.tittle);
    }

    public String toString() {
        return tittle;
    }

    public String getTittle() {
        return tittle;
    }
}
