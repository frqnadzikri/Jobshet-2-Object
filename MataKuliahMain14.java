public class MataKuliahMain14 {

    public static void main(String[] args) {

        // Objek 1 (menggunakan konstruktor default)
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        // Objek 2 (menggunakan konstruktor berparameter)
        MataKuliah14 mk2 = new MataKuliah14("IF101", "Pemrograman Dasar", 4, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();
    }
}