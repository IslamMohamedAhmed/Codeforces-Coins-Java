/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.coins;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class Coins {

    public static void main(String[] args) {
        String[] arr = new String[3];
        char[] arr2 = new char[3];
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
            String helper1 = arr[i];
            char helper2;
            if (helper1.toCharArray()[1] == '>') {
                helper2 = helper1.toCharArray()[0];
            } else {
                helper2 = helper1.toCharArray()[2];
            }
            switch (helper2) {
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'C':
                    c++;
                    break;

            }
        }
        if (a + b + c == 3 && (a == 2 || b == 2 || c == 2)) {
            arr2[a] = 'A';
            arr2[b] = 'B';
            arr2[c] = 'C';
            for (int i = 0; i < 3; i++) {
                System.out.print(arr2[i]);
            }

        } else {
            System.out.println("Impossible");
        }

    }
}
