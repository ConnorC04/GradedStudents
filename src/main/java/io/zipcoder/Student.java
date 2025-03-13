package io.zipcoder;

import java.util.ArrayList;


public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }


    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }


}
