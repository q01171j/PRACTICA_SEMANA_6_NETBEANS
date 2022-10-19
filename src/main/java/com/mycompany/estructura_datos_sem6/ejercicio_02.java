/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem6;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_02 {
    public static void main(String[] args){
        int i = 1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        int n = leer.nextInt();
        crece(i,n);
    }

    //método que imprime dígitos de 1 hasta n
    //ejemplo: n=5 -> 12345
    //ejemplo: n=8 -> 12345678

    static void crece(int i , int n){
        if(i<=n){
            System.out.print(i);
            crece(i+1,n);
        }else{
            System.out.println();    
        }
    }
}
