package tw.alan.myproject.homework;

public class TestDegreeChangeEx1 {

	public static void main(String[] args) {
		double degree = 38;
		int index = (int)(Math.random()*2+1);
		
		System.out.println("index= " + index);
		
		if(index==1){
			System.out.println(degree + "C = " + (degree*9/5+32) + "F");
			
		}else if(index==2){
			System.out.println(degree + "F = " + ((degree-32)*5/9) + "C");
		}
		

	}

}
