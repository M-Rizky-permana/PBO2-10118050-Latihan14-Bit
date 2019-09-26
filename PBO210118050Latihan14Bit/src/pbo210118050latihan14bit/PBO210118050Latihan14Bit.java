/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo210118050latihan14bit;

/**
 *
 * @author 
 * NAMA     : Muhamad Rizky Permana
 * KELAS    : IF-2
 * NIM      : 10118050
 * Deskripsi Program : Menampilkan penghitungan bit
 */
public class PBO210118050Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60;/* 60 = 0011 1100 */
        int b = 13;/* 13 = 0000 1101 */
        int c = 0;
        
        c = a & b;
        /* */
        System.out.println("a & b = " + c);
        c = a | b;
        /* */
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* */
        System.out.println("a ^ b = " + c);
        c = ~a;
        /* */
        System.out.println("~a = " + c);
        c = a << 2;
        /* */
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        /* */
        System.out.println("a >> 2 = " + c);
        
        
        
        
        
        
    }
    
}
