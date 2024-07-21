/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechcostructionprivatelimitedinheritance.Values;
import com.mycompany.amstechcostructionprivatelimitedinheritance.TypesOf.*;
/**
 *
 * @author PRANAY
 */
public class Estimation {
     public static void printTotalEstimat(Plot plot){
        System.out.println("Type : Plot");
        System.out.println("Length :" + plot.getLength());
        System.out.println("Breadth :" + plot.getBreath());
        System.out.println("Total Area :" + plot.getRectnageArea());
        System.out.println("Plot Rate :" + Rate.plotRate );
     
     double totalPrice = Calculation.getTotalPrice(plot.getRectnageArea(),'p');
     double ragistryCharges= Calculation.getRagistryCharges(totalPrice);
     double greenTax = Calculation.getGreenTaxCharges(totalPrice);
     
     
        System.out.println("Total Price :" + totalPrice);
        System.out.println("Ragistry Charges:" + ragistryCharges);
        System.out.println("Green Tax:" + greenTax );
        System.out.println("Society Devlopment Charges:" + Rate.societyDevlopmentCharge);
        
        double grandTotal = totalPrice + ragistryCharges + greenTax + Rate.societyDevlopmentCharge;
        
        System.out.println("Grand Total:" + grandTotal);
}
    public static void printTotalEstimat(Flate flate){
        System.out.println("Type : flate");
        System.out.println("Total Area :" + flate.getRectnageArea());
        System.out.println("Plot Rate :" + Rate.flateRate );
     
     double totalPrice = Calculation.getTotalPrice(flate.getRectnageArea(),'f');
     double ragistryCharges= Calculation.getRagistryCharges(totalPrice);
     double greenTax = Calculation.getGreenTaxCharges(totalPrice);
     
     
        System.out.println("Total Price :" + totalPrice);
        System.out.println("Ragistry Charges:" + ragistryCharges);
        System.out.println("Green Tax:" + greenTax );
        System.out.println("Society Devlopment Charges:" + Rate.societyDevlopmentCharge);
        
        double grandTotal = totalPrice + ragistryCharges + greenTax + Rate.societyDevlopmentCharge;
        
        System.out.println("Grand Total:" + grandTotal);
}
    
    public static void printTotalEstimat(Office office){
        System.out.println("Type : Plot");
        System.out.println("Length :" + office.getLength());
        System.out.println("Breadth :" + office.getBreath());
        System.out.println("Total Area :" + office.getRectnageArea());
        System.out.println("Office Rate :" + Rate.officeRate );
     
     double totalPrice = Calculation.getTotalPrice(office.getRectnageArea(),'o');
     double ragistryCharges= Calculation.getRagistryCharges(totalPrice);
     double greenTax = Calculation.getGreenTaxCharges(totalPrice);
     
     
        System.out.println("Total Price :" + totalPrice);
        System.out.println("Ragistry Charges:" + ragistryCharges);
        System.out.println("Green Tax:" + greenTax );
        System.out.println("Society Devlopment Charges:" + Rate.societyDevlopmentCharge);
        
        double grandTotal = totalPrice + ragistryCharges + greenTax + Rate.societyDevlopmentCharge;
        
        System.out.println("Grand Total:" + grandTotal);
}


    
    
}
