import javax.swing.JOptionPane;

public class Principal {
public static void main (String args []) {
	Procesos misProcesos=new Procesos();
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a 10"));
	misProcesos.retornoNumero(numero);
}
}
