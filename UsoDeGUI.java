/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import javax.swing.JOptionPane;
public class UsoDeGUI {
    public static void main (String[] args){
        String entrada;
        String nombre;
        entrada = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        nombre = entrada;
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
        //06/03/2020
        int n;
        entrada = JOptionPane.showInputDialog("Ingrese tu edad");
        n = Integer.parseInt(entrada);
        n = 2020 - n;
        JOptionPane.showMessageDialog(null, "Naciste el: " + n);
        
    }//Fin main
}//Fin de la clase UsoDeGUI
