/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


public class CoffeeShop{
    private String nama;
    private String alamat;
    private String jenisKopiFavorit;
    private static int totalCoffeeShop = 0;

    public CoffeeShop(String nama, String alamat, String jenisKopiFavorit) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKopiFavorit = jenisKopiFavorit;
        totalCoffeeShop++;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKopiFavorit() {
        return jenisKopiFavorit;
    }

    public static int getTotalCoffeeShop() {
        return totalCoffeeShop;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Alamat: " + alamat + ", Kopi Favorit: " + jenisKopiFavorit;
    }
}

