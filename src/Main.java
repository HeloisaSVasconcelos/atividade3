public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2);       // Saída: false
        System.out.println(l1.equals(l2));  // Saída: false

        /*

          POR QUE (l1 == l2) É FALSE?
          Porque o operador '==' compara referências de memória. Como usamos
          'new' duas vezes, o Java criou dois objetos em locais diferentes
          da memória Heap, mesmo que os dados internos sejam idênticos.

          POR QUE l1.equals(l2) TAMBÉM RETORNA FALSE SEM OVERRIDE?
          Por padrão, a classe Object (de onde Livro herda) implementa o método
          .equals() usando exatamente o operador '=='.

          Ou seja, para o Java "padrão", a igualdade é a mesma coisa que a
          identidade de memória. Se você não escrever o seu próprio método
          .equals() na classe Livro comparando os atributos (titulo e isbn),
          o Java não tem como saber que dois livros com o mesmo ISBN devem
          ser considerados o "mesmo" livro.

          CONCLUSÃO:
          Para que .equals() retorne true em objetos customizados, é obrigatório
          sobrescrever (@Override) o método equals() e definir a regra de negócio
          da comparação (ex: comparar se os ISBNs são iguais).
         */
    }
}