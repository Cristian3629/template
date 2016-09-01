package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */

public class Queue<T> {
    private Nodo<T> first;

    public Queue() {

        first = new NodoNull();
    }

    //----------------------Interfaz solicitada----------------------
    public boolean isEmpty() {

        return this.first.size() == 0;
    }

    public int size() {
        return this.first.size();
    }

    public void add(T item) {
        System.out.print("Hola quiero agregar un elemento\n ");
        this.first.setLast(this, item);
    }

    //Si es un NodoNUll esto lanza una excepcion directamente
    public void remove() {
        this.first = this.first.next();
    }


    public void removeNotEmpty() {
        this.first = this.first.next();
    }

    public T top() {

        return this.first.getDate();
    }


    public void addNodoIsEmpty(T item) {
        System.out.print("cambie el primer elemento\n ");
        this.first = new NodoQueue<T>(item);
    }

    //solo llamo a getLast si se que la cola esta vacia
    private Nodo<T> getLast() {
        return this.first.getLast(this.first);
    }

    public void addNodoIsNotEmpty(T item) {
        System.out.print("cambie el ultimo\n ");
        this.getLast().setNext(new NodoQueue<T>(item));
    }

}
