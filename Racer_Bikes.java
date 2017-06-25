//Assignment 3.2

//Write a program in Java to show the use of super and this keyword with constructor, methods, variables

package assignment_3_2;


	import java.util.Scanner;     //importing all classes from Java's util library.. Because 
	//it has Scanner class which is used to take input from user.



	class Racer_Bikes      
	//Declaring the class Racer Bikes
	{
		int maxSpeed;       
		//Declaring the int variable maxSpeed.
		
		public Racer_Bikes(int maxSpeed)       //Constructor of vehicle class.
		{
			this.maxSpeed=maxSpeed;        //Assigning the max speed variable with the parameter.
			System.out.println("This is the constructor of Racer_Bikes class."); 
		}
		
		public void displaySpeed()
		{
			System.out.println("Speed displayed by the given Racer Bike is "+this.maxSpeed);      
			//Using 'this' keyword with variable.
		}
		
	}


	class Harley_Davidson extends Racer_Bikes
	{
		int maxSpeed;         //Assigning the int variable maxSpeed.
		
		public Harley_Davidson(int maxSpeed1,int maxSpeed2)
		{
			super(maxSpeed1);              
			//passing the value to constructor of superclass with 'super' keyword.
			this.maxSpeed=maxSpeed2;       
			//Assigning the max speed variable with the parameter.
			System.out.println("This is the constructor of Harley-Davidson class."); 
		}
		
		public void display()
		{
			super.displaySpeed();      
			//Using 'super' keyword with method.
			this.displaySpeed();       
			//Using 'this' keyword with method.
		}
		
		public void displaySpeed()
		{
			System.out.println("Speed output by Harley-Davidson bike is "+this.maxSpeed);     
			//Using 'this' keyword with variable.
		}
		
	}


	