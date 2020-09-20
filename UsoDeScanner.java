/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr.: 1986677 
   Hora: V4
 */
import java.util.Scanner;
public class UsoDeScanner {
    public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        String nombre;
        System.out.print("Ingresa tu nombre: ");
        nombre = lec.nextLine();
        System.out.println("Hola, " + nombre);
    }//Fin de main
}//Fin de clase
