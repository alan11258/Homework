package tw.alan.myproject.homework;

public class TestTriangleEx2{
	public void showTriangle3(){                 //Teacher Ex1
		for (int i = 1; i<=10 ; i++){
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			for(int n=1; n<=i; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public void showTriangle4(){                  //Teacher Ex2
		for (int i = 1; i<=10 ; i++){
			
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			
			for(int n=1; n<=i; n++){
				System.out.print("*");
			}
			if(i==1){
				System.out.println();
				continue;
			}
			
			for(int n=1; n<=i-1; n++){
				System.out.print("*");
			}
			
			for (int m = 1; m <= 11-i ; m++){
				System.out.print(" ");	
			}
			System.out.println();
		}
	}
	public void showTriangle5(){                 //Self Practice-1
		for (int i = 1; i<=10 ; i++){
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			for(int n=1; n <= i; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void showTriangle6(){                 //Self Practice-2
		for (int i = 1; i<=10 ; i++){
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			for(int n=1; n<=i*2; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void showTriangle7(){                 //Self Practice-3
		  System.out.println("           *");
		for (int i = 1; i<=10 ; i++){
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			for(int n=1; n<=i*2; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void showTriangle8(){                  //Self Practice-4
		for (int i = 1; i<=10 ; i++){
			for (int m = 1; m <= 11-i ; m++){
			System.out.print(" ");	
			}
			for(int n=1; n<=i; n++){
				System.out.print(" *");           //智傑的方法,直接在*前加一個空格
			}
			System.out.println();
		}
	}
	


	public static void main(String[] args) {
		TestTriangleEx2 test1 = new TestTriangleEx2();
		test1.showTriangle3(); System.out.println("Teacher Ex1 As Above.");
		test1.showTriangle4(); System.out.println("Teacher Ex2 As Above.");
		test1.showTriangle5(); System.out.println("Self Practice-1 As Above.");
		test1.showTriangle6(); System.out.println("Self Practice-2 As Above.");
		test1.showTriangle7(); System.out.println("Self Practice-3 As Above.");
		test1.showTriangle8(); System.out.println("Self Practice-4 As Above.");
	}

}
