class A{
  private String s="A";
}
class Exp41U extends A 
	{
	void show(){
	System.out.println(super.s); 
	}
public static void main(String[] args){
Exp41U obj=new Exp41U();
System.out.print("This is private class ");
obj.show();
}
}