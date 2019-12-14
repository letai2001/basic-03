/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and opettttjnty'
ythyt template in the editor.
 */
package lesson10;

/**
 *
 * @author Administrator
 */
public class Lesson10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //eurathos
        
        int n = 100;
        //     for (int i = 0; i < n; i++) {

        // 
        boolean erathos[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (erathos[i] == false) {
                int j = 2;
                while (j*i < n) {
                    erathos[j*i] = true;
                    j = j + i;

                }
            }
        }for (int i = 0; i < n; i++) {
            if(erathos[i]==true){
                System.out.println(":khonglasonguyento");
            }else{
                System.out.println(i+":lasonguyento");
            }
            
        }

    }

    static boolean kiemtrasnt(int x) {
        int dem = 0;
        for (int i = 2; i <= x / 2; i++) {
            if (i % 1 == 0) {
                dem++;
            }
        }
        if (dem == 0) {
            return true;
        } else {
            return false;
        }

    }

}
