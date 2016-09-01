package ar.fiuba.tdd.template;


/**
 * Created by cristian on 01/09/16.
 */

public class NodoQueue<T> implements Nodo<T> {
    private Nodo<T> next = new NodoNull();
    private T date;

    public NodoQueue(T date_new) {
        this.date = date_new;
    }

    public int size() {
        return 1 + this.next.size();
    }

    public void setLast(Queue<T> cola, T item) {
        System.out.print("Hola la cola quiere agregar un elemento pero no está vacio \n ");
        cola.addNodoIsNotEmpty(item);
    }

    public Nodo<T> getLast(Nodo<T> nodo) {

        return this.next.getLast(this);
    }

    public T getDate() {
        return this.date;
    }

    public Nodo<T> next() {
        return this.next;
    }

    public void setNext(Nodo<T> nodo) {
        this.next = nodo;
    }

}
