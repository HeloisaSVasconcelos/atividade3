// Classe ValidadorSenha.java
public class ValidadorSenha {
    public static void main(String[] args) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        /*
        if (tentativa == senhaCorreta) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); 
        }
        */

        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }

        /*

          O QUE APARECE NA VERSÃO COM '=='?
          Aparece "Acesso negado".

          POR QUE O ACESSO É NEGADO MESMO COM A SENHA CORRETA?
          Porque o operador '==' compara o endereço de memória dos objetos.
          'senhaCorreta' foi criada com 'new String', o que garante um novo objeto
          na memória Heap. 'tentativa' é um literal no String Pool. Como estão
          em endereços diferentes, o Java entende que NÃO são o mesmo objeto.

          QUAL O RISCO DE USAR '==' COM STRINGS EM SISTEMAS REAIS?
          O risco é a imprevisibilidade. Em alguns casos, devido ao String Pool,
          o '==' pode funcionar por coincidência (se ambas vierem de literais).
          Porém, se o dado vier de um banco de dados, de um formulário web ou
          de um arquivo, ele será um novo objeto na memória e o '==' falhará.
          Isso pode causar falhas graves de segurança (bloqueio de usuários
          legítimos) ou erros de lógica difíceis de rastrear.
         */
    }
}