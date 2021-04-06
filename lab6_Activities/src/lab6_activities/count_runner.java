/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_activities;

//home Activity 2 
public class count_runner {
     public static void main(String[] args) {
         countObject O1= new countObject();
         countObject O2= new countObject(66);
         countObject O3= new countObject(77);
         countObject O4= new countObject(77);
        System.out.println("Objects created:"+ countObject.getObject());
        O4.deleteObject();
        System.out.println("Objects created:"+ countObject.getObject());
     }
    
}
