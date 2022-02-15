package letra;

import java.util.*;

/**
 * author: antonio
 * atividade: Letra que não se repete
 */

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		HashMap<String, Integer> mapa = counting(line.replace(" ", "").toLowerCase());

		for(Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator(); it.hasNext(); ) {
			Map.Entry<String, Integer> entry = it.next();

			Integer valor = entry.getValue();
			String key = entry.getKey();
			it.remove();

			if (valor == 1) {
				System.out.println(key);
				return;
			} else if (mapa.size() == 0) {
				System.out.println("_");
			}
		}

		scanner.close();
	}

	public static HashMap<String, Integer> counting(String str) {
		HashMap<String, Integer> map = new HashMap<>();
		for(char item : str.toCharArray()) {
			Integer string = map.get(String.valueOf(item));
			if (string != null) {
				map.put(String.valueOf(item), ++string);
			} else {
				map.put(String.valueOf(item), 1);
			}
		}
		return map;
	}
}
