/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson200;

/**
 *
 * @author Administrator
 */
public class Lesson200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ;   // TODO code applicati  
        
        
        
        /////////////////bai 1
        
       
        float m=60;
        float n=15;
        float ketqua;
        System.out.println("tong");
        ketqua = m+n;
        System.out.println(ketqua);
        
        System.out.println("tru");
        ketqua = m-n ;
        System.out.println(ketqua);
        
        System.out.println("thuong");
        ketqua = m/n ;
        System.out.println(ketqua);
        
        System.out.println("tich");
        ketqua = m*n ;
        System.out.println(ketqua);
        
        
        ///bai 2
        
        double a = 1 ;
        double b = -4;
        double c = 3 ;
        double delta = b*b-4*a*c;
        double x;
        double x1;
        double x2;
        
        
        if (a!=0){
        if (delta <0) {
            System.out.println("phương trình vô nghiệm");
        }
        if (delta == 0) {
            System.out.println("phương trình có nghiệm kép");
             x = -b/(2*a);
             System.out.println(x);
        }   
        if (delta > 0)  {
            System.out.println("phương trình có 2 nghiệm phân biệt");
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = -b/a -x1 ;
            System.out.println(x1);
            System.out.println(x2);
        }
        }
        if (a == 0){
        if (b == 0) {
            if (c==0){ System.out.println("vô số nghiệm");
                
        }
            else System.out.println("phuong trinh vo lồn");
        }    
        else {System.out.println("phuong trinh co mot nghiem");
        x = -c/b;
            System.out.println(x);
        }
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    } 
    
               
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        on logic here
    }
    
}
