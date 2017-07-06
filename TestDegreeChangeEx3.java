package tw.alan.myproject.homework;

import java.util.Scanner;

public class TestDegreeChangeEx3 {

	public static void main(String[] args) {
		
		System.out.println("Please Input 1 or 2.");
		
		Scanner choose = new Scanner(System.in);
		int index = choose.nextInt();
		
		if(index==1){
			System.out.println("Please Input The Celsius Degree.");
			Scanner C = new Scanner(System.in);
			
			double degreeC = choose.nextInt();
			double degreeF = (((degreeC*9)/5)+32);
			
			System.out.println(degreeC + " Celsius = " + degreeF +" Fahrenheit.");
		
		}else if(index==2){
			System.out.println("Please Input The Fahrenheit Degree.");
			Scanner F = new Scanner(System.in);
			
			double degreeF = choose.nextInt();
			double degreeC = (((degreeF-32))*5/9);
			
			System.out.println(degreeF + " Fahrenheit = " + degreeC +" Celsius.");
		}else{
			System.out.println("Please Input Valid Index(Input 1 or 2).");
		}
	
	}

}
