package sancrisxa.com.br.teste;

import sancrisxa.com.br.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");


        Vetor vetorOtimizado = new Vetor(2);
        try {
            vetorOtimizado.adicionaOtimizado("elemento 1");
            vetorOtimizado.adicionaOtimizado("elemento 2");
            vetorOtimizado.adicionaOtimizado("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
