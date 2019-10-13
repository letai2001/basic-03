/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        /////////////////BÀI TẬP 2
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = String.valueOf(a);
        char [] c = b.toCharArray();
        int [] d = new int[c.length];
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            d[i] = c[i] - 48;
        }for (int i = 0; i < c.length; i++) {
            sum += d[i];
            
        }if(a%sum == 0){
            System.out.println("đây là số đặc biệt");
        }else{
            System.out.println("đây không phải số đặc biệt");
        }
           //////////BÀI TẬP 1
           long x1 = sc.nextLong();
           long x = 1;
           for (int i = 1; i <= x1; i++) {
               x = x*i;
            
        }System.out.println(x);
           
           String y = String.valueOf(x);
           char [] z = y.toCharArray();
           int count = 0;
           if (z[z.length-1]!=0){
               System.out.println("số chứ số 0 tính từ hàng đơn vị là 0");
               
           }else {
               for (int i = z.length-1; i > 0; i--) {
                   if (z[i]==z[i-1]){
                       count++;
                       
                   }else{
                       break;
                   }
                   
                   
               }System.out.println("số chữ số 0 tính từ hàng đơn vị là"+count);
           }
           
           
           
           
           
           
            
            
        
        
        
        
        
    }
    
}
