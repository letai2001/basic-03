/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cap cua ma tran vuong");
        n = scanner.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap phan tu ma tran");
                System.out.print("A[" + i + "][" + j + "]");
                A[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += A[i][j];
                }

            }

        }
        System.out.println("tong duong cheo chinh " + sum);

    }

}
