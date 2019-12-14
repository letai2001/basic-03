/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiaqua;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Chiaqua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] != 100 && a[i] != 200) {
                System.out.println("kothoaman");
                break;
            } else {
                sum += a[i];

            }

        }if(sum%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}