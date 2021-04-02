package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {

    Student[] students;
    ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));
    HashMap<Student, String> gradebook = new HashMap<Student, String>();


    public Classroom (Integer maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom (Student[] students){
        this.students = students;
    }

    public Classroom (){
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return this.students;
    }

    public Double getAverageExamScore(){

        Double total = 0.0;
        Integer examsTaken = 0;

        for(Student student : students){
            for(Double examScore : student.examScores){
                total += examScore;
                examsTaken++;
            }
        }
        Double avgScore = total / examsTaken;
        return avgScore;
    }


    public void addStudent(Student student){
        studentList.add(student);
        students = studentList.toArray(students);
    }

    public void removeStudent(String firstName, String lastName){
        if(this.studentList.size() != 0){
            for (Student student : students){
                if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                    studentList.remove(student);

                }
            }
        }
        students = studentList.toArray(students);
    }




}
