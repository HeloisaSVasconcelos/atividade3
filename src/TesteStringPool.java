public class TesteStringPool {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);       // Saída: true
        System.out.println(a == c);       // Saída: false
        System.out.println(a.equals(c));  // Saída: true

        /*

         POR QUE (a == b) RETORNA TRUE?
         Em Java, o operador "==" compara a REFERÊNCIA (o endereço de memória).
         Como ambas as variáveis foram criadas como literais ("Java"), o Java
         as coloca no String Pool e faz 'b' apontar para o mesmo endereço de 'a'.

         POR QUE (a == c) RETORNA FALSE?
         O comando 'new String("Java")' força a criação de um NOVO objeto na
         memória Heap, fora do String Pool. Portanto, 'a' e 'c' apontam para
         lugares diferentes, mesmo tendo o mesmo texto.

         O QUE É O STRING POOL?
         O String Pool (Piscina de Strings) é uma área especial de memória dentro
         da Heap onde o Java armazena literais de String. O objetivo é a
         ECONOMIA DE MEMÓRIA e PERFORMANCE, evitando criar múltiplos objetos
         idênticos para o mesmo texto.

         CONCLUSÃO:
         Use .equals() para comparar o CONTEÚDO (o texto em si).
         Use == apenas se quiser saber se são exatamente o MESMO OBJETO.
         */
    }
}