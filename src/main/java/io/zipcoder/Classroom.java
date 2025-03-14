package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private ArrayList<Student> students;
    private Integer maxStudents;

    public Classroom(){
    }

    public Classroom(Integer maxStudents){
        this.maxStudents = maxStudents;
    }

    public Classroom(ArrayList<Student> students){
        this.students = students;
    }

    public Integer getStudents(){
        return students.size();
    }

    public void addStudents(Student student){
        students.add(student);
    }
}
