//Program to display Marksheet of 8 students in different ways

package com.hsbc.day2;

class Student {
    private static int ctr = 0;
    private int rollNo, marksInEng, marksInMaths ,marksInScience;
    private String studName;
    
    public Student() {
        ctr++;
        this.rollNo = ctr;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public int getMarksInEng() {
        return marksInEng;
    }
    public void setMarksInEng(int marksInEng) {
        this.marksInEng = marksInEng;
    }
    public int getMarksInMaths() {
        return marksInMaths;
    }
    public void setMarksInMaths(int marksInMaths) {
        this.marksInMaths = marksInMaths;
    }
    public int getMarksInScience() {
        return marksInScience;
    }
    public void setMarksInScience(int marksInScience) {
        this.marksInScience = marksInScience;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }   
}

public class Standard {

    public static void func1(Student[] s) {
        System.out.println("Roll No. & Name credentials(ascending based on roll no.)");
        for(int i=0;i<s.length;i++) {
            System.out.println(s[i].getRollNo() + " | " + s[i].getStudName());
        }
    }
    
    public static void func2(Student[] s) {
        System.out.println("Topper:");
        int[] tot = new int[8];
        for(int i=0;i<tot.length;i++)
        {
         tot[i] = s[i].getMarksInEng() + s[i].getMarksInMaths() + s[i].getMarksInScience();
        }
        int max = tot[0];
        int v=0;
        for(int i=1;i<tot.length;i++) {
            if(tot[i]>max) {
                max = tot[i];
                v = i;
            }
        }
        System.out.println("Roll No. : " + s[v].getRollNo() + " | Name : " + s[v].getStudName());
    }
    
    public static void func3(Student[] s) {
        System.out.println("Topper in Maths:");
        int[] m = new int[8];
        for(int i=0;i<m.length;i++) {
            m[i] = s[i].getMarksInMaths();
        }
        int max = m[0];
        int v = 0;
        for(int i=0;i<m.length;i++) {
            if(m[i]>max) {
                max = m[i];
                v = i;
            }
        }
        System.out.println("Roll No. : " + s[v].getRollNo() + " | Name : " + s[v].getStudName());
    }
    
    public static void func4(Student[] s) {
        System.out.println("List of Maths & Science sum marks (Ascending order based on marks):");
        System.out.println("Roll No.  |  Name  | Sum marks in Maths & Science ");
        int[] ms = new int[8];
        for(int i=0;i<ms.length;i++) {
            ms[i] = s[i].getMarksInMaths() + s[i].getMarksInScience();
        }
        int[] r = {1,2,3,4,5,6,7,8};
        for(int i=0;i<ms.length;i++)
        {
         for(int j=i+1;j<ms.length;j++)
         {
          if(ms[i]>ms[j]) {
              ms[i] = ms[i]+ms[j];
              ms[j] = ms[i]-ms[j];
              ms[i] = ms[i]-ms[j];
              r[i] = r[i]+r[j];
              r[j] = r[i]-r[j];
              r[i] = r[i]-r[j];
          }
         }
        }
        for(int i=0;i<r.length;i++) {
            System.out.println(r[i] + " | " + s[r[i]-1].getStudName() + " | " + ms[i]);
        }
    }
    
    public static void func5(Student[] s) {
        System.out.println("Marklist with percentage(descending based on rank):");
        System.out.println("Rank | Roll No. | Name | Total Marks | Percentage ");
        int[] tot = new int[8];
        for(int i=0;i<tot.length;i++)
        {
         tot[i] = s[i].getMarksInEng() + s[i].getMarksInMaths() + s[i].getMarksInScience();
        }
        int[] r = {1,2,3,4,5,6,7,8};
        for(int i=0;i<tot.length;i++)
        {
         for(int j=i+1;j<tot.length;j++)
         {
          if(tot[i]>tot[j]) {
              tot[i] = tot[i]+tot[j];
              tot[j] = tot[i]-tot[j];
              tot[i] = tot[i]-tot[j];
              r[i] = r[i]+r[j];
              r[j] = r[i]-r[j];
              r[i] = r[i]-r[j];
          }
         }
        }
        float[] perc = new float[8];
        for(int i=0;i<perc.length;i++) {
            perc[i] = (float)tot[i]/3;
        }
        for(int i=0;i<tot.length;i++) {
            System.out.println(i + " | " + s[r[i]-1].getRollNo() + " | " + s[r[i]-1].getStudName() + " | " + tot[i] + " | " + perc[i]);
        }
    }
    
    public static void main(String[] args) {
        Student[] s = new Student[8];
        Student s1 = new Student();
        s1.setStudName("Jayesh");
        s1.setMarksInEng(89);
        s1.setMarksInMaths(95);
        s1.setMarksInScience(94);
        s[0] = s1;
        Student s2 = new Student();
        s2.setStudName("Ashish");
        s2.setMarksInEng(92);
        s2.setMarksInMaths(96);
        s2.setMarksInScience(84);
        s[1] = s2;
        Student s3 = new Student();
        s3.setStudName("Mayuresh");
        s3.setMarksInEng(91);
        s3.setMarksInMaths(90);
        s3.setMarksInScience(94);
        s[2] = s3;
        Student s4 = new Student();
        s4.setStudName("Tanmay");
        s4.setMarksInEng(88);
        s4.setMarksInMaths(98);
        s4.setMarksInScience(94);
        s[3] = s4;
        Student s5 = new Student();
        s5.setStudName("Sanket");
        s5.setMarksInEng(98);
        s5.setMarksInMaths(91);
        s5.setMarksInScience(94);
        s[4] = s5;
        Student s6 = new Student();
        s6.setStudName("Srushti");
        s6.setMarksInEng(99);
        s6.setMarksInMaths(97);
        s6.setMarksInScience(94);
        s[5] = s6;
        Student s7 = new Student();
        s7.setStudName("Vishakha");
        s7.setMarksInEng(98);
        s7.setMarksInMaths(95);
        s7.setMarksInScience(99);
        s[6] = s7;
        Student s8 = new Student();
        s8.setStudName("Saurabh");
        s8.setMarksInEng(98);
        s8.setMarksInMaths(100);
        s8.setMarksInScience(84);
        s[7] = s8;
        func1(s);
        func2(s);
        func3(s);
        func4(s);
        func5(s);
    }

}
