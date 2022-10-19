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
public class ejercicio_06 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        //numero de fibonacci
        System.out.print("Ingrese un número para calcular su fibonacci: ");
        int num = leer.nextInt();

        System.out.println("metodo 1 :");
        System.out.println("Fibonacci de "+num+" es "+fibonacci1(num));
        System.out.println("metodo 2 :");
        System.out.println("Fibonacci de "+num+" es "+fibonacci2(num));
        System.out.println("metodo 3 :");
        System.out.println("Fibonacci de "+num+" es "+fibonacci3(num));
    }

    //solución 1
    
    static int fibonacci1(int n){
        if (n>1)  return fibonacci1(n-1) + fibonacci1(n-2);  //función recursiva
        else if (n==1)
            return 1;
        else
            return 0;
    }

    //solución 2
    
    static int fibonacci2(int n){
        if (n>1)
        return fibonacci2(n-1) + fibonacci2(n-2);  //función recursiva
        else return n;
    }
    
    //solución 3
    
    static int fibonacci3(int n){
        if (n<2)
        return n;
        else return fibonacci3(n-1) + fibonacci3(n-2);  //función recursiva
    }
}
