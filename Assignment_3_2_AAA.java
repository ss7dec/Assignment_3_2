//Assignment 3.2

//Write a program in Java to show the use of super and this keyword with constructor, methods, variables


package assignment_3_2;

import java.util.Scanner;

public class Assignment_3_2_AAA {
	public static class Assignment_3_2     
	//Class declaration.
	{
		public static void main(String[] args)    
		//main function declaration. and because it is static, program execution starts from main function.
		{
			int Racer_BikesSpeed,Harley_DavidsonSpeed;    
			//Declaring two int variables to store maximum speed of Racer_Bikes and Harley_Davidson.
			
			System.out.println("Enter the two numbers,One denoting maximum speed of Racer_Bikes and other denoting maximum speed of Harley_Daidson");
			// asking value of choice from the user.
	        // for printing this on screen. we have used the inbuilt function println() 
			//of out stream of System class.
			
			
			//Now we want to take input of the speed value from the user.
	      	// For taking input from the user, we have to make the object of Scanner class.
	      	//And we have to pass System.in stream in the constructor of that object to read
			//input from keyboard.
			Scanner sc=new Scanner(System.in);       
			//creating object of Scanner class.
			
			Racer_BikesSpeed=sc.nextInt();          
			//Initializing Racer_Bikes Speed variable with first value entered by user.
			Harley_DavidsonSpeed=sc.nextInt();        
			//Initializing Harley_Davidson Speed variable with second value entered by user.
			
			Harley_Davidson Racer_BikesSpeedTest=new Harley_Davidson(Racer_BikesSpeed,Harley_DavidsonSpeed);    //Creating the new object of class Harley_Davidson which is inherited by Racer_Bikes.
			//Passing the speeds of Racer Bikes and Harley_Davidson to the constructor of the new created object.
			
			Racer_BikesSpeedTest.display();     
			//Invoking the method display.
			
			sc.close();       //Closing the scanner class object.

		}
		
	} //End of Main Function
	
}  //End of Class
	

