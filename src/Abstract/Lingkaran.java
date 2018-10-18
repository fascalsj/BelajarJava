package Abstract;

public class Lingkaran {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double hitungKeliling() {
        return 2 * 3.14 * r;
    }

    public double hitungLuas() {
        return 3.14 * r * 4;
    }
}
