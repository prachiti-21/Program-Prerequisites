class NumberOfChocolates{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
   int numberOfChocolates,numberOfChildren;
   System.out.println("Enter number of chocolates and number of children:");
   numberOfChocolates= input.nextInt();
   numberOfChildren= input.nextInt();
   
   //finding number of chocolates each child will get
   int each_child= numberOfChocolates/numberOfChildren;
   
   //remaining chocolates
   int remaining_chocolates= numberOfChocolates%numberOfChildren;
   
   System.out.println("the number of chocolates each child gets is "+each_child+" and the number of remaining chocolates are "+remaining_chocolates);
}
}