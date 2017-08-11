package librabry;

import java.util.Date;

public class Journal extends Item {
    public Journal(String title, String publication, Date date, int noOfPages, Boolean isAvailable) {
        super(title, publication, date, noOfPages, isAvailable);
    }

    @Override
    public void checkout() {
        this.setAvailable(true);
        //unable to checkout Journals
    }

    @Override
    public void checkin() {
        this.setAvailable(true);
    }
}
