/*
 * Hoja de Trabajo 4
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Autores:
 * Alberto López y Nancy Girón
 */

package hojadetrabajo4;

public abstract class pilaAbstracta<E>
{
     // Retorna el tamaño de la pila
    public abstract int size();
    
    // Hasta arriba de la pila agrega un elemento
    public void add(E item) 
    {
        push(item);
    }

    // Agrega otro elemento hasta arriba de la pila
    public abstract void push(E item);

    // Elimina el elemento que está arriba de la pila
    public abstract E remove();

    // Hace un get al ultimo elemento de la pila
    public abstract E pop();
    
    // Retorna el ultimo elemento de la pila
    public abstract E get();

    // Retorna el ultimo elemento de la pila
    public E getFirst() {
        return get();
    }
    
    // Retorna el ultimo elemento de la pila
    public E peek() 
    {
        return getFirst();
    }

    // Si la pila se encuentra vacía retorna un True
    public abstract boolean empty();
    
}
