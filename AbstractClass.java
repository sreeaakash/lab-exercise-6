/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
abstract class marks
{
    abstract void getpercentage();
    
}
class A extends  marks 
{
    double m1,m2,m3,a;
    A(int a1,int a2,int a3)
    {
        m1=a1;
        m2=a2;
        m3=a3;
    }
    void  getpercentage()
    {
       a=(m1+m2+m3)/3;
      
    }
    void display()
    {
        System.out.println("The student1 marks are ");
        System.out.println("Mark1="+m1+"mark2"+m2+"mark3="+m3);
    
        System.out.println("The student1 average is "+a);
    }
}

class B extends  marks 
{
    double mb1,mb2,mb3,mb4,b;
    B(int b1,int b2,int b3,int b4)
    {
        mb1=b1;
        mb2=b2;
        mb3=b3;
        mb4=b4;
    }
    void  getpercentage()
    {
       b=(mb1+mb2+mb3+mb4)/4;
      
    }
    void display()
    {
        System.out.println("The student2 marks are ");
        System.out.println("Mark1="+mb1+"mark2"+mb2+"mark3="+mb3+"marks4="+mb4);
    
        System.out.println("The student2 average is "+b);
    }
}
 
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c;
        int p,q,r,s;
        System.out.println("Enter marks for student1:");
        Scanner obj=new Scanner (System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        A obj1=new A(a,b,c);
        obj1.getpercentage();
        obj1.display();
        System.out.println("Enter marks for student2:");
        p=obj.nextInt();
        q=obj.nextInt();
        r=obj.nextInt();
        s=obj.nextInt();
        B obj2=new B(p,q,r,s);
        obj2.getpercentage();
        obj2.display();
        
        
        
    }
    
}
