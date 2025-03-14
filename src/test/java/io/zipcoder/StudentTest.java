package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    private String firstName = "";
    private String lastName = "";
    private ArrayList<Double> examScores = new ArrayList<>();
    private Student student;

    public void setUp(){
        student = new Student(firstName, lastName, examScores);
    }

    @Test
    public void testSettersAndGetters(){
        // Given
        setUp();
        student.setFirstName("John");
        student.setLastName("Cena");
        examScores.add(100.0);
        student.setExamScores(examScores);

        // When
        String expectedFirst = "John";
        String expectedLast = "Cena";
        ArrayList<Double> expectedScores = new ArrayList<>();
        expectedScores.add(100.0);

        // Then
        Assert.assertEquals(expectedFirst, student.getFirstName());
        Assert.assertEquals(expectedLast, student.getLastName());
        Assert.assertEquals(expectedScores, student.getExamScores());
    }


}