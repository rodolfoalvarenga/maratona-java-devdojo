package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {

    /*
    Crie um sistema que gerencia seminários

    O sistema deverar cadastrar seminários, estudantes, professores e local onde será realizado

    Um aluno poderá estar em apenas um seminário
    Um seminário poderá ter nenhum ou vários alunos
    Um professor poderá ministrar vários seminários
    Um seminário deve ter um local

    Campos básicos (excluindo relacionamento)
    seminário: título
    aluno: nome e idade
    professor: nome, especialidade
    local: endereço
     */

    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");

        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }

}
