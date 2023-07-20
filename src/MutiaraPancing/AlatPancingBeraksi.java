package MutiaraPancing;

import java.util.Scanner;

public class AlatPancingBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan daftar alat pancing
        AlatPancing[] daftarAlatPancing = new AlatPancing[2];

        // Error Handling memakai Exception e
        try {
            // Input data alat pancing dan Perulangan
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

            // Menampilkan daftar alat pancing
            
            System.out.println("/n=== Daftar Alat Pancing ===");
            for (AlatPancing alatPancing : daftarAlatPancing) {
                alatPancing.Info();
                System.out.println();
            }

            // Percabangan
            System.out.print("Apakah ingin membeli alat pancing? (y/n): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("y")) {
                System.out.print("Masukkan indeks alat pancing yang ingin dibeli: ");
                int indeks = input.nextInt();
                if (indeks >= 0 && indeks < daftarAlatPancing.length) {
                    // Ketika Memilih maka kalian harus Ketik dari angka 0 yang mendeklarasikan array 1 
                    System.out.println("Anda membeli alat pancing dengan merk: " + daftarAlatPancing[indeks].getMerk());
                } else {
                    System.out.println("Indeks alat pancing tidak valid!");
                }
            } else {
                System.out.println("Terima kasih!");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input Harus Memakai ANGKA di Harga ");
        }
    }
}
