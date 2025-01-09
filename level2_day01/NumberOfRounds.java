class NumberOfRounds{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
   double side1,side2,side3;
   System.out.print("Enter the length of sides in metres:");
   //taking sides in input
   side1= input.nextDouble();
   side2= input.nextDouble();
   side3= input.nextDouble();

  //finding perimeter
   double perimeter= side1+side2+side3;

  // number of rounds
   double rounds= 5000/perimeter;
 
  //display
   System.out.println("the total number of rounds the athlete will run is "+rounds+" to complete 5 km");
}
}