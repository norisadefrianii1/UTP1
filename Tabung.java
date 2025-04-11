package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung() {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLuasAlas() {
        return radius * radius * PEMBILANG / PENYEBUT;
    }

    public double getKeliling() {
        return 2 * radius * PEMBILANG / PENYEBUT;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }

}
