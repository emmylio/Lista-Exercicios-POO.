package ex04;

import figuras.FiguraGeometrica;

public class Ex04 implements FiguraGeometrica{

    private double comprimento;
    private double largura;

    public Ex04(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularPerimetro (){
        return 2 * (comprimento + largura);
    }

    @Override
    public double calcularArea (){
        return (largura * comprimento);
    }

    @Override
    public double calcularVolume() {
        return 0;
    }

}
