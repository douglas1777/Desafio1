package com.br.digitalhouse.desafio

open class ProfessorTitular(nome: String, sobrenome: String, tpCasa: Int, cdProfessor: Int, val especialidade: String) : Professor(
    nome, sobrenome,
    tpCasa
) {
}