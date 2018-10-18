package AssociationBidirectionalSatukeSatu;

public class Main {

    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMKN 1 Karawang");
        KepalaSekolah kepalaSekolah = new KepalaSekolah("Endang");
        
        sekolah.setKepalaSekolah(kepalaSekolah);
        kepalaSekolah.setSekolah(sekolah);
        
        String namaSekolah = sekolah.getNamaSekolah();
        String namaKepalaSekolah = sekolah.getKepalaSekolah().getNamaKepalaSekolah();
        tampilNilaiSekolah(namaSekolah, namaKepalaSekolah);
       
        
        namaKepalaSekolah = kepalaSekolah.getNamaKepalaSekolah();
        namaSekolah =kepalaSekolah.getSekolah().getNamaSekolah();
         tampilNilaiSekolah(namaSekolah, namaKepalaSekolah);
    }
    public static void tampilNilaiSekolah(String namaSekolah, String namaKepalaSekolah){
        System.out.println(namaSekolah);
        System.out.println(namaKepalaSekolah);
    }

}
