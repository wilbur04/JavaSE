


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static java.lang.Integer.parseInt;

public class PersonWF {


    static BufferedReader br;

    public static void main (String[] args){
        PeopleList pl = new PeopleList();
        PeopleList p2 = new PeopleList();
        pl.addToList(new People("rhys", 21, "BufferedReader"));
        pl.addToList(new People("amrit", 21, "Reader"));
        pl.addToList(new People("Ayaz", 20, "singer"));
        pl.addToList(new People("sean", 20, "bufferWriter"));

        pl.Writetofile();

        ReadFromFile(p2);

        p2.printAllPeople();
    }


    public static void ReadFromFile(PeopleList A1){
        try {
            br = new BufferedReader((new FileReader("File.txt")));
            String line = "";
            while ( (line = br.readLine()) != null){
                String[] sc = line.split(", ");
                A1.addToList(new People(sc[0], parseInt(sc[1]), sc[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
