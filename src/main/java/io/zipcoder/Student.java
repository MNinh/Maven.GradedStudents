package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    public ArrayList<Double> examScores;
    public double avgScore;

    public Student(String firstName, String lastName, Double[] examScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(Arrays.asList(examScore));
    }

    public Student(){
        this.firstName = "Mike";
        this.lastName = "Ninh";
        this.examScores = new ArrayList<>();
    }

    public String getFirstName() {
       return firstName;
    }

    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String result = "";
        int examNum = 1;
        for(Double i : examScores) {
            result += "Exam " + examNum++ + " -> " + i + "\n";
        }
        return result;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore() {
        return avgScore;
    }

    public void setAvgScore(){
        double totalScore = 0.0;
        for (Double i : examScores){
            totalScore += i;
        }
        avgScore = totalScore/examScores.size();
    }


}
