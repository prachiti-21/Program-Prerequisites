import java.util.*;
class Average{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter 3 numbers  : ");
 double num1=sc.nextDouble();
 double num2=sc.nextDouble();
 double num3=sc.nextDouble();
 double avg= (num1+num2+num3)/3;
 System.out.println("Average is:" +avg);
}
}