package ex05;

import figuras.FiguraGeometrica;

public class Ex05 implements FiguraGeometrica {

    private double altura;
    private double largura;
    private double comprimento;

    public Ex05(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    @Override
    public double calcularArea() {
        return (2 * (altura * largura + altura * comprimento + largura * comprimento));
    }

    @Override
    public double calcularVolume() {
        return (altura * comprimento * largura);
    }
}
