
/* Nombre: JOSE PABLO GONZALEZ FLORES 
   Matr: 1986677 
   Hora: V4
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Matriz {
    public static void main (String[] args){
    String entrada;
    int i,j,n,m;
    int [][] A;
    entrada=JOptionPane.showInputDialog("Ingrese el número de filas:");
    n=Integer.parseInt(entrada);
    entrada=JOptionPane.showInputDialog("Ingrese el número de columnas:");
    m=Integer.parseInt(entrada);
    A = new int[n][m];
    
    for(i=0;i<n;i++){
    for(j=0;j<m;j++){
        entrada=JOptionPane.showInputDialog("A["+(i+1)+"]["+(j+1)+"]=");
        A[i][j] = Integer.parseInt(entrada);

    }
}
    String letrero = "A[" + n +"][" + m +"]\n";
for(i=0; i < n; i++){
for(j=0; j<m; j++){
letrero= letrero + A[i][j] + "";
}
letrero = letrero + "\n";
}//Fin de ciclos de llenado para imprimir
JOptionPane.showMessageDialog(null, letrero);
    
}
}
