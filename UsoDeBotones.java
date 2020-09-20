/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */

import javax.swing.JOptionPane;
public class UsoDeBotones {
    public static void main (String[] args){
        
       String[] options={"Terminar","1","2","3","4","5"};
       int v = JOptionPane.showOptionDialog(null,
               "Ingresa un número entero de 1 al 5",
               "Números", 
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,
               options,
               options[0]);
       JOptionPane.showMessageDialog(null,"Botón seleccionado:"+v);
        
    }//Fin main
}//Fin de la clase UsoDeGUI