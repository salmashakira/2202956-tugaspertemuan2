/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan3;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class SoalLatihan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan karakter pertama: ");
        char karakterA = input.next().charAt(0);
        
        System.out.print("Masukkan karakter kedua: ");
        char karakterB = input.next().charAt(0);
        
        int kodeASCIIA = (int) karakterA;
        int kodeASCIIB = (int) karakterB;
        
        int hasilJumlah = kodeASCIIA + kodeASCIIB;
        
        System.out.println("Hasil penjumlahan kode ASCII dari " + karakterA + " dan " + karakterB + " adalah: " + hasilJumlah);
        
        input.close();
    }
}
