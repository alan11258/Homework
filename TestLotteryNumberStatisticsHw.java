package tw.alan.myproject.homework;

public class TestLotteryNumberStatisticsHw {
	int[] count = new int[42];
	int[] number = new int[42];
	
	public void createLuckerNumber(){
		for(int i = 1; i <= 100000; i++){
			int rNum = (int)(Math.random()*42)+1;
			 //System.out.println("rNum:" + rNum);
			count[rNum-1]++;             //-1是因為要計算值,然後count[0]=1的關係
		}
		for(int j = 1; j <= 42; j++){
			number[j-1] = j;
		}
	}
	public void sortnumber1(){
		for (int i = 0; i < count.length - 1; i++) {
			for (int j = i + 1; j < count.length; j++) {

				int temp1 = 0, temp2 = 0;
				if (count[i] < count[j]) {
					temp1 = count[i];
					count[i] = count[j];
					count[j] = temp1;

					temp2 = number[i];
					number[i] = number[j];
					number[j] = temp2;
				}
			}
		}
	}
	public void printResult(){
		for(int k = 0; k < count.length; k++){
			System.out.printf("%d:%d\n", number[k], count[k]);
		}
	}

	public static void main(String[] args) {
		TestLotteryNumberStatisticsHw stats= new TestLotteryNumberStatisticsHw();
		stats.createLuckerNumber();
		System.out.println("Original Data:");
		System.out.println("-----------------------");
		stats.printResult();
		System.out.println("-----------------------");
		System.out.println("Sorted Data:");
		System.out.println("-----------------------");
		stats.sortnumber1();
		stats.printResult();
		System.out.println("-----------------------");
	}

}
