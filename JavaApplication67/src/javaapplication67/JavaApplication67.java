/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication67 {

    static int[][] board = new int[10][10];
    static int sothutu = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            move();
            if (check()) {
                System.out.println("người chơi " + sothutu + " thắng");
                break;
            }
            swap();
            show();

        }
    }

    public static void move() {
        System.out.println("nhập tọa độ người chơi thứ  " + sothutu);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        board[x][y] = sothutu;

    }

    public static void swap() {
        sothutu = 3 - sothutu;
    }

    public static boolean check() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i + 1][j] && board[i + 1][j] == board[i + 2][j] && board[i + 2][j] == board[i + 3][j]) {
                    return true;

                }
                if (board[j][i] != 0 && board[j][i] == board[j][i + 1] && board[j][i + 1] == board[j][i + 2] && board[j][i + 2] == board[j][i + 3]) {
                    return true;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i + 1][j + 1] && board[i + 1][j + 1] == board[i + 2][j + 2] && board[i + 2][j + 2] == board[i + 3][j + 3]) {
                    return true;
                }
            }

        }
        for (int i = 3; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i - 1][j + 1] && board[i - 1][j + 1] == board[i - 2][j + 2] && board[i - 2][j + 2] == board[i - 3][j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void show() {
        System.out.println("người chơi " + sothutu);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }

    }

}
