/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class homework5bai2 {
    public static void main(String[] args) {
        long soTien = 12345678;
        String s = Long.toString(soTien);
        String a = s.substring(0,s.indexOf(3)-1);
        int a1 = Integer.valueOf(a);
        String b = s.substring(s.indexOf(3),s.indexOf(5));
        int b1 = Integer.valueOf(b);
        String c = s.substring(s.indexOf(6),s.indexOf(8));
        int c1 = Integer.valueOf(c);
        System.out.println("vậy số tiền là: "+a1+","+b1+","+c1+" vnd");
        
        
        
        
        
        
       
        
        
    }
    
}
