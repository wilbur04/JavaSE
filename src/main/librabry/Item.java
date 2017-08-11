package librabry;

import java.util.Date;

public abstract class Item {
    private String title;
    private String publication;
    private Date date;
    private int noOfPages;
    private Boolean borowable;
    private Boolean isAvailable;

    public Item(String title, String publication, Date date, int noOfPages,  Boolean isAvailable) {
        this.title = title;
        this.publication = publication;
        this.date = date;
        this.noOfPages = noOfPages;
        this.borowable = true;
        this.isAvailable = isAvailable;
    }







    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public Boolean isBorowable() {
        return borowable;
    }


    public void setBorowable(Boolean borowable) {
        this.borowable = borowable;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public abstract void checkout();

    public abstract void checkin();
}
