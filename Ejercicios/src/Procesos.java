import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

import javax.swing.JOptionPane;

public class Procesos {

	public void nombre() {
	    String iNombre = JOptionPane.showInputDialog("Ingrese su nombre");
		System.out.println("Hola " + iNombre);
	}
	
	public void retornoNumero(int num) {
		if (num>10) {
			System.out.println("Su numero es mayor a 10 y fue " + num);
		}
		else {
			System.out.println("Su numero no es mayor a 10, no se podra mostrar");
			do {
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a 10"));
				if (num>10) {
					System.out.println("Su numero es mayor a 10 y fue " + num);
				}
			} while (num <= 10);
		}
	}
	
	public int numeroRandom() {
		Random random = new Random();
		return random.nextInt(100)+1;
	}
	
	public int maximoValor(int arreglo[]) {
		int maximo = arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > maximo) {
				maximo=arreglo[i];
			}
		}
		return maximo;
	}
	
	public int maxValorArrayList(ArrayList<Integer> listaNumeros) {
		int maximo = listaNumeros.get(0);
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) > maximo) {
				maximo=listaNumeros.get(i);
			}
		}
		return maximo;
	}

	    public int[] sumaArreglos(int[] arr1, int[] arr2) {
	        int resultado[] = new int[arr1.length];
	
	        for (int i = 0; i < arr1.length; i++) {
	            resultado[i] = arr1[i] + arr2[i];
	        }
	        return resultado;
	    }
    
    public void diccionario() {
		Hashtable<String, String> diccionario = new Hashtable<String, String>();
		diccionario.put("Frog", "Sapo");
		diccionario.put("Door", "Puerta");
		diccionario.put("Cat", "Gato");
		diccionario.put("Window", "Ventana");
		diccionario.put("Computer", "Computador");
		diccionario.put("Desktop", "Escritorio");
		String mensaje= "<<DICCIONARIO INGLES>> \n";
		mensaje+= "Frog \n";
		mensaje+= "Door \n";
		mensaje+= "Cat \n";
		mensaje+= "Window \n";
		mensaje+= "Computer \n";
		mensaje+= "Desktop \n";
		String opc = JOptionPane.showInputDialog(mensaje);
		System.out.println("\nEn espaniol significa: " + diccionario.get(opc));
    }
    
    public void estudiantes() {
    	HashMap<String, ArrayList<Double>> alumnos = new HashMap<String, ArrayList<Double>>();
    	String menu = "<<<<OPCIONES>>>>\n";
    	menu+="1. Agregar estudiantes\n";
    	menu+="2. Consultar Notas\n";
    	menu+="3. Salir\n";
    	menu+="Ingrese una opción";
    	int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    	String nombre;
    	ArrayList<Double> notasList;
    	do {
			switch (opcion) {
			case 1:
				int cantEst = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea ingresar"));
				for (int i = 0; i < cantEst; i++) {
					nombre = JOptionPane.showInputDialog("Ingrese el nombre de el alumno");
					notasList = new ArrayList<Double>();
					int cantNot = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea ingresar para " + nombre));
			    	double nota;
				
			    	for (int j = 0; j < cantNot; j++) {
						nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j+1) + " para " + nombre));
						notasList.add(nota);
					}
					alumnos.put(nombre, notasList);
					System.out.println(nombre + " = " + notasList);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;
				
			case 2:
				String nombreConsulta=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
				if (alumnos.containsKey(nombreConsulta)) {
					ArrayList<Double> listaNotasTemporales = alumnos.get(nombreConsulta);
					System.out.println("Nombre: "+nombreConsulta);
					
					double sum=0;
					System.out.println("Lista de notas: ");
					for (int i = 0; i < listaNotasTemporales.size(); i++) {
						System.out.print(listaNotasTemporales.get(i)+",");
						sum+=listaNotasTemporales.get(i);
					}
					
					double prom=sum/listaNotasTemporales.size();
					System.out.println("\nEl Promedio es: "+prom);
				}else {
					System.out.println("No se encuentra el estudiante: "+nombreConsulta);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;

			default:
				break;
			}
		} while (opcion != 3);
    }
  
}