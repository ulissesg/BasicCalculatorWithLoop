/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculatorwithloop;

import java.util.Scanner;

/**
 *
 * @author ulisses
 */
public class BasicCalculatorWithLoop {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        header();
        int option = 0;
        menu(option);
        
    }
    
    public static void header(){
        System.out.println("---------------------------------------------");
        System.out.println("|           Not so basic calculator         |");
        System.out.println("---------------------------------------------");
    }
    
    public static void menu(int option){
        switch (option){
            case 0:
                System.out.println("Result: " + inputMath());
                repeat();
            case 1: 
                break;
                
        }
    }
    
    public static void repeat(){
        String option;
        boolean aux;
        System.out.println("Wanna do another operation ?"); 
        option = input.next();
        switch(option){
            case "yes":
                menu(0);
            case "no":
                menu(1);
        }
    }
    
    public static float inputMath(){
        float num1;
        float num2;
        String ope;
        
        System.out.println("\n-------------------------------------------------\n");
        
        System.out.println("Type a number: ");
        num1 = input.nextFloat();
        
        System.out.println("Type a math operation ( +, -, *, /)");
        ope = input.next();
        
        System.out.println("Type a number");
        num2 = input.nextFloat();
        
        return calculator(num1, ope, num2);
        
    }
    
    public static float calculator(float num1, String op, float num2){

        int typeOp = verifyOperation(op);
        
        switch(typeOp){
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3: 
                return num1 * num2;
            case 4: 
                return num1 / num2;
            default:
                return -1;
        }
    } 
    
    public static int verifyOperation(String op){

        switch (op) {
        case "+":
            return 1;
        case "-":
            return 2;
        case "*":
            return 3;
        case "/":
            return 4;
        default:
            System.err.println("Invalid Operation, wrong answer, try again !");
            return -1;
        }
    }
}

