/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechcostructionprivatelimitedinheritance.Values;
/**
 *
 * @author PRANAY
 */
public class Calculation {
        public static double getTotalPrice(double area,char type){
        if(type == 'p'){
            return area*Rate.plotRate;
        }
        else if (type == 'f'){
            return area*Rate.flateRate;
        }
        else if (type == 'O'){
            return area*Rate.officeRate;
        }
        return -1;
    }
    
    public static double getRagistryCharges (double totalPrice){
       return ((totalPrice *Rate.ragistryChargePercentage/100));
    
    }
   public static double getSocietyDevelopmentCharges(double totalPrice){
     return ((totalPrice *Rate.societyDevlopmentCharge/100));
 
   }
   
   public static double getGreenTaxCharges(double totalPrice){
    return ((totalPrice * Rate.greenTaxPercentage));
   
   }
    
}
