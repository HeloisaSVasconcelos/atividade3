class Livro {
    String titulo;
    String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Se os objetos apontam para o mesmo endereço de memória, são iguais
        if (this == obj) return true;

        // 2. Se o objeto passado é nulo ou não é do tipo Livro, são diferentes
        if (!(obj instanceof Livro)) return false;

        // 3. Cast para Livro para poder acessar os atributos
        Livro outro = (Livro) obj;

        // 4. Critério de igualdade: comparação do ISBN
        return this.isbn != null && this.isbn.equals(outro.isbn);
    }
}