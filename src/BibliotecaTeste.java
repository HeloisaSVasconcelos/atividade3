import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
        HashSet<Livro> biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println("Tamanho da biblioteca: " + biblioteca.size());

        /*

          RODADA A (Com equals e hashCode):
          Saída: 1
          Por quê? O HashSet usa o hashCode para encontrar a "gaveta" onde o objeto
          deveria estar e o equals para confirmar se já existe um livro igual lá.
          Como ambos estão implementados usando o ISBN, o HashSet detecta que l2
          é uma duplicata e não o adiciona.

          RODADA B (Sem hashCode - apenas equals):
          Saída: 2
          Por quê? Embora os livros sejam "iguais" pelo equals, eles geram hashCodes
          diferentes (baseados no endereço de memória padrão). O HashSet coloca l1
          e l2 em "gavetas" diferentes. Como ele só chama o equals se os objetos
          caírem na mesma gaveta, ele nunca percebe que são duplicatas.

          O QUE O HASHSET USA PARA DETECTAR DUPLICATAS?
          Ele usa a combinação dos dois:
          1. Primeiro o hashCode(): Para busca rápida de onde o objeto pode estar.
          2. Depois o equals(): Para ter certeza absoluta de que o conteúdo é igual.
         */
    }
}