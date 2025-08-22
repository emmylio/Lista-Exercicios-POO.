package ex08;

public class Ex08 {

    private String nome;
    private double peso;
    private double altura;

    public Ex08(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String faixaDeRisco() {
        double imc = calcularIMC();
        if (imc < 20) {
            return "Abaixo do peso ideal";
        } else if (imc <= 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Excesso de peso";
        } else if (imc <= 35) {
            return "Obesidade";
        } else {
            return "Obesidade mórbida";
        }
    }

    public static void main(String[] args) {
        Ex08 pessoa = new Ex08("Geovanna", 66, 1.72);
        System.out.println(pessoa.getNome() + " tem IMC: " + pessoa.calcularIMC());
        System.out.println("Classificação: " + pessoa.faixaDeRisco());

    }
}

