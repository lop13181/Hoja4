/*
 * Hoja de Trabajo 4
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Autores:
 * Alberto López y Nancy Girón
 */

package hojadetrabajo4;

import java.util.LinkedList;

class PilaLista<E> extends pilaAbstracta<E>{
    
    // Implementación de la Lista

    private LinkedList linkedList;
            
    // Declaración del tamaño de la Pila
    private int size;        
    
    //-----------------------------Constructor----------------------------------
    public PilaLista() 
    {
        linkedList = new LinkedList();
    }
    
    // Retorna el tamaño de la pila
    public int size() 
    {
        return size;
    }
    
    // Se agrega arriba de la pila un elemento
    public void add(E item) {
        linkedList.add(item);
        size++;
    }

    //Se agrega otro elemento arriba de la pila
    public void push(E item) 
    {
        linkedList.add(item);
        size++;
    }

    // El elemento arriba de la pila es eliminado
    public E remove() {
        E objeto = (E) linkedList.get(size-1);
        if (size != 0) linkedList.remove(size-1);
        return objeto;
    }

    // Con pop sale el ultimo elemento de la pila
    // El elemento hasta arriba de la pila, que fue eliminado, es retornado
     
    public E pop() {
        E objeto = (E) linkedList.get(size-1);
        linkedList.remove(size-1);
        size--;
        return objeto;
    }
    
    //El ultimo objeto de la pila es retornado
    //Tamaño mayor a cero
    // Retorna el elemento situado hasta arriba de la pila, No se elimina
    
    public E get() {
        E objeto = (E) linkedList.get(size-1);
        return objeto;
    }

    //Retorna el primer elemento de la pila
    
    public E getFirst() {
        E objeto = (E) linkedList.get(size-1);
        return objeto;
    }

    // Retorna el último objeto de la Pila
    // antes: tamaño mayor a cero
    // después: retorna el elemento situado hasta arriba de la pila, No se elimina

    public E peek() {
        E objeto = (E) linkedList.get(size-1);
        return objeto;
    }

    // Retorna True si la pila está vacía
    public boolean empty() {
        if (size == 0) return true;
        return false;
    }
}