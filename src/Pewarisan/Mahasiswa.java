package Pewarisan;

public class Mahasiswa extends Manusia {

    private String nim;
    private String kelas;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " mahasiswa di kelas " + kelas);
    }

}
