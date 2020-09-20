/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import java.util.Scanner;
public class Serie3 {
        public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int N;
         System.out.print("Ingresa el numero entero: ");
        N = lec.nextInt();
        for (int I=1; I<=N; I++){
            if (I%2==0){
              System.out.println(I);   
            }
            else{
                System.out.println("-"+I); 
            }
           
        }
        
        
    }//Fin main
}//Fin de la clase
