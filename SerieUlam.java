/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import java.util.Scanner;

public class SerieUlam {
        public static void main (String[] args){
            
        Scanner lec = new Scanner(System.in);
        int x;
         System.out.print("Ingresa el numero entero: ");
        x = lec.nextInt();
       while(x!=1){
           if(x%2==0){
               x=x/2;
           }else{
               x=3*x+1;
           }
           System.out.println(x); 
       }
        
        
    }//Fin main
}//Fin de la clase