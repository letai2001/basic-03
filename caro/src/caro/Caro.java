/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caro;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Caro {

    static int[][] board = new int[3][3];
    static int sothutu = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic 
        while (true) {
            move();
            if (check()) {
                System.out.println("người chơi " + sothutu + " thắng");
                break;
            }
            hoandoi();
            show();
        }
    }

    public static void move() {
        System.out.println("nhập vị trí tọa độ  người chơi " + sothutu);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        board[x][y] = sothutu;

    }

    public static void hoandoi() {
        sothutu = 3 - sothutu;

    }

    private static boolean check() {
        if (board[0][0] != 0 && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            return true;
        }
        if (board[1][0] != 0 && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            return true;
        }
        if (board[2][0] != 0 && board[2][0] == board[2][1] & board[2][1] == board[2][2]) {
            return true;
        }
        if (board[0][0] != 0 && board[0][0] == board[1][0] & board[1][0] == board[2][0]) {
            return true;
        }
        if (board[0][1] != 0 && board[0][1] == board[1][1] & board[1][1] == board[2][1]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][2] & board[1][2] == board[2][2]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][2] & board[1][2] == board[2][2]) {
            return true;
        }
        if (board[0][0] != 0 && board[0][0] == board[1][1] & board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] & board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    private static void show() {
        System.out.println("Player" + sothutu);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
    }

}
