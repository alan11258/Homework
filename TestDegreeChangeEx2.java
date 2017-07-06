package tw.alan.myproject.homework;

import java.util.*;  

 public class TestDegreeChangeEx2 { 

	public static void main(String[] args) { 
		System.out.println("Please inpute 1 or 2"); 
		 
		Scanner sc = new Scanner(System.in); 
		int index = sc.nextInt();  
		if(index == 1) { 
			System.out.println("Please input the Fahrenheit degree."); 
			Scanner scF = new Scanner(System.in); 
			double Fahrenheit = sc.nextInt(); 
			double Celsius = (((Fahrenheit-32)*5)/9); 
			System.out.println(Fahrenheit + " Fahrenheit = " + Celsius + " Celsius.");			 
		}else if(index == 2){ 
			System.out.println("Please input the Celsius degree."); 
			Scanner scC = new Scanner(System.in); 
			double Celsius = sc.nextInt(); 
			double Fahrenheit = (Celsius*9/5+32); 
			System.out.println(Celsius + " Celsius = " + Fahrenheit + " Fahrenheit."); 
		}else{ 
			System.out.println("You should input 1 or 2."); 
		} 

	} 

} 
