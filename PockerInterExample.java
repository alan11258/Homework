package tw.alan.myproject.homework;

import java.util.Random;

class Card {
    int Suit;                                   //花色
    char Number;                            //牌面數字 
}
public class PockerInterExample {
    static Card[] OneCard = new Card[52];  //儲存每張撲克的花色、數字
    //顯示撲克牌
    static void showCard() {
        int i, j;
        String s = "";     //代表花色

        for (i = 0, j = 0; i < 52; i++, j++) //撲克牌迴圈一遍
        {
            if (j % 13 == 0) {                      //控制每種花色一行
                System.out.print("\n");
            }
            switch (OneCard[i].Suit) {          //枓據花色屬性，顯示花色符號
                case 1:                             //1，代表黑桃
                    s = "黑桃";
                    break;
                case 2:                             //2，代表紅心
                    s = "紅心";
                    break;
                case 3:                              //3，代表方塊
                    s = "方塊";
                    break;
                case 4:                              //4，代表梅花
                    s = "梅花";
                    break;
                default:
                        ;
            }
            System.out.printf("    " + s + OneCard[i].Number);   //輸出顯示
        }
        System.out.print("\n");
    }

    //洗牌
    static void shuffle() {
        int i, j;
        Card tempcard = new Card();         //交換過程中臨時備份用
        Random r = new Random();                //隨機種子
        for (i = 0; i < 52; i++) //換52次牌
        {
            j = r.nextInt(52);                      //隨機取牌
            tempcard = OneCard[j];          //換牌
            OneCard[j] = OneCard[i];
            OneCard[i] = tempcard;
        }
    }

    public static void main(String[] args) {
        initial();       //產生一副新牌
        System.out.printf("一副新牌的初始排列如下：\n");
        showCard();                   //顯示新牌的排列
        shuffle();                      //洗牌
        System.out.print("\n洗牌後的排列如下：\n");
        showCard();                 //顯示洗牌後的排列
    }
    //產生一副新牌
    private static void initial() {
        int i, temp;
        int suit;
        suit = 0;
        for (i = 0; i < 52; i++) //產生52張牌
        {
            if (i % 13 == 0) //每13張牌改變花色
            {
                suit++;                         //改變花色
            }
            Card t = new Card();        //產生撲克牌物件
            t.Suit = suit;                   //儲存花色
            temp = i % 13;              //牌面數字不超過13
            switch (temp) {
                case 0:
                    t.Number = 'A';         //第一個數從0開始，代表 A
                    break;
                case 9:
                    t.Number = '0';         //代表A
                    break;
                case 10:
                    t.Number = 'J';         //代表J
                    break;
                case 11:
                    t.Number = 'Q';         //代表Q
                    break;
                case 12:
                    t.Number = 'K';         //代表K
                    break;
                default:
                    t.Number = (char) (temp + '1');    //其他普通數字，注意加1
            }
            OneCard[i] = t;                     //儲存撲克
        }
    }
}