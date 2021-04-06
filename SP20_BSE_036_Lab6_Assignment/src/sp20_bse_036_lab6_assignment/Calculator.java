/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20_bse_036_lab6_assignment;

/**
 *
 * @author Rehman Computer
 */
public class Calculator {
     static double sin_value;
     static double cos_value;
     static int modulus;
     static int sum;
     static int multiply;
     static double division;
     static int subtraction;
    public static int sum(int x,int y){
        
        return sum=x+y;
    }
    public static int multiply(int x,int y){
        return multiply=x*y;
    }
    public static double divide(int x,int y){
        return division =x/y;
         
    }
    public static int subtraction(int x,int y){
        return subtraction= x-y;
    }
     
    public static double sin(double dgree){
        double radian= Math.toRadians(dgree);
        return sin_value= Math.sin(radian);
    }
     public static double cos(double dgree){
        double radian= Math.toRadians(dgree);
        return cos_value= Math.cos(radian);
    }
     public static int modulus(int x,int y){
         return modulus= x % y;
     }
    

    }
