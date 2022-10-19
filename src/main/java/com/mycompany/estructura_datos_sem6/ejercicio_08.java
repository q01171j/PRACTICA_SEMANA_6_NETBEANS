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
public class ejercicio_08 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        //numero a invertir
        System.out.print("Ingrese un numero para invertir los digitos : ");
        int n = leer.nextInt();
        inv(n);
    }

    //método que dado un número, lo imprime por pantalla invertido
    //ejemplo: n = 1234 -> 4321
    
    static void inv(int n){
        if(n<10){
            System.out.print(n);
        }else{
            System.out.print(n%10);
            inv(n/10);
        }
    }
}
