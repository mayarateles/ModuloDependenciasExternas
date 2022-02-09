package com.letscode.dependenciasExternas;

import lombok.Getter;

import java.util.*;

@Getter
public class Escola {
    Set<Turma> turmasDaEscola = new HashSet<>();

    void addTurma(Turma turma){
        turmasDaEscola.add(turma);
    }

    int totalDeAlunos(){
        return alunosDaEscola().size();
    }

    SortedSet<Aluno> alunosDaEscola() {
        SortedSet<Aluno> todosAlunos = new TreeSet<>();
        for(Turma turma: turmasDaEscola) {
            todosAlunos.addAll(turma.getAlunos());
        }
        return todosAlunos;
    }

}
