/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int copyA=a;
        
        int b = sc.nextInt();
        int copyB = b;
        while(true){
            if(a>b){
                if(b==0){
                    break;
                }else{
                    a = a-b;
                }
            
               
                
            }else{
                if(a==0){
                    break;
                }else{
                    b = b-a;
                }
                    
            }
            
            
        }int gcd = a+b;
        System.out.println(gcd);
        int lcm = (copyA*copyB)/gcd;
        System.out.println(lcm);
    }

}
