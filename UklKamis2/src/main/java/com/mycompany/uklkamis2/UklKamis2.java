/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklkamis2;

/**
 *
 * @author fahim
 */
import java.util.Scanner;

public class UklKamis2 {

    //untuk menghitung luas bola
    /**
     *
     * @param @return
     */
    public static double hitungLuasPermukaanBola(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Masukkan jari-jari bola: ");
            double jariJari = scanner.nextDouble();

            double luasPermukaan = hitungLuasPermukaanBola(jariJari);

            System.out.printf("Luas permukaan bola dengan jari-jari %.2f adalah %.2f%n", jariJari, luasPermukaan);

        }
    }

}
