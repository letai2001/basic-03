/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app
        Scanner sc = new Scanner(System.in);
        int x = 1234;
        int y = 12345;
        int d = 0;
        while (y > 0) {
            int r = y % 10;
            y = y / 10;
            System.out.println("phan du:" + r + "phan con lai" + y);
            int multi = r * x;
            String space = "";
            for (int i = 0; i < d; i++) {
                space = space + "-";
            }
            System.out.printf(multi + space);
            
            // dataitype name var[]
            int array[] = new int[100];
            char[] charArray = new char[50];
            int[][] matrix = new int[3][3];
            String[] sArray = new String[10];

            int[] a12345 = {1, 2, 3, 4, 5};
            

        }int[] mangA = {1,22,36,42,51};
        System.out.println(mangA[0]);
        
       
        
        for (int i = 0; i < mangA.length; i++) {
            System.out.print("index"+i);
            System.out.println("\tvalue"+mangA[i]);
        }
        
       String s = "Nhay doi \" Tab3123123\t xuong dong\n dau gach \\";
       String sample = "nguyen";
        System.out.println("sample\t"+sample);
        System.out.println("length\t"+sample.length());
        char key = 'n';
        for (int i = 0; i < sample.length(); i++){
            if (sample.charAt(i)==key ) {
                System.out.println(+i);
            
        }break;
            
            
            
               
        
        
        
                

    }int [] mangB = {1,22,36,42,51,22,65,33,67};
    boolean tim =true;
    int len = mangB.length;
        for (int i = 0; i < len; i++) {
            
            if (mangB[i]%5==1){
                System.out.println(mangB[i]);
                tim = true;
            }if (tim ==false){
                System.out.println("kotimthay");
            }
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
