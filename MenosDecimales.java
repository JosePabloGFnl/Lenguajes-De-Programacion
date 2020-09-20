/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class MenosDecimales {
    public static void main(String[] args){
        String letrero;
        DecimalFormat decimales = new DecimalFormat("0.00");
        double pc1=31.234567;
        letrero = "El valor de pc1=" + decimales.format(pc1);
        JOptionPane.showMessageDialog(null,letrero);
    }
}
