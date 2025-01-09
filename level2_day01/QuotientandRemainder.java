import java.util.*;
class QuotientandRemainder{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);

  int number1,number2;
    System.out.println("enter 2 nos: ");
  //taking input numbers
    number1= input.nextInt();
    number2= input.nextInt();

  //finding quotient
    double quotient= (double)number1/number2;

  //finding remainder
    double remainder= (double)number1 % number2;

  //display
   System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two  numbers "+number1+" and "+ number2);
}
}