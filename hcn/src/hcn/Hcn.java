/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcn;

/**
 *
 * @author Administrator
 */
public class Hcn {

    double chieudai;
    double chieurong;

    Hcn() {
        chieudai = 3;
        chieurong = 2;

    }

    Hcn(double input1, double input2) {
        chieudai = input1;
        chieurong = input2;

    }

    void dientich() {
        double dientich = chieudai * chieurong;

    }

    void chuvi(double px, double py) {
        double chuvi = 2 * px + 2 * py;
    }
}
