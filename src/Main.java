public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado Mecânico", 250.00);
        Produto p2 = new Produto("Mouse Gamer", 150.00);

        System.out.println(p1);
        System.out.println(p2);

        /*
          SAÍDA NO CONSOLE:
          Produto@15db9742
          Produto@6d06d69c

          O QUE APARECE?
          Aparece o nome da classe seguido de um símbolo "@" e um código
          hexadecimal (que representa o hashcode do objeto na memória).

          É LEGÍVEL?
          Não é legível para um usuário final ou para entender o conteúdo do objeto.
          Ele não mostra o "nome" ou o "preço", apenas a referência do objeto na JVM.
         */
    }
}