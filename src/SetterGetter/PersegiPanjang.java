/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetterGetter;


public class PersegiPanjang {

    public double panjang;
    public double lebar;

    public double hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

}
