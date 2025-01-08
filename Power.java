import java.util.*;
class Power{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter base  : ");
 int base= sc.nextInt();
 System.out.println("enter exponent: ");
 int exp=sc.nextInt();
 int power= Math.pow(base,exp);
  System.out.println("Power is: " +power);
}
}