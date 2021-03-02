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
public class harii {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        int jarak,jumlah;
        System.out.println("Hari ini adalah hari senin ");
        
        System.out.print("Masukan jumlah hari ke depan : ");
        jarak = baca.nextInt();
        
        jumlah = jarak%7;
        
        if(jumlah == 0){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Senin");
        }
        else if(jumlah == 1){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Selasa");
        }
        else if(jumlah == 2){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Rabu");
        }
        else if(jumlah == 3){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Kamis");
        }
        else if(jumlah == 4){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Jumat");
        }
        else if(jumlah == 5){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Sabtu");
        }
        else if(jumlah == 6){
            System.out.println("Maka "+jarak+" hari berikutnya adalah hari Minggu");
        }
        
    }
}