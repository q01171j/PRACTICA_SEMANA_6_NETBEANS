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
public class ejercicio_04 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número para sumar sus digitos: ");
        int num = leer.nextInt();
        System.out.println(num+" tiene "+digi(num)+" dígitos");
    }

    //método que devuelve la cantidad de dígitos de num, num debe ser positivo
    //ejemplo: num = 1111 -> 4
    //ejemplo: num = 45895 -> 5

    static int digi(int num){
        if(num<=0) return 0;
        return 1 + digi(num/10);
    }
}
