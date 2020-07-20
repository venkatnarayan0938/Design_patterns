package com.gvn.designpatterns;

import java.util.*;

public class AppOne {

	public static void main( String[] args )
    {
        Scanner x1=new Scanner(System.in);
        CalculatorOne calci=new CalculatorOne();
        int v1,ch;
        float a,b,c;
        while(true)
        {
        	System.out.println("-----------CALCULATOR-------------");
        	System.out.println("Enter no. of values : ");
        	v1=x1.nextInt();
        	if(v1!=2&&v1!=3)
        	{
        		System.out.println("Unsupported number! please give 2 or 3");
        		return;
        	}
        	System.out.println("1.Addition");
        	System.out.println("2.Subtraction");
        	System.out.println("3.Multiplication");
        	System.out.println("4.Division");
        	System.out.println("5.Exit");
        	ch=x1.nextInt();
        	if(ch==5)
        	{
        		System.out.println("EXITED CALCULATOR");
        		return;
        	}
        	switch(v1)
        	{
        	    case 2:switch(ch)
        	           {
        	               case 1:System.out.println("Enter 2 values one by one :");
        	                      a=x1.nextFloat();
        	                      System.out.print("+");
        	                      b=x1.nextFloat();
        	                      System.out.println(calci.Addition(a,b));
        	                      break;
        	               case 2:System.out.println("Enter 2 values one by one :");
 	                              a=x1.nextFloat();
 	                              System.out.print("-");
 	                              b=x1.nextFloat();
 	                              System.out.println(calci.Subtraction(a,b));
 	                              break;
        	               case 3:System.out.println("Enter 2 values one by one :");
 	                              a=x1.nextFloat();
 	                              System.out.print("*");
 	                              b=x1.nextFloat();
 	                              System.out.println(calci.Multiplication(a,b));
 	                              break;
        	               case 4:System.out.println("Enter 2 values one by one :");
                                  a=x1.nextFloat();
                                  System.out.print("/");
                                  b=x1.nextFloat();
                                  if(b==0)
                                	  System.out.println("Math Error");
                                  else
                                  System.out.println(calci.Division(a,b)); 
                                  break;
                           default:System.out.println("Check your inputs");
                                   break;
        	           }
        	           break;
        	    case 3:switch(ch)
 	                   {
               case 1:System.out.println("Enter 3 values one by one :");
                      a=x1.nextFloat();
                      System.out.print("+");
                      b=x1.nextFloat();
                      System.out.print("+");
                      c=x1.nextFloat();
                      System.out.println(calci.Addition(a,b,c));
                      break;
               case 2:System.out.println("Enter 3 values one by one :");
                       a=x1.nextFloat();
                       System.out.print("-");
                       b=x1.nextFloat();
                       System.out.print("-");
                       c=x1.nextFloat();
                       System.out.println(calci.Subtraction(a,b,c));
                       break;
               case 3:System.out.println("Enter 3 values one by one :");
                       a=x1.nextFloat();
                       System.out.print("*");
                       b=x1.nextFloat();
                       System.out.print("*");
                       c=x1.nextFloat();
                       System.out.println(calci.Multiplication(a,b,c));
                       break;
               case 4:System.out.print("Enter 3 values one by one :");
                      a=x1.nextFloat();
                      System.out.print("/");
                      b=x1.nextFloat();
                      System.out.print("/");
                      c=x1.nextFloat();
                      if((b==0)||(c==0))
                    	  System.out.println("Math Error");
                      else
                      System.out.println(calci.Division(a,b,c)); 
                      break;
               default:System.out.println("Check your inputs");
                       break;
           }break;
        	    default:System.out.println("Unsupported");
        	            break;
        	}
        	
        }
    }
}
