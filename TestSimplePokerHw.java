package tw.alan.myproject.homework;

public class TestSimplePokerHw {
	
	int[] cardstatus = new int[52];   //用陣列來儲存鋪克牌數,[0]等於撲克牌1
	int player = 2;       //玩家人數
	int count = 0;        //累積發牌的次數
	
	public void deal(){
		int cardNumber = (int)(Math.random()*52)+1; //隨機產生撲克牌面額
		
			while(true){     //無窮迴圈
			if(cardstatus[cardNumber - 1] == 1){  //當儲存陣列數[撲克牌面額-1]等於1時就代表上面發過了
				cardNumber = (int)(Math.random()*52)+1; //因為發過了就要繼續產生新的面額來發牌
				continue;
			}
			cardstatus[cardNumber - 1 ] = 1;        //計算發出的牌數
			System.out.println("cardNumber: " +cardNumber);  //列印發出的撲克牌面額資訊
			count++;
		
			if(count == player){   //發牌數等於玩家數就停止,在player後面設定乘以數字就是設定一人發幾張牌
			break;
			}
		}
	}
	public void ptintResult(){           //列印所有撲克牌資訊
		for(int i = 0; i < cardstatus.length; i++)
		System.out.println("cardstatus[" + i +"]=" + cardstatus[i]);
	}
	
	public static void main(String[] args) {
		TestSimplePokerHw poker = new TestSimplePokerHw();
		poker.deal();                    //發牌
		poker.ptintResult();             //列印資訊

	}

}
