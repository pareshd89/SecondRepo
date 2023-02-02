//ANY PRIME NUMBER BETWEEN ANY NUMBER AND ALSO GIVES THE COUNT FOR THE NUMBERS



package com.jbk.eveningselenium;
import java.util.Scanner;

public class Prime1_100 {

	public static void main(String[] args) {
	int count=0;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two digits to get the prime number between them");
	System.out.println("Enter the First Digit");
	int start=sc.nextInt();
	System.out.println("Enter the Second Digit");
	int end=sc.nextInt();
		
		for (int j=start;j<=end;j++)
		{
		 int checkprime=j;
		 boolean flag= false;
		 
		 if(checkprime==1)
		 { 
			 System.out.println(checkprime);
			 }
		 else if(checkprime==2)
		 {
			 System.out.println(checkprime);
		 }
		 
		 else {
			 for(int i=2;i<checkprime;i++)
			 {
				 if(checkprime%i==0)
				 {
					flag=true;
					break;
				 }
			 }
			 if(flag==false)
			 {   count++;
				 System.out.println(checkprime);
				 
			 }
		 }
		
		
		}
	
		 System.out.println("total prime no is: "+count);
	
	}
	
}
	
	
		
