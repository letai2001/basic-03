/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       int conlai = Integer.valueOf(input);
       int sodu = 0 ;
       int heso = 1000;
       String kq = "";
       while(true){
           sodu = conlai% heso;
           kq = "," +sodu+kq;
           conlai = conlai/heso;
           if(conlai<1000){
               kq = conlai + kq;
               break ;
           }
       }System.out.println(kq);
       
       
       int [][] matrix = new int [3][3];
        System.out.println("nhap vao toa do");
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        System.out.println("NHAP GIA TRI");
        int giatri = sc.nextInt();
        matrix[hang][cot] = giatri;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
                
                
            }System.out.println("");
            
        }
    }
    
}
    
}
