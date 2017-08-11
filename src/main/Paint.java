
public class Paint {
    private String name;
    private double price;
    private int canSize;
    private int areaPerCan;

    public Paint(String name, double price, int canSize, int areaPerCan) {
        this.name = name;
        this.price = price;
        this.canSize = canSize;
        this.areaPerCan = areaPerCan;
    }

   public int numberofCansneeded(double area){
        if (areaPerCan%area ==0){
            return  (int)(areaPerCan/area);
        } else {
            return  (int)(areaPerCan/area) +1;
        }
   }

    public double getwaste(double area){
        double waste = area % areaPerCan;
        return (waste/areaPerCan)*100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCanSize() {
        return canSize;
    }

    public void setCanSize(int canSize) {
        this.canSize = canSize;
    }

    public int getAreaPerCan() {
        return areaPerCan;
    }

    public void setAreaPerCan(int areaPerCan) {
        this.areaPerCan = areaPerCan;
    }
}
