package ex06;

import figuras.FiguraGeometrica;

public class Ex06 implements FiguraGeometrica{

    private double raio;
    private double altura;


    public Ex06(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }



    public double calcularAreaLateral() {
       double areaLateral = (2 * Math.PI * raio * altura);
        return areaLateral;
    }

    @Override
    public double calcularArea() {
        double areaTotal = (2 * Math.PI * raio * (altura + raio));
        return areaTotal;
    }


    @Override
    public double calcularVolume() {
        return (Math.PI * raio * raio * altura);
    }
}
