import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
public static void main(String arg[]) {
	Procesos misProcesos=new Procesos();
	misProcesos.nombre();
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a 10"));
			misProcesos.retornoNumero(numero);
			
			int numeroAleatorio = misProcesos.numeroRandom();
			System.out.println("Su numero aleatorio es: "+numeroAleatorio);
			
			int arregloNumeros[]= new int[5];
			for (int i = 0; i < arregloNumeros.length; i++) {
				arregloNumeros[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion " + (i)));
			}
			int maximoValor = misProcesos.maximoValor(arregloNumeros); 
			System.out.println("Este es el numero mayor del arreglo " + maximoValor);
			
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
			System.out.println("Este es el numero mayor de su ArrayList " + valorMaximo);
			
	        int arr1[] = new int[5];
	        int arr2[] = new int[5];
	        for (int i = 0; i < arr1.length; i++) {
	            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	        }
	        for (int i = 0; i < arr2.length; i++) {
	            arr2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	        }
	        int sumaArreglos[] = misProcesos.sumaArreglos(arr1, arr2);
	        System.out.print("La suma de los dos arreglos ingresados es: ");
	        for (int num : sumaArreglos) {
	            System.out.print(num + " ");
	        }
	        
	        misProcesos.diccionario();
	        
	        misProcesos.estudiantes();

		}
}
