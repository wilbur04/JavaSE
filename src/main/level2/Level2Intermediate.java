package level2;
public class Level2Intermediate {



    public static void main(String [] args){
        Blackjack bj = new Blackjack();
        UniqueSum us = new UniqueSum();
        TooHot th = new TooHot();

        System.out.println( bj.playBlackJack(20,16));

        System.out.println( us.findUniqueSum(1,1,2));

        System.out.println( th.tooHot(101,true));

    }











}
