package ConsDecs;

public class Persegi {

    private double sisi;

    public Persegi() {
        this.sisi = 0;
    }

    public double hitungKeliling() {
        return sisi * 4;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
