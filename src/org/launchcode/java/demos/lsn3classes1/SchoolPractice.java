package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student();
        newStudent.setNumberOfCredits(1);
        newStudent.setName("Stanyale");
        newStudent.setGpa(4.0);

        System.out.println("Student Name: " + newStudent.getName() + "\n" +
                            "Number of Credits: " + newStudent.getNumberOfCredits() + "\n" +
                            "GPA: " + newStudent.getGpa());


    }
}
