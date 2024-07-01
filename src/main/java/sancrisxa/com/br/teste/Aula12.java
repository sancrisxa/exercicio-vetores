package sancrisxa.com.br.teste;

import sancrisxa.com.br.Lista;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        int pos = arrayList.indexOf("B");

        if (pos > -1) {
            System.out.println("Elemento existe no array" + pos);
        } else {
            System.out.println("Elemento não existe no array" + pos);
        }

        int posD = arrayList.indexOf("D");

        if (posD > -1) {
            System.out.println("Elemento existe no array" + posD);
        } else {
            System.out.println("Elemento não existe no array" + posD);
        }

        System.out.println(arrayList.get(2));

        System.out.println(arrayList.size());

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        Lista<String> listaString = new Lista<>(3);

        listaString.adicionaBooleano("A");
        listaString.adicionaBooleano("B");
        listaString.adicionaBooleano("C");

        System.out.println(listaString);

        boolean resultado = listaString.contem("B");

        System.out.println(resultado);

        resultado = listaString.contem("E");

        System.out.println(resultado);


    }
}
