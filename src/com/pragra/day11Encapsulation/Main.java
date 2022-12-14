package com.pragra.day11Encapsulation;

public class Main {
    public static void main(String[] args) {
        Address address=new Address("1061 plante drive","Ottawa","Canada");
        Student student=new Student(1001,
                "Meraj",
                "Brar",
                "12345678",
                "meraj@gmail.com",
                address);
        System.out.println(student);


        Student student1=new Student(1002,
                "Aekas",
                "Brar");
        student1.setPhoneNumber("765898543");
        student1.setEmailId("aekas@gmail.com");
        System.out.println(student1);
        System.out.println(student1.getStudentFirstName());
    }



}
