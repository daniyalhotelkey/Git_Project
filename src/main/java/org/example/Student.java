package org.example;

public class Student extends Person{

    String rollNumber;
    int mathMarks;
    Student(String name,int age,String rollNumber)
    {
        super(name,age);
        this.rollNumber=rollNumber;
        this.mathMarks=0;
    }


    String getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }
}
