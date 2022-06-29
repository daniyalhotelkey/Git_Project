package org.example;

import java.io.*;
import java.util.ArrayList;

public class Class {
    ArrayList<Student> stList;

    Class()
    {
        stList=new ArrayList<Student>();
    }

    void addStudents()
    {
        try {

            String fileName = "src/main/java/org/example/StudentsRecord.txt";
            BufferedReader in = new BufferedReader(new FileReader(fileName));

            String s;
            while((s = in.readLine()) != null) {

                String [] data= s.split(" ");
                Student temp=new Student("",0,"");

                temp.setName(data[0]);
                temp.setAge(Integer.parseInt(data[1]));
                temp.setRollNumber(data[2]);

                stList.add(temp);


            }
            in.close();

        } catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }


    }

    void printStudents(){

        for(int i=0;i<stList.size();i++)
        {
            System.out.println(stList.get(i).getName() + " "+ stList.get(i).getAge() + " " + stList.get(i).getRollNumber());
        }
    }


}
