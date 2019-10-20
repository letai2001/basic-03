/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập các phân số vào");
        System.out.print("tử số 1: ");
        
        int tuso1 = sc.nextInt();
        System.out.println(tuso1);
        System.out.print("mẫu số 1:");
        
        int mauso1 = sc.nextInt();
        System.out.println(mauso1);
        System.out.print("tử số 2:");
        
        int tuso2 = sc.nextInt();
        System.out.println(tuso2);
        System.out.print("mẫu số 2:");
        int mauso2 = sc.nextInt();
        System.out.print(mauso2);
        System.out.println(tuso1+"/"+mauso1+" +"+tuso2+"/"+mauso2 );
        int tuso3 = tuso1*mauso2+tuso2*mauso1;
        int mauso3 = mauso1*mauso2;
        System.out.println("kết quả là");
        System.out.println(tuso3+"/"+mauso3);
        
        
        
        
        
        
        
        
    }
    
}
