/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklkamis3;

/**
 *
 * @author fahim
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UklKamis3 {

    public static void main(String[] args) {

     int[] bil = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> negativeElements = new ArrayList<>();

        for (int i = 0; i < bil.length; i++) {
            if (bil[i] < 0) {
                negativeElements.add(bil[i]);
            }
        }
        if (negativeElements.isEmpty()) {
            System.out.println("Array tidak mengandung elemen negatif.");
        } else {
            System.out.print("Array mengandung elemen negatif: ");

        }

        for (int n = 0; n < negativeElements.size(); n++) {
            System.out.print(negativeElements.get(n));
            if (n < negativeElements.size() - 1) {
                System.out.print(", ");
            }

        }
        System.out.println(" ");
    }
    }

