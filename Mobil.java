/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Mobil {
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void percepat(int nilaiKecepatan) {
        kecepatan += nilaiKecepatan;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
   
    public static void main(String[] args) {
        // Contoh penggunaan:
        Mobil mobil1 = new Mobil("Mini Cooper", 2023, "Merah", 120);
        mobil1.tampilInformasi();  // Menampilkan informasi mobil

        mobil1.percepat(30);  // Menambahkan kecepatan mobil
        mobil1.tampilInformasi();  // Menampilkan informasi mobil setelah dipercepat
    }
}