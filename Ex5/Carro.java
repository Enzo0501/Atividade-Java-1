public class Carro {

    String marca;
    String modelo;
    int ano;
    String placa;
    int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O carro está acelerando. Nova velocidade: " + this.velocidadeAtual + " km/h");
    }

    public void frear(int decremento) {
        if (this.velocidadeAtual - decremento >= 0) {
            this.velocidadeAtual -= decremento;
            System.out.println("O carro está freando. Nova velocidade: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }


}
