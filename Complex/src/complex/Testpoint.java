/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoint;

/**
 *
 * @author Administrator
 */
public class Testpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point a = new Point();
        a.hoanhdo = 1;
        a.tungdo = 2;
        a.caodo = 3;
        Point b = new Point(3, 2, 1);
        b.hienthitoado();
    }

}
