/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contoh penggunaan:
        PersegiPanjang persegiPanjang = new PersegiPanjang(6.0f, 4.0f);
        float luas = persegiPanjang.hitungLuas();
        float keliling = persegiPanjang.hitungKeliling();

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
