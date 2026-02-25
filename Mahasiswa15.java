public class Mahasiswa15 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor default
    public Mahasiswa15() {
    }

    // Konstruktor berparameter
    public Mahasiswa15(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    public static void main(String[] args) {

        // Menggunakan konstruktor default
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Budi";
        mhs1.nim = "12345678";
        mhs1.ipk = 3.5;
        mhs1.kelas = "TI-A";

        System.out.println("=== Data Mahasiswa 1 ===");
        mhs1.tampilkanInformasi();

        // Menggunakan konstruktor berparameter
        Mahasiswa15 mhs2 = new Mahasiswa15("Siti", "87654321", 3.8, "TI-B");

        System.out.println("\n=== Data Mahasiswa 2 ===");
        mhs2.tampilkanInformasi();
    }
}