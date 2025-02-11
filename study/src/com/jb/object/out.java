package com.jb.object;

public class out {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setScore(70);
        operate o1=new operate(s1);
        o1.printPass();
    }

}
