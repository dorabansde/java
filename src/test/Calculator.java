package test;

import java.util.Scanner;

public abstract class Calculator extends Machine{
	private String name;
	private int age;
	
	{
		this.name = "°è»ê±â";
		this.age = 2021;	
	}
	
	
	
	
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	
	a = sc.nextInt();
	b = sc.nextInt();
	
	public Calculator() {

	}
	
	Machine turn = new Machine() {
		
		void turnOff() {
			System.out.println("Calculator Off");
			
		}
		void turnOn() {
			System.out.println("Calculator On");
			
		}
	};
	
	

	
	public void add() {
		
	}
	

	sc.close();
}
