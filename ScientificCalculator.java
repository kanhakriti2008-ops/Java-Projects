import java.util.*;
public class ScientificCalculator
{
      Scanner sc=new Scanner(System.in);
      double result=0;
      double memory=0;
      String history[]=new  String[100];
      int c=0;
      double input()
      {
          double n=0;
          int valid=0;
          while(valid ==0)
          {
              try
              {
                  String s=sc.nextLine();
                  n=Double.parseDouble(s);
                  valid=1;
              }
              catch(Exception e)
              {
                  System.out.println("Invalid input!Enter a number");
              }
          }
          return n;
     }
      void display(String expression, double answer)
     {
         result=answer;
         System.out.println("Result="+result);
         if (c<100)
         {
             history[c]=expression+"="+result;
             c++;
         }
     }  
     double factorial(double n)
     {
         if(n<0||n!=(int)n)
         throw new ArithmeticException("Factorial not possible");
         if(n>170)
         throw new ArithmeticException("Number too large!");
         double f=1;
         for(int i=1;i<=(int)n;i++)
         {
             f=f*i;
         }
         return f;
         }
     void calculate()
         {
          int choice=-1;
          double a,b,ans=0;
          while(choice!=0)
            {
               System.out.println("1.Addition");
               System.out.println("2.Substraction");
               System.out.println("3.Multiplication");
               System.out.println("4.Division");
               System.out.println("5.Modules");
               System.out.println("6.Power");
               System.out.println("7.Square Root");
               System.out.println("8.Percentage");
               System.out.println("9.Reciprocal");
               System.out.println("10.Sin");
               System.out.println("11.Cos");
               System.out.println("12.Tan");
               System.out.println("13.Log");
               System.out.println("14.Natural Log");
               System.out.println("15.Factorial");
               System.out.println("16.M+");
               System.out.println("17.M-");
               System.out.println("18.MR");
               System.out.println("19.MC");
               System.out.println("20.Calculation History");
               System.out.println("21.Clear(C)");
               System.out.println("22.All Clear(AC)");
               System.out.println("0.Exit");
               System.out.println("Enter your choice");
               try
                  {
                      choice=Integer.parseInt(sc.nextLine());
                  }
                    catch(Exception e)
                   {
                      System.out.println("Invalid choice:");
                      choice=-1;
                   }
               try
                  {
                     switch(choice)
                      {
                          case 1:
                              System.out.println("Enter first number:");
                              a=input();
                              System.out.println("Enter second number:");
                              b=input();
                              ans=a+b;
                              display(a+"+"+b,ans);
                              break;
                          case 2:
                              System.out.println("Enter first number:");
                              a=input();
                              System.out.println("Enter second number:");
                              b=input();
                                  ans=a-b;
                                  display(a+"-"+b,ans);
                                  break;
                          case 3:
                                  System.out.println("Enter first number:");
                                  a=input();
                                  System.out.println("Enter second number:");
                                  b=input();
                                  ans=a*b;
                                  display(a+"*"+b,ans);
                                  break;
                          case 4:
                                  System.out.println("Enter first number:");
                                  a=input();
                                  System.out.println("Enter second number:");
                                  b=input();
                                  if(b==0)
                                  throw new ArithmeticException("Division by zero!");
                                  ans=a/b;
                                  display(a+"/"+b,ans);
                                  break;
                          case 5:
                                  System.out.println("Enter first number:");
                                  a=input();
                                  System.out.println("Enter second number:");
                                  b=input();
                                  if(b==0)
                                  throw new ArithmeticException("Cannot divide by zero!");
                                  ans=a%b;
                                  display(a+"%"+b,ans);
                                  break;
                          case 6:
                                  System.out.println("Enter base:");
                                  a=input();
                                  System.out.println("Enter power:");
                                  b=input();
                                  ans=Math.pow(a,b);
                                  display(a+"^"+b,ans);
                                  break;
                          case 7:
                                  System.out.println("Enter number:");
                                  a=input();
                                  if(a<0)
                                  throw new ArithmeticException("Negative square root not possible!");
                                  ans=Math.sqrt(a);
                                  display("Square root of "+a,ans);
                                  break;
                          case 8:
                                  System.out.println("Enter number:");
                                  a=input();
                                  System.out.println("Enter percentage:");
                                  b=input();
                                  ans=(a*b)/100;
                                  display(b+"% of"+a,ans);
                                  break;
                          case 9:
                                  System.out.println("Enter number:");
                                  a=input();
                                  if(a==0)
                                  throw new ArithmeticException("Reciprocal not possible!");
                                  ans=1/a;
                                  display("1/"+a,ans);
                                  break;
                          case 10:
                                  System.out.println("Enter angle in degrees:");
                                  a=input();
                                  ans=Math.sin(Math.toRadians(a));
                                  display("sin"+a,ans);
                                  break;
                          case 11:
                                  System.out.println("Enter angle in degrees:");
                                  a=input();
                                  ans=Math.cos(Math.toRadians(a));
                                  display("cos"+a,ans);
                                  break;
                          case 12:
                                  System.out.println("Enter angle in degrees:");
                                  a=input();
                                  if(Math.abs(Math.cos(Math.toRadians(a)))<0.0000001)
                                  throw new ArithmeticException("Tan is undefined!");
                                  ans=Math.tan(Math.toRadians(a));
                                  display("Tan"+a,ans);
                                  break;
                          case 13:
                                  System.out.println("Enter number:");
                                  a=input();
                                  if(a<=0)
                                  throw new ArithmeticException("Log requires a positive number!:");
                                  ans=Math.log10(a);
                                  display("Log"+a,ans);
                                  break;
                          case 14:
                                  System.out.println("Enter number:");
                                  a=input();
                                  if(a<=0)
                                  throw new ArithmeticException("Natural log requires a positive number!:");
                                  ans=Math.log(a);
                                  display("Ln"+a,ans);
                                  break;
                          case 15:
                                  System.out.println("Enter number:");
                                  a=input();
                                  ans=factorial(a);
                                  display(a+"!",ans);
                                  break;
                          case 16:
                                  memory=memory+result;
                                  System.out.println("Added to memory:"+memory);
                                  break;
                          case 17:
                                  memory=memory-result;
                                  System.out.println("Subtracted from memory:"+memory);
                                  break;
                          case 18:
                                  System.out.println("Mmemory value="+memory);
                                  result=memory;
                                  break;
                          case 19:
                                  memory=0;
                                  System.out.println("Memory cleared!:");
                                  break;
                          case 20:
                                  System.out.println("\nCalculation History:");
                                  if(c==0)
                                  System.out.println("No calculations available:");
                                  for(int i=0;i<c;i++)
                                  {
                                      System.out.println(history[i]);
                                  }
                                   break;
                          case 21:
                                  result=0;
                                  System.out.println("Current result available:");
                                  break;
                          case 22:
                                  result=0;
                                  memory=0;
                                  c=0;
                                  System.out.println("Calculator completely cleared!:");
                                  break;
                          case 0:
                                  System.out.println("Thank you for using the calculator!:");
                                  break;
                                  default:
                                      System.out.println("Invalid choice!:");
                       }
                 }
                   catch(Exception e)
                   {
                       System.out.println("Error:"+e.getMessage());
                   }
                  }
              }
              public static void main(String args[])
              {
                  ScientificCalculator ob=new ScientificCalculator();
                  ob.calculate();
              }
          }
