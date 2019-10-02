/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

 
    int n ;
        boolean arr[];
        arr = new boolean[n +1];
        for(int i=2;i<=n;i++){
            arr[i] = true;
        }
        for(int i=2;i<=n;i++){
            for(int k=2;k*i<=n;k++){
                int j=k*i;
                arr[j] = false;
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
       
    }
}
    }
    
}
