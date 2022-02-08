public class VeiculoImpl implements Veiculo{
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preço;

    public VeiculoImpl(String marca, String modelo, String placa, String cor, String km, boolean isLigado, int litrosCombustivel, int velocidade, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preço = preço;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public void acelerar() {
        if (isLigado) {
            velocidade += 20;
            System.out.println("velocidade atual: " +velocidade);
        } else {
            System.out.println("ligue o veiculo primeiro");
        }

    }

    @Override
    public void abastecer(int combustivel) {
        if ((combustivel + litrosCombustivel) <= 60) {
            this.litrosCombustivel += combustivel;
            System.out.println("adicionado "+combustivel+" litros de combustivel");
        } else {
            int newComb = 60 - this.litrosCombustivel;
            this.litrosCombustivel += newComb;
            System.out.println("tanque cheio");
        }
        System.out.println("combustível atual: "+ litrosCombustivel);
    }

    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 20;
            System.out.println("velocidade atual: " +velocidade);
        }
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Cor do carro alterada para "+cor);
        this.cor = cor;
    }

    @Override
    public void ligar() {
        if (!isLigado) isLigado = true;
        System.out.println("carro ligado");
    }

    @Override
    public void desligar() {
        if (velocidade > 0) {
            System.out.println("Não pode desligar veiculo em movimento");
        } else {
            if (isLigado) isLigado = false;
            System.out.println("carro desligado");
        }
    }

    @Override
    public String toString() {
        return "VeiculoImpl{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", km='" + km + '\'' +
                ", isLigado=" + isLigado +
                ", litrosCombustivel=" + litrosCombustivel +
                ", velocidade=" + velocidade +
                ", preço=" + preço +
                '}';
    }
}
