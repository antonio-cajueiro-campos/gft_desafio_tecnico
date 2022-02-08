/**
 * author: antonio
 * atividade: Veiculos
 */

public class Main {
    public static void main(String[] args) {
        VeiculoImpl veiculo = new VeiculoImpl(
                "Toyota",
                "007",
                "ABC-0101",
                "preto",
                "10",
                false,
                10,
                0,
                20.00050
        );
        System.out.println(veiculo);
        veiculo.ligar();
        veiculo.abastecer(20);
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.frear();
        veiculo.pintar("vermelho");
        veiculo.desligar();
    }
}
