package com.lambton;

public class CollegeExample
{
    public static void  main(String[] args)
    {
        int a=10, b =4;
        Arthmetic am=new Arthmetic();
        /* int f=am.add(a,b);
         System.out.println("Addition of two numbers :" +am.add(a,b));
        System.out.println("Subtraction of two numbers :" +am.subtract(a,b));
        System.out.println("mulcatiplication of two numbers :" +am.mul(a,b));
        System.out.println("division of two numbers :" +am.division(a,b));
        */

        Student s=new Student();
        s.setFirstname("Ritik");
        s.setLastname("jagpal");
        s.setStudentid(12);
        s.setMakrs4(23);
        s.setMarks5(56);
        s.setMarks1(67);
        s.setMarks2(56);
        s.setMarks3(89);

        System.out.println("Student id :" +s.getStudentid());
        System.out.println("Student full name:" +s.getFullname());
        System.out.println("marks 1 :"+s.getMarks1());
        System.out.println("marks 2:"+s.getMarks2());
        System.out.println("marks 3 :"+s.getMarks3());
        System.out.println("marks 4:"+s.getMakrs4());
        System.out.println("marks 5:"+s.getMarks5());

    }
}
