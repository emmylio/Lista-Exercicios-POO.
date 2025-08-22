package ex11;

public class Ex11 {

    private String nome;
    private double salarioBruto;
    private double desconto;

    public Ex11(String nome, double salarioBruto, double desconto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - desconto;
    }

    public void mostrarDados() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
    }

    public static void main(String[] args) {
        Ex11 f1 = new Ex11("Maria", 5000, 750);
        f1.mostrarDados();

    }
}
