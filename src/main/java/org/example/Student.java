package org.example;

public class Student extends Person{

    String rollNumber;

    Student(String name,int age,String rollNumber)
    {
        super(name,age);
        this.rollNumber=rollNumber;
    }

    String getRollNumber()
    {
        return rollNumber;
    }
}
