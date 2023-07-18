/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void tambahHalaman(int tambahanHalaman) {
        jumlahHalaman += tambahanHalaman;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contoh penggunaan:
        Buku buku1 = new Buku("Hafalan Shalat Delisa", "Tere Liye", 2005, 245);
        buku1.tampilInformasi();  // Menampilkan informasi buku

        buku1.tambahHalaman(50);  // Menambahkan halaman buku
        buku1.tampilInformasi();  // Menampilkan informasi buku setelah ditambahkan halaman
    }
}
