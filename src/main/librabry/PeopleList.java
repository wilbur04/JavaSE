package librabry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class PeopleList implements AddRemove {
    private List<People> listOfPeople;
    private BufferedWriter bw;
    private BufferedReader br;

    public PeopleList(){
        listOfPeople = new ArrayList<>();
    }


    @Override
    public void add(Object o) {
        listOfPeople.add((People) o);
    }

    @Override
    public void remove(Object o) {
        listOfPeople.remove(o);
    }

    @Override
    public void writeToFile() {
        try {
            bw = new BufferedWriter(new FileWriter("people.txt"));
            for (People p: listOfPeople ) {
                String type="";
                if ( p instanceof Member){
                    type = "Member";
                } else if (p instanceof Employee){
                    type = "Employee";
                }
                bw.write(type +", "+p.getName()+", "+p.getAddress().getHouseNumber()+", "+p.getAddress().getPostCode()+", "+p.getPhoneNo() );
                bw.newLine();
            }
            bw.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {

        listOfPeople.clear();
        try {
            br = new BufferedReader((new FileReader("people.txt")));
            String line = "";
            while ( (line = br.readLine()) != null){
                String[] sc = line.split(", ");
                if (sc[0].equals("Member")){
                    listOfPeople.add(new Member(sc[1],new Address(parseInt(sc[2]), sc[3]),parseInt(sc[4])));
                }else if ( sc[0].equals("Employee")){
                    listOfPeople.add(new Employee(sc[1],new Address(parseInt(sc[2]),sc[3]),parseInt(sc[4])));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public int getNoOfPeople() {
        return listOfPeople.size();
    }



}
