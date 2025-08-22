package ex03;
import figuras.FiguraGeometrica;

public class Ex03 implements FiguraGeometrica {

    private double raio;
    private double area;
    private double volume;

    public Ex03(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea (){
        area = ((4 * Math.PI) * (raio * raio));
        return area;
    }

    @Override
    public double calcularVolume (){
        volume = ((4.0 / 3) * Math.PI * (raio * raio * raio));
        return volume;
    }
}
