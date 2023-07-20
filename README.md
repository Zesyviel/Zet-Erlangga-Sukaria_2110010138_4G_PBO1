# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `AlatPancing`, `ReelAlatPancing`, dan `AlatPancingBeraksi` adalah contoh dari class.

```bash
public class AlatPancing {
    ...
}

public class ReelAlatPancing extends AlatPancing {
    ...
}

public class AlatPancingBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarAlatPancing[i] = new AlatPancing(merk, harga);` adalah contoh pembuatan object.

```bash
daftarAlatPancing[i] = new AlatPancing(merk, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `harga` adalah contoh atribut.

```bash
String merk;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `AlatPancing` dan `ReelAlatPancing`.

```bash
public AlatPancing(String merk, double harga) {
        this.merk = merk;
        this.harga = harga;
    }

public ReelAlatPancing(int gearRatio, String merk, double harga) {
        super(merk, harga);
        this.gearRatio = gearRatio;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` dan `setHarga` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
        this.merk = merk;
    }

public void setHarga(double harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getHarga`, dan `getGearRatio` adalah contoh method accessor.

```bash
public String getMerk() {
    return nama;
}

public String getHarga() {
    return npm;
}
public int getGearRatio() {
    return gearRatio;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk`,`harga`, dan `gearRatio` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private double harga;
private int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ReelAlatPancing` mewarisi `AlatPancing` dengan sintaks `extends`.

```bash
public class ReelAlatPancing extends AlatPancing {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini,`Info` di `Reel` merupakan override dari method `Info` di `AlatPancing`.

```bash
@Override
public String Info() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi 1 `if else` dalam Perulangan `for` untuk penginputan data dan seleksi 2 `if else` di gunakan untuk memilih data pada class `AlatPancingBeraksi`.

```bash
// Seleksi 1 - Digunakan dalam perulangan for untuk menginput data alat pancing
for (int i = 0; i < daftarAlatPancing.length; i++) {
                System.out.println("=== Alat Pancing " + (i + 1) + " ===");
                System.out.print("Masukkan merk alat pancing: ");
                String merk = input.nextLine();
                System.out.print("Masukkan harga alat pancing: ");
                double harga = input.nextDouble();
                input.nextLine(); // Membersihkan \n di buffer

                System.out.print("Apakah alat pancing adalah reel? (y/n): ");
                String reel = input.nextLine();

                if (reel.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan gear ratio reel: ");
                    int gearRatio = input.nextInt();
                    input.nextLine(); // Membersihkan \n di buffer
                    daftarAlatPancing[i] = new ReelAlatPancing(gearRatio, merk, harga);

                } else {
                    daftarAlatPancing[i] = new AlatPancing(merk, harga);
                }
            }
// Seleksi 2 - Digunakan untuk membeli alat pancing
System.out.print("Apakah ingin membeli alat pancing? (y/n): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("y")) {
                System.out.print("Masukkan indeks alat pancing yang ingin dibeli: ");
                int indeks = input.nextInt();
                if (indeks >= 0 && indeks < daftarAlatPancing.length) {
                    System.out.println("Anda membeli alat pancing dengan merk: " + daftarAlatPancing[indeks].getMerk());
                } else {
                    System.out.println("Indeks alat pancing tidak valid!");
                }
            } else {
                System.out.println("Terima kasih!");
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input data.

```bash
for (int i = 0; i < daftarAlatPancing.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.println("=== Alat Pancing " + (i + 1) + " ===");
                System.out.print("Masukkan merk alat pancing: ");
                String merk = input.nextLine();
                System.out.print("Masukkan harga alat pancing: ");
                double harga = input.nextDouble();
                input.nextLine();

System.out.println("=== Daftar Alat Pancing ===");
            for (AlatPancing alatPancing : daftarAlatPancing) {
                alatPancing.Info();
                System.out.println();
            }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `AlatPancing[] daftarAlatPancing = new AlatPancing[2];` adalah contoh penggunaan array.

```bash
AlatPancing[] daftarAlatPancing = new AlatPancing[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
  System.out.println("Terjadi kesalahan input Harus Memakai ANGKA di Harga ");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama  : Zet Erlangga Sukaria
|| NPM   : 2110010138
