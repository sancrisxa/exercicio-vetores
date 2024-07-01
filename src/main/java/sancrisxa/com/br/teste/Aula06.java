package sancrisxa.com.br.teste;

import sancrisxa.com.br.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionaBooleano("elemento01");
        vetor.adicionaBooleano("elemento02");
        vetor.adicionaBooleano("elemento03");

        System.out.println(vetor.buscaElegante("elemento01"));
    }
}
