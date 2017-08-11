package level2;
public class UniqueSum {

    public UniqueSum() {
    }

    public int findUniqueSum(int one, int two, int three){

        if (one == two && one == two && one ==three){
            return 0;
        }else if (one == two ){
            return three;
        } else if (one == three){
            return two;
        } else if (two == three){
            return one;
        } else {
            return one + two + three;
        }
    }

}
