/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.List;

public class disciplina {
   
    private String nome;
    private String horario;

    private List<professor> professores;
    private List<turma> turmas;
    private List<aluno> alunos;

    public disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

  
    public void exibirGradeDeHorario() {}

    public void exibirProfessores() {}
}

