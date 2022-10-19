/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem6;

/**
 *
 * @author Adriano
 */
public class ejercicio_14 {
    public static void main(String[] args){
        //valor del número analizado
        int num = 1001010;
        if(enBinario(num)){ 
            System.out.println("El número está en binario");
        }else{ 
            System.out.println("El número no está en binario");
        }
    }
    
    //método que comprueba si n está en binario
    //ejemplo: n = 101011 -> true
    
    static boolean enBinario(int n){
        if(n>9){
            if(n%10==0 || n%10==1){ 
                return enBinario(n/10);
            }else{ 
                return false;
            }
        }else if(n==0 || n==1){ 
            return true;
        }else{ 
            return false;
        }
    }
}
