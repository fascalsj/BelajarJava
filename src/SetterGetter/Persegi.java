
package SetterGetter;

public class Persegi {

    public double sisi;

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
