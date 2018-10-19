package AssocBidirSatuKeBanyak;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        Kelas kelas = new Kelas("IF-8", mhs);
        
        mhs.add(new Mahasiswa("10112317", kelas));
        mhs.add(new Mahasiswa("10112318", kelas));
        
        System.out.println("List Mahasiswa " + kelas.getNamaKelas());
        System.out.println("--------------------");
        kelas.getMahasiswa().forEach((listMhs) -> {
            System.out.println(listMhs.getNim());
        });
    }
}
