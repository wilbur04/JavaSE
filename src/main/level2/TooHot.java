package level2;
public class TooHot {

    public TooHot() {
    }

    public boolean tooHot(int temp, boolean isSummer){
        if (!isSummer && temp >=60 && temp <= 90){
            return false;
        }else if (isSummer && temp >=60 && temp <= 100){
            return false;
        }else {
            return true;
        }
    }

}
