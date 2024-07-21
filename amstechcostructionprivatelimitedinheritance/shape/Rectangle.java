/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechcostructionprivatelimitedinheritance.shape;

/**
 *
 * @author PRANAY
 */
public class Rectangle {

    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
    
    

    public double getRectnageArea() {
        return length * breath;
    }

}
