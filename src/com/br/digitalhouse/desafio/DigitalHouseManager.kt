package com.br.digitalhouse.desafio

class DigitalHouseManager {
    var listaAluno = mutableListOf<Aluno>()
    var listaProfessorAdjunto = mutableListOf<ProfessorAdjunto>()
    var listaProfessorTitular = mutableListOf<ProfessorTitular>()
    var listaCurso = mutableListOf<Curso>()
    var listaMatricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, cdCurso: Int, qtdeMaxAluno: Int){
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
        listaProfessorAdjunto.add(ProfessorAdjunto(nome, sobrenome, cdProfessor, qtdHrMonitoria))
        println("Professor adjunto cadastrado com sucesso!")

    }
    fun registrarProfessorTitular(nome: String , sobrenome: String, cdProfessor: Int, tpCasa: Int, especialidade: String){
        listaProfessorTitular.add(ProfessorTitular(nome, sobrenome, cdProfessor, tpCasa, especialidade ))
        println("Professor titular cadastrado com sucesso!")

    }
    fun excluirProfessor(cdProfessor: Int){
        if(cdProfessor in listaProfessorAdjunto){
            listaProfessorAdjunto.remove(listaProfessorAdjunto.get(cdProfessor))
            println("Esse professor foi removido com sucesso")

        }else if(cdProfessor in listaProfessorTitular){
            listaProfessorTitular.remove(listaProfessorTitular.get(cdProfessor))
            println("Esse professor foi removido com sucesso")
        }
        println("Professor não encontrado")

    }
    fun matricularAluno(cdAluno: Int, cdCurso: Int){


    }
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){

    }
}