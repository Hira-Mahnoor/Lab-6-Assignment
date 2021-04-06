/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_activities;

//home activity 2
public class countObject {
     public static int noOfObject=0;
    private int num;
    
    public countObject(){
        noOfObject++;
    }
    public countObject(int num){
        this.num=num;
        noOfObject++;
    }
    public static int getObject(){
        return noOfObject;
    }
     public static int deleteObject(){
        return noOfObject--;
     }
    }
    
    

