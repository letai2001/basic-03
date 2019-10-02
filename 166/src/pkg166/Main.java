/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg166;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array [] = new int [100];
        int [] mangA = {1,22,36,55 51};
        int k =22;
        boolean timthay = false ;
        int length = mangA.length;
        for (int i = 0; i < mangA.length; i++){
            if (mangA[i]==k) {
                System.out.println(i);
                timthay = true;
            }
        }if (timthay==false){
            System.out.println("kotimthay");
            
        }
       
        
    }
    
}
