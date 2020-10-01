package com.br.digitalhouse.desafio

data class Curso (val nomeCurso: String, val cdCurso: Int, val qtdeMaxAluno: Int, val professorAdjunto: ProfessorAdjunto = null!!, val professorTitular: ProfessorTitular = null!!){

    var listaAlunoMatriculados = mutableListOf<Aluno>()


    fun addAluno(umAluno: Aluno): Boolean {
        if(listaAlunoMatriculados.size <= qtdeMaxAluno){
            listaAlunoMatriculados.add(umAluno)
            return true
        }
        return false
    }
    fun excluirAluno (umAluno: Aluno){
        if(umAluno in listaAlunoMatriculados )
        listaAlunoMatriculados.remove(umAluno)
    }


}