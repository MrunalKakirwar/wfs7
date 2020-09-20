/*package com.hsbc.day2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
	
	
	public static void main(String[] args) {
        
        Student1 s1=new Student1("Prince",101,23);     //creating student
        Student1 s2=new Student1("Vikram",102,21);
        Student1 s3=new Student1("Arun",103,24);
        Student1 s4=new Student1("Tarun",104,21);
        
        Student ss1=new Student("Prince",101,23);
        Student ss2=new Student("Vikram",102,21);
        Student ss3=new Student("Arun",103,24);
        Student ss4=new Student("Tarun",104,21);
        
        Student st[]=new Student[] {
            ss1,ss2,ss3,ss4
        };
        
        List<Student1> p=new ArrayList<Student1>();      //lists
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(s4);
        
    
        MyComparator comp=new MyComparator();   //comparison
        Arrays.sort(st);
        Collections.sort(p, comp);
        System.out.println(st.length);
        for(Student1 objs:p) {
            System.out.println(objs);
        }
	}
}

class MyComparator implements Comparator<Student1>   //comparison based on age
{
    public int compare(Student1 o1, Student1 o2) {
        
        if(o1.age>o2.age)
            return 1;
        else if (o1.age<o2.age)
            return -1;
        else
            return 0;
    }
    
}

class Student1  {
    
    public Student1() {
        super();
    }
    public Student1(String name, int rollNo, int age) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Student1 [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
    }
    String name;
    int rollNo;
    int age;

}

class Student implements Comparable<Student>{
    
    public Student() {
        super();
    }
    public Student(String name, int rollNo, int age) {        
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
    }
    String name;
    int rollNo;
    int age;
   
    public int compareTo(Student o) {             //comparison based on age
        
        if(this.age>o.age)                  
            return -1;
        else if (this.age<o.age)
            return 1;
        else
        return 0;
    }
    
}*/
