package sancrisxa.com.br.labs;

import sancrisxa.com.br.Lista;

public class Exerc01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionaBooleano("A");
        lista.adicionaBooleano("B");
        lista.adicionaBooleano("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
