package ar.fiuba.tdd.template;


/**
 * Created by cristian on 01/09/16.
 */

public class NodoNull<T> implements Nodo<T> {

    public int size() {

        return 0;
    }

    public void setLast(Queue<T> cola, T item) {
        System.out.print("Hola la cola quiere agregar un elemento pero está vacio\n ");
        cola.addNodoIsEmpty(item);
    }

    public Nodo<T> getLast(Nodo<T> nodo) {
        return nodo;
    }

    public Nodo<T> next() {

        throw new AssertionError();
    }

    public T getDate() {

        throw new AssertionError();
    }

    public void setNext(Nodo<T> nodo) {
    }


}
