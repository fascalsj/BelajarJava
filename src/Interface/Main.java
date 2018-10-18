package Interface;

public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        tampilPersegi(persegi.hitungKeliling(), persegi.hitungLuas());
        Lingkaran lingkaran = new Lingkaran();
        tampilLingkaran(lingkaran.hitungKeliling(), lingkaran.hitungLuas());
    }

    public static void tampilPersegi(double kelilingPersegi, double luasPersegi) {
        System.out.println("Keliling Persegi = " + kelilingPersegi);
        System.out.println("Luas Persegi = " + luasPersegi);
    }

    public static void tampilLingkaran(double kelilingLingkaran, double luasLingkaran) {
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
        System.out.println("Luas Lingkaran = " + luasLingkaran);
    }

}
