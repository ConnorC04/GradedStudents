package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private Student[] students;
    private Integer maxStudents;

    public Classroom(){
    }

    public Classroom(Integer maxStudents){
        this.maxStudents = maxStudents;
    }

    public Classroom(Student[] students){
        this.students = students;
    }


}
