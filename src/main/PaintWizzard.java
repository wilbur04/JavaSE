
import java.util.ArrayList;
import java.util.List;

public class PaintWizzard {

    private double roomHeight;
    private double roomLenght;
    private double roomWidth;
    private List<Paint> paintsList;


    public PaintWizzard(Double roomHeight, int roomLenght, int roomWidth) {
        this.roomHeight = roomHeight;
        this.roomLenght = roomLenght;
        this.roomWidth = roomWidth;
        this.paintsList = new ArrayList<>();
    }



    public void addToPaintList(Paint paint){
        paintsList.add(paint);
    }

    public double getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    public double getRoomLenght() {
        return roomLenght;
    }

    public void setRoomLenght(double roomLenght) {
        this.roomLenght = roomLenght;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public List<Paint> getPaintsList() {
        return paintsList;
    }



    public double areaToBepainted(){
        return  ((roomHeight*roomLenght)*2) + ((roomHeight*roomWidth)*2) ;
    }

    public String getCheapestPaintForAnyRoom() {
        Paint min =  paintsList.get(0);
        for (Paint p: paintsList ) {
            if (p.numberofCansneeded(areaToBepainted())*p.getPrice() < min.numberofCansneeded(areaToBepainted())*min.getPrice());
            }

        return min.getName();
    }

    public String getLeastWasteForAnyRoom() {
        Paint min =  paintsList.get(0);
        for (Paint p: paintsList ) {
            if (p.getwaste(areaToBepainted())<min.getwaste(areaToBepainted())){
                min = p;
            }
        }
        return min.getName();
    }


}
