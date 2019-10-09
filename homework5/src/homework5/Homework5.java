/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author Administrator
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */////BÀI TẬP 3
    public static void main(String[] args) {
        String s = "235-1222";
        int x = s.indexOf("-");
        String a = s.substring(0, x - 1);
        String b = s.substring(x+1, s.length());
        int c = Integer.valueOf(a);
        int d = Integer.valueOf(b);
        int e = c - d;
        System.out.println("kết quả của phép tính là"+c);
        
        

    }///////BÀI TẬP 1(EM RÚT GỌN CÒN LẠI MẤY KÍ TỰ)

    public static boolean containSpecial(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '!' && a[i] == '@' && a[i] == '#' && a[i] == '$' && a[i] == '^') {
                return true;
            }

        }
        return false;

    }
}//////BAITAP3

