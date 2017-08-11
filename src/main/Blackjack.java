
public class Blackjack {



    public Blackjack(){

    }

    public int playBlackJack(int player1, int player2) {
        int win = 0;
        if (player1 >21 && player2 >21){
            win = 0;
        }else if ( player1 >21){
            win = player2;
        }else if (player2 >22) {
            win = player1;
        }else {
            if  (player1 > player2){
                win = player1;
            } else {
                win = player2;
            }
        }
        return win;
    }
}
