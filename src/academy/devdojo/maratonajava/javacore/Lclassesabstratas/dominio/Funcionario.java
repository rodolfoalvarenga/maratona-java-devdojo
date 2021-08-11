package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {

    /*
    * Classe abstrata pode ter método concreto e/ou abstrato
    * Porém, método abstrato só podem existir em classe abstrata
    * e os métodos abstratos DEVEM ser implementados nas sub classes
    * */

    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

}
