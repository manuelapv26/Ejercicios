import javax.swing.JOptionPane;

public class Principal {
public static void main (String args []) {
	Procesos misProcesos= new Procesos();
	int arregloNumeros[]= new int[5];
	for (int i = 0; i < arregloNumeros.length; i++) {
		arregloNumeros[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion " + (i+1)));
	}
	int maximoValor = misProcesos.maximoValor(arregloNumeros); 
	System.out.println("El numero mayor del arreglo es: " + maximoValor);
}
}
