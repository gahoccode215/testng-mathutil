/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gahoccode.core;

/**
 *
 * @author ASUS
 */
public class FibonacciCaculate {
    public static long getFibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n < 0){
            throw new IllegalArgumentException("Invalid n. n must be larger than 0");
        }else if(n == 0 || n == 1){
            return n;
        }else{
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
        
    }
}
