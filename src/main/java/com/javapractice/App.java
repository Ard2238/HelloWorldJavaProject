package com.javapractice;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App
{
	private static final Logger LOG= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Enter the first number: ");
    	int num1= sc.nextInt();
    	
    	System.out.println("Enter the second number: ");
    	int num2= sc.nextInt();
    	
    	add2numbers(num1, num2);
    	product(num1, num2);
    	
    	sc.close();
    }
    
    private static void add2numbers(int num1, int num2) {
    	long sum= num1 + num2;
    	
    	LOG.info("This sum of "+ num1 + " and " + num2 + " == "+sum);
    }
    private static void product(int num1, int num2) {
    	long pdt= num1*num2;
    	
    	LOG.info("This product of "+ num1 + " and " + num2 + " == "+pdt);
    }
}
