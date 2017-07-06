package tw.alan.myproject.homework;

import java.util.Scanner;

public class TestDegreeChangeEx4 {
	
	public static Scanner scn;
	
	public static void main(String[] args) {
//		System.out.println("Please Input 1 or 2.");
//		Scanner scn = new Scanner(System.in);
		scn = new Scanner(System.in);
		int index; 
		double C; double F;
//		index = scn.nextInt();
			
		do{
			System.out.println("Please Input 1 or 2.");
			index = scn.nextInt();
		}while(index < 1 || index > 2);
		
		if(index==1){
		System.out.println("Please Input The Celsius Degree.");
		C = scn.nextDouble();
					
		F = (((C*9)/5)+32);
				
		System.out.println(C + " Celsius = " + F +" Fahrenheit.");
			
		}else if(index==2){
		System.out.println("Please Input The Fahrenheit Degree.");
		F = scn.nextDouble();
				
		C = (((F-32))*5/9);
				
		System.out.println(F + " Fahrenheit = " + C +" Celsius.");
		}
//		else{
//		System.out.println("Please Input Valid Index(Input 1 or 2).");
//		}
			
	}

}