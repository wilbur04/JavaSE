
import java.io.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class PeopleList {

    private ArrayList<People> peopleList;
    private BufferedWriter bw;
    private BufferedReader br;



    public PeopleList(){
        peopleList = new ArrayList();

    }

    public void addToList(People person){
        peopleList.add(person);
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }

    public void printAllPeople(){
        for (int i =0; i<peopleList.size(); i++){
            System.out.println(peopleList.get(i).toString());
        }
    }

    public People searchPeopleByName(String name){
        for (People p:
             peopleList) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }


    public void Writetofile(){
        try {
            bw = new BufferedWriter(new FileWriter("File.txt"));
            for (People p: peopleList ) {
                bw.write(p.getName()+", "+p.getAge()+ ", "+ p.getJobTitle());
                bw.newLine();
            }
            bw.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


}
