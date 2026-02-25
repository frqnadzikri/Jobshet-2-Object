public class DosenMain14 {
    public static void main(String[] args) {

        // objek 1 → konstruktor default
        Dosen14 d1 = new Dosen14();
        d1.idDosen = "D001";
        d1.nama = "Budi";
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";

        d1.setStatusAktif(true);
        d1.tampilInformasi();

        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2024) + " tahun");

        d1.ubahKeahlian("Artificial Intelligence");
        d1.tampilInformasi();


        // objek 2 → konstruktor parameter
        Dosen14 d2 = new Dosen14("D002", "Siti", true, 2018, "Basis Data");

        d2.tampilInformasi();

        System.out.println("Masa kerja: " + d2.hitungMasaKerja(2024) + " tahun");

        d2.setStatusAktif(false);
        d2.ubahKeahlian("Data Science");
        d2.tampilInformasi();
    }
}
