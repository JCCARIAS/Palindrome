package org.example.model;




public class Pila<T> {
    private Nodo<T> cima;
    private int tamaño;

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamaño++;
    }

    public T pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }
    public boolean estaVacia() {
        return cima == null;
    }

    public int tamaño() {
        return tamaño;
    }

    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.dato;
    }
}