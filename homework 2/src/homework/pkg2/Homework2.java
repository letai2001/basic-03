/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           int k  ;
           int dem = 0 ;
           k = sc.nextInt() ;
           for (int i = 2 ; i <= k; i++)
           {
               for (int j = 1 ; j <= k ; j++ )
               { if (i % j ==0){
                    dem++ ;
               }
                   
               }if (dem ==2 ){
               System.out.println(i);
               dem++;
           }
              
           }
    }
    
    

