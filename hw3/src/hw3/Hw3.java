/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author Administrator
 */
public class Hw3 {

    /**
     * @param args the command line arguments
     *///   BAITAP1DE
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] arrayA = {2, 3, 4, 2, 6, 7};
        int sum = 0;
        int len = arrayA.length;
        for (int i = 0; i < len; i++) {

            sum += arrayA[i];

        }
        System.out.println(sum);

        //// BAITAP2DE
        int[] arrayB = {2, 3, 4, 2, 6, 7, 16, 11, 89, 70};
 boolean check = false ;
 int summ = 0;
        for (int j = 0; j < 11; j++) {
            if (j % 2 == 0) {
                System.out.println("phan tu co vi tri chan la: " + arrayB[j]);
            } else {
                System.out.println("phan tu co vi tri le la: " + arrayB[j]);
            }
            if (arrayB[j] % 2 == 0) {
                System.out.println(" phan tu chia het cho 2 la :" + arrayB[j]);
                summ += arrayB[j];
                
                
            }System.out.println("tong cac phan tu chan :"+summ);
            if (arrayB[j] % 5 == 1) {

                System.out.println(" phan tu chia 5 du 1 la: " + arrayB[j]);
                check = true;
            }

        }       

        if (check = false) {
            System.out.println("ko co phan tu nao chia 5 du 1");
        }  System.out.println("tong cac phan tu chan :"+summ);
    }

}
