package com.globallogic;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
   private String name;
   private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String args[])
    {
     Student st[]=new Student[3];

//     st[0]=new Student("Shubham",55);
//     st[1]=new Student("Shivam",68);
//     st[2]=new Student("Shubham",97);
//     st[3]=new Student("Ritika",97);



        st[0]=new Student("Karan",55);
        st[1]=new Student("Shivam",68);
        st[2]=new Student("Karan",97);

        Set<String> set=new LinkedHashSet<>();
        for(Student stud:st)
        {
            set.add(stud.getName());
        }


        int maxAvg=0;
        for(String s:set)
          {int sum=0,count=0;

            for(Student stud:st)
            {
                if(s== stud.getName())
                {
                   sum+=stud.getMarks();
                   count++;
                }
            }
            if(maxAvg<sum/count)
                maxAvg=sum/count;
        }
        System.out.println(maxAvg);
    }
}
