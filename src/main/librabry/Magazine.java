package librabry;

import java.util.Date;

public class Magazine extends Item {
    public Magazine(String title, String publication, Date date, int noOfPages, Boolean isAvailable) {
        super(title, publication, date, noOfPages, isAvailable);
    }

    @Override
    public void checkout() {
        //todo Syspritn for cli
        this.setAvailable(true);
        //unable to checkout magazines
    }

    @Override
    public void checkin() {
        this.setAvailable(true);
    }
}
