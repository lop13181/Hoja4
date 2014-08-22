/*
 * Hoja de Trabajo 4
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Autores:
 * Alberto López y Nancy Girón
 */

package hojadetrabajo4;

public interface Pila<E> {
        
     // Retorna el tamaño de la pila que tenía inicialmente
    public int size();
    
    // Arriba de la pila suma un elemento
    public void add(E item);

    // Introduce un elemento de primero en la Pila
    public void push(E item);

    // El elemento que está arriba de la pila lo elimina
    public E remove();

    // obtiene el último elemento de la pila
    public E pop();
    
   // el último elemento de la pila lo devuelve
    public E get();

   // el primer elemento de la pila lo devuelve
    public E getFirst();

    // el ultimo elemento de la pila lo devuelve
    public E peek();

    // retorna un True si la pila está vacía
    public boolean empty();
    
}
