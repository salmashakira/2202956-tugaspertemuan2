/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan2;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class SoalLatihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan rangking Anda : ");
        int rangking = input.nextInt();
        
        System.out.print("Apakah Anda naik kelas (true/false): ");
        boolean naikKelas = input.nextBoolean();
        
        boolean akanDiberihadiah = (rangking==1) && (naikKelas);
        
        if (akanDiberihadiah) {
            System.out.println("Selamat! Anda mendapatkan hadiah!");
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan hadiah");
        }
        
        input.close();
    }
}
