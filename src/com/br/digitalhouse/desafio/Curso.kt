package com.br.digitalhouse.desafio

class Curso (val nomeCurso: String, val cdCurso: Int, val qtdeMaxAluno: Int){
    var professorTitular = ProfessorTitular("", "", "")
    var professorAdjunto = ProfessorAdjunto("", "", )
    var listaAlunoMatriculados = mutableListOf<Aluno>()


}