public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Código Limpo", "978-0132350884");
        Livro l3 = new Livro("Java Efetivo", "978-0134685991");

        System.out.println("ISBNs iguais:");
        System.out.println("HashCode L1: " + l1.hashCode());
        System.out.println("HashCode L2: " + l2.hashCode());
        System.out.println("L1.equals(L2)? " + l1.equals(l2));
        System.out.println("HashCodes são iguais? " + (l1.hashCode() == l2.hashCode()));

        System.out.println("\n--------------------------\n");

        System.out.println("ISBNs diferentes:");
        System.out.println("HashCode L1: " + l1.hashCode());
        System.out.println("HashCode L3: " + l3.hashCode());
        System.out.println("HashCodes são diferentes? " + (l1.hashCode() != l3.hashCode()));

        /*

          MESMO ISBN: Os hashCodes são idênticos. Como 'l1.equals(l2)' é true,
          o contrato exige que os códigos sejam os mesmos.

         SBNS DIFERENTES: Os hashCodes são diferentes. Embora seja tecnicamente
          possível que dois objetos diferentes tenham o mesmo hash (chamado de colisão),
          o ideal é que objetos diferentes gerem códigos diferentes.

          POR QUE ISSO É IMPORTANTE?
          Imagine um HashMap como um armário cheio de gavetas numeradas. O hashCode()
          diz ao Java em qual gaveta colocar o objeto. Se você tem dois objetos
          que o equals() diz que são "iguais", mas eles dão hashCodes (gavetas)
          diferentes, o Java nunca vai conseguir encontrar seu objeto no armário!
         */
    }
}