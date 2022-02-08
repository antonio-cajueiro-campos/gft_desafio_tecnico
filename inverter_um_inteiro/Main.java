package inverter_um_inteiro;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * author: antonio
 * atividade: Inverter um inteiro
 */

public class Main {
	public static void main(String[] args) {
		Long[] dadosEntrada = new Long[]{
			15485448L,
			2195498L,
			12L,
			98716549L,
			9999998999L,
			1654891L
		};
		ArrayList<Long> listaDeEntrada = new ArrayList<>(Arrays.asList(dadosEntrada));
		listaDeEntrada.stream().forEach(longAtt -> {
			String inv = new StringBuilder(longAtt.toString()).reverse().toString();
			System.out.println(inv);
		});
	}
}
