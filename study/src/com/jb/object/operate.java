package com.jb.object;

public class operate {
    private student student;
    public operate(student student) {
        this.student = student;
    }
    public void printPass(){
        if(student.getScore()>=60){
            System.out.println("pass");
        }
    }
}
