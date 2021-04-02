package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    Student student = new Student("Mike", "Ninh", new Double[]{91.0, 100.0, 85.0});

    @Test
    public void constructorTest(){
        String expectedLastName = "Ninh";
        String expectedFirstName = "Mike";
        Double[] expectedExamScore = {85.0, 91.0, 82.0};
        Integer expectedNumberOfExamsTaken = 3;

        Student mike = new Student(expectedFirstName, expectedLastName, expectedExamScore);
        String actualFirstName = mike.getFirstName();
        String actualLastName = mike.getLastName();
        Integer actualNumberOfExamsTaken = mike.getNumberOfExamsTaken();

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedNumberOfExamsTaken, actualNumberOfExamsTaken);
    }


    @Test
    public void testGetFirstName() {
        String expectedName = "Mike";
        String actualName = student.getFirstName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetFirstName() {
        String expectedName = "Mike";
        String actualName = student.setFirstName(expectedName);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetLastName() {
        String expectedName = "Ninh";
        String actualName = student.getLastName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetLastName() {
        String expectedName = "Ninh";
        String actualName = student.setLastName(expectedName);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetNumberOfExamsTaken() {
        Integer expectedNum = 3;
        Integer actualNum = student.getNumberOfExamsTaken();
        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testGetExamScores() {

        String expectedScores = "Exam 1 -> 91.0\nExam 2 -> 100.0\nExam 3 -> 85.0\n";
        Assert.assertEquals(expectedScores, student.getExamScores());
    }

    @Test
    public void testAddExamScore() {
        String expectedScores = "Exam 1 -> 91.0\nExam 2 -> 100.0\nExam 3 -> 85.0\nExam 4 -> 88.0\n";
        student.addExamScore(88.0);
        Assert.assertEquals(expectedScores, student.getExamScores());
    }

    @Test
    public void testSetExamScore() {
        String expectedScores = "Exam 1 -> 91.0\nExam 2 -> 100.0\nExam 3 -> 92.0\n";
        student.setExamScore(2, 92);
        Assert.assertEquals(expectedScores, student.getExamScores());
    }

    @Test
    public void testGetAverageExamScore() {
        Double expected = 0.0;
        Assert.assertEquals(expected, student.getAverageExamScore());
    }

    @Test
    public void testSetAvgScore() {
    }
}