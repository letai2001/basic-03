/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.pkg1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so :");
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        int[] c = new int[b.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = b[i]-48; 
        }
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println(sum);
        if (sum%10 == 9) {
            System.out.println("so dep");
        }else System.out.println("ko dep");

    }

}

