import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aposentadoria {
	public static void main(String[] args) {
		try {
			Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse("03/01/2000");
			Jogador jogador = new Jogador("Antonio", "atacante", nascimento);

			jogador.toString();

			jogador.tempoParaAposentar();

			System.out.println(jogador.calcularIdade());
		} catch (ParseException e) {
			System.out.println("data de nascimento inválida");
		}
	}
}
