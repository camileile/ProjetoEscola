/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.List;

public class aluno {
    


    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String responsavel;
    private double[] notas = new double[4];
    private String matricula;

    private List<disciplina> disciplinas;
    private turma turma;

    public aluno(String nome, String cpf, int idade, String genero, String responsavel, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.responsavel = responsavel;
        this.matricula = matricula;
    }


    public void setNotas(double[] notas) {
        this.notas = notas;
    }

   
    public void verSuasNotas() {}

    public void consultarFrequencias() {}

    public void consultarHistorico() {}

    public void consultarComprovanteMatricula() {}

    public void consultarGradeDeHorario() {}

    
    }

