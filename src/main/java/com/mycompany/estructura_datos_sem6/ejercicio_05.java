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
public class ejercicio_05 {
    public static void main(String[] args){
        //obtier factorial de n
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número a factorizar:");
        int n = leer.nextInt();
        System.out.println(n+"! = "+fact(n));
    }

    //método que devuelve el factorial de n
    //ejemplo: n = 4 -> 4x3x2x1

    static int fact(int n){
        if(n>1) return n * fact(n-1);
        else return 1;
    }
}
