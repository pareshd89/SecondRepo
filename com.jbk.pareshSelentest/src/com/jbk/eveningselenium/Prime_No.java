// check wheather the no is Prime or Not

package com.jbk.eveningselenium;
import java.util.Scanner;
 
public class Prime_No {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int checkprime=sc.nextInt();
	 boolean flag=false;
	 	if(checkprime==2)
	 	{
	 		System.out.println("Prime Number");
	 		System.exit(checkprime);
	 	}
	 	for(int i=2; i<checkprime/2;i++)
  			  {
  				if (checkprime%i==0)
  					{ 
  					 flag=true;
  					 break;
  					}
  			  }
	 	if(flag==false)
	 	     {
	 			System.out.println("The number is prime");
	 		 }
	 	else
	 		System.out.println("not a prime");
	}

}
