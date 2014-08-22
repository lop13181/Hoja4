/*
 * Hoja de Trabajo 4
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Autores:
 * Alberto López y Nancy Girón
 */

package hojadetrabajo4;

class Calculadora {
    
    // Pila que utilizará el programa
    private PilaLista<Double> pila;
    
    //Operadores y operandos contenidos en el arreglo
    private String[] entrada;
    
    //evalua la exresión del resultado
    private double resultado;
   
    //----------------------------Constructor-----------------------------------
    public Calculadora()
    {
        pila = new PilaLista<Double>();
    }
    
    // Muestra una excepcion si la entrada por el usuario es incorrecta
    // Devuelve el resultado de examinar la expresión
     
    public void procesoEntrada(String inp) throws Exception {
        entrada = inp.split(" ");
        validarEntrada();
    }
    
    //------------------------------------------------------------------------
    //Evalúa la entrada, si es válida realiza los cálculos correspondientes
    //------------------------------------------------------------------------
    
    public void validarEntrada() throws Exception 
    {
        for (int i = 0; i < entrada.length; i++) 
        {
            try 
            {
                double val = Double.parseDouble(entrada[i]);
                pila.push(val);
            } catch (Exception e) {
                if (!entrada[i].equals("+") && !entrada[i].equals("-") && !entrada[i].equals("*") && !entrada[i].equals("/")) 
                {
                    throw new Exception("Ingreso inválido");
                }
                try 
                {
                   evaluarResultado(i);  
                } catch (Exception d) 
                {
                    throw new Exception("Sintaxis inválida");
                }
            }
        }
        resultado = pila.pop();
    }
    
    //------------------------------------------------------------------------
    //Examina el resultado de las operaciones y los guarda en la pila
    //------------------------------------------------------------------------
    
    public void evaluarResultado(int pos) throws Exception 
    {
        if (entrada[pos].equals("+")) 
        {
            double opcion2 = pila.pop();
            double opcion1 = pila.pop();
            double resultado = opcion1+opcion2;
            pila.push(resultado);
            return;
        } else if (entrada[pos].equals("-")) 
        {
            double opcion2 = pila.pop();
            double opcion1 = pila.pop();
            double resultado = opcion1-opcion2;
            pila.push(resultado);
            return;
        } else if (entrada[pos].equals("*")) 
        {
            double opcion2 = pila.pop();
            double opcion1 = pila.pop();
            double resultado = opcion1*opcion2;
            pila.push(resultado);
            return;
        } else if (entrada[pos].equals("/"))
        {
            double opcion2 = pila.pop();
            double opcion1 = pila.pop();
            double resultado = opcion1/opcion2;
            pila.push(resultado);
            return;
        }
    } 
    
    // El resultado es retornado
    
    public double getResultado() {
        return resultado;
    }
}