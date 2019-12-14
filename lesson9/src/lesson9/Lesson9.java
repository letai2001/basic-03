/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import  java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lesson9 {
static int luachon;
static ArrayList<Sinhvien>dssv;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dssv = new ArrayList<Sinhvien>();
        
        Scanner sc = new Scanner(System.in);
        int luachon;
        while(true){
            hienthimenu();
            nhapluachon();
            switch (luachon) {
                case 
                case read();
                case update();
                case delete();
            }
        }
    }

    private static void hienthimenu() {
        System.out.println("cacluachon");
        System.out.println("1.Create:tao moi 1 sinh vien");
        System.out.println("2.read:hienthimotsinhvien");
        System.out.println("3.update:nhapthongtinsinhvien");
        System.out.println("4.delete:xoa 1 sinhvien");
    }

    private static int nhapluachon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("luachoncuaban");
        int n = sc.nextInt();
        return n;
        
    }static void creat(){
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao mssv moi:");
            System.out.println("nhap mssv");
            int mssv = sc.nextInt();
            sc.nextLine();
            System.out.println("nhaphoten");
            String hoten = sc.nextLine();
            System.out.println("nhap cpa :");
            float diem = sc.nextFloat();
            Sinhvien sinhvienmoi = new Sinhvien(mssv,hoten,diem);
            dssv.add(sinhvienmoi);
            
            
        
        
        
    }static void read(){
            for (int i = 0; i < dssv.size(); i++) {
                Sinhvien svdangxet = dssv.get(i);
                System.out.println("sothutu:"+i);
                System.out.println("mssv:"+svdangxet.mssv);
                System.out.println("hoten:"+svdangxet.hoten);
                System.out.println("cpa"+svdangxet.cpa);
                
            }
    }static void delete(){
            System.out.println("nhap vao mssv can xoa");
            int mssvcanxoa = new Scanner(System.in).nextInt();
            for (int i = 0; i < dssv.size(); i++) {
                if(dssv.getClass(i).mssv==mssvcanxoa){
                    String confirm = " ";
                    System.out.println("bạn có muốn xóa ko");
                }}  String confirm = new Scanner(System.in).nextLine();
                
    }static void update_cpa(){
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap mssv");
            int mssv = sc.nextInt();
            System.out.println("nhap cpa moi:");
            float cpamoi = sc.nextFloat();
            for (int i = 0; i < dssv.size(); i++) {
                if(dssv.get(i).mssv == mssv){
                    
                    
                }
                
            }
    }
    
}
