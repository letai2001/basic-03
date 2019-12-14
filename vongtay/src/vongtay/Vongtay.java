/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vongtay;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Vongtay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = n/7;
        int p = n-7*m;
        int k = 7 -p;
        if(m%2==0){
            System.out.println(k+" "+p);
        }else{
            System.out.println(p+" "+k);
        }
    
    
}}
