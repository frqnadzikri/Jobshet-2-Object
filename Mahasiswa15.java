public class Mahasiswa15 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        Mahasiswa15 mhs = new Mahasiswa15();
        mhs.nama = "Budi";
        mhs.nim = "12345678";
        mhs.kelas = "TI-A";
        mhs.ipk = 3.7;

        System.out.println("===== Data Awal =====");
        mhs.tampilkanInformasi();
        System.out.println("Kinerja: " + mhs.nilaiKinerja());

        System.out.println("\n===== Update IPK Valid (3.5) =====");
        mhs.updateIpk(3.5);
        System.out.println("IPK setelah diupdate: " + mhs.ipk);
        System.out.println("Kinerja: " + mhs.nilaiKinerja());

        System.out.println("\n===== Update IPK Tidak Valid (5.0) =====");
        mhs.updateIpk(5.0);
        System.out.println("IPK setelah diupdate: " + mhs.ipk);

        System.out.println("\n===== Update IPK Tidak Valid (-1.0) =====");
        mhs.updateIpk(-1.0);
        System.out.println("IPK setelah diupdate: " + mhs.ipk);

        System.out.println("\n===== Ubah Kelas =====");
        mhs.ubahKelas("TI-B");
        mhs.tampilkanInformasi();
    }
}

