package sancrisxa.com.br.labs;

import sancrisxa.com.br.Lista;

public class Exerc03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionaBooleano("A");
        lista.adicionaBooleano("B");
        lista.adicionaBooleano("C");
        lista.adicionaBooleano("D");
        lista.adicionaBooleano("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);

    }
}
