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
public class ejercicio_07 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base : ");
        int base=leer.nextInt();
        System.out.println("Ingrese el exponente : ");
        int exp=leer.nextInt();
        System.out.println(base+" elevado a "+exp+" = "+poten(base, exp));
    }
    
    //método que devuelve base elevado a exp
    //ejemplo: base = 2 y exp = 4 -> 4
    
    static int poten(int base, int exp){
        if(exp==0){
            return 1; // cualquier número elevado a cero es 1
        }else if(exp==1){
            return base;
        }
        else{
            return base*poten(base, exp-1);
        }
    }
}
