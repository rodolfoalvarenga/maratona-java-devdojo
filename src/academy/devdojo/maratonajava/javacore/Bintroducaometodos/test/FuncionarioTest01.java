package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    /* Crie uma classe Funcionario com os seguintes atributos

    nome
            idade
    salario // três salários devem ser guardados

    Crie dois métodos

    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
    }
}
