package sancrisxa.com.br.labs;

import sancrisxa.com.br.Lista;

public class Exerc04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionaBooleano("A");
        lista.adicionaBooleano("B");
        lista.adicionaBooleano("C");
        lista.adicionaBooleano("D");
        lista.adicionaBooleano("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
