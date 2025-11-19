/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.List;


public class turma { 

    private String identificador;
    private List<aluno> alunos;
    private String horario;
    private String local;
    private List<professor> professores;

    public turma(String identificador, String horario, String local) {
        this.identificador = identificador;
        this.horario = horario;
        this.local = local;
    }

 
    public void definirLimiteDeAlunos() {}

    public void inserirProfessoresNaTurma(professor professor) {
        professores.add(professor);
    }

    public void inserirAlunosNaTurma(aluno aluno) {
        alunos.add(aluno);
    }

    public void removerProfessoresNaTurma(professor professor) {
        professores.remove(professor);
    }

    public void removerAlunosNaTurma(aluno aluno) {
        alunos.remove(aluno);
    }
}

