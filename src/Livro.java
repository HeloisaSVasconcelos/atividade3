import java.util.Objects;

class Livro {
    String titulo;
    String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livro)) return false;
        Livro outro = (Livro) obj;
        return Objects.equals(this.isbn, outro.isbn);
    }

    @Override
    public int hashCode() {
        // O campo usado deve ser o mesmo do equals para manter o contrato
        return Objects.hash(isbn);
    }
}