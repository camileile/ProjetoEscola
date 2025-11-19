/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

/**
 *
 * @author CAMILEDAANUNCIAÇÃOLI
 */
public class colaborador {
    
     private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String cargo;
    private double salario;

    public colaborador(String nome, String cpf, int idade, String genero, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;
    }


    public void verificarEscalaDeTrabalho() {
        System.out.println("Escala do colaborador" + nome + "ainda não definida");
    }

    public void baterPonto() {
        System.out.println(nome + "bateu o ponto com sucesso.");
    }
}

