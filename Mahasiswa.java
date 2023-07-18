/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private float ipk;

    public Mahasiswa(String nama, String nim, String jurusan, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void ubahNama(String namaBaru) {
        nama = namaBaru;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contoh penggunaan:
        Mahasiswa mahasiswa1 = new Mahasiswa("Ai Nurul", "C2083207025", "Pendidikan Teknologi Informasi", 3.75f);
        mahasiswa1.tampilInformasi();  // Menampilkan informasi mahasiswa

        mahasiswa1.ubahNama("Ai Nurul Kausar");  // Mengubah nama mahasiswa
        mahasiswa1.tampilInformasi();  // Menampilkan informasi mahasiswa setelah diubah
    }
}
        // TODO code application logic here