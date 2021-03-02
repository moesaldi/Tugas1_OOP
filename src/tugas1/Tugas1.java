/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;
/**
 *
 * @author Optimoes
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        int detik,menit;
        
        System.out.print("Enter an innteger for seconds : ");
        detik = baca.nextInt();
        
        menit = detik / 60;
        
        System.out.println(detik+" seconds is "+menit+" minutes and "+detik%60+" seconds");
    }
    
}
