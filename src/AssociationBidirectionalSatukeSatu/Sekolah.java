package AssociationBidirectionalSatukeSatu;

public class Sekolah {

    private String namaSekolah;
    private KepalaSekolah kepalaSekolah;

    //Ini adalah Constructor
    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamasekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public KepalaSekolah getKepalaSekolah() {
        return kepalaSekolah;
    }

    public void setKepalaSekolah(KepalaSekolah kepalaSekolah) {
        this.kepalaSekolah = kepalaSekolah;
    }

}
