package ex02;

public class Ex02 {

private double areaBase;
private double altura;
private double volume;


    public Ex02(double base, double altura) {
        this.areaBase = base;
        this.altura = altura;
    }


    public double getAreaBase() {
        return areaBase;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularVolume (){
        volume = ( (1.0 / 3) * areaBase * altura);
        return volume;
    }


}
