//package creation 

package student;
public class studentinfo
{
    public void infostudent(int m1,int m2,int m3)
    {
        int t=m1+m2+m3;
        double p=(m1+m2+m3)/3;
        String grade;
        System.out.println("total marks are : "+t);
        System.out.println("percentage is : "+p);
        if(p<90 && p>100)
        {
            grade="A+";
            System.out.println("grade is : "+grade);
        }
        else if(p<80 && p>90)
        {
            grade="A";
            System.out.println("grade is : "+grade);
        }
        else
        {
            grade="B+";
            System.out.println("grade is : "+grade);
        }
    }
}

//import package 
import student.*;
public class studentin
  {
    public static void main(String args[])
    {
      studentinfo s=new studentinfo();
      s.infostudent(99,99,100);
    }
  }
