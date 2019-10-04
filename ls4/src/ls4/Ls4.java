/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ls4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] danhsachhoten = {"A", "b", "c", "d", "e"};

        int[] diem = {4, 2, 5, 3, 1};
        for (int a = 0; a < danhsachhoten.length - 1; a++) {
            for (int b = a + 1; b < danhsachhoten.length; b++) {
                if (diem[a] > diem[b]) {
                    int tem = diem[a];

                    diem[a] = diem[b];
                    diem[b] = tem;
                    String t = danhsachhoten[a];
                    danhsachhoten[a] = danhsachhoten[b];
                    danhsachhoten[b] = t;

                }

            }

        }
        System.out.println("");
        for (int c = 0; c < danhsachhoten.length; c++) {
            System.out.println(danhsachhoten[c] + "\t" + diem[c]);

        }

    }

}
