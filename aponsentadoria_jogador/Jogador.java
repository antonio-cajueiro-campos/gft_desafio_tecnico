import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Jogador {
    private String nome;
    private String posição;
    private Date dataDeNascimento;

    public Jogador(String nome, String posição, Date dataDeNascimento) {
        this.nome = nome;
        this.posição = posição;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int calcularIdade() {
        return Period.between(dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
    }

    public void tempoParaAposentar() {
        int tempo = 0;

        if (posição != "defesa" && posição != "meio-campo" && posição != "atacante") {
            System.out.println("posição inválida");
        } else {
            switch (posição) {
                case "defesa": tempo = 40 - calcularIdade(); break;
                case "meio-campo": tempo = 38 - calcularIdade(); break;
                case "atacante": tempo = 35 - calcularIdade(); break;
            }

            System.out.println("falta "+tempo+" anos para o jogador "+nome+" se aposentar");
        }


    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posição='" + posição + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
