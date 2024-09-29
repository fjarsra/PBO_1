/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package manajemen;


import data.CoffeeShop;
import java.util.ArrayList;
import java.util.Scanner;

public class manage {
    private static ArrayList<CoffeeShop> daftarCoffeeShop = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keluar = false;

        while (!keluar) {
            System.out.println("\n--- Manajemen Coffee Shop ---");
            System.out.println("1. Tambah Coffee Shop");
            System.out.println("2. Lihat Semua Coffee Shop");
            System.out.println("3. Total Coffee Shop Terdaftar");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Mengatasi masalah input newline

            switch (pilihan) {
                case 1:
                    tambahCoffeeShop();
                    break;
                case 2:
                    lihatSemuaCoffeeShop();
                    break;
                case 3:
                    System.out.println("Total Coffee Shop Terdaftar: " + CoffeeShop.getTotalCoffeeShop());
                    break;
                case 4:
                    keluar = true;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private static void tambahCoffeeShop() {
        System.out.print("Masukkan Nama Coffee Shop: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat Coffee Shop: ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Jenis Kopi Favorit: ");
        String jenisKopiFavorit = input.nextLine();

        CoffeeShop coffeeShopBaru = new CoffeeShop(nama, alamat, jenisKopiFavorit);
        daftarCoffeeShop.add(coffeeShopBaru);
        System.out.println("Coffee Shop berhasil ditambahkan!");
    }

    private static void lihatSemuaCoffeeShop() {
        if (daftarCoffeeShop.isEmpty()) {
            System.out.println("Belum ada coffee shop yang terdaftar.");
        } else {
            System.out.println("\n--- Daftar Coffee Shop ---");
            for (CoffeeShop coffeeShop : daftarCoffeeShop) {
                System.out.println(coffeeShop.toString());
            }
        }
    }
}
