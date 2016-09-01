package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */

public interface Nodo<T> {

    int size();

    void setLast(Queue<T> cola, T item);

    Nodo<T> getLast(Nodo<T> nodo);

    Nodo<T> next();

    T getDate();

    void setNext(Nodo<T> nodo);

}
