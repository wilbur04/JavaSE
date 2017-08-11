
import java.util.ArrayList;
import java.lang.Math;
import java.util.Timer;
import java.util.TimerTask;

public class PrimeOne {


    private static ArrayList<Integer> listOne = new ArrayList<>();

    public static void main (String [] args){

        long start = System.nanoTime();
        //pimeOne();
        pimeTwo();
        long elapsedTime = System.nanoTime() - start;
        System.out.println("it took you "+ elapsedTime+" nano seconds");
        System.out.println(listOne.size()+8);
    }

    private static void pimeOne(){

        listOne.add(23);

        int size = 1;
        int count ;

        for (int x=27; x <1000000000 ; x+=2){
            count =0;
            if (x%3==0|| x%5==0 || x%7 ==0 || x%11 ==0|| x%13==0|| x%17==0|| x%19==0 ) {
                continue;
            } else{
                for (int i =0 ; i < size; i++) {
                    // todo use while loop
                    if ( x % listOne.get(i) == 0){
                        count++;
                        break;
                    } if (listOne.get(i) > Math.sqrt(x)){
                        break;
                    }

                } if (count == 0) {
                    listOne.add(x);
                    size++;
                }
            }
        }
    }


    private static void pimeTwo(){

        listOne.add(23);

        int size = 1;
        int count ;
        int i = 0;

        for (int x=27; x <1000000 ; x+=2){
            count =0;
            if (x%3==0|| x%5==0 || x%7 ==0 || x%11 ==0|| x%13==0|| x%17==0|| x%19==0 ) {
                continue;
            } else{
                while(i < Math.sqrt (x) && i <size){
                    if  ((listOne.get(i) % x) != 0){
                        count++;
                        continue;
                    }
                    i++;
                } if (count == 0) {
                    listOne.add(x);
                    size++;
                }
            }
        }
    }


}
