/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructura_datos_sem6;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        //llamada para obtener la suma de 5
        System.out.print("Ingrese un número entero: ");
        int n = leer.nextInt();
        System.out.println("=====");
        System.out.println(sum(n));
    }
    
    //método que devuelve la suma de los elementos desde n hasta 1
    //ejemplo: n = 4 -> 4+3+2+1=10
    static int sum(int n){
        //caso base
        if(n==1){
            return 1;
        }
        else{
            //llamada recursiva
            return n + sum(n-1);
        }
    }
}
