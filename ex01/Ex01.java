package ex01;

public class Ex01 {

    private String nome;
    private double peso;
    private double altura;
    private String sexo;


    public Ex01(String nome, String sexo, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }



    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Ex01 p5 = new Ex01("Geovanna delicia", "feminino", 66, 1.72); // peso (kg), altura (m)
        System.out.println("A pessoa " + p5.getNome() + "e do sexo " + p5.getSexo() + " tem o IMC: " + p5.calcularIMC());
    }

}


