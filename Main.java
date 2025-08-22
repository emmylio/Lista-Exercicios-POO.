import ex01.*;

public class Main {
    public static <Pessoa> void main(String[] args) {
        Ex01 p5 = new Ex01("Geovanna delicia", "feminino", 66, 1.72); // peso (kg), altura (m)
        System.out.println("A pessoa " + p5.getNome() + "e do sexo " + p5.getSexo() + " tem o IMC: " + p5.calcularIMC());

    }
}
