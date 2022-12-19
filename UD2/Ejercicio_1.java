package UD2;

public class Ejercicio_1 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Declaramos nuestras variables para tener un valor de los números que queremos comparar para saber
        // cuál es el mayor.
        int a = 2;
        int b = 18;
        int c =29;
        // Abrimos un if para ver si a > b, si es así, entramos en otro if para comparar si también a > c, si se cumple
        // obtenemos por consola el valor de a, ya que es el mayor.
        // Si no se cumple el if, pasamos al else que nos muestra directamente que c es el mayor ya que c > a & b.
        if (a > b) {
            if (a > c) {
                System.out.println("El número mayor es: " + a);                                             
            } 
            else {
                System.out.println("El número mayor es: " + c);     
            }
        } 
        // Creamos un else if para comparar b con c, pero sólo en el caso de que el primer if no se pueda cumplir y saltemos
        // a ésta parte del código, en la cuál se inicia comparando que b > c, cómo a esta parte del código sólo podemos llegar 
        // en el caso de que a sea menor que b, descartamos directamente el número a, por ello comparamos b > c para obtener si
        // b es el número mayor.
        else if (b > c) {
            System.out.println("El número mayor es: " + b);
        } 
        // En el caso de que b no sea mayor que c, como tenemos que b < c & a < b, mostramos por consola que c es el número mayor.
        else {
            System.out.println("El número mayor es: " + c);
        }
    }
}
