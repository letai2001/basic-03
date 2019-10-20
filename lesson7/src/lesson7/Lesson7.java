/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson7 {

    static int vitri = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hạng của ma trận");
        int n = sc.nextInt();

        if (0 < n && n < 20) {
            int[][] b = new int[n][n];
            System.out.println("nhập vào vị trí ban đầu");
            int x = sc.nextInt();
            int y = sc.nextInt();
            b[x][y] = vitri;

            while (true) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(b[i][j]);

                    }
                    System.out.println("");
                }
                String a = sc.next();

                
                if (a.equalsIgnoreCase("UP")) {
                    x = x - 1;
                    System.out.println(x);
                    vitri = b[x][y];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == y && j == x) {
                                b[i][j] = b[x][y];
                            }
                            System.out.print(b[i][j]);

                        }
                        System.out.println("");

                    }

                }
//                if (a == "DOWN") {
//                    x = x + 1;
//                    vitri = b[x][y];
//                     for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i == y && j == x) {
//                            b[i][j] = b[x][y];
//                        }System.out.print(b[i][j]);
//
//                        }System.out.println("");
//                        
//                    }
//               
//
//                }
//                if (a == "LEFT") {
//                    y = y - 1;
//                    vitri = b[x][y];
//                     for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i == y && j == x) {
//                            b[i][j] = b[x][y];
//                        }System.out.print(b[i][j]);
//
//                        }System.out.println("");
//                       
//                    }
//               
//
//                }
//                if (a == "RIGHT") {
//                    y = y + 1;
//                    vitri = b[x][y];
//                     for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i == y && j == x) {
//                            b[i][j] = b[x][y];
//                        }System.out.print(b[i][j]);
//
//                        }System.out.println("");
//                        
//                    }
//               
//                }

            }

        }
    }
}
