/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Administrator
 */
class Complex {
    public static void main(String[] args) {
        Complex a = new Complex(2,3);
        Complex b = new Complex(3,4);
        b.hienthisophuc();
        hieuhaisophuc(a,b);
    }

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    float phanthuc;
    float phanao;
    // hàm khởi tạo không tham số

    Complex() {
        phanthuc = 1;
        phanao = 2;

    }///// hàm khởi tạo nhận một số thực làm tham số

    Complex(float input) {
        phanthuc = input;
    }///// hàm khởi tạo 2 số thực làm tham số

    Complex(float input1, float input2) {
        phanthuc = input1;
        phanao = input2;
    }

    void tonghaisophuc(Complex p1, Complex p2) {
       
      
        

    }

    void hieuhaisophuc(Complex p1,Complex p2) {
        Float thuc1 = p1.phanthuc - p2.phanthuc;
        Float ao1 = p1.phanao - p2.phanao;
        System.out.println(thuc1 + "+" +ao1 + "i");
    }

    void tichhaisophuc(Complex p1, Complex p2) {
        float a = p1.phanthuc * p2.phanthuc - p1.phanao * p2.phanao;
        float b = p1.phanthuc * p2.phanao + p1.phanao + p2.phanthuc;
        System.out.println(a + "+" + b + "i");

    }

    void thuonghaisophuc(Complex p1, Complex p2) {
        float c = p1.phanthuc * p2.phanthuc + p2.phanao * p1.phanao;
        float d = p2.phanthuc * p1.phanao - p2.phanao * p1.phanthuc;
        float e = p2.phanthuc * p2.phanthuc + p2.phanao * p2.phanao;
    }

    void hienthisophuc() {
        System.out.println(phanthuc + "+" + phanao + "i");
    }

}
