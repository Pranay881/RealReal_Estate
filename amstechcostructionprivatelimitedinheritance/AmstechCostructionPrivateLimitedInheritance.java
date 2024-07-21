/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amstechcostructionprivatelimitedinheritance;
import com.mycompany.amstechcostructionprivatelimitedinheritance.TypesOf.*;
import com.mycompany.amstechcostructionprivatelimitedinheritance.Values.*;



public class AmstechCostructionPrivateLimitedInheritance {

    
  public static void main(String[] args) {
        
            
        Plot SanyamPlot = new Plot(56, 36);
        Plot pranayPlot = new Plot( 23,13);
        Plot GarimaPlot = new Plot(78,62);
        Plot YogiPlot = new Plot(38,22);
        
        System.out.println("--------------");       
        Estimation.printTotalEstimat(pranayPlot);

        
        Estimation.printTotalEstimat(SanyamPlot);
        System.out.println("--------------");

        Estimation.printTotalEstimat(GarimaPlot);
        System.out.println("--------------");

        Estimation.printTotalEstimat(YogiPlot);
        System.out.println("--------------");

     
    }    }

