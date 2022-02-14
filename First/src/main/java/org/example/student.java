package org.example;


public class student {
    private int studentId;
    private String studentName;
    private  String studentAddress;

    public student(int studentId, String studentName, String studentAddress) {
        System.out.println("Constructor with parameters call");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public student() {
        super();
        System.out.println("Super constructor call");
    }

    public int getStudentId() {
        System.out.println("Get Student ID");
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Set Student ID");
        this.studentId = studentId;
    }

    public String getStudentName() {
        System.out.println("Get Student Name");
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Set Student Name");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        System.out.println("Get Student Address");
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Set Student Address");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
