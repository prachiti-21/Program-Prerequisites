import java.util.*;
class OperationPrecedence{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  
    int a,b,c;
    System.out.println("enter a,b and c:" );
   //taking input a,b and c
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();

   //doing operations 
   int result1= (a+b)*c;
   int result2= a*b+c;
   int result3= (c+a)/b;
   int result4= a % b +c;

  //display
   System.out.println("The results are: "+result1+ " "+result2+" "+result3+" "+result4);
}
}