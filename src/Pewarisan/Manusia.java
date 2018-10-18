package Pewarisan;

public class Manusia {

    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void siapaKamu()
    {
        System.out.println("Saya manusia");
    }

}
