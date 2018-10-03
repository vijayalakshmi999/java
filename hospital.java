class hospital
{
   public void disp()
   {
	System.out.println("Number Of Patients in hospital ");
   }	   
}
class apollo extends hospital
{
   public void disp()
{
	System.out.println("Number Of Patients in hospital");
   }
   public void newMethod()
{
	System.out.println("new method of apollo class");
   }}
class overridden
{   
public static void main(String[] args)
 {
	
hospital obj = new hospital();
	obj.disp();
apollo obj2 = new apollo();
	obj2.disp();
   }

}

