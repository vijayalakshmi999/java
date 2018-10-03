Class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

Class B1 extends A
{
   public void methodB1()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     B1 obj = new B1();
     obj.methodA(); //calling super class method
     obj.methodB1(); //calling local method
  }
}
