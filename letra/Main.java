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
		Map<String, Integer> mapa = counting(line.replace(" ", "").toLowerCase());

		for(Map.Entry<String, Integer> letra : mapa.entrySet()) {
			if (letra.getValue() == 1) {
				System.out.println(letra.getKey());
				return;
			}
		}

		scanner.close();
	}

	public static Map<String, Integer> counting(String str) {
		Map<String, Integer> tmap = new TreeMap<>();
		for(char item : str.toCharArray()) {
			Integer s = tmap.get(String.valueOf(item));
			if (s != null) {
				tmap.put(String.valueOf(item), ++s);
			} else {
				tmap.put(String.valueOf(item), 1);
			}
		}
		return tmap;
	}
}
