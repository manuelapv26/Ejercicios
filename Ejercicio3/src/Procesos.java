import java.util.Random;

public class Procesos {
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
}
