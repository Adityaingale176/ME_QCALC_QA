package com.crio.qcalc;

public class StandardCalculator {

    private double result;

    public double getResult(){
        return result;
    }

    public void setResult(int value){
        this.result = value;
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void add(double num1, double num2){
        result = num1+num2;
    }


    public void subtract(double num1, double num2){
        result = num1 - num2;
    }
    
    
    public void multiply(double num1, double num2){
        result = num1 * num2;
    }
    
    
    public void divide(double num1, double num2){
        result = num1 / num2;
    }
    
    public void printResult(){

        System.out.println("Standard Calculator Result:"+ result);
    
    }

}
