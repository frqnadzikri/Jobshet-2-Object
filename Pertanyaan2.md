1. Mahasiswa mhs1 = new Mahasiswa();
```

Penjelasannya: `Mahasiswa` adalah tipe class, `mhs1` adalah **nama object** yang dihasilkan, dan `new Mahasiswa()` adalah proses instansiasi yang membuat object baru dari class Mahasiswa

2. Cara Mengakses Atribut dan Method dari Suatu Object**

Cara mengakses atribut dan method dari suatu object menggunakan **tanda titik (.)** dengan format:
```
namaObject.namaAtribut   // untuk mengakses atribut
namaObject.namaMethod()  // untuk mengakses method
3. 
Alasan Output Pertama dan Kedua Berbeda
Output pertama dan kedua berbeda karena sebelum pemanggilan tampilkanInformasi() yang kedua, terdapat dua method yang mengubah nilai atribut object mhs1, yaitu:

mhs1.ubahKelas("SI 2K") — mengubah nilai atribut kelas dari "SI 2J" menjadi "SI 2K"
mhs1.updateIpk(3.60) — mengubah nilai atribut ipk dari 3.55 menjadi 3.6