Jawaban
1. Dua Karakteristik Class/Object
Class atau object memiliki dua karakteristik utama yaitu atribut dan method. Atribut adalah karakteristik atau sifat yang dimiliki oleh suatu object (seperti nama, nim, ipk), sedangkan method adalah perilaku atau aksi yang dapat dilakukan oleh object tersebut (seperti menampilkan informasi atau mengubah data).

2. Atribut Class Mahasiswa
Class Mahasiswa memiliki 4 atribut, yaitu:

nim bertipe String — menyimpan nomor induk mahasiswa
nama bertipe String — menyimpan nama mahasiswa
kelas bertipe String — menyimpan kelas mahasiswa
ipk bertipe double — menyimpan nilai IPK mahasiswa


3. Method Class Mahasiswa
Class Mahasiswa memiliki 4 method, yaitu:

tampilkanInformasi() — menampilkan seluruh data mahasiswa ke layar
ubahKelas(String kelasBaru) — mengubah kelas mahasiswa dengan nilai baru
updateIpk(double ipkBaru) — memperbarui nilai IPK mahasiswa
nilaiKinerja() — mengembalikan keterangan kinerja mahasiswa berdasarkan nilai IPK
5. Cara Kerja Method nilaiKinerja()
Method nilaiKinerja() bekerja dengan cara membaca nilai atribut ipk yang dimiliki object, lalu mengevaluasinya menggunakan struktur percabangan if-else if-else secara berurutan dari nilai tertinggi ke terendah.