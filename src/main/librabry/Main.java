package librabry;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner sc;
    public static void main (String [] args){
        Library lib = new Library("hello");
        lib.add(new Member("illy",new Address(23,"pe1 6ht"),928364547));
        lib.add(new Employee("illy",new Address(23,"pe1 6ht"),928364547));
        lib.add(new Member("illy",new Address(23,"pe1 6ht"),928364547));

        lib.add(new Book("hello", "publication", new Date(99,12,04), 400, true));
        lib.add(new Magazine("hi", "publication", new Date(99,12,04), 400, true));
        lib.add(new Journal("meh", "publication", new Date(99,12,04), 400, true));
        lib.add(new Book("hbrro", "publication", new Date(99,12,04), 400, true));
        lib.write();
        lib.read();


    }


}
