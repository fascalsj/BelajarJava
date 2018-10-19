package AsBidirBanyakkeBanyak;

import java.util.Stack;

public class Main {

    Stack<AnggotaKeluarga> keluarga = new Stack<>();
    Stack<Pekerjaan> pekerjaan = new Stack<>();

    public void addKeluarga(String namaAnggota) {
        keluarga.add(new AnggotaKeluarga(namaAnggota));
    }

    public void addPekerjaan(String namaPekerjaan) {
        pekerjaan.add(new Pekerjaan(namaPekerjaan));
    }
    public void mappingKerja(){
        System.out.print(keluarga.pop().getNamaAnggota());
        System.out.print(" ");
        System.out.println(pekerjaan.pop().getNamaPekerjaan());
    }
    public static void main(String[] args){
        Main pr = new Main();
        pr.addKeluarga("Ibu");
        pr.addKeluarga("Ayah");
        pr.addKeluarga("Ayah");
        pr.addKeluarga("Ibu");
        pr.addPekerjaan("Memasak");
        pr.addPekerjaan("Macul");
        pr.addPekerjaan("Berkebun");
        pr.addPekerjaan("Nyeseuh");
        
        pr.mappingKerja();
        
    }
    
    

}
