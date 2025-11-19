/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.List;


public class escola {



    private List<professor> professores;
    private List<turma> turmas;
    private List<aluno> alunos;
    private List<colaborador> colaboradores;
    private String nome;
    private String diretor;

 
    public escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
    }

    // Métodos
    public void matricularAluno(aluno aluno) {
        alunos.add(aluno);
    }

    public void expulsarAluno(aluno aluno) {
        alunos.remove(aluno);
    }

    public void orientarAluno(aluno aluno) {
        
    }

    public void contratarProfessor(professor professor) {
        professores.add(professor);
    }

    public void demitirProfessor(professor professor) {
        professores.remove(professor);
    }

    public void suspenderProfessor(professor professor) {
        
    }

    public void contratarColaborador(colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public void demitirColaborador(colaborador colaborador) {
        colaboradores.remove(colaborador);
    }

    public void suspenderColaborador(colaborador colaborador) {
        
    }

    public void definirEscalaColaborador(colaborador colaborador) {
     
    }
}

