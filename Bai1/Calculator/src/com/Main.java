package com;

import com.controller.Calculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		//2number + 1 operation => output
		
		Calculator calculator1 = new Calculator();
		calculator1.setA(6);
		calculator1.setB(5);
		calculator1.setC("*");
		float result = calculator1.calculator();
		System.out.println(result);
	}
}
