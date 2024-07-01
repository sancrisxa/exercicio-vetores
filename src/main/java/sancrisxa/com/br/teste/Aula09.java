package sancrisxa.com.br.teste;

import sancrisxa.com.br.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionaBooleano("B");
        vetor.adicionaBooleano("C");
        vetor.adicionaBooleano("E");
        vetor.adicionaBooleano("F");
        vetor.adicionaBooleano("G");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento E");

        int pos = vetor.buscaElegante("E");

        if (pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);

        System.out.println("Remover o elemento A");

        int pos2 = vetor.buscaElegante("A");

        if (pos2 > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);


    }
}
