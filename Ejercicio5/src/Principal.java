import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
public static void main (String args []) {
	Procesos misProcesos= new Procesos();
	ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
	String mensaje = "Opciones\n";
	mensaje+="Opcion 1: Ingresar numero\n";
	mensaje+="Opcion 2 : Finalizar ingresos\n";
	int opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	do {
		listaNumeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")));
		opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	} while (opcion != 2);
	int valorMaximo = misProcesos.maxValorArrayList(listaNumeros);
	System.out.println("El numero mayor del ArrayList es: " + valorMaximo);
}
}
