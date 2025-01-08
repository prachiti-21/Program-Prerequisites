import java.util.*;
class Convert{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter distance in Km  : ");
 double dist= sc.nextDouble();
 double mile= dist * 0.621371;
 System.out.print("Distance in miles is: " +mile); 
 }
}