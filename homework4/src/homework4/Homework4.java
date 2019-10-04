/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 *
 * @author Administrator
 */
public class Homework4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       int [] A ={1,2,3,4,5};
       
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length + 1 - i]) {
                return false;
            }

        }
        return true;

    }
    //////////////////////BAITAP2

    static boolean songuyento(int a) {

        for (int i = 1; i <= a; i++) {
            int count = 0;

            if (a % i == 0) {

                count++;
            }
            if (count != 2) {
                return false;
            }

        }
        return true;

    }///////////////////////BAITAP3

    static String[] kitutangdan(String[] daykitu) {
        String[] sapxep = new String[daykitu.length];
        for (int i = 0; i < daykitu.length - 1; i++) {
            for (int j = i + 1; j < daykitu.length; j++) {
                if (daykitu[i].compareTo(daykitu[j]) > 0) {
                    for (int k = 0; k < daykitu.length; k++) {
                        sapxep[k] = daykitu[k];

                    }
                }

            }

        }
        return sapxep;

    }//////////////////BAITAP4

    static int sapxep(int dayso[]) {

        for (int i = 0; i < dayso.length - 1; i++) {
            for (int j = i + 1; j < dayso.length; j++) {
                if (dayso[i] < dayso[j]) {

                    return 1;

                }if (dayso[i] > dayso[j]){
                    return -1;
                

            }

        }

    }return 0;

}}
