package tw.alan.myproject.homework;

public class TestSimplePokerHw1_1 {

	int[] cardStatus = new int[52];  //用陣列來儲存鋪克牌數,[0]等於撲克牌1
	int player = 6;         //玩家人數
	int count = 0;          //累積發牌的次數

	public void deal() {
		int cardNumber = (int) (Math.random() * 52) + 1;    //隨機產生撲克牌面額

		while (true) {     //無窮迴圈

			if (cardStatus[cardNumber - 1] == 1) { //當儲存陣列數[撲克牌面額-1]等於1時就代表上面發過了
				cardNumber = (int) (Math.random() * 52) + 1; //因為發過了就要繼續產生新的面額來發牌
				continue;
			}

			cardStatus[cardNumber - 1] = 1;    //計算發出的牌數

			count++;
			System.out.println("player" + count + ": cardNumber:" + cardNumber);
			//列印發出的撲克牌面額資訊
			if (count == player) {
				break;
			//發牌數等於玩家數就停止,在player後面設定乘以數字就是設定一人發幾張牌
			}
		}

		System.out.println("---------------------------------------------------");
	}

	public void printResult() {        //列印所有撲克牌資訊,可以不打
		for (int i = 0; i < cardStatus.length; i++) {
			System.out.println("cardStatus[" + i + "]=" + cardStatus[i]);
		}
	}

	public static void main(String[] args) {
		TestSimplePokerHw1_1 poker = new TestSimplePokerHw1_1();
		poker.deal();                  //發牌
		poker.printResult();           //列印資訊
	}

}
