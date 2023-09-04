import javax.swing.JOptionPane;

public class Procesos {
	public void retornoNumero(int num) {
		if (num>10) {
			System.out.println("Su numero es mayor a 10 y fue " + num);
		}
		else {
			System.out.println("Su numero no es mayor a 10, no se puede mostrar");
			do {
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor a 10"));
				if (num>10) {
					System.out.println("Su numero es mayor a 10 y fue " + num);
				}
			} while (num <= 10);
		}
	}
}
