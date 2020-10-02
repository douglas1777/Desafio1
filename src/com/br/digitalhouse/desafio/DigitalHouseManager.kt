package com.br.digitalhouse.desafio

import java.time.LocalDate

class DigitalHouseManager {
    var listaAluno = mutableListOf<Aluno>()
    var listaProfessorAdjunto = mutableListOf<ProfessorAdjunto>()
    var listaProfessorTitular = mutableListOf<ProfessorTitular>()
    var listaCurso = mutableListOf<Curso>()
    var listaMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, cdCurso: Int, qtdeMaxAluno: Int){
        val curso = Curso(nome, cdCurso, qtdeMaxAluno)
        println("""Curso $nome criado com sucesso!
            |Código do curso: $cdCurso
            |Quantidade máxima de alunos: $qtdeMaxAluno
        """.trimMargin())
        listaCurso.add(Curso(nome, cdCurso, qtdeMaxAluno))


    }
    fun excluirCurso(cdCurso: Int){
        for(verifica in listaCurso) {
           if(verifica.cdCurso == cdCurso) {
               listaCurso.remove(verifica)
           }
        }

    }
    fun registrarProfessorAdjunto(nome: String , sobrenome: String , cdProfessor: Int, qtdHrMonitoria: Int){
        val PAdjunto = ProfessorAdjunto(nome, sobrenome, cdProfessor, qtdHrMonitoria )
        println("""Professor Adjunto cadastrado com sucesso!
            |Nome: $nome
            |Sobrenome: $sobrenome
            |Código de professor: $cdProfessor
            |Quantidades de horsas de monitoria: $qtdHrMonitoria
        """.trimMargin())
        listaProfessorAdjunto.add(PAdjunto)


    }
    fun registrarProfessorTitular(nome: String , sobrenome: String, cdProfessor: Int, tpCasa: Int, especialidade: String){
        val PTitular = ProfessorTitular(nome, sobrenome, cdProfessor, tpCasa, especialidade )
        println("""Professor Adjunto cadastrado com sucesso!
            |Nome: $nome
            |Sobrenome: $sobrenome
            |Código de professor: $cdProfessor
            |Quantidades de horsas de monitoria: $especialidade
        """.trimMargin())
        listaProfessorTitular.add(PTitular)

    }
    fun excluirProfessor(cdProfessor: Int){
        for(buscaAdjunto in listaProfessorAdjunto){
        if(buscaAdjunto == listaProfessorAdjunto){
            listaProfessorAdjunto.remove(buscaAdjunto)
            println("Esse professor $buscaAdjunto foi removido com sucesso")
            break

        }
        for (buscaTitular in listaProfessorTitular)
        if(buscaTitular in listaProfessorTitular){
            listaProfessorTitular.remove(buscaTitular)
            println("Esse professor $buscaTitular foi removido com sucesso")
        }
        println("Professor não encontrado")

    }}
    fun resgistrarAluno(nome: String, sobrenome: String, cdAluno: Int){
        val aluno = Aluno(nome, sobrenome, cdAluno)
        println("""======================================
|Aluno $nome Registrado com Sucesso!
            |Nome copleto: $nome $sobrenome
            |Código de aluno: $cdAluno
            |====================================
        """.trimMargin())
        listaAluno.add(aluno)



    }
     fun matricularAlunoCurso(cdAluno: Int, cdCurso: Int){
         //pesquisando pelo aluno
         var matricula = Matricula(aluno = )
         for( buscaAluno  in listaAluno){
             if(buscaAluno.cdAluno ==  cdAluno){

                 println(buscaAluno)
                 for (buscaCurso in listaCurso){
                     if (buscaCurso.cdCurso==cdCurso)
                         println(buscaAluno)


                 }
                 println("Aluno não encontrado")



             }

         }
     }







    fun alocarProfessores(cdCurso: Int, cdProfessorTitular: Int, cdProfessorAdjunto: Int){

    }
}