class Income{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  double salary,bonus;
  //taking input
  System.out.print("Enter salary and bonus: ");
  salary=input.nextDouble();
  bonus=input.nextDouble();

  //finding income
  double income= salary+bonus;
  
  //display
  System.out.println("The salary is INR "+salary+ " and bonus is INR "+bonus+"."+ "Hence Total Income is INR "+income);
}
}