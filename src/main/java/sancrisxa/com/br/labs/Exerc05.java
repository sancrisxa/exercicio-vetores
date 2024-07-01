package sancrisxa.com.br.labs;

import sancrisxa.com.br.Lista;

import java.util.ArrayList;

public class Exerc05 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);

        Lista<String> lista = new Lista<>(5);

        lista.adicionaBooleano("A");
        lista.adicionaBooleano("B");
        lista.adicionaBooleano("C");
        lista.adicionaBooleano("D");
        lista.adicionaBooleano("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);
    }
}
