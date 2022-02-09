package com.letscode.dependenciasExternas;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Turma implements Serializable {

    private String nomeDaTurma;
    private int codigoDaTurma;
    private static int cont = 0;

    private List<Aluno> alunos = new ArrayList<>();



    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
        this.codigoDaTurma = cont++;

    }
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    public void addAluno(String nomeDoAluno){
        Aluno aluno = new Aluno(nomeDoAluno);
        alunos.add(aluno);
    }

    public void imprimirAlunosDaTurma (){
        Collections.sort(alunos, Collections.reverseOrder());
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).toString());
            System.out.println();
        }

    }

}
