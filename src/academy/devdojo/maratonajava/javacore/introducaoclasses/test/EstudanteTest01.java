package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Variável de referência do tipo Estudante com o objeto também do tipo Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // Imprimindo apenas a variável de referêcia
        // você tem o endereço de memória da mesma como retorno
        // ou seja, o espaço em memória que o objeto está localizado
        System.out.println(estudante);
    }
}
