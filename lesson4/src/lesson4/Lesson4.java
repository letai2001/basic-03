/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author Administrator
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        

    static int tinhTong(int a, int b) {
        int tong = a + b;
        return tong;
    }
    static String tentruong(){
        String tenTruong = "dhbkhn";
        return tenTruong;
    }
    static void inraSoNguyen(int x){
        System.out.println(x);
    }
    static String[] lietke(String[] hoten, int bangdiem[]){
        String[] result = new String[hoten.length];
        
        for (int i = 0; i < hoten.length; i++) {
            
            result[i] = hoten[i]+" "+bangdiem[i];
        }
            
        return  result;
        }static int tongMang(int[] mangsoNguyen){
            int sum = 0;
            for (int i = 0; i < mangsoNguyen.length; i++) {
                sum += mangsoNguyen[i];
                
            }return sum;
        }
         static boolean check(int[] arr){
             for (int i = 0; i < arr.length-1; i++) {
                 for (int j = i+1; j < arr.length; j++) {
                     if (arr[i] > arr[j]){
                        //////
                         
                     } 
                     
                 }
                 
                 
             }return true;
            
        }
}
            
        

            
        
                
    
        
    
        
    
