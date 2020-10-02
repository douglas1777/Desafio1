package com.br.digitalhouse.desafio

class Aluno (override val nome: String, override val sobrenome: String, val cdAluno: Int): Pessoa {
    var aluno = Aluno("Pedro", "Ricardo", 1)
}