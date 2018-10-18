package ConsDecs;

public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.print("Hitung Keliling Persegi : ");
        System.out.println(persegi.hitungKeliling());
        System.out.print("Hitung Luas Persegi : ");
        System.out.println(persegi.hitungLuas());
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.setPanjang(20);
        persegipanjang.setLebar(15);
        System.out.print("Hitung Keliling Persegi Panjang : ");
        System.out.println(persegipanjang.hitungKeliling());
        System.out.print("Hitung Luas Persegi Panjang : ");
        System.out.println(persegipanjang.hitungLuas());
    }
}
