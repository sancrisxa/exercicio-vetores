package sancrisxa.com.br.teste;

import sancrisxa.com.br.Vetor;

public class Aula07 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionaBooleano("B");
        vetor.adicionaBooleano("C");
        vetor.adicionaBooleano("E");
        vetor.adicionaBooleano("F");
        vetor.adicionaBooleano("G");

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);

        vetor.adiciona(3, "D");

        System.out.println(vetor);

    }
}
