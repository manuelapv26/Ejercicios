import java.util.ArrayList;

public class Procesos {
	public int maxValorArrayList(ArrayList<Integer> listaNumeros) {
		int maximo = listaNumeros.get(0);
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) > maximo) {
				maximo=listaNumeros.get(i);
			}
		}
		return maximo;
	}
}
