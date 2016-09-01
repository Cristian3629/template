package ar.fiuba.tdd.template;

import static org.junit.Assert.*;

import org.junit.Test;


public class QueueTests {
    @Test
    public void colaCreadaEstaVacia() {
        Queue queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void colaEsNoVacia() {
        Queue queue = new Queue<>();
        queue.add(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void colaTieneUnElemento() {
        Queue queue = new Queue<>();
        queue.add(1);
        assertEquals(1, queue.size());
    }

    @Test
    public void colaTieneDosElementos() {
        System.out.print("colaTieneDosElementos\n");
        Queue queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void devuelveCorrectamente() {
        Queue queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.top());
    }

    @Test
    public void devuelveCorrectamenteElSegundoElemento() {
        Queue queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.top();
        queue.remove();
        assertEquals(2, queue.top());
    }

    @Test(expected = AssertionError.class)
    public void noSePuedeEliminarEnUnaColaVacia() {
        Queue queue = new Queue<>();
        queue.remove();
    }


}
