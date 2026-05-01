public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);

        System.out.println(p1);

        System.out.println("Item: " + p2);

        /*
          O QUE MUDOU NA SAÍDA?
          Agora, em vez de aparecer o endereço de memória (Produto@hash),
          aparece o conteúdo legível formatado:
          Produto{nome='Caneta', preco=2.5}

          O toString() É CHAMADO AUTOMATICAMENTE NA CONCATENAÇÃO?
          Sim. Quando fazemos "Texto" + objeto, o Java invoca o método
          toString() do objeto por trás das cenas para transformar o
          objeto em uma representação textual.

          CONCLUSÕES:
          O método toString() é chamado automaticamente em:
          - System.out.println(objeto)
          - Concatenação com Strings usando o operador "+"
          - Visualização de variáveis durante o Debug (o IDE usa o toString
            para mostrar o valor do objeto no painel).
         */
    }
}