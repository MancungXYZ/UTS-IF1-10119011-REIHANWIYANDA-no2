/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119011.reihanwiyanda.no2;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class UTSIF110119011REIHANWIYANDANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukan Saldo Awal : Rp ");
        Tabungan tb = new Tabungan (sc.nextInt());
        
        System.out.print("Jumlah uang yang di ambil : Rp ");
        System.out.println("Saldo Anda Sekarang : " + tb.ambilUang(sc.nextInt()));
        
        
    }
    
}
