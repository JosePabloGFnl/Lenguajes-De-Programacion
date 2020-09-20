/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import java.util.Scanner;
public class CapturaNumerica {
    public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int x;
        float y;
        double z;
        byte w;
        
         System.out.print("Ingresa el numero entero: ");
        x = lec.nextInt();
        System.out.println("X=" +x);
        
         System.out.print("Ingresa el numero float: ");
        y = lec.nextFloat();
        System.out.println("Y=" +y);
        
         System.out.print("Ingresa el numero double: ");
        z = lec.nextDouble();
        System.out.println("Z=" +z);
        
         System.out.print("Ingresa el numero byte: ");
        w = lec.nextByte();
        System.out.println("W=" +w);
        
        double peso = 8.9856;
        float cantidad = 3.45f;
    }//Fin main
}//Fin de la clase

