package com.letscode.dependenciasExternas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Escola letsCode = new Escola();
        Turma java = new Turma("java");
        Turma bancoDeDados = new Turma("banco de dados");

        letsCode.addTurma(java);
        letsCode.addTurma(bancoDeDados);

        java.addAluno("Alexandre Martins");
        java.addAluno("Vitor Hugo Lima");
        java.addAluno("Esther Rodrigues");
        java.addAluno("Lavínia Cunha");
        java.addAluno("Natália Gomes");
        java.addAluno("Yago Ramos");
        java.addAluno("Letícia Cunha");
        java.addAluno("Ana Júlia Ramos");
        java.addAluno("Pietra Martins");
        java.addAluno("Thomas Peixoto");
        java.addAluno("Thales Farias");

        System.out.println("================================");
        System.out.println("ALUNOS DA TURMA " + java.getNomeDaTurma().toUpperCase(Locale.ROOT));
        System.out.println("================================");
        java.imprimirAlunosDaTurma();

        bancoDeDados.addAluno("Vitor Hugo Lima");
        bancoDeDados.addAluno("Esther Rodrigues");
        bancoDeDados.addAluno("Nathan Nascimento");
        bancoDeDados.addAluno("Lavínia Cunha");
        bancoDeDados.addAluno("Natália Gomes");
        bancoDeDados.addAluno("Lavínia Lopes");
        bancoDeDados.addAluno("Yago Ramos");
        bancoDeDados.addAluno("Letícia Cunha");
        bancoDeDados.addAluno("Luiz Miguel Azevedo");
        bancoDeDados.addAluno("Ana Júlia Ramos");
        bancoDeDados.addAluno("Thales Farias");
        bancoDeDados.addAluno("Alana Porto");

        System.out.println("================================");
        System.out.println("ALUNOS DA TURMA " + bancoDeDados.getNomeDaTurma().toUpperCase(Locale.ROOT));
        System.out.println("================================");
        bancoDeDados.imprimirAlunosDaTurma();


        try {
            FileWriter outputPath = new FileWriter("docs/listadealunos-saida.txt");
            BufferedWriter saida = new BufferedWriter(outputPath);
            for(Turma turma: letsCode.turmasDaEscola){
                saida.write("================================");
                saida.newLine();
                saida.write("ALUNOS DA Turma " + turma.getNomeDaTurma().toUpperCase(Locale.ROOT));
                saida.newLine();
                saida.write(String.valueOf("Total de alunos na turma: " + turma.getAlunos().size()));
                saida.newLine();

                for(Aluno aluno: turma.getAlunos()){
                    saida.write(aluno.getNomeDoAluno());
                    saida.newLine();
                }
            }
            saida.newLine();
            saida.write("================================");
            saida.newLine();
            saida.write("Alunos da Escola: ");
            saida.newLine();

            saida.write(String.valueOf("Total de alunos da escola: " + letsCode.totalDeAlunos()));
            saida.newLine();
            for(Aluno alunoEscola: letsCode.alunosDaEscola()){
                saida.write(alunoEscola.getNomeDoAluno());
                saida.newLine();
            }
            saida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
