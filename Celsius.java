import java.util.*;
class Celsius{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter temperature in celsius  : ");
 float temp= sc.nextFloat();
 float fahrenheit=(temp*(9/5))+32;
  System.out.print("Temperature in Fahrenheit: " +fahrenheit);
}
}