package sancrisxa.com.br.teste;

import sancrisxa.com.br.Vetor;

public class Aula04 {
    public static void main(String[] args) {

        Vetor vetorOtimizado = new Vetor(10);
        try {
            vetorOtimizado.adicionaOtimizado("elemento 1");
            vetorOtimizado.adicionaOtimizado("elemento 2");
            vetorOtimizado.adicionaOtimizado("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetorOtimizado.getTamanho());

        System.out.println(vetorOtimizado);
    }
}
