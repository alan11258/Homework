package tw.alan.myproject.homework;


import java.util.ArrayList;
import java.util.List;
class FaPai{
//	public class PockerInternetExample2{
		
//	}
	public static void main(String[] brad){
	   int randnum=0;
	   List<Integer> list_a = new ArrayList<Integer>();   //手中的牌
	   List<Integer> list_b = new ArrayList<Integer>();   //發過的牌
	   //--------------------產生一副52張的牌
	   for (int j=0; j < 52 ; j++ ){    
	     list_a.add(j+1);
	   }
	   //--------------------亂數發牌 與 紀錄發了什麼牌 並 排除重複
	   for (int j=0; j < 52 ; j++ ){
	     randnum = (int)(Math.random() * list_a.size());    // 亂數發牌
	     list_b.add(list_a.get(randnum));    // 紀錄發了什麼牌
	     list_a.remove(randnum);    // 抽掉手中的牌
	   }
	   //--------------------印出玩家手中的牌型
	   int pai=0;
	   String flower = "";
	   String paiarr[] = {"Ghost","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	   String pai_no="";
	   for (int i=0; i < list_b.size() ; i++ ){  
	       pai = list_b.get(i);  
	     if(pai >= 1 && pai <= 13){  //♠♣♥♦
	       flower = "♠"; //"黑桃";
	       pai_no = paiarr[pai];
	     }
	     if(pai >= 14 && pai <= 26){
	       flower = "♣"; //"梅花";
	       pai_no = paiarr[pai - 13];
	     }
	     if(pai >= 27 && pai <= 39){
	       flower = "♥"; //"紅心";
	       pai_no = paiarr[pai - 26];
	     }  
	     if(pai >= 40 && pai <= 52){
	       flower = "♦"; //"方塊";
	       pai_no = paiarr[pai - 39];
	     }
	      
	     if((i % 13) == 0 && i != 0)
	       System.out.print("\n");
	      
	     if((i % 13) == 0)
	       System.out.print("玩家" + ((i / 13)  + 1) + "的牌 :  \t");
	
	     System.out.print(flower + pai_no+"\t");  // 印出4位玩家手中的牌
	    }
	  }
	}