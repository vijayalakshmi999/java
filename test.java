class bank{
int getrateofinterest()
{
return 0;
}
}
class SBI extends bank{
int getrateofinterest()
{
return 8;
}
}
class ICICI extends bank{
int getrateofinterest()
{
return 7;
}
}
class AXIS extends bank {
int getrateofinterest ()
{
return 9;
}
}
class test{
public static void main(String args[])
{
SBI s= new SBI();
ICICI i= new ICICI();
AXIS a= new AXIS();
System.out.println("SBIrateofinterest" + s.getrateofinterest());
System.out.println("ICICIrateofinterest" + i.getrateofinterest());
System.out.println("AXISrateofinterest" + a.getrateofinterest());
}
}



