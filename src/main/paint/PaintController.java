package paint;

import java.util.ArrayList;

public class PaintController {



    public static void main (String [] args){
        PaintWizzard pw = new PaintWizzard(1.5,3,4);
        pw.addToPaintList(new Paint ("ChepoMax",19.99, 20, 10));
        pw.addToPaintList(new Paint ("AverageJones",17.99, 15, 11));
        pw.addToPaintList(new Paint ("DuluxourousPaints",25, 10, 20));


        System.out.println(pw.getLeastWasteForAnyRoom());
        System.out.println(pw.getCheapestPaintForAnyRoom());
    }
}
