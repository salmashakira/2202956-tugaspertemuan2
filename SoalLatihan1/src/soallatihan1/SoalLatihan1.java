/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package soallatihan1;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class SoalLatihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan pecahan pertama (masukan pembilang/penyebut dgn spasi): ");
        int pembilang1 = scanner.nextInt();
        int penyebut1 = scanner.nextInt();

        System.out.print("Masukkan pecahan kedua (masukan pembilang/penyebut dgn spasi): ");
        int pembilang2 = scanner.nextInt();
        int penyebut2 = scanner.nextInt();

        System.out.print("Masukkan pecahan ketiga (masukan pembilang/pembagi dgn spasi): ");
        int pembilang3 = scanner.nextInt();
        int penyebut3 = scanner.nextInt();

        double pecahan1 = (double) pembilang1 / penyebut1;
        double pecahan2 = (double) pembilang2 / penyebut2;
        double pecahan3 = (double) pembilang3 / penyebut3;

        System.out.println("Hasil penjumlahan: " + (pecahan1 + pecahan2 + pecahan3));
        System.out.println("Hasil pengurangan: " + (pecahan1 - pecahan2 - pecahan3));
        System.out.println("Hasil perkalian: " + (pecahan1 * pecahan2 * pecahan3));
        System.out.println("Hasil pembagian: " + (pecahan1 / pecahan2 / pecahan3));
    }
}
