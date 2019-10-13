/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.pkg2;

/**
 *
 * @author Administrator
 */
public class Lesson62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1, 2, 4, 4, 4, 2, 5};
        int maxA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxA) {
                maxA = a[i];

            }

        }int []b = new int [maxA+1];
        for (int i = 0; i < a.length; i++) {
        b[a[i]]++;    
            
        }int maxB = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]>maxB){
                maxB = b[i];
                
            }
            
        }for (int i = b.length-1; i > 0; i--) {
            if(b[i] == maxB)
            
        }

    }     

}
