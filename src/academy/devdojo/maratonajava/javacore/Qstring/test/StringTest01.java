package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {

        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome.concat(" Suane");
        System.out.println(nome); // a imutabilidade das Strings não deixa o valor ser trocado, a não ser que crie um nova variável de referência
        nome = nome.concat(" Suane"); // nome += " Suane";
        System.out.println(nome);
        System.out.println(nome == nome2); // as duas variáveis estão fazendo referência para o mesmo objeto em memória
        // criando variável no heap de memória
        // 1 variável de referência, 2 objeto do tipo String, 3 uma String no pool de String
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // pega a referência dentro do pool de String

    }

}
