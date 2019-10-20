/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8.pkg2;

/**
 *
 * @author Administrator
 */
public class Lesson82 {

    /**
     * @param args the command line arguments
,     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        phanso p  = new phanso();
        phanso p1 = new phanso();
        phanso p2 = new phanso();
        p1.tuso = 1;
        p1.mauso = 2;
        p2.tuso=2;
        p2.mauso=4;
        int mausoChung  = p1.mauso*p2.mauso;
        int tusoChung = p1.tuso*p2.mauso+p1.mauso*p2.tuso;
        phanso p5 = new phanso(5,6);
        
                
        
    }static phanso cong(int a , int b){
        phanso ketqua = new phanso();
        return ketqua ;
        
    }static phanso  rutgon(int a ,int b){
        
        
        
            for (int i = 1; i <= b ; i++) {
                if (a%i == 0&& b%i == 0){
                    a = a/i;
                    b = b/i;
                }
                
            }return phansorutgon;
            
    
}
    
    
    
    

}