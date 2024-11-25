abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract String informacoesVeiculo();
}

class Carro extends Veiculo {
    public int numeroPortas;

    @Override
    public String informacoesVeiculo() {
        return "Carro - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + 
               ", Número de portas: " + numeroPortas;
    }
}

class Moto extends Veiculo {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + 
               ", Cilindrada: " + cilindrada + "cc";
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Chevrolet";
        carro.modelo = "Prisma";
        carro.setAno(2022);
        carro.numeroPortas = 4;

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "Biz";
        moto.setAno(2021);
        moto.setCilindrada(150);

        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
