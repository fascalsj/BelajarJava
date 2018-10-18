package Pewarisan;

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Irfan Maliki");
        dosen.setUmur(32);
        dosen.setNip("1010192");
        dosen.setMatakuliah(" Grafika Pengolahan Citra ");
        System.out.println("NIP Dosen : " + dosen.getNip());
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Fascal Sapty Jarockohir");
        mahasiswa.setUmur(24);
        mahasiswa.setNim("10112317");
        mahasiswa.setKelas("IF-8");
        System.out.println("NIM Mahasiswa : " + mahasiswa.getNim());
        mahasiswa.kelasApa();
        
        
    }
}
