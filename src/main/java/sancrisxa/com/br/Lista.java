package sancrisxa.com.br;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public void adiciona(T elemento) {

        this.aumentaCapacidade();

        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public boolean adiciona(int posicao, T elemento) {

        this.aumentaCapacidade();

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;


        return true;
    }

    public void adicionaOtimizado(T elemento) throws Exception {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível dicionar mais elementos.");
        }
    }

    public boolean adicionaBooleano(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {

            throw new IllegalArgumentException("Posição inválida!");
        }

        return this.elementos[posicao];
    }

    public int ultimoIndice(T elemento) {
        int pos = -1;

        for (int i =0; i < this.elementos.length; i++) {
            if (this.elementos[i] == elemento) {
                pos = i;
            }
        }

        return pos;
    }

    public int ultimoIndiceOtimizado(T elemento) {

        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i] == elemento) {
                return  i;
            }
        }

        return -1;
    }

    public boolean contem(T element) {

        int pos = this.buscaElegante(element);

        if (pos > -1) {
            return true;
        }

        return false;
    }

    public boolean busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    public int buscaElegante(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    public void remove(T elemento) {
        int pos = this.buscaElegante(elemento);

        if (pos > -1) {
            this.remove(pos);
        }
    }

    public void limpar() {
        // this.elementos = (T[]) new Object[this.elementos.length];

        // this.tamanho = 0;

        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }

        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i =0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
