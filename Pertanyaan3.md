1. kode yang digunakan adalah: 
public Mahasiswa15(String nm, String nim, double ipk, String kls) {
    this.nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    this.kelas = kls;
}
2. Penjelasan:
Baris tersebut:
Membuat objek baru bernama mhs2
Menggunakan konstruktor berparameter
Langsung mengisi nilai atribut:
nama = "Annisa Nabila"
nim = "2141720160"
ipk = 3.25
kelas = "TI 2L"
3. Jika konstruktor default dihapus, maka:
Mahasiswa15 mhs1 = new Mahasiswa15();
Akan menghasilkan error saat compile.
Kenapa?

Karena:
Saat kita membuat konstruktor berparameter,
Java tidak lagi menyediakan konstruktor default otomatis.
Sehingga pemanggilan tanpa parameter menjadi tidak valid.
Jadi program tidak bisa dijalankan sampai konstruktor default ditambahkan kembali atau pemanggilan objek disesuaikan.
4. Apakah method harus diakses berurutan?
Tidak harus berurutan.
Setelah objek dibuat, method dapat dipanggil dalam urutan apa saja sesuai kebutuhan program.

Karena:
Method adalah perilaku (behavior) dari objek.
Urutan pemanggilan tergantung logika program, bukan aturan class
5. 