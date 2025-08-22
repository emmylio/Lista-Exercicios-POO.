package ex07;

import figuras.FiguraGeometrica;

public class Ex07 implements FiguraGeometrica{

    private double raio;
    private double altura;

    public Ex07(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularGeratriz() {
        return Math.sqrt ((altura * altura) + (raio * raio));
    }

    public double calcularAreaLateral() {
        return (Math.PI * raio * calcularGeratriz());
    }

    @Override
    public double calcularArea() {
        return (Math.PI * raio * (calcularGeratriz() + raio));
    }

    @Override
    public double calcularVolume() {
        return (1.0 / 3.0 * Math.PI * (raio * raio) * altura );
    }
}
