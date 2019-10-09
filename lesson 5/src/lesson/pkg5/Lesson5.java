/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    char midman = arr[i];
                    arr[i] = arr[j];
                    arr[j] = midman;
                }
            }
        }
        String ans = String.valueOf(2);
        System.out.println("chuendoi: " + ans);
        int x = Integer.valueOf("123");
        float f = Float.valueOf("0.45");
        int c = Character.valueOf('a');
        int mssv = 20194162;
        String s = "nguyen le tai";
        int indexofspace = s.lastIndexOf(' ');
        String ten = s.substring(indexofspace + 1);
        String viettatho = String.valueOf(s.charAt(0));

        String uit = "abc";
        char[] ar = uit.toCharArray();
        for (int i = 0; i < ar.length / 2; i++) {
            ar[i] = ar[ar.length - 1 - i];

        }
    Static boolean validPassword(String pass)
        
    

    


