import java.util.*;
class SimpleInterest{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter Principle amount  : ");
 double pr= sc.nextDouble();
 System.out.println("enter rate of interest: ");
 double rate=sc.nextDouble();
System.out.print("Enter time: ");
 double time=sc.nextDouble();
 double si= (pr * rate * time)/100;
  System.out.println("Simple interest is: " +si);
}
}