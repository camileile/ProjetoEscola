package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjetoEscolar {

    public static void main(String[] args) {
        
       
        System.out.println("PROJETO ESCOLAR");
       
        
       
        Escola minhaEscola = new Escola("Colegio Galileu", "Dr. Pedro diretor");
        System.out.println("Escola criada: " + minhaEscola.getNome() + " (Diretor: " + minhaEscola.getDiretor() + ")");

        
        Aluno alunoMaria = new Aluno("Maria da Silva", "123.456.789-10", 16, "F", "João Roberto", "2024001");
        
        
        Professor profLuiz = new Professor("Prof. Luiz Gustavo", "222.222.222-22", 40, "M", 3000.00);
        
       
        Colaborador colaAna = new Colaborador("Ana Souza", "333.333.333-33", 35, "F", "Secretaria", 2500.00);
        
        
        Disciplina discMatematica = new Disciplina("Matematica", "Seg/Qua 10:00");
        Disciplina discPortugues = new Disciplina("Portugues", "Ter/Qui 08:00");
        Disciplina discIngles = new Disciplina ("Ingles","Sex 11:00");

      
        Turma turma3A = new Turma("3A - Medio", "Manha", "Sala 15");
        
        
        
        
        System.out.println("MeTODOS DA ESCOLA");
        
        
        minhaEscola.matricularAluno(alunoMaria); 
        minhaEscola.orientarAluno(alunoMaria);

       
        minhaEscola.contratarProfessor(profLuiz);
        minhaEscola.suspenderProfessor(profLuiz); 
        minhaEscola.demitirProfessor(profLuiz); 
        minhaEscola.contratarProfessor(profLuiz);
        
  
        minhaEscola.contratarColaborador(colaAna);
        minhaEscola.definirEscalaColaborador(colaAna);
        minhaEscola.suspenderColaborador(colaAna);
        minhaEscola.demitirColaborador(colaAna); 
        minhaEscola.contratarColaborador(colaAna);


        
        
        
        
       
        List<Professor> professoresMat = new ArrayList<>();
        professoresMat.add(profLuiz);
        discMatematica.setProfessores(professoresMat);
        
       
        turma3A.inserirAlunosNaTurma(alunoMaria);
        turma3A.inserirProfessoresNaTurma(profLuiz);
        
      
        alunoMaria.setTurma(turma3A);
        List<Disciplina> disciplinasMaria = Arrays.asList(discMatematica, discPortugues, discIngles);
        alunoMaria.setDisciplinas(disciplinasMaria);
        
        
        
        
        System.out.println( "METODOS DO ALUNO");
        
        alunoMaria.consultarComprovanteMatricula(); 
        alunoMaria.consultarFrequencias(); 
        alunoMaria.consultarGradeDeHorario(); 
        alunoMaria.consultarHistorico(); 
        alunoMaria.verSuasNotas(); 
        
       
        
        System.out.println(" METODOS DO PROFESSOR");
        
        profLuiz.verificarDisciplinas(); 
        profLuiz.verificarCronogramaDisciplinas(); 
        
        
        double[] notasAluno = {8.0, 7.5, 9.0, 8.5};
        profLuiz.inserirNotas(alunoMaria, notasAluno); 
        
       
        profLuiz.colocarPresenca(alunoMaria); 
        profLuiz.verificarPresenca(alunoMaria); 
        profLuiz.definirSituacaoAcademica(alunoMaria);
        
       
        System.out.println("Notas de Maria depois de inserir:");
        alunoMaria.verSuasNotas(); 


        
        
        System.out.println("METODOS DO COLABORADOR");
        
        colaAna.baterPonto(); 
        colaAna.verificarEscalaDeTrabalho(); 
        
        
        
        
        System.out.println("METODOS DA DISCIPLINA E TURMA");
        
        discMatematica.exibirGradeDeHorario();
        discMatematica.exibirProfessores(); 
        
        turma3A.definirLimiteDeAlunos(); 
        turma3A.removerAlunosNaTurma(alunoMaria); 
        
        
       
       
    }
}
