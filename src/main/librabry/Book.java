package librabry;

import java.util.Date;

public class Book extends Item {
    public Book(String title, String publication, Date date, int noOfPages, Boolean isAvailable) {
        super(title, publication, date, noOfPages, isAvailable);
        this.setBorowable(true);
    }

    @Override
    public void checkout() {
        this.setAvailable(false);
    }

    @Override
    public void checkin() {
        this.setAvailable(true);
    }


}
