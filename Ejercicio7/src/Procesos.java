import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Procesos {
	  public void diccionario() {
			Hashtable<String, String> diccionario = new Hashtable<String, String>();
			diccionario.put("Hi", "Hola");
			diccionario.put("Yellow", "Amarillo");
			diccionario.put("Flower", "Flor");
			diccionario.put("Car", "Carro");
			diccionario.put("Boyfriend", "Novio");
			diccionario.put("House", "Casa");
			String mensaje= "<<DICCIONARIO INGLES>> \n";
			mensaje+= "Ingrese la palabra que desea traducir \n";
			mensaje+= "Hi \n";
			mensaje+= "Yellow \n";
			mensaje+= "Flower \n";
			mensaje+= "Car \n";
			mensaje+= "Boyfriend \n";
			mensaje+= "House \n";
			String opc = JOptionPane.showInputDialog(mensaje);
			System.out.println("\nEn espa�ol significa: " + diccionario.get(opc));
	    }
}
