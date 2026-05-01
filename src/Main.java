public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Código Limpo (Traduzido)", "978-0132350884");

        System.out.println("Mesmo ISBN, títulos diferentes: " + l1.equals(l2));

        System.out.println("Comparando com null: " + l1.equals(null));
        System.out.println("Comparando com uma String: " + l1.equals("978-0132350884"));

        /*

         SÃO IGUAIS COM TÍTULOS DIFERENTES?
         Sim. Como o critério no equals() é apenas o ISBN, o Java retornará 'true'.
         Isso é útil para identificar o mesmo produto em edições ou traduções diferentes.

         LANÇA EXCEÇÃO COM NULL OU STRING?
         Não. O uso do 'instanceof' protege o código. Se o objeto for null ou
         de outro tipo (como String), o 'instanceof' retorna 'false' e o
         método encerra graciosamente sem causar um NullPointerException.

         POR QUE COMPARAMOS PELO ISBN E NÃO PELO TÍTULO?
         O ISBN é um IDENTIFICADOR ÚNICO universal (como um CPF para livros).
         Títulos podem se repetir ou ter variações (ex: "Java" vs "Java: 2ª Edição"),
         mas o ISBN garante que estamos falando do mesmo registro técnico.
         Em sistemas reais, sempre usamos chaves primárias ou IDs únicos para equals.
         */
    }
}