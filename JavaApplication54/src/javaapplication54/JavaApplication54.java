/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 7;
        if (n < 7) {
            System.out.println(7 - n + " " + n);
        } else {
            long b = n - 7 * a;
            long c = 7-b;
            if (a % 2 != 0) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(c + " " + b);
            }
        }
    }

}
