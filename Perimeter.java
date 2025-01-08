import java.util.*;
class Perimeter{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter length  : ");
 double length= sc.nextDouble();
 System.out.println("enter width: ");
 double width=sc.nextDouble();
 double peri= 2*(length + width);
  System.out.println("Perimeter is: " +peri);
}
}