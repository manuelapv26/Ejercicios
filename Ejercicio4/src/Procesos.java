
public class Procesos {
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
