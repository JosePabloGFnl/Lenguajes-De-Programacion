/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import java.util.Scanner;
public class Serie2 {
        public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int N;
         System.out.print("Ingresa el numero entero: ");
        N = lec.nextInt();
        for (int I=1; I<=N; I++){
          System.out.println(Math.pow(I,3));  
        }
        
        
    }//Fin main
}//Fin de la clase