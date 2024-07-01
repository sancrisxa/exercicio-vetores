package sancrisxa.com.br.teste;

import sancrisxa.com.br.Contato;
import sancrisxa.com.br.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetorObjetos = new VetorObjetos(3);

        vetorObjetos.adicionaBooleano(3);
        vetorObjetos.adicionaBooleano(4);
        vetorObjetos.adicionaBooleano(5);

        System.out.println("Tamanho = " + vetorObjetos.getTamanho());
        System.out.println(vetorObjetos);

        VetorObjetos vetorObjetosString = new VetorObjetos(3);

        vetorObjetosString.adicionaBooleano("3");
        vetorObjetosString.adicionaBooleano("4");
        vetorObjetosString.adicionaBooleano("5");

        System.out.println("Tamanho = " + vetorObjetosString.getTamanho());
        System.out.println(vetorObjetosString);


        Contato c1 = new Contato("Contato 1", "1234-456", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2234-456", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3234-456", "contato3@email.com");
        Contato c4 = new Contato("Contato 4", "4234-456", "contato4@email.com");

        VetorObjetos vetorObjetosContatos = new VetorObjetos(3);
        vetorObjetosContatos.adicionaBooleano(c1);
        vetorObjetosContatos.adicionaBooleano(c2);
        vetorObjetosContatos.adicionaBooleano(c3);

        System.out.println("Tamanho = " + vetorObjetosContatos.getTamanho());
        System.out.println(vetorObjetosContatos);

        int pos = vetorObjetosContatos.buscaElegante(c1);

        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }


        int pos4 = vetorObjetosContatos.buscaElegante(c4);

        if (pos4 > -1) {
            System.out.println("Elemento 4 existe no vetor");
        } else {
            System.out.println("Elemento 4 não existe no vetor");
        }


    }
}
