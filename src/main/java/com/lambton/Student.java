package com.lambton;

public class Student
{
//       //int[] StudentId=new int[5];
        //float total , percentage;
        //char[] firstname=new char[5];
        //char[] lastname=new char[5];
        //int[] marks=new int[5];
       // marks[22,33,44,55,66,77];
        int Studentid, total;
        float percentage;
        int marks1;
        int marks2;
        int marks3;
        int makrs4;
        int marks5;
        String lastname;
        String firstname;
        String fullname= firstname +" "+ lastname;
        boolean pass=true;
        boolean fail=false;


    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public int getMarks1() {
        return marks1;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }
    public void calculatetotal()
    {
        total=makrs4+marks1+marks2+marks3+marks5;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }
    public void calculatepercentage()
    {
        percentage=total/5*100;
    }


    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMakrs4() {
        return makrs4;
    }

    public void setMakrs4(int makrs4) {
        this.makrs4 = makrs4;
    }

    public int getMarks5() {
        return marks5;
    }

    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getTotal() {
        return total;
    }

    public float getPercentage() {
        return percentage;
    }
    public void genrateresult()
    {
        int count=0;
        if (marks5<50)
            count++;
        if (marks3<50);
            count++;
            if (makrs4<50)
                count++;
            if (marks2<50)
                count++;
            if (marks1<50)
                count++;
        if (count>=2)
        {
            return fail;

        }
        else
        {
            return pass;
        }
    }

}
