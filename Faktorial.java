/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        int n = input.nextInt();
        
        for (int i = 0 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++ ){
                System.out.print("*");
            }
            for (int a = 2 ; a <= i ; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 0 ; i <= n ; i++){
            for (int k = 1 ; k <= i ; k++ ){
                System.out.print(" ");
            }
            for (int a = 1 ; a <= n-i ; a++){
                System.out.print("*");
            }
            for (int c = 2 ; c <= n-i ; c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}