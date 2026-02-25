public class MataKuliah14 {

    // Atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor default
    public MataKuliah14() {
        kodeMK = "MK000";
        nama = "Tidak Diketahui";
        sks = 0;
        jumlahJam = 0;
    }

    // Konstruktor berparameter
    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method tampil informasi
    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-----------------------------");
    }

    // Method ubah SKS
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    // Method tambah jam
    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah menjadi " + jumlahJam);
    }

    // Method kurangi jam
    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam gagal! Jam tidak mencukupi.");
        }
    }
}