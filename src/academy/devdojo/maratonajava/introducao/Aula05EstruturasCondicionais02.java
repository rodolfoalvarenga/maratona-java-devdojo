package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);

        // não é recomendado agrupar operador ternário
        String categoriaTernario = idade < 15 ? "Categoria Infantil" : idade >=15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoriaTernario);
    }
}
