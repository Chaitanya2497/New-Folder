package pack1;

import java.util.Scanner;

public class Student1 {

	String sname;
	int rollno; 
	int marks[]= new int[5];
	
	public void adddata()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter student name");
		sname= s.next();
		System.out.println("enter rollno");
		rollno=s.nextInt();
		
		for(int i=0;i<5;i++) {
		  System.out.println("enter marks");
		  marks[i]= s.nextInt();
		}
	}
	
	
	void showData()
	{   System.out.println();
		System.out.print("  "+sname);
		System.out.print("  "+rollno);
	
		for(int i=0;i<5;i++) {
			System.out.print ("  "+ marks[i]);
		}
		
	}
	
	public static void main(String aa[])
	{
		Student1 r[]= new Student1[4];//we have created 7 references

		for(int i=0;i<4;i++)
		{
			r[i]= new Student1();//without this line java.lang.NullPointerException
			r[i].adddata();
		}
		for(int i=0;i<4;i++)
		{ 
			 if(r[i].sname.equals("Rohan"))
		   			r[i].showData();
		}
	}
	}
	
 
