package UD2;

public class Ejercicio_5 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Declaro las variables para pintar el árbol en consola.
        char hueco = ' ';
        char hoja = '*';
        int N = 0;
        // Creo un bucle de duración 4, para que pinte todo el árbol.
        for(N=1; N<=4; N++) {
            // Comienzo a pintar desde la copa hacia el tronco para completar el árbol, la copa va aumentando su
            // tamaño por cada for.
            for(int huecos=5 - N; huecos > 0; huecos--)
                System.out.print(hueco);
            for(int hojas = 1; hojas < 2 * N; hojas++)
                System.out.print(hoja);
            System.out.println("");
        }   
        // Pinto el árbol de una forma un poco sencilla, pero bueno, obtenemos el resultado deseado para completar
        // el ejercicio
        System.out.println("   | |" + "\n" + "   | |");
    }
}