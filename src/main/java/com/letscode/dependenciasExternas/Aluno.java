package com.letscode.dependenciasExternas;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Aluno implements Serializable, Comparable<Aluno>{
    private String nomeDoAluno;
    private int matriculaDoAluno;


    public Aluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;

    }

    public String toString() {
        return "Nome: " + this.nomeDoAluno;
    }

    @Override
    public int compareTo(Aluno nome) {
        return nome.getNomeDoAluno().compareTo(this.getNomeDoAluno());
    }

}
