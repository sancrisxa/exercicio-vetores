package sancrisxa.com.br.labs;

import sancrisxa.com.br.Lista;

import java.util.ArrayList;

public class Exerc02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<>(5);
        lista.adicionaBooleano("A");
        lista.adicionaBooleano("B");
        lista.adicionaBooleano("C");
        lista.adicionaBooleano("A");

        System.out.println( lista.ultimoIndice("A"));

        System.out.println( lista.ultimoIndiceOtimizado("A"));
    }
}
