/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Administrator
 */
public class Point {

    /**
     * @param args the command line arguments
     */
    float hoanhdo;
    float tungdo;
    float caodo;
    // TODO code application logic here

    //khởi tạo không tham số
    Point() {
        float hoanhdo = 1;
        float tungdo = 2;
        float caodo = 1;

    }/// khởi tạo 3 số thực làm tham số

    Point(float input1, float input2, float input3) {
        hoanhdo = input1;
        tungdo = input2;
        caodo = input3;

    }

    void hienthitoado() {
        System.out.println(hoanhdo + "," + tungdo + "," + caodo);
    }
}
