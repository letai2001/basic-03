/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcn;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("Nhap vao chieu dai");
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        System.out.println("Nhap vao chieu rong");
        int cr = sc.nextInt();
        Hcn h = new Hcn(cd, cr);
       int a = 5/7;
        System.out.println(a);
    }
}
