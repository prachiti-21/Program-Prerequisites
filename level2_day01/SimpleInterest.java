class SimpleInterest{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
  double principle,rate,time;
  System.out.println("Enter principle amount, rate of interest and time:");
  principle= input.nextDouble();
  rate= input.nextDouble();
  time= input.nextDouble();
  
  //finding simple interest
  double simple_interest= (principle*rate*time)/100;
  
  //display
  System.out.println("the Simple Interest is "+simple_interest+" for Principle "+principle+","+"rate of interest "+ rate+" and time " + time);
}
}